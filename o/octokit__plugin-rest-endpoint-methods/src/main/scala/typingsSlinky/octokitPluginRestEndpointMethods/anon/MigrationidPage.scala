package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationidPage extends js.Object {
  var migration_id: Required
  var page: Type
  var per_page: Type
}

object MigrationidPage {
  @scala.inline
  def apply(migration_id: Required, page: Type, per_page: Type): MigrationidPage = {
    val __obj = js.Dynamic.literal(migration_id = migration_id.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationidPage]
  }
}

