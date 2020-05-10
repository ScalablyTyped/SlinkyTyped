package typingsSlinky.schwifty.mod

import typingsSlinky.knex.mod.Config
import typingsSlinky.knex.mod.Knex
import typingsSlinky.schwifty.schwiftyStrings.latest
import typingsSlinky.schwifty.schwiftyStrings.rollback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegistrationOptions extends js.Object {
  var knex: js.UndefOr[(Knex[_, js.Array[_]]) | Config] = js.native
  var migrateOnStart: js.UndefOr[Boolean | latest | rollback] = js.native
  var migrationsDir: js.UndefOr[String] = js.native
  var models: js.UndefOr[js.Array[ModelClass] | String] = js.native
  var teardownOnStop: js.UndefOr[Boolean] = js.native
}

object RegistrationOptions {
  @scala.inline
  def apply(): RegistrationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegistrationOptions]
  }
  @scala.inline
  implicit class RegistrationOptionsOps[Self <: RegistrationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKnex(value: (Knex[_, js.Array[_]]) | Config): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKnex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knex")(js.undefined)
        ret
    }
    @scala.inline
    def withMigrateOnStart(value: Boolean | latest | rollback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migrateOnStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMigrateOnStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migrateOnStart")(js.undefined)
        ret
    }
    @scala.inline
    def withMigrationsDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migrationsDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMigrationsDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migrationsDir")(js.undefined)
        ret
    }
    @scala.inline
    def withModels(value: js.Array[ModelClass] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("models")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("models")(js.undefined)
        ret
    }
    @scala.inline
    def withTeardownOnStop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teardownOnStop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeardownOnStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teardownOnStop")(js.undefined)
        ret
    }
  }
  
}

