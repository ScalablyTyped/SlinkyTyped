package typingsSlinky.awsSdkClientS3Node.typesPartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledPart extends Part {
  /**
    * <p>Date and time at which the part was uploaded.</p>
    */
  @JSName("LastModified")
  var LastModified_UnmarshalledPart: js.UndefOr[js.Date] = js.undefined
}

object UnmarshalledPart {
  @scala.inline
  def apply(
    ETag: String = null,
    LastModified: js.Date = null,
    PartNumber: js.UndefOr[Double] = js.undefined,
    Size: js.UndefOr[Double] = js.undefined
  ): UnmarshalledPart = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag.asInstanceOf[js.Any])
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified.asInstanceOf[js.Any])
    if (!js.isUndefined(PartNumber)) __obj.updateDynamic("PartNumber")(PartNumber.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Size)) __obj.updateDynamic("Size")(Size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledPart]
  }
}

