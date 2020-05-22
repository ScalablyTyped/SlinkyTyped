package typingsSlinky.intercomClient.anon

import typingsSlinky.intercomClient.companyMod.Company
import typingsSlinky.intercomClient.intercomClientStrings.companyDotlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Companies extends js.Object {
  var companies: js.Array[Company]
  var `type`: companyDotlist
}

object Companies {
  @scala.inline
  def apply(companies: js.Array[Company], `type`: companyDotlist): Companies = {
    val __obj = js.Dynamic.literal(companies = companies.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Companies]
  }
}

