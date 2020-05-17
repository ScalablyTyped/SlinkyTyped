package typingsSlinky.activexLibreoffice.com_.sun.star.chart2

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.RectanglePoint
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XLabeled extends js.Object {
  var Label: XTitle = js.native
  var LabelAnchor: RectanglePoint = js.native
  var Offset: SafeArray[Double] = js.native
  var OwnAnchor: RectanglePoint = js.native
  def getLabel(): XTitle = js.native
  def getLabelAnchor(): RectanglePoint = js.native
  def getOffset(): SafeArray[Double] = js.native
  def getOwnAnchor(): RectanglePoint = js.native
  def setLabel(xTitle: XTitle): Unit = js.native
  def setLabelAnchor(aAnchorPoint: RectanglePoint): Unit = js.native
  def setOffset(aOffsetVector: SeqEquiv[Double]): Unit = js.native
  def setOwnAnchor(aAnchorPoint: RectanglePoint): Unit = js.native
}

object XLabeled {
  @scala.inline
  def apply(
    Label: XTitle,
    LabelAnchor: RectanglePoint,
    Offset: SafeArray[Double],
    OwnAnchor: RectanglePoint,
    getLabel: () => XTitle,
    getLabelAnchor: () => RectanglePoint,
    getOffset: () => SafeArray[Double],
    getOwnAnchor: () => RectanglePoint,
    setLabel: XTitle => Unit,
    setLabelAnchor: RectanglePoint => Unit,
    setOffset: SeqEquiv[Double] => Unit,
    setOwnAnchor: RectanglePoint => Unit
  ): XLabeled = {
    val __obj = js.Dynamic.literal(Label = Label.asInstanceOf[js.Any], LabelAnchor = LabelAnchor.asInstanceOf[js.Any], Offset = Offset.asInstanceOf[js.Any], OwnAnchor = OwnAnchor.asInstanceOf[js.Any], getLabel = js.Any.fromFunction0(getLabel), getLabelAnchor = js.Any.fromFunction0(getLabelAnchor), getOffset = js.Any.fromFunction0(getOffset), getOwnAnchor = js.Any.fromFunction0(getOwnAnchor), setLabel = js.Any.fromFunction1(setLabel), setLabelAnchor = js.Any.fromFunction1(setLabelAnchor), setOffset = js.Any.fromFunction1(setOffset), setOwnAnchor = js.Any.fromFunction1(setOwnAnchor))
    __obj.asInstanceOf[XLabeled]
  }
  @scala.inline
  implicit class XLabeledOps[Self <: XLabeled] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabel(value: XTitle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelAnchor(value: RectanglePoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LabelAnchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: SafeArray[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnAnchor(value: RectanglePoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnAnchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetLabel(value: () => XTitle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLabelAnchor(value: () => RectanglePoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabelAnchor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOffset(value: () => SafeArray[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOffset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOwnAnchor(value: () => RectanglePoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOwnAnchor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetLabel(value: XTitle => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetLabelAnchor(value: RectanglePoint => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLabelAnchor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOffset(value: SeqEquiv[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOffset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOwnAnchor(value: RectanglePoint => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOwnAnchor")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

