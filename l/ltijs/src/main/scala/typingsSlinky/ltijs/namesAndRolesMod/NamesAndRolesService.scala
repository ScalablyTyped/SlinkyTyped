package typingsSlinky.ltijs.namesAndRolesMod

import typingsSlinky.ltijs.idTokenMod.IdToken
import typingsSlinky.ltijs.ltijsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamesAndRolesService extends js.Object {
  def getMembers(idtoken: IdToken): js.Promise[MembersResult | `false`] = js.native
  def getMembers(idtoken: IdToken, filters: MemberFilters): js.Promise[MembersResult | `false`] = js.native
}

