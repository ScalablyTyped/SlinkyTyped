package typingsSlinky.extjs.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShadow extends IBase {
  /** [Method] Hides this shadow */
  var hide: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns true if the shadow is visible else false */
  var isVisible: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String) */
  var mode: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (Number) */
  var offset: js.UndefOr[Double] = js.native
  /** [Method] Direct alignment when values are already available
  		* @param left Number The target element left position
  		* @param top Number The target element top position
  		* @param width Number The target element width
  		* @param height Number The target element height
  		*/
  var realign: js.UndefOr[
    js.Function4[
      /* left */ js.UndefOr[Double], 
      /* top */ js.UndefOr[Double], 
      /* width */ js.UndefOr[Double], 
      /* height */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** [Method] Sets the opacity of the shadow
  		* @param opacity Number The opacity
  		*/
  var setOpacity: js.UndefOr[js.Function1[/* opacity */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Adjust the z index of this shadow
  		* @param zindex Number The new z-index
  		*/
  var setZIndex: js.UndefOr[js.Function1[/* zindex */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Displays the shadow under the target element
  		* @param targetEl String/HTMLElement/Ext.Element The id or element under which the shadow should display
  		*/
  var show: js.UndefOr[js.Function1[/* targetEl */ js.UndefOr[js.Any], Unit]] = js.native
}

object IShadow {
  @scala.inline
  def apply(): IShadow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IShadow]
  }
  @scala.inline
  implicit class IShadowOps[Self <: IShadow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.undefined)
        ret
    }
    @scala.inline
    def withIsVisible(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withRealign(
      value: (/* left */ js.UndefOr[Double], /* top */ js.UndefOr[Double], /* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realign")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutRealign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realign")(js.undefined)
        ret
    }
    @scala.inline
    def withSetOpacity(value: /* opacity */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOpacity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withSetZIndex(value: /* zindex */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setZIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setZIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: /* targetEl */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
  }
  
}

