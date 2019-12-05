package typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesUnderscoreBucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledBucket extends _Bucket {
  /**
    * <p>Date the bucket was created.</p>
    */
  @JSName("CreationDate")
  var CreationDate__UnmarshalledBucket: js.UndefOr[js.Date] = js.undefined
}

object _UnmarshalledBucket {
  @scala.inline
  def apply(CreationDate: js.Date = null, Name: String = null): _UnmarshalledBucket = {
    val __obj = js.Dynamic.literal()
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledBucket]
  }
}

