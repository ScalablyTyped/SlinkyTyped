package typingsSlinky.awsSdkLogger

import typingsSlinky.awsSdkTypes.loggerMod.LoggerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/logger", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class Logger protected ()
    extends typingsSlinky.awsSdkTypes.loggerMod.Logger {
    def this(options: LoggerOptions) = this()
    
    val logLevel: js.Any = js.native
    
    val logger: js.Any = js.native
    
    val options: LoggerOptions = js.native
    
    var write: js.Any = js.native
  }
  /* static members */
  @js.native
  object Logger extends js.Object {
    
    val logLevelPriority: js.Any = js.native
  }
}
