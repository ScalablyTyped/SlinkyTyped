package typingsSlinky.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICD10CMEntity extends js.Object {
  /**
    * The detected attributes that relate to the entity. An extracted segment of the text that is an attribute of an entity, or otherwise related to an entity, such as the nature of a medical condition.
    */
  var Attributes: js.UndefOr[ICD10CMAttributeList] = js.native
  /**
    * The 0-based character offset in the input text that shows where the entity begins. The offset returns the UTF-8 code point in the string.
    */
  var BeginOffset: js.UndefOr[Integer] = js.native
  /**
    *  The category of the entity. InferICD10CM detects entities in the MEDICAL_CONDITION category. 
    */
  var Category: js.UndefOr[ICD10CMEntityCategory] = js.native
  /**
    * The 0-based character offset in the input text that shows where the entity ends. The offset returns the UTF-8 code point in the string.
    */
  var EndOffset: js.UndefOr[Integer] = js.native
  /**
    * The ICD-10-CM concepts that the entity could refer to, along with a score indicating the likelihood of the match.
    */
  var ICD10CMConcepts: js.UndefOr[ICD10CMConceptList] = js.native
  /**
    * The numeric identifier for the entity. This is a monotonically increasing id unique within this response rather than a global unique identifier.
    */
  var Id: js.UndefOr[Integer] = js.native
  /**
    * The level of confidence that Amazon Comprehend Medical has in the accuracy of the detection.
    */
  var Score: js.UndefOr[Float] = js.native
  /**
    * The segment of input text that is matched to the detected entity.
    */
  var Text: js.UndefOr[OntologyLinkingBoundedLengthString] = js.native
  /**
    * Provides Contextual information for the entity. The traits recognized by InferICD10CM are DIAGNOSIS, SIGN, SYMPTOM, and NEGATION. 
    */
  var Traits: js.UndefOr[ICD10CMTraitList] = js.native
  /**
    * Describes the specific type of entity with category of entities. InferICD10CM detects entities of the type DX_NAME.
    */
  var Type: js.UndefOr[ICD10CMEntityType] = js.native
}

object ICD10CMEntity {
  @scala.inline
  def apply(): ICD10CMEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICD10CMEntity]
  }
  @scala.inline
  implicit class ICD10CMEntityOps[Self <: ICD10CMEntity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: ICD10CMAttributeList): Self = {
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
    def withCategory(value: ICD10CMEntityCategory): Self = {
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
    def withICD10CMConcepts(value: ICD10CMConceptList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ICD10CMConcepts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutICD10CMConcepts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ICD10CMConcepts")(js.undefined)
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
    def withTraits(value: ICD10CMTraitList): Self = {
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
    def withType(value: ICD10CMEntityType): Self = {
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

