package typingsSlinky.mjmlReact.anon

import org.scalablytyped.runtime.StringDictionary
import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictkey
  extends /* key */ StringDictionary[js.Any] {
  var children: js.UndefOr[TagMod[Any]] = js.undefined
}

object Dictkey {
  @scala.inline
  def apply(StringDictionary: /* name */ StringDictionary[js.Any] = null, children: TagMod[Any] = null): Dictkey = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
}

