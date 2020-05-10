package typingsSlinky.activexWord

import typingsSlinky.activexWord.Word.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBlockType extends js.Object {
  val BlockType: String = js.native
  val Category: String = js.native
  val Name: String = js.native
  val Range: typingsSlinky.activexWord.Word.Range = js.native
  val Template: String = js.native
}

object AnonBlockType {
  @scala.inline
  def apply(BlockType: String, Category: String, Name: String, Range: Range, Template: String): AnonBlockType = {
    val __obj = js.Dynamic.literal(BlockType = BlockType.asInstanceOf[js.Any], Category = Category.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Template = Template.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBlockType]
  }
  @scala.inline
  implicit class AnonBlockTypeOps[Self <: AnonBlockType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Template")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

