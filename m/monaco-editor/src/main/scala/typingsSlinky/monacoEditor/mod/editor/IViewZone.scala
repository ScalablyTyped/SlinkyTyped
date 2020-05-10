package typingsSlinky.monacoEditor.mod.editor

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IViewZone extends js.Object {
  /**
    * The column after which this zone should appear.
    * If not set, the maxLineColumn of `afterLineNumber` will be used.
    */
  var afterColumn: js.UndefOr[Double] = js.native
  /**
    * The line number after which this zone should appear.
    * Use 0 to place a view zone before the first line number.
    */
  var afterLineNumber: Double = js.native
  /**
    * The dom node of the view zone
    */
  var domNode: HTMLElement = js.native
  /**
    * The height in lines of the view zone.
    * If specified, `heightInPx` will be used instead of this.
    * If neither `heightInPx` nor `heightInLines` is specified, a default of `heightInLines` = 1 will be chosen.
    */
  var heightInLines: js.UndefOr[Double] = js.native
  /**
    * The height in px of the view zone.
    * If this is set, the editor will give preference to it rather than `heightInLines` above.
    * If neither `heightInPx` nor `heightInLines` is specified, a default of `heightInLines` = 1 will be chosen.
    */
  var heightInPx: js.UndefOr[Double] = js.native
  /**
    * An optional dom node for the view zone that will be placed in the margin area.
    */
  var marginDomNode: js.UndefOr[HTMLElement | Null] = js.native
  /**
    * The minimum width in px of the view zone.
    * If this is set, the editor will ensure that the scroll width is >= than this value.
    */
  var minWidthInPx: js.UndefOr[Double] = js.native
  /**
    * Callback which gives the height in pixels of the view zone.
    */
  var onComputedHeight: js.UndefOr[js.Function1[/* height */ Double, Unit]] = js.native
  /**
    * Callback which gives the relative top of the view zone as it appears (taking scrolling into account).
    */
  var onDomNodeTop: js.UndefOr[js.Function1[/* top */ Double, Unit]] = js.native
  /**
    * Suppress mouse down events.
    * If set, the editor will attach a mouse down listener to the view zone and .preventDefault on it.
    * Defaults to false
    */
  var suppressMouseDown: js.UndefOr[Boolean] = js.native
}

object IViewZone {
  @scala.inline
  def apply(afterLineNumber: Double, domNode: HTMLElement): IViewZone = {
    val __obj = js.Dynamic.literal(afterLineNumber = afterLineNumber.asInstanceOf[js.Any], domNode = domNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IViewZone]
  }
  @scala.inline
  implicit class IViewZoneOps[Self <: IViewZone] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterLineNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterLineNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomNode(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withHeightInLines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightInLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeightInLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightInLines")(js.undefined)
        ret
    }
    @scala.inline
    def withHeightInPx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightInPx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeightInPx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightInPx")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginDomNode(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginDomNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginDomNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginDomNode")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginDomNodeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginDomNode")(null)
        ret
    }
    @scala.inline
    def withMinWidthInPx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidthInPx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidthInPx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidthInPx")(js.undefined)
        ret
    }
    @scala.inline
    def withOnComputedHeight(value: /* height */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComputedHeight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnComputedHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComputedHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDomNodeTop(value: /* top */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDomNodeTop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDomNodeTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDomNodeTop")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressMouseDown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressMouseDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressMouseDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressMouseDown")(js.undefined)
        ret
    }
  }
  
}

