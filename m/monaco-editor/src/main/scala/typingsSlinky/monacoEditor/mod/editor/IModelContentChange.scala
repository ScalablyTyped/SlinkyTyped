package typingsSlinky.monacoEditor.mod.editor

import typingsSlinky.monacoEditor.mod.IRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModelContentChange extends js.Object {
  /**
    * The range that got replaced.
    */
  val range: IRange = js.native
  /**
    * The length of the range that got replaced.
    */
  val rangeLength: Double = js.native
  /**
    * The offset of the range that got replaced.
    */
  val rangeOffset: Double = js.native
  /**
    * The new text for the range.
    */
  val text: String = js.native
}

object IModelContentChange {
  @scala.inline
  def apply(range: IRange, rangeLength: Double, rangeOffset: Double, text: String): IModelContentChange = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], rangeLength = rangeLength.asInstanceOf[js.Any], rangeOffset = rangeOffset.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModelContentChange]
  }
  @scala.inline
  implicit class IModelContentChangeOps[Self <: IModelContentChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRange(value: IRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRangeLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRangeOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

