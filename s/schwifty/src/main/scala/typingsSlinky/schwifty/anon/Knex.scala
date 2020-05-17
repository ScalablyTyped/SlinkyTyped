package typingsSlinky.schwifty.anon

import typingsSlinky.knex.mod.Config
import typingsSlinky.schwifty.mod.ModelClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Knex extends js.Object {
  var knex: (typingsSlinky.knex.mod.Knex[_, js.Array[_]]) | Config = js.native
  var migrationsDir: String = js.native
  var models: js.Array[ModelClass] = js.native
}

object Knex {
  @scala.inline
  def apply(
    knex: (typingsSlinky.knex.mod.Knex[_, js.Array[_]]) | Config,
    migrationsDir: String,
    models: js.Array[ModelClass]
  ): Knex = {
    val __obj = js.Dynamic.literal(knex = knex.asInstanceOf[js.Any], migrationsDir = migrationsDir.asInstanceOf[js.Any], models = models.asInstanceOf[js.Any])
    __obj.asInstanceOf[Knex]
  }
  @scala.inline
  implicit class KnexOps[Self <: Knex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKnex(value: (typingsSlinky.knex.mod.Knex[_, js.Array[_]]) | Config): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMigrationsDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migrationsDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModels(value: js.Array[ModelClass]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("models")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

