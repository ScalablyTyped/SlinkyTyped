package typingsSlinky.intercomClient.companyMod

import typingsSlinky.intercomClient.anon.Companyid
import typingsSlinky.intercomClient.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.intercomClient.anon.Id
  - typingsSlinky.intercomClient.anon.Companyid
*/
trait CompanyIdentifier extends js.Object

object CompanyIdentifier {
  @scala.inline
  implicit def apply(value: Companyid): CompanyIdentifier = value.asInstanceOf[CompanyIdentifier]
  @scala.inline
  implicit def apply(value: Id): CompanyIdentifier = value.asInstanceOf[CompanyIdentifier]
}

