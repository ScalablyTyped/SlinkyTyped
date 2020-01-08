package typingsSlinky.node.http2Mod

import typingsSlinky.node.urlMod.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlternativeServiceOptions extends js.Object {
  var origin: Double | String | URL
}

object AlternativeServiceOptions {
  @scala.inline
  def apply(origin: Double | String | URL): AlternativeServiceOptions = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AlternativeServiceOptions]
  }
}

