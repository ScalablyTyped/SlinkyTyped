package typingsSlinky.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileConverters extends js.Object {
  val Count: Double = js.native
  @JSName("PowerPoint.FileConverters_typekey")
  var PowerPointDotFileConverters_typekey: FileConverters = js.native
  def Item(Index: js.Any): FileConverter = js.native
}

object FileConverters {
  @scala.inline
  def apply(Count: Double, Item: js.Any => FileConverter, PowerPointDotFileConverters_typekey: FileConverters): FileConverters = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.updateDynamic("PowerPoint.FileConverters_typekey")(PowerPointDotFileConverters_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileConverters]
  }
  @scala.inline
  implicit class FileConvertersOps[Self <: FileConverters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: js.Any => FileConverter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPowerPointDotFileConverters_typekey(value: FileConverters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.FileConverters_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

