package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OMathMatCol extends js.Object {
  var Align: WdOMathHorizAlignType = js.native
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Args: OMathArgs = js.native
  val ColIndex: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.OMathMatCol_typekey")
  var WordDotOMathMatCol_typekey: OMathMatCol = js.native
  def Delete(): Unit = js.native
}

object OMathMatCol {
  @scala.inline
  def apply(
    Align: WdOMathHorizAlignType,
    Application: Application,
    Args: OMathArgs,
    ColIndex: Double,
    Creator: Double,
    Delete: () => Unit,
    Parent: js.Any,
    WordDotOMathMatCol_typekey: OMathMatCol
  ): OMathMatCol = {
    val __obj = js.Dynamic.literal(Align = Align.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Args = Args.asInstanceOf[js.Any], ColIndex = ColIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathMatCol_typekey")(WordDotOMathMatCol_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathMatCol]
  }
  @scala.inline
  implicit class OMathMatColOps[Self <: OMathMatCol] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: WdOMathHorizAlignType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Align")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withColIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColIndex")(value.asInstanceOf[js.Any])
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
    def withWordDotOMathMatCol_typekey(value: OMathMatCol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.OMathMatCol_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

