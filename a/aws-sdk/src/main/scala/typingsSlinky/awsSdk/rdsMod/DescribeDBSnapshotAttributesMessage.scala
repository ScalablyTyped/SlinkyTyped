package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDBSnapshotAttributesMessage extends js.Object {
  /**
    * The identifier for the DB snapshot to describe the attributes for.
    */
  var DBSnapshotIdentifier: String = js.native
}

object DescribeDBSnapshotAttributesMessage {
  @scala.inline
  def apply(DBSnapshotIdentifier: String): DescribeDBSnapshotAttributesMessage = {
    val __obj = js.Dynamic.literal(DBSnapshotIdentifier = DBSnapshotIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDBSnapshotAttributesMessage]
  }
  @scala.inline
  implicit class DescribeDBSnapshotAttributesMessageOps[Self <: DescribeDBSnapshotAttributesMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDBSnapshotIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBSnapshotIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

