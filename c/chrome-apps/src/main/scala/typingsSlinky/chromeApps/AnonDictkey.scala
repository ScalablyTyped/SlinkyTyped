package typingsSlinky.chromeApps

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.chromeApps.chrome.webViewRequest.DeclarativeWebRequestConditionsList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDictkey
  extends /** Arguments, see original condition docs in chrome.webViewRequest */
/* key */ StringDictionary[js.Any | js.Array[_]] {
  /** Condition */
  var `type`: DeclarativeWebRequestConditionsList = js.native
}

object AnonDictkey {
  @scala.inline
  def apply(`type`: DeclarativeWebRequestConditionsList): AnonDictkey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictkey]
  }
  @scala.inline
  implicit class AnonDictkeyOps[Self <: AnonDictkey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: DeclarativeWebRequestConditionsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

