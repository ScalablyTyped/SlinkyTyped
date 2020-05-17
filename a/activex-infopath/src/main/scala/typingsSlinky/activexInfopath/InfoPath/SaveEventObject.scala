package typingsSlinky.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SaveEventObject extends js.Object {
  val FileName: String = js.native
  @JSName("InfoPath.SaveEventObject_typekey")
  var InfoPathDotSaveEventObject_typekey: SaveEventObject = js.native
  var IsCancelled: Boolean = js.native
  val IsSaveAs: Boolean = js.native
  var ReturnStatus: Boolean = js.native
  val XDocument: _XDocument = js.native
  def PerformSaveOperation(): Boolean = js.native
}

object SaveEventObject {
  @scala.inline
  def apply(
    FileName: String,
    InfoPathDotSaveEventObject_typekey: SaveEventObject,
    IsCancelled: Boolean,
    IsSaveAs: Boolean,
    PerformSaveOperation: () => Boolean,
    ReturnStatus: Boolean,
    XDocument: _XDocument
  ): SaveEventObject = {
    val __obj = js.Dynamic.literal(FileName = FileName.asInstanceOf[js.Any], IsCancelled = IsCancelled.asInstanceOf[js.Any], IsSaveAs = IsSaveAs.asInstanceOf[js.Any], PerformSaveOperation = js.Any.fromFunction0(PerformSaveOperation), ReturnStatus = ReturnStatus.asInstanceOf[js.Any], XDocument = XDocument.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.SaveEventObject_typekey")(InfoPathDotSaveEventObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveEventObject]
  }
  @scala.inline
  implicit class SaveEventObjectOps[Self <: SaveEventObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfoPathDotSaveEventObject_typekey(value: SaveEventObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InfoPath.SaveEventObject_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCancelled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsCancelled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSaveAs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsSaveAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPerformSaveOperation(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PerformSaveOperation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReturnStatus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReturnStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXDocument(value: _XDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XDocument")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

