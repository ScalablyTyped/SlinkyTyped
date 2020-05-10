package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBSnapshotAttributesResult extends js.Object {
  /**
    * The list of attributes and values for the manual DB snapshot.
    */
  var DBSnapshotAttributes: js.UndefOr[DBSnapshotAttributeList] = js.native
  /**
    * The identifier of the manual DB snapshot that the attributes apply to.
    */
  var DBSnapshotIdentifier: js.UndefOr[String] = js.native
}

object DBSnapshotAttributesResult {
  @scala.inline
  def apply(): DBSnapshotAttributesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBSnapshotAttributesResult]
  }
  @scala.inline
  implicit class DBSnapshotAttributesResultOps[Self <: DBSnapshotAttributesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDBSnapshotAttributes(value: DBSnapshotAttributeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBSnapshotAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBSnapshotAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBSnapshotAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withDBSnapshotIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBSnapshotIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBSnapshotIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBSnapshotIdentifier")(js.undefined)
        ret
    }
  }
  
}

