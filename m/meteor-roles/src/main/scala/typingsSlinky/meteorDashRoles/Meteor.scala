package typingsSlinky.meteorDashRoles

import typingsSlinky.meteor.Mongo.Collection
import typingsSlinky.meteorDashRoles.Roles.Role
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// module
@JSGlobal("Meteor")
@js.native
object Meteor extends js.Object {
  var roles: Collection[Role] = js.native
}

