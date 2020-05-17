package typingsSlinky.jui.anon

import typingsSlinky.jui.juiStrings.horizontal
import typingsSlinky.jui.juiStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BarSize extends js.Object {
  /**
    * @cfg {Number} [barSize=4]
    * set splitter's bar size
    */
  var barSize: js.UndefOr[Double] = js.native
  /**
    * @cfg {Object} [barStyle={}]
    * set custom splitter bar style
    */
  var barStyle: js.UndefOr[js.Object] = js.native
  /**
    * @cfg {"vertical"/"horizontal"} [direction='vertical']
    * set bar's direction
    */
  var direction: js.UndefOr[vertical | horizontal] = js.native
  var event: js.UndefOr[js.Any] = js.native
  /**
    * @cfg {Boolean} [fixed=false]
    *
    * if fixed is true, panels can not resize.
    *
    */
  var fixed: js.UndefOr[Boolean] = js.native
  /**
    * @cfg {String} [hideClass='hide']
    * set splitter's hide class for design
    */
  var hideClass: js.UndefOr[String] = js.native
  /**
    * @cfg {String/Number} [initSize='50%']
    * set first panel's default width or height
    */
  var initSize: js.UndefOr[String | Double] = js.native
  /**
    * @cfg {String} [items=[]]
    *
    * set items  to placed in vertical or horizontal
    *
    * support max two times
    *
    */
  var items: js.UndefOr[js.Array[_]] = js.native
  /**
    * @cfg {Number/Array} [minSize=30]
    * set panel's minimum width or height
    *
    * if minSize is number , minSize is conver to array
    *
    * minSize[0] is first panel's minimum size
    * minSize[1] is second panel's minimum size
    *
    */
  var minSize: js.UndefOr[Double | js.Array[Double]] = js.native
  /**
    * @cfg {String} [splitterClass='ui-splitter']
    * set splitter's class for design
    */
  var splitterClass: js.UndefOr[String] = js.native
  var tpl: js.UndefOr[js.Any] = js.native
}

object BarSize {
  @scala.inline
  def apply(): BarSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarSize]
  }
  @scala.inline
  implicit class BarSizeOps[Self <: BarSize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBarSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barSize")(js.undefined)
        ret
    }
    @scala.inline
    def withBarStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: vertical | horizontal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withEvent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(js.undefined)
        ret
    }
    @scala.inline
    def withFixed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(js.undefined)
        ret
    }
    @scala.inline
    def withHideClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideClass")(js.undefined)
        ret
    }
    @scala.inline
    def withInitSize(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initSize")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSize(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSplitterClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitterClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplitterClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitterClass")(js.undefined)
        ret
    }
    @scala.inline
    def withTpl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tpl")(js.undefined)
        ret
    }
  }
  
}

