package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISignaturePromptInfoMetadataBased extends js.Object {
  var IsReferencedBySignatureObject: Boolean = js.native
  var MeaningPropertyID: Double = js.native
  var PromptInfoLookupPropertyID: Double = js.native
  var ReasonPropertyID: Double = js.native
  def Clone(): ISignaturePromptInfoMetadataBased = js.native
}

object ISignaturePromptInfoMetadataBased {
  @scala.inline
  def apply(
    Clone: () => ISignaturePromptInfoMetadataBased,
    IsReferencedBySignatureObject: Boolean,
    MeaningPropertyID: Double,
    PromptInfoLookupPropertyID: Double,
    ReasonPropertyID: Double
  ): ISignaturePromptInfoMetadataBased = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), IsReferencedBySignatureObject = IsReferencedBySignatureObject.asInstanceOf[js.Any], MeaningPropertyID = MeaningPropertyID.asInstanceOf[js.Any], PromptInfoLookupPropertyID = PromptInfoLookupPropertyID.asInstanceOf[js.Any], ReasonPropertyID = ReasonPropertyID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISignaturePromptInfoMetadataBased]
  }
  @scala.inline
  implicit class ISignaturePromptInfoMetadataBasedOps[Self <: ISignaturePromptInfoMetadataBased] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => ISignaturePromptInfoMetadataBased): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsReferencedBySignatureObject(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsReferencedBySignatureObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeaningPropertyID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MeaningPropertyID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPromptInfoLookupPropertyID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PromptInfoLookupPropertyID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReasonPropertyID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReasonPropertyID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

