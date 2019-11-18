package typingsSlinky.antd.libMentionsMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionProps
  extends /* key */ StringDictionary[js.Any] {
  var children: TagMod[Any]
  var value: String
}

object OptionProps {
  @scala.inline
  def apply(children: TagMod[Any], value: String, StringDictionary: /* key */ StringDictionary[js.Any] = null): OptionProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[OptionProps]
  }
}

