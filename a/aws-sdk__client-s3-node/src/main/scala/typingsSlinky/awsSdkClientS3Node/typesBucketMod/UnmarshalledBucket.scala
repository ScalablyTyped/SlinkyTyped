package typingsSlinky.awsSdkClientS3Node.typesBucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledBucket extends Bucket {
  /**
    * <p>Date the bucket was created.</p>
    */
  @JSName("CreationDate")
  var CreationDate_UnmarshalledBucket: js.UndefOr[js.Date] = js.undefined
}

object UnmarshalledBucket {
  @scala.inline
  def apply(CreationDate: js.Date = null, Name: String = null): UnmarshalledBucket = {
    val __obj = js.Dynamic.literal()
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledBucket]
  }
}

