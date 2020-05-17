package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the value and settings of a scroll bar and makes it possible to register adjustment event listeners. */
@js.native
trait XScrollBar extends XInterface {
  /** returns the currently set increment for a block move. */
  var BlockIncrement: Double = js.native
  /** returns the currently set increment for a single line move. */
  var LineIncrement: Double = js.native
  /** returns the currently set maximum scroll value of the scroll bar. */
  var Maximum: Double = js.native
  /** returns the currently set {@link ScrollBarOrientation} of the scroll bar. */
  var Orientation: Double = js.native
  /** returns the current scroll value of the scroll bar. */
  var Value: Double = js.native
  /** returns the currently visible size of the scroll bar. */
  var VisibleSize: Double = js.native
  /** registers an adjustment event listener. */
  def addAdjustmentListener(l: XAdjustmentListener): Unit = js.native
  /** returns the currently set increment for a block move. */
  def getBlockIncrement(): Double = js.native
  /** returns the currently set increment for a single line move. */
  def getLineIncrement(): Double = js.native
  /** returns the currently set maximum scroll value of the scroll bar. */
  def getMaximum(): Double = js.native
  /** returns the currently set {@link ScrollBarOrientation} of the scroll bar. */
  def getOrientation(): Double = js.native
  /** returns the current scroll value of the scroll bar. */
  def getValue(): Double = js.native
  /** returns the currently visible size of the scroll bar. */
  def getVisibleSize(): Double = js.native
  /** unregisters an adjustment event listener. */
  def removeAdjustmentListener(l: XAdjustmentListener): Unit = js.native
  /** sets the increment for a block move. */
  def setBlockIncrement(n: Double): Unit = js.native
  /** sets the increment for a single line move. */
  def setLineIncrement(n: Double): Unit = js.native
  /** sets the maximum scroll value of the scroll bar. */
  def setMaximum(n: Double): Unit = js.native
  /** sets the {@link ScrollBarOrientation} of the scroll bar. */
  def setOrientation(n: Double): Unit = js.native
  /** sets the scroll value of the scroll bar. */
  def setValue(n: Double): Unit = js.native
  /** sets the scroll value, visible area and maximum scroll value of the scroll bar. */
  def setValues(nValue: Double, nVisible: Double, nMax: Double): Unit = js.native
  /** sets the visible size of the scroll bar. */
  def setVisibleSize(n: Double): Unit = js.native
}

object XScrollBar {
  @scala.inline
  def apply(
    BlockIncrement: Double,
    LineIncrement: Double,
    Maximum: Double,
    Orientation: Double,
    Value: Double,
    VisibleSize: Double,
    acquire: () => Unit,
    addAdjustmentListener: XAdjustmentListener => Unit,
    getBlockIncrement: () => Double,
    getLineIncrement: () => Double,
    getMaximum: () => Double,
    getOrientation: () => Double,
    getValue: () => Double,
    getVisibleSize: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeAdjustmentListener: XAdjustmentListener => Unit,
    setBlockIncrement: Double => Unit,
    setLineIncrement: Double => Unit,
    setMaximum: Double => Unit,
    setOrientation: Double => Unit,
    setValue: Double => Unit,
    setValues: (Double, Double, Double) => Unit,
    setVisibleSize: Double => Unit
  ): XScrollBar = {
    val __obj = js.Dynamic.literal(BlockIncrement = BlockIncrement.asInstanceOf[js.Any], LineIncrement = LineIncrement.asInstanceOf[js.Any], Maximum = Maximum.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], VisibleSize = VisibleSize.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addAdjustmentListener = js.Any.fromFunction1(addAdjustmentListener), getBlockIncrement = js.Any.fromFunction0(getBlockIncrement), getLineIncrement = js.Any.fromFunction0(getLineIncrement), getMaximum = js.Any.fromFunction0(getMaximum), getOrientation = js.Any.fromFunction0(getOrientation), getValue = js.Any.fromFunction0(getValue), getVisibleSize = js.Any.fromFunction0(getVisibleSize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeAdjustmentListener = js.Any.fromFunction1(removeAdjustmentListener), setBlockIncrement = js.Any.fromFunction1(setBlockIncrement), setLineIncrement = js.Any.fromFunction1(setLineIncrement), setMaximum = js.Any.fromFunction1(setMaximum), setOrientation = js.Any.fromFunction1(setOrientation), setValue = js.Any.fromFunction1(setValue), setValues = js.Any.fromFunction3(setValues), setVisibleSize = js.Any.fromFunction1(setVisibleSize))
    __obj.asInstanceOf[XScrollBar]
  }
  @scala.inline
  implicit class XScrollBarOps[Self <: XScrollBar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockIncrement(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockIncrement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineIncrement(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LineIncrement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaximum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Maximum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibleSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VisibleSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddAdjustmentListener(value: XAdjustmentListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAdjustmentListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetBlockIncrement(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBlockIncrement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLineIncrement(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLineIncrement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMaximum(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaximum")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOrientation(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOrientation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValue(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetVisibleSize(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVisibleSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveAdjustmentListener(value: XAdjustmentListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAdjustmentListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetBlockIncrement(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBlockIncrement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetLineIncrement(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLineIncrement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMaximum(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaximum")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOrientation(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOrientation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetValue(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetValues(value: (Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValues")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetVisibleSize(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVisibleSize")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

