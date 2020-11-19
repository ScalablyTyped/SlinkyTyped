package typingsSlinky.nodePgMigrate.anon

import typingsSlinky.nodePgMigrate.generalTypesMod.IfExistsOption
import typingsSlinky.nodePgMigrate.rolesTypesMod.CreateRoleFn
import typingsSlinky.nodePgMigrate.rolesTypesMod.RoleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseCreateRoleFn extends js.Object {
  
  def reverse(roleName: typingsSlinky.nodePgMigrate.generalTypesMod.Name): String | js.Array[String] = js.native
  def reverse(
    roleName: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    roleOptions: RoleOptions with IfExistsOption
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: CreateRoleFn = js.native
}
