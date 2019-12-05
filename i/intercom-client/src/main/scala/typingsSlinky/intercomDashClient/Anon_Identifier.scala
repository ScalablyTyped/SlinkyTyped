package typingsSlinky.intercomDashClient

import typingsSlinky.intercomDashClient.intercomDashClientStrings.lead
import typingsSlinky.intercomDashClient.visitorMod.VisitorIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Identifier extends js.Object {
  var identifier: VisitorIdentifier
  var `type`: lead
}

object Anon_Identifier {
  @scala.inline
  def apply(identifier: VisitorIdentifier, `type`: lead): Anon_Identifier = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Identifier]
  }
}

