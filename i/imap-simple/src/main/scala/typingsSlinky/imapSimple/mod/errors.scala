package typingsSlinky.imapSimple.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("imap-simple", "errors")
@js.native
object errors extends js.Object {
  
  @js.native
  class ConnectionTimeoutError protected () extends Error {
    def this(timeout: Double) = this()
    
    var timeout: Double = js.native
  }
}
