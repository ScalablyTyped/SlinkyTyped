package typingsSlinky.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RxNormEntity extends js.Object {
  /**
    * The extracted attributes that relate to the entity. The attributes recognized by InferRxNorm are DOSAGE, DURATION, FORM, FREQUENCY, RATE, ROUTE_OR_MODE, and STRENGTH.
    */
  var Attributes: js.UndefOr[RxNormAttributeList] = js.native
  /**
    * The 0-based character offset in the input text that shows where the entity begins. The offset returns the UTF-8 code point in the string.
    */
  var BeginOffset: js.UndefOr[Integer] = js.native
  /**
    * The category of the entity. The recognized categories are GENERIC or BRAND_NAME.
    */
  var Category: js.UndefOr[RxNormEntityCategory] = js.native
  /**
    * The 0-based character offset in the input text that shows where the entity ends. The offset returns the UTF-8 code point in the string.
    */
  var EndOffset: js.UndefOr[Integer] = js.native
  /**
    * The numeric identifier for the entity. This is a monotonically increasing id unique within this response rather than a global unique identifier.
    */
  var Id: js.UndefOr[Integer] = js.native
  /**
    *  The RxNorm concepts that the entity could refer to, along with a score indicating the likelihood of the match.
    */
  var RxNormConcepts: js.UndefOr[RxNormConceptList] = js.native
  /**
    * The level of confidence that Amazon Comprehend Medical has in the accuracy of the detected entity.
    */
  var Score: js.UndefOr[Float] = js.native
  /**
    * The segment of input text extracted from which the entity was detected.
    */
  var Text: js.UndefOr[OntologyLinkingBoundedLengthString] = js.native
  /**
    *  Contextual information for the entity.
    */
  var Traits: js.UndefOr[RxNormTraitList] = js.native
  /**
    *  Describes the specific type of entity. For InferRxNorm, the recognized entity type is MEDICATION.
    */
  var Type: js.UndefOr[RxNormEntityType] = js.native
}

object RxNormEntity {
  @scala.inline
  def apply(): RxNormEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RxNormEntity]
  }
  @scala.inline
  implicit class RxNormEntityOps[Self <: RxNormEntity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: RxNormAttributeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withBeginOffset(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BeginOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeginOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BeginOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withCategory(value: RxNormEntityCategory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Category")(js.undefined)
        ret
    }
    @scala.inline
    def withEndOffset(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withRxNormConcepts(value: RxNormConceptList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RxNormConcepts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRxNormConcepts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RxNormConcepts")(js.undefined)
        ret
    }
    @scala.inline
    def withScore(value: Float): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Score")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Score")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: OntologyLinkingBoundedLengthString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Text")(js.undefined)
        ret
    }
    @scala.inline
    def withTraits(value: RxNormTraitList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Traits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTraits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Traits")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: RxNormEntityType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}

