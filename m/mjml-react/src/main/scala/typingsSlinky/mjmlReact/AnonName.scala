package typingsSlinky.mjmlReact

import org.scalablytyped.runtime.StringDictionary
import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName
  extends /* key */ StringDictionary[js.Any] {
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var name: String
}

object AnonName {
  @scala.inline
  def apply(
    name: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    children: TagMod[Any] = null
  ): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName]
  }
}

