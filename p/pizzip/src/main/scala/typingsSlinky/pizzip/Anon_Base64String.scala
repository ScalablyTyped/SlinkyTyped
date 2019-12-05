package typingsSlinky.pizzip

import typingsSlinky.pizzip.pizzipStrings.base64
import typingsSlinky.pizzip.pizzipStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Base64String extends js.Object {
  var `type`: js.UndefOr[string | base64] = js.undefined
}

object Anon_Base64String {
  @scala.inline
  def apply(`type`: string | base64 = null): Anon_Base64String = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Base64String]
  }
}

