package typingsSlinky.actionsOnGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object actionssdkActionssdkMod {
  type ActionSdkIntentHandlers = org.scalablytyped.runtime.StringDictionary[
    js.UndefOr[
      (typingsSlinky.actionsOnGoogle.actionssdkActionssdkMod.ActionsSdkIntentHandler[
        js.Object, 
        js.Object, 
        typingsSlinky.actionsOnGoogle.convMod.ActionsSdkConversation[js.Object, js.Object], 
        typingsSlinky.actionsOnGoogle.argumentArgumentMod.Argument
      ]) | java.lang.String
    ]
  ]
  type ActionsSdkIntentHandler[TConvData, TUserStorage, TConversation /* <: typingsSlinky.actionsOnGoogle.convMod.ActionsSdkConversation[TConvData, TUserStorage] */, TArgument /* <: typingsSlinky.actionsOnGoogle.argumentArgumentMod.Argument */] = js.Function4[
    /* conv */ TConversation, 
    /* input */ java.lang.String, 
    /* argument */ TArgument, 
    /* status */ js.UndefOr[typingsSlinky.actionsOnGoogle.v2Mod.GoogleRpcStatus], 
    js.Promise[js.Any] | js.Any
  ]
  type ActionsSdkMiddleware[TConversationPlugin /* <: typingsSlinky.actionsOnGoogle.convMod.ActionsSdkConversation[js.Object, js.Object] */] = js.Function2[
    /* conv */ typingsSlinky.actionsOnGoogle.convMod.ActionsSdkConversation[js.Object, js.Object], 
    /* framework */ typingsSlinky.actionsOnGoogle.frameworkFrameworkMod.BuiltinFrameworkMetadata, 
    ((typingsSlinky.actionsOnGoogle.convMod.ActionsSdkConversation[js.Object, js.Object]) with TConversationPlugin) | scala.Unit | (js.Promise[
      ((typingsSlinky.actionsOnGoogle.convMod.ActionsSdkConversation[js.Object, js.Object]) with TConversationPlugin) | scala.Unit
    ])
  ]
}
