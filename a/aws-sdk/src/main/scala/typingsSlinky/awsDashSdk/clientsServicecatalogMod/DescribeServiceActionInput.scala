package typingsSlinky.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeServiceActionInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typingsSlinky.awsDashSdk.clientsServicecatalogMod.AcceptLanguage] = js.native
  /**
    * The self-service action identifier.
    */
  var Id: typingsSlinky.awsDashSdk.clientsServicecatalogMod.Id = js.native
}

object DescribeServiceActionInput {
  @scala.inline
  def apply(Id: Id, AcceptLanguage: AcceptLanguage = null): DescribeServiceActionInput = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeServiceActionInput]
  }
}

