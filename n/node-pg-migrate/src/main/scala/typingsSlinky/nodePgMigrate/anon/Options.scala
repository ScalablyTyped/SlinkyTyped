package typingsSlinky.nodePgMigrate.anon

import typingsSlinky.nodePgMigrate.mod.LikeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var options: js.UndefOr[LikeOptions] = js.undefined
  var table: typingsSlinky.nodePgMigrate.mod.Name
}

object Options {
  @scala.inline
  def apply(table: typingsSlinky.nodePgMigrate.mod.Name, options: LikeOptions = null): Options = {
    val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

