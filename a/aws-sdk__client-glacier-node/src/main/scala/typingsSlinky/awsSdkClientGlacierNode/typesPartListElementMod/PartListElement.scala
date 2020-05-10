package typingsSlinky.awsSdkClientGlacierNode.typesPartListElementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartListElement extends js.Object {
  /**
    * <p>The byte range of a part, inclusive of the upper value of the range.</p>
    */
  var RangeInBytes: js.UndefOr[String] = js.native
  /**
    * <p>The SHA256 tree hash value that Amazon Glacier calculated for the part. This field is never <code>null</code>.</p>
    */
  var SHA256TreeHash: js.UndefOr[String] = js.native
}

object PartListElement {
  @scala.inline
  def apply(): PartListElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartListElement]
  }
  @scala.inline
  implicit class PartListElementOps[Self <: PartListElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRangeInBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RangeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeInBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RangeInBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withSHA256TreeHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SHA256TreeHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSHA256TreeHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SHA256TreeHash")(js.undefined)
        ret
    }
  }
  
}

