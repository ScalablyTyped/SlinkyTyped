package typingsSlinky.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object connectContactFlowMod {
  
  type ConnectContactFlowCallback = typingsSlinky.awsLambda.handlerMod.Callback[typingsSlinky.awsLambda.connectContactFlowMod.ConnectContactFlowResult]
  
  type ConnectContactFlowHandler = typingsSlinky.awsLambda.handlerMod.Handler[
    typingsSlinky.awsLambda.connectContactFlowMod.ConnectContactFlowEvent, 
    typingsSlinky.awsLambda.connectContactFlowMod.ConnectContactFlowResult
  ]
  
  type ConnectContactFlowResult = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Null]
}
