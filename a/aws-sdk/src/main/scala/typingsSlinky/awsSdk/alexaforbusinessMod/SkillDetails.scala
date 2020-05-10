package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkillDetails extends js.Object {
  /**
    * The details about what the skill supports organized as bullet points.
    */
  var BulletPoints: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.BulletPoints] = js.native
  /**
    * The details about the developer that published the skill.
    */
  var DeveloperInfo: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.DeveloperInfo] = js.native
  /**
    * The URL of the end user license agreement.
    */
  var EndUserLicenseAgreement: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.EndUserLicenseAgreement] = js.native
  /**
    * The generic keywords associated with the skill that can be used to find a skill.
    */
  var GenericKeywords: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.GenericKeywords] = js.native
  /**
    * The phrase used to trigger the skill.
    */
  var InvocationPhrase: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.InvocationPhrase] = js.native
  /**
    * The updates added in bullet points.
    */
  var NewInThisVersionBulletPoints: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.NewInThisVersionBulletPoints] = js.native
  /**
    * The description of the product.
    */
  var ProductDescription: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.ProductDescription] = js.native
  /**
    * The date when the skill was released.
    */
  var ReleaseDate: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.ReleaseDate] = js.native
  /**
    * The list of reviews for the skill, including Key and Value pair.
    */
  var Reviews: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.Reviews] = js.native
  /**
    * The types of skills.
    */
  var SkillTypes: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.SkillTypes] = js.native
}

object SkillDetails {
  @scala.inline
  def apply(): SkillDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkillDetails]
  }
  @scala.inline
  implicit class SkillDetailsOps[Self <: SkillDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBulletPoints(value: BulletPoints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BulletPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBulletPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BulletPoints")(js.undefined)
        ret
    }
    @scala.inline
    def withDeveloperInfo(value: DeveloperInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeveloperInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeveloperInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeveloperInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withEndUserLicenseAgreement(value: EndUserLicenseAgreement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndUserLicenseAgreement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndUserLicenseAgreement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndUserLicenseAgreement")(js.undefined)
        ret
    }
    @scala.inline
    def withGenericKeywords(value: GenericKeywords): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GenericKeywords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenericKeywords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GenericKeywords")(js.undefined)
        ret
    }
    @scala.inline
    def withInvocationPhrase(value: InvocationPhrase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvocationPhrase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvocationPhrase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvocationPhrase")(js.undefined)
        ret
    }
    @scala.inline
    def withNewInThisVersionBulletPoints(value: NewInThisVersionBulletPoints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewInThisVersionBulletPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewInThisVersionBulletPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewInThisVersionBulletPoints")(js.undefined)
        ret
    }
    @scala.inline
    def withProductDescription(value: ProductDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withReleaseDate(value: ReleaseDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReleaseDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReleaseDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReleaseDate")(js.undefined)
        ret
    }
    @scala.inline
    def withReviews(value: Reviews): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reviews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReviews: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reviews")(js.undefined)
        ret
    }
    @scala.inline
    def withSkillTypes(value: SkillTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkillTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkillTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkillTypes")(js.undefined)
        ret
    }
  }
  
}

