package typingsSlinky.nodePgMigrate.anon

import typingsSlinky.nodePgMigrate.domainsTypesMod.RenameDomainFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseRenameDomainFn extends js.Object {
  
  def reverse(
    oldDomainName: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    newDomainName: typingsSlinky.nodePgMigrate.generalTypesMod.Name
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: RenameDomainFn = js.native
}
