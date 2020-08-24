package typingsSlinky.nodePgMigrate.anon

import typingsSlinky.nodePgMigrate.viewsMaterializedTypesMod.RefreshMaterializedViewFn
import typingsSlinky.nodePgMigrate.viewsMaterializedTypesMod.RefreshMaterializedViewOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReverseRefreshMaterializedViewFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: RefreshMaterializedViewFn = js.native
  def reverse(viewName: typingsSlinky.nodePgMigrate.generalTypesMod.Name): String | js.Array[String] = js.native
  def reverse(
    viewName: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    options: RefreshMaterializedViewOptions
  ): String | js.Array[String] = js.native
}

