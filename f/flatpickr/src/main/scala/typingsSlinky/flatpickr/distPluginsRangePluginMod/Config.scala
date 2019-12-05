package typingsSlinky.flatpickr.distPluginsRangePluginMod

import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.flatpickr.flatpickrStrings.left
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var input: js.UndefOr[String | HTMLInputElement] = js.undefined
  var position: js.UndefOr[left] = js.undefined
}

object Config {
  @scala.inline
  def apply(input: String | HTMLInputElement = null, position: left = null): Config = {
    val __obj = js.Dynamic.literal()
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

