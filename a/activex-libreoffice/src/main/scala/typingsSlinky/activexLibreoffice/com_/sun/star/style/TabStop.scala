package typingsSlinky.activexLibreoffice.com_.sun.star.style

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This structure is used to specify a single tabulator stop. */
@js.native
trait TabStop extends js.Object {
  /** This field specifies the alignment of the text range before the tabulator. */
  var Alignment: TabAlign = js.native
  /** This field specifies which delimiter is used for the decimal. */
  var DecimalChar: String = js.native
  /** This field specifies the character that is used to fill up the space between the text in the text range and the tabulators. */
  var FillChar: String = js.native
  /** This field specifies the position of the tabulator in relation to the left border. */
  var Position: Double = js.native
}

object TabStop {
  @scala.inline
  def apply(Alignment: TabAlign, DecimalChar: String, FillChar: String, Position: Double): TabStop = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], DecimalChar = DecimalChar.asInstanceOf[js.Any], FillChar = FillChar.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabStop]
  }
  @scala.inline
  implicit class TabStopOps[Self <: TabStop] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignment(value: TabAlign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecimalChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DecimalChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FillChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Position")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

