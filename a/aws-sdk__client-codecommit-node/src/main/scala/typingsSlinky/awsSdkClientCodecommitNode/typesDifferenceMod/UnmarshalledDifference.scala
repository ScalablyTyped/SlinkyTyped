package typingsSlinky.awsSdkClientCodecommitNode.typesDifferenceMod

import typingsSlinky.awsSdkClientCodecommitNode.typesBlobMetadataMod.UnmarshalledBlobMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledDifference extends Difference {
  /**
    * <p>Information about an <code>afterBlob</code> data type object, including the ID, the file mode permission code, and the path.</p>
    */
  @JSName("afterBlob")
  var afterBlob_UnmarshalledDifference: js.UndefOr[UnmarshalledBlobMetadata] = js.native
  /**
    * <p>Information about a <code>beforeBlob</code> data type object, including the ID, the file mode permission code, and the path.</p>
    */
  @JSName("beforeBlob")
  var beforeBlob_UnmarshalledDifference: js.UndefOr[UnmarshalledBlobMetadata] = js.native
}

object UnmarshalledDifference {
  @scala.inline
  def apply(): UnmarshalledDifference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledDifference]
  }
  @scala.inline
  implicit class UnmarshalledDifferenceOps[Self <: UnmarshalledDifference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterBlob(value: UnmarshalledBlobMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterBlob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterBlob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterBlob")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeBlob(value: UnmarshalledBlobMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeBlob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeBlob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeBlob")(js.undefined)
        ret
    }
  }
  
}

