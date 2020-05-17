package typingsSlinky.jointjs.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deep
  extends /* key */ StringDictionary[js.Any] {
  var deep: js.UndefOr[Boolean] = js.native
  var parentRelative: js.UndefOr[Boolean] = js.native
}

object Deep {
  @scala.inline
  def apply(): Deep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deep]
  }
  @scala.inline
  implicit class DeepOps[Self <: Deep] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeep(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deep")(js.undefined)
        ret
    }
    @scala.inline
    def withParentRelative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentRelative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentRelative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentRelative")(js.undefined)
        ret
    }
  }
  
}

