package typingsSlinky.nodePgMigrate.anon

import typingsSlinky.nodePgMigrate.domainsTypesMod.CreateDomainFn
import typingsSlinky.nodePgMigrate.domainsTypesMod.DomainOptionsCreate
import typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reverse extends js.Object {
  
  def reverse(
    domainName: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    `type`: typingsSlinky.nodePgMigrate.generalTypesMod.Type
  ): String | js.Array[String] = js.native
  def reverse(
    domainName: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    `type`: typingsSlinky.nodePgMigrate.generalTypesMod.Type,
    domainOptions: DomainOptionsCreate with DropOptions
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: CreateDomainFn = js.native
}
