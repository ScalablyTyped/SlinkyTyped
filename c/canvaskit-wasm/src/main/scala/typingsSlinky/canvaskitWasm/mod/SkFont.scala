package typingsSlinky.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkFont extends SkObject[SkFont] {
  def getScaleX(): Double = js.native
  def getSize(): Double = js.native
  def getSkewX(): Double = js.native
  def getTypeface(): SkTypeface = js.native
  def getWidths(chars: String): js.Array[Double] = js.native
  def measureText(text: String): Double = js.native
  def setScaleX(value: Double): Unit = js.native
  def setSize(value: Double): Unit = js.native
  def setSkewX(value: Double): Unit = js.native
  def setTypeface(value: SkTypeface): Unit = js.native
}

object SkFont {
  @scala.inline
  def apply(
    delete: () => Unit,
    deleteAfter: () => Unit,
    getScaleX: () => Double,
    getSize: () => Double,
    getSkewX: () => Double,
    getTypeface: () => SkTypeface,
    getWidths: String => js.Array[Double],
    isAliasOf: js.Any => Boolean,
    isDeleted: () => Boolean,
    measureText: String => Double,
    setScaleX: Double => Unit,
    setSize: Double => Unit,
    setSkewX: Double => Unit,
    setTypeface: SkTypeface => Unit
  ): SkFont = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), deleteAfter = js.Any.fromFunction0(deleteAfter), getScaleX = js.Any.fromFunction0(getScaleX), getSize = js.Any.fromFunction0(getSize), getSkewX = js.Any.fromFunction0(getSkewX), getTypeface = js.Any.fromFunction0(getTypeface), getWidths = js.Any.fromFunction1(getWidths), isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = js.Any.fromFunction0(isDeleted), measureText = js.Any.fromFunction1(measureText), setScaleX = js.Any.fromFunction1(setScaleX), setSize = js.Any.fromFunction1(setSize), setSkewX = js.Any.fromFunction1(setSkewX), setTypeface = js.Any.fromFunction1(setTypeface))
    __obj.asInstanceOf[SkFont]
  }
  @scala.inline
  implicit class SkFontOps[Self <: SkFont] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetScaleX(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScaleX")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSize(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSkewX(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSkewX")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTypeface(value: () => SkTypeface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTypeface")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWidths(value: String => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWidths")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMeasureText(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetScaleX(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScaleX")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSize(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSkewX(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSkewX")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTypeface(value: SkTypeface => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTypeface")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

