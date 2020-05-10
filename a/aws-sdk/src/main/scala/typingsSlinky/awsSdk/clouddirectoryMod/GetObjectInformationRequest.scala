package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetObjectInformationRequest extends js.Object {
  /**
    * The consistency level at which to retrieve the object information.
    */
  var ConsistencyLevel: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.ConsistencyLevel] = js.native
  /**
    * The ARN of the directory being retrieved.
    */
  var DirectoryArn: Arn = js.native
  /**
    * A reference to the object.
    */
  var ObjectReference: typingsSlinky.awsSdk.clouddirectoryMod.ObjectReference = js.native
}

object GetObjectInformationRequest {
  @scala.inline
  def apply(DirectoryArn: Arn, ObjectReference: ObjectReference): GetObjectInformationRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], ObjectReference = ObjectReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectInformationRequest]
  }
  @scala.inline
  implicit class GetObjectInformationRequestOps[Self <: GetObjectInformationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectoryArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectReference(value: ObjectReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConsistencyLevel(value: ConsistencyLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConsistencyLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsistencyLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConsistencyLevel")(js.undefined)
        ret
    }
  }
  
}

