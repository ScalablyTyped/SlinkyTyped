package typingsSlinky.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VersionUpgradeEventObject extends js.Object {
  val DocumentVersion: String = js.native
  @JSName("InfoPath.VersionUpgradeEventObject_typekey")
  var InfoPathDotVersionUpgradeEventObject_typekey: VersionUpgradeEventObject = js.native
  var ReturnStatus: Boolean = js.native
  val SolutionVersion: String = js.native
  val XDocument: _XDocument = js.native
}

object VersionUpgradeEventObject {
  @scala.inline
  def apply(
    DocumentVersion: String,
    InfoPathDotVersionUpgradeEventObject_typekey: VersionUpgradeEventObject,
    ReturnStatus: Boolean,
    SolutionVersion: String,
    XDocument: _XDocument
  ): VersionUpgradeEventObject = {
    val __obj = js.Dynamic.literal(DocumentVersion = DocumentVersion.asInstanceOf[js.Any], ReturnStatus = ReturnStatus.asInstanceOf[js.Any], SolutionVersion = SolutionVersion.asInstanceOf[js.Any], XDocument = XDocument.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.VersionUpgradeEventObject_typekey")(InfoPathDotVersionUpgradeEventObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionUpgradeEventObject]
  }
  @scala.inline
  implicit class VersionUpgradeEventObjectOps[Self <: VersionUpgradeEventObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocumentVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfoPathDotVersionUpgradeEventObject_typekey(value: VersionUpgradeEventObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InfoPath.VersionUpgradeEventObject_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturnStatus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReturnStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSolutionVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SolutionVersion")(value.asInstanceOf[js.Any])
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

