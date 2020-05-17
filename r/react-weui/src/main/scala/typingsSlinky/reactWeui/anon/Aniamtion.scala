package typingsSlinky.reactWeui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Aniamtion extends js.Object {
  var aniamtion: Boolean = js.native
  var defaultIndex: Double = js.native
  var groupIndex: Double = js.native
  var height: Double = js.native
  var indicatorHeight: Double = js.native
  var indicatorTop: Double = js.native
  var itemHeight: Double = js.native
  var mapKeys: Label = js.native
}

object Aniamtion {
  @scala.inline
  def apply(
    aniamtion: Boolean,
    defaultIndex: Double,
    groupIndex: Double,
    height: Double,
    indicatorHeight: Double,
    indicatorTop: Double,
    itemHeight: Double,
    mapKeys: Label
  ): Aniamtion = {
    val __obj = js.Dynamic.literal(aniamtion = aniamtion.asInstanceOf[js.Any], defaultIndex = defaultIndex.asInstanceOf[js.Any], groupIndex = groupIndex.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], indicatorHeight = indicatorHeight.asInstanceOf[js.Any], indicatorTop = indicatorTop.asInstanceOf[js.Any], itemHeight = itemHeight.asInstanceOf[js.Any], mapKeys = mapKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aniamtion]
  }
  @scala.inline
  implicit class AniamtionOps[Self <: Aniamtion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAniamtion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aniamtion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndicatorHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndicatorTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMapKeys(value: Label): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapKeys")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

