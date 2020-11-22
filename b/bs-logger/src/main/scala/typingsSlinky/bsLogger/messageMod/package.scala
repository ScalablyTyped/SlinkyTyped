package typingsSlinky.bsLogger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object messageMod {
  
  type LogMessageFormatter = js.Function1[/* msg */ typingsSlinky.bsLogger.messageMod.LogMessage, java.lang.String]
  
  type LogMessageTranslator = js.Function1[
    /* msg */ typingsSlinky.bsLogger.messageMod.LogMessage, 
    typingsSlinky.bsLogger.messageMod.LogMessage
  ]
}
