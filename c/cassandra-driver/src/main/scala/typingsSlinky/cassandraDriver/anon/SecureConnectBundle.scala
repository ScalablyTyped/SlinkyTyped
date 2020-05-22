package typingsSlinky.cassandraDriver.anon

import typingsSlinky.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecureConnectBundle extends js.Object {
  var secureConnectBundle: String | URL_
}

object SecureConnectBundle {
  @scala.inline
  def apply(secureConnectBundle: String | URL_): SecureConnectBundle = {
    val __obj = js.Dynamic.literal(secureConnectBundle = secureConnectBundle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecureConnectBundle]
  }
}

