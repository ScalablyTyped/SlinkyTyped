package typingsSlinky.reactNativeVideo.anon

import typingsSlinky.reactNativeVideo.reactNativeVideoStrings.disabled
import typingsSlinky.reactNativeVideo.reactNativeVideoStrings.index
import typingsSlinky.reactNativeVideo.reactNativeVideoStrings.language
import typingsSlinky.reactNativeVideo.reactNativeVideoStrings.system
import typingsSlinky.reactNativeVideo.reactNativeVideoStrings.title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  var `type`: system | disabled | title | language | index
  var value: js.UndefOr[String | Double] = js.undefined
}

object Type {
  @scala.inline
  def apply(`type`: system | disabled | title | language | index, value: String | Double = null): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

