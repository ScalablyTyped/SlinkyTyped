package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociatePrincipalWithPortfolioInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  /**
    * The portfolio identifier.
    */
  var PortfolioId: Id = js.native
  /**
    * The ARN of the principal (IAM user, role, or group).
    */
  var PrincipalARN: typingsSlinky.awsSdk.servicecatalogMod.PrincipalARN = js.native
  /**
    * The principal type. The supported value is IAM.
    */
  var PrincipalType: typingsSlinky.awsSdk.servicecatalogMod.PrincipalType = js.native
}

object AssociatePrincipalWithPortfolioInput {
  @scala.inline
  def apply(PortfolioId: Id, PrincipalARN: PrincipalARN, PrincipalType: PrincipalType): AssociatePrincipalWithPortfolioInput = {
    val __obj = js.Dynamic.literal(PortfolioId = PortfolioId.asInstanceOf[js.Any], PrincipalARN = PrincipalARN.asInstanceOf[js.Any], PrincipalType = PrincipalType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociatePrincipalWithPortfolioInput]
  }
  @scala.inline
  implicit class AssociatePrincipalWithPortfolioInputOps[Self <: AssociatePrincipalWithPortfolioInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPortfolioId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PortfolioId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrincipalARN(value: PrincipalARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrincipalARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrincipalType(value: PrincipalType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrincipalType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAcceptLanguage(value: AcceptLanguage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AcceptLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AcceptLanguage")(js.undefined)
        ret
    }
  }
  
}

