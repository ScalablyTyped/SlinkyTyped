package typingsSlinky.monacoEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRange extends js.Object {
  /**
    * Column on which the range ends in line `endLineNumber`.
    */
  val endColumn: Double = js.native
  /**
    * Line number on which the range ends.
    */
  val endLineNumber: Double = js.native
  /**
    * Column on which the range starts in line `startLineNumber` (starts at 1).
    */
  val startColumn: Double = js.native
  /**
    * Line number on which the range starts (starts at 1).
    */
  val startLineNumber: Double = js.native
}

object IRange {
  @scala.inline
  def apply(endColumn: Double, endLineNumber: Double, startColumn: Double, startLineNumber: Double): IRange = {
    val __obj = js.Dynamic.literal(endColumn = endColumn.asInstanceOf[js.Any], endLineNumber = endLineNumber.asInstanceOf[js.Any], startColumn = startColumn.asInstanceOf[js.Any], startLineNumber = startLineNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRange]
  }
  @scala.inline
  implicit class IRangeOps[Self <: IRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndLineNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endLineNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartLineNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startLineNumber")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

