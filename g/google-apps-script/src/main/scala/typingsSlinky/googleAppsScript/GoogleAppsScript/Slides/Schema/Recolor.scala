package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Recolor extends js.Object {
  var name: js.UndefOr[String] = js.native
  var recolorStops: js.UndefOr[js.Array[ColorStop]] = js.native
}

object Recolor {
  @scala.inline
  def apply(): Recolor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Recolor]
  }
  @scala.inline
  implicit class RecolorOps[Self <: Recolor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withRecolorStops(value: js.Array[ColorStop]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recolorStops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecolorStops: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recolorStops")(js.undefined)
        ret
    }
  }
  
}

