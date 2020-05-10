package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SectionListScrollParams extends js.Object {
  var animated: js.UndefOr[Boolean] = js.native
  var itemIndex: Double = js.native
  var sectionIndex: Double = js.native
  var viewOffset: js.UndefOr[Double] = js.native
  var viewPosition: js.UndefOr[Double] = js.native
}

object SectionListScrollParams {
  @scala.inline
  def apply(itemIndex: Double, sectionIndex: Double): SectionListScrollParams = {
    val __obj = js.Dynamic.literal(itemIndex = itemIndex.asInstanceOf[js.Any], sectionIndex = sectionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionListScrollParams]
  }
  @scala.inline
  implicit class SectionListScrollParamsOps[Self <: SectionListScrollParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItemIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSectionIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectionIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(js.undefined)
        ret
    }
    @scala.inline
    def withViewOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withViewPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewPosition")(js.undefined)
        ret
    }
  }
  
}

