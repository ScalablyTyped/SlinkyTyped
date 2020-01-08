package typingsSlinky.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePortfolioInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typingsSlinky.awsDashSdk.clientsServicecatalogMod.AcceptLanguage] = js.native
  /**
    * The portfolio identifier.
    */
  var Id: typingsSlinky.awsDashSdk.clientsServicecatalogMod.Id = js.native
}

object DeletePortfolioInput {
  @scala.inline
  def apply(Id: Id, AcceptLanguage: AcceptLanguage = null): DeletePortfolioInput = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePortfolioInput]
  }
}

