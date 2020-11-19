package typingsSlinky.dav.mod.transport

import typingsSlinky.dav.mod.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dav", "transport.Basic")
@js.native
class Basic protected () extends Transport {
  /**
    * Create a new Basic object. This sends dav requests using http basic authentication.
    * @param credentials user authorization.
    */
  def this(credentials: Credentials) = this()
}
