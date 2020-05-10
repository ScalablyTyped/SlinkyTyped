package typingsSlinky.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWordAtPosition extends js.Object {
  /**
    * The column where the word ends.
    */
  val endColumn: Double = js.native
  /**
    * The column where the word starts.
    */
  val startColumn: Double = js.native
  /**
    * The word.
    */
  val word: String = js.native
}

object IWordAtPosition {
  @scala.inline
  def apply(endColumn: Double, startColumn: Double, word: String): IWordAtPosition = {
    val __obj = js.Dynamic.literal(endColumn = endColumn.asInstanceOf[js.Any], startColumn = startColumn.asInstanceOf[js.Any], word = word.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWordAtPosition]
  }
  @scala.inline
  implicit class IWordAtPositionOps[Self <: IWordAtPosition] (val x: Self) extends AnyVal {
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
    def withStartColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWord(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("word")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

