package typingsSlinky.nodePgMigrate.anon

import typingsSlinky.nodePgMigrate.domainsTypesMod.RenameDomainFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReverseRenameDomainFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: RenameDomainFn = js.native
  def reverse(
    oldDomainName: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    newDomainName: typingsSlinky.nodePgMigrate.generalTypesMod.Name
  ): String | js.Array[String] = js.native
}

