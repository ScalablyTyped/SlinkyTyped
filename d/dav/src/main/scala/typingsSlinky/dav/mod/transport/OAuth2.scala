package typingsSlinky.dav.mod.transport

import typingsSlinky.dav.mod.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new OAuth2 object.This sends dav requests authorized via rfc 6749 oauth2.
  * @param credentials user authorization.
  */
@JSImport("dav", "transport.OAuth2")
@js.native
class OAuth2 protected () extends Transport {
  def this(credentials: Credentials) = this()
}
