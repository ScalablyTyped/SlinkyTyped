package typingsSlinky.gapiClientGenomics.gapi.client.genomics

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeVariantsRequest extends js.Object {
  /**
    * A mapping between info field keys and the InfoMergeOperations to
    * be performed on them.
    */
  var infoMergeConfig: js.UndefOr[Record[String, String]] = js.native
  /** The destination variant set. */
  var variantSetId: js.UndefOr[String] = js.native
  /** The variants to be merged with existing variants. */
  var variants: js.UndefOr[js.Array[Variant]] = js.native
}

object MergeVariantsRequest {
  @scala.inline
  def apply(): MergeVariantsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeVariantsRequest]
  }
  @scala.inline
  implicit class MergeVariantsRequestOps[Self <: MergeVariantsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInfoMergeConfig(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoMergeConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfoMergeConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoMergeConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withVariantSetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variantSetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariantSetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variantSetId")(js.undefined)
        ret
    }
    @scala.inline
    def withVariants(value: js.Array[Variant]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariants: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variants")(js.undefined)
        ret
    }
  }
  
}

