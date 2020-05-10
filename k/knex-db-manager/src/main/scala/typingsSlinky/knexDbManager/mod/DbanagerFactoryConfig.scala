package typingsSlinky.knexDbManager.mod

import typingsSlinky.knex.mod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DbanagerFactoryConfig extends js.Object {
  var dbManager: DbManagerConfig = js.native
  var knex: Config | String = js.native
}

object DbanagerFactoryConfig {
  @scala.inline
  def apply(dbManager: DbManagerConfig, knex: Config | String): DbanagerFactoryConfig = {
    val __obj = js.Dynamic.literal(dbManager = dbManager.asInstanceOf[js.Any], knex = knex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DbanagerFactoryConfig]
  }
  @scala.inline
  implicit class DbanagerFactoryConfigOps[Self <: DbanagerFactoryConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDbManager(value: DbManagerConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKnex(value: Config | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

