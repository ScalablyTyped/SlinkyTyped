package typingsSlinky.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICD10CMConcept extends js.Object {
  /**
    * The ICD-10-CM code that identifies the concept found in the knowledge base from the Centers for Disease Control.
    */
  var Code: js.UndefOr[String] = js.native
  /**
    * The long description of the ICD-10-CM code in the ontology.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The level of confidence that Amazon Comprehend Medical has that the entity is accurately linked to an ICD-10-CM concept.
    */
  var Score: js.UndefOr[Float] = js.native
}

object ICD10CMConcept {
  @scala.inline
  def apply(): ICD10CMConcept = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICD10CMConcept]
  }
  @scala.inline
  implicit class ICD10CMConceptOps[Self <: ICD10CMConcept] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Code")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
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
  }
  
}

