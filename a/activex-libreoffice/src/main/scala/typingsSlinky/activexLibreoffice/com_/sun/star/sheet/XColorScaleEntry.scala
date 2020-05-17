package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.com_.sun.star.util.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XColorScaleEntry extends js.Object {
  var Color: typingsSlinky.activexLibreoffice.com_.sun.star.util.Color = js.native
  var Formula: String = js.native
  /** See {@link com.sun.star.sheet.ColorScaleEntryType} for possible values */
  var Type: Double = js.native
  def getColor(): Color = js.native
  def getFormula(): String = js.native
  /** See {@link com.sun.star.sheet.ColorScaleEntryType} for possible values */
  def getType(): Double = js.native
  def setColor(Color: Color): Unit = js.native
  def setFormula(Formula: String): Unit = js.native
  /** See {@link com.sun.star.sheet.ColorScaleEntryType} for possible values */
  def setType(Type: Double): Unit = js.native
}

object XColorScaleEntry {
  @scala.inline
  def apply(
    Color: Color,
    Formula: String,
    Type: Double,
    getColor: () => Color,
    getFormula: () => String,
    getType: () => Double,
    setColor: Color => Unit,
    setFormula: String => Unit,
    setType: Double => Unit
  ): XColorScaleEntry = {
    val __obj = js.Dynamic.literal(Color = Color.asInstanceOf[js.Any], Formula = Formula.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], getColor = js.Any.fromFunction0(getColor), getFormula = js.Any.fromFunction0(getFormula), getType = js.Any.fromFunction0(getType), setColor = js.Any.fromFunction1(setColor), setFormula = js.Any.fromFunction1(setFormula), setType = js.Any.fromFunction1(setType))
    __obj.asInstanceOf[XColorScaleEntry]
  }
  @scala.inline
  implicit class XColorScaleEntryOps[Self <: XColorScaleEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormula(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Formula")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetColor(value: () => Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFormula(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFormula")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetType(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetColor(value: Color => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetFormula(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFormula")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetType(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setType")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

