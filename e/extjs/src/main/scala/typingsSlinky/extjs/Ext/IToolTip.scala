package typingsSlinky.extjs.Ext

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IToolTip
  extends typingsSlinky.extjs.Ext.tip.ITip {
  /** [Config Option] (String) */
  var anchor: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (Number) */
  var anchorOffset: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var anchorToTarget: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var autoHide: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var delegate: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (Number) */
  var dismissDelay: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var hideDelay: js.UndefOr[Double] = js.native
  /** [Config Option] (Number[]) */
  var mouseOffset: js.UndefOr[Array] = js.native
  /** [Method] Binds this ToolTip to the specified element
  		* @param t String/HTMLElement/Ext.Element The Element, HtmlElement, or ID of an element to bind to
  		*/
  var setTarget: js.UndefOr[js.Function1[/* t */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Number) */
  var showDelay: js.UndefOr[Double] = js.native
  /** [Config Option] (HTMLElement/Ext.Element/String) */
  var target: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var trackMouse: js.UndefOr[Boolean] = js.native
  /** [Property] (HTMLElement) */
  var triggerElement: js.UndefOr[HTMLElement] = js.native
}

object IToolTip {
  @scala.inline
  def apply(): IToolTip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IToolTip]
  }
  @scala.inline
  implicit class IToolTipOps[Self <: IToolTip] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchor(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(js.undefined)
        ret
    }
    @scala.inline
    def withAnchorOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchorOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withAnchorToTarget(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorToTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchorToTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorToTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoHide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHide")(js.undefined)
        ret
    }
    @scala.inline
    def withDelegate(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelegate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegate")(js.undefined)
        ret
    }
    @scala.inline
    def withDismissDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDismissDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withHideDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseOffset(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTarget(value: /* t */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTarget")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackMouse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackMouse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackMouse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackMouse")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerElement")(js.undefined)
        ret
    }
  }
  
}

