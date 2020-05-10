package typingsSlinky.angularRouter

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDictk
  extends /* k */ StringDictionary[js.Any] {
  var navigationId: Double = js.native
}

object AnonDictk {
  @scala.inline
  def apply(navigationId: Double): AnonDictk = {
    val __obj = js.Dynamic.literal(navigationId = navigationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictk]
  }
  @scala.inline
  implicit class AnonDictkOps[Self <: AnonDictk] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNavigationId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

