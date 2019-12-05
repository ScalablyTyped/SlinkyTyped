package typingsSlinky.reactDashNativeDashVideo

import typingsSlinky.reactDashNativeDashVideo.reactDashNativeDashVideoStrings.disabled
import typingsSlinky.reactDashNativeDashVideo.reactDashNativeDashVideoStrings.index
import typingsSlinky.reactDashNativeDashVideo.reactDashNativeDashVideoStrings.language
import typingsSlinky.reactDashNativeDashVideo.reactDashNativeDashVideoStrings.system
import typingsSlinky.reactDashNativeDashVideo.reactDashNativeDashVideoStrings.title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Disabled extends js.Object {
  var `type`: system | disabled | title | language | index
  var value: js.UndefOr[String | Double] = js.undefined
}

object Anon_Disabled {
  @scala.inline
  def apply(`type`: system | disabled | title | language | index, value: String | Double = null): Anon_Disabled = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Disabled]
  }
}

