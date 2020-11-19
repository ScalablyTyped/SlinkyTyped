package typingsSlinky.actionsOnGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object dialogflowDialogflowMod {
  
  type DialogflowIntentHandler[TConvData, TUserStorage, TContexts /* <: typingsSlinky.actionsOnGoogle.contextMod.Contexts */, TConversation /* <: typingsSlinky.actionsOnGoogle.dialogflowConvMod.DialogflowConversation[TConvData, TUserStorage, TContexts] */, TParameters /* <: typingsSlinky.actionsOnGoogle.contextMod.Parameters */, TArgument /* <: typingsSlinky.actionsOnGoogle.argumentArgumentMod.Argument */] = js.Function4[
    /* conv */ TConversation, 
    /* params */ TParameters, 
    /* argument */ TArgument, 
    /* status */ js.UndefOr[typingsSlinky.actionsOnGoogle.v2Mod.GoogleRpcStatus], 
    js.Promise[js.Any] | js.Any
  ]
  
  type DialogflowIntentHandlers = org.scalablytyped.runtime.StringDictionary[js.UndefOr[js.Function | java.lang.String]]
  
  type DialogflowMiddleware[TConversationPlugin /* <: typingsSlinky.actionsOnGoogle.dialogflowConvMod.DialogflowConversation[
    typingsSlinky.actionsOnGoogle.commonMod.JsonObject, 
    typingsSlinky.actionsOnGoogle.commonMod.JsonObject, 
    typingsSlinky.actionsOnGoogle.contextMod.Contexts
  ] */] = js.Function2[
    /* conv */ typingsSlinky.actionsOnGoogle.dialogflowConvMod.DialogflowConversation[
      typingsSlinky.actionsOnGoogle.commonMod.JsonObject, 
      typingsSlinky.actionsOnGoogle.commonMod.JsonObject, 
      typingsSlinky.actionsOnGoogle.contextMod.Contexts
    ], 
    /* framework */ typingsSlinky.actionsOnGoogle.frameworkFrameworkMod.BuiltinFrameworkMetadata, 
    ((typingsSlinky.actionsOnGoogle.dialogflowConvMod.DialogflowConversation[
      typingsSlinky.actionsOnGoogle.commonMod.JsonObject, 
      typingsSlinky.actionsOnGoogle.commonMod.JsonObject, 
      typingsSlinky.actionsOnGoogle.contextMod.Contexts
    ]) with TConversationPlugin) | scala.Unit | (js.Promise[
      ((typingsSlinky.actionsOnGoogle.dialogflowConvMod.DialogflowConversation[
        typingsSlinky.actionsOnGoogle.commonMod.JsonObject, 
        typingsSlinky.actionsOnGoogle.commonMod.JsonObject, 
        typingsSlinky.actionsOnGoogle.contextMod.Contexts
      ]) with TConversationPlugin) | scala.Unit
    ])
  ]
  
  type DialogflowVerificationHeaders = /**
    * A header key value pair to check against.
    * @public
    */
  org.scalablytyped.runtime.StringDictionary[java.lang.String]
}
