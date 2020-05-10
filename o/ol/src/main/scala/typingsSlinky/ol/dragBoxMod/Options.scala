package typingsSlinky.ol.dragBoxMod

import typingsSlinky.ol.conditionMod.Condition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var boxEndCondition: js.UndefOr[EndCondition] = js.native
  var className: js.UndefOr[String] = js.native
  var condition: js.UndefOr[Condition] = js.native
  var minArea: js.UndefOr[Double] = js.native
  var onBoxEnd: js.UndefOr[
    js.ThisFunction1[/* this */ DragBox, /* p0 */ typingsSlinky.ol.mapBrowserEventMod.default, Unit]
  ] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoxEndCondition(value: EndCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxEndCondition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxEndCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxEndCondition")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withCondition(value: Condition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(js.undefined)
        ret
    }
    @scala.inline
    def withMinArea(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minArea")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBoxEnd(
      value: js.ThisFunction1[/* this */ DragBox, /* p0 */ typingsSlinky.ol.mapBrowserEventMod.default, Unit]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBoxEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnBoxEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBoxEnd")(js.undefined)
        ret
    }
  }
  
}

