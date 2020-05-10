package typingsSlinky.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RxNormAttribute extends js.Object {
  /**
    * The 0-based character offset in the input text that shows where the attribute begins. The offset returns the UTF-8 code point in the string.
    */
  var BeginOffset: js.UndefOr[Integer] = js.native
  /**
    * The 0-based character offset in the input text that shows where the attribute ends. The offset returns the UTF-8 code point in the string.
    */
  var EndOffset: js.UndefOr[Integer] = js.native
  /**
    * The numeric identifier for this attribute. This is a monotonically increasing id unique within this response rather than a global unique identifier.
    */
  var Id: js.UndefOr[Integer] = js.native
  /**
    * The level of confidence that Amazon Comprehend Medical has that the attribute is accurately linked to an entity.
    */
  var RelationshipScore: js.UndefOr[Float] = js.native
  /**
    * The level of confidence that Comprehend Medical has that the segment of text is correctly recognized as an attribute.
    */
  var Score: js.UndefOr[Float] = js.native
  /**
    * The segment of input text which corresponds to the detected attribute.
    */
  var Text: js.UndefOr[String] = js.native
  /**
    * Contextual information for the attribute. InferRxNorm recognizes the trait NEGATION for attributes, i.e. that the patient is not taking a specific dose or form of a medication.
    */
  var Traits: js.UndefOr[RxNormTraitList] = js.native
  /**
    * The type of attribute. The types of attributes recognized by InferRxNorm are BRAND_NAME and GENERIC_NAME.
    */
  var Type: js.UndefOr[RxNormAttributeType] = js.native
}

object RxNormAttribute {
  @scala.inline
  def apply(): RxNormAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RxNormAttribute]
  }
  @scala.inline
  implicit class RxNormAttributeOps[Self <: RxNormAttribute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withRelationshipScore(value: Float): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelationshipScore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelationshipScore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelationshipScore")(js.undefined)
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
    def withText(value: String): Self = {
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
    def withType(value: RxNormAttributeType): Self = {
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

