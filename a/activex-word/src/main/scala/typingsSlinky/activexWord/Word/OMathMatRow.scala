package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OMathMatRow extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Args: OMathArgs = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  val RowIndex: Double = js.native
  @JSName("Word.OMathMatRow_typekey")
  var WordDotOMathMatRow_typekey: OMathMatRow = js.native
  def Delete(): Unit = js.native
}

object OMathMatRow {
  @scala.inline
  def apply(
    Application: Application,
    Args: OMathArgs,
    Creator: Double,
    Delete: () => Unit,
    Parent: js.Any,
    RowIndex: Double,
    WordDotOMathMatRow_typekey: OMathMatRow
  ): OMathMatRow = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Args = Args.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Parent = Parent.asInstanceOf[js.Any], RowIndex = RowIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathMatRow_typekey")(WordDotOMathMatRow_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathMatRow]
  }
  @scala.inline
  implicit class OMathMatRowOps[Self <: OMathMatRow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArgs(value: OMathArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RowIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotOMathMatRow_typekey(value: OMathMatRow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.OMathMatRow_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

