package typingsSlinky.awsSdkClientCodecommitNode.typesDifferenceMod

import typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.A
import typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.D
import typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.M
import typingsSlinky.awsSdkClientCodecommitNode.typesBlobMetadataMod.BlobMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Difference extends js.Object {
  /**
    * <p>Information about an <code>afterBlob</code> data type object, including the ID, the file mode permission code, and the path.</p>
    */
  var afterBlob: js.UndefOr[BlobMetadata] = js.native
  /**
    * <p>Information about a <code>beforeBlob</code> data type object, including the ID, the file mode permission code, and the path.</p>
    */
  var beforeBlob: js.UndefOr[BlobMetadata] = js.native
  /**
    * <p>Whether the change type of the difference is an addition (A), deletion (D), or modification (M).</p>
    */
  var changeType: js.UndefOr[A | M | D | String] = js.native
}

object Difference {
  @scala.inline
  def apply(): Difference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Difference]
  }
  @scala.inline
  implicit class DifferenceOps[Self <: Difference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterBlob(value: BlobMetadata): Self = {
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
    def withBeforeBlob(value: BlobMetadata): Self = {
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
    @scala.inline
    def withChangeType(value: A | M | D | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeType")(js.undefined)
        ret
    }
  }
  
}

