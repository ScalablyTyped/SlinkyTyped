package typingsSlinky.schwifty.anon

import typingsSlinky.knex.mod.Config
import typingsSlinky.schwifty.mod.ModelClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Knex extends js.Object {
  var knex: (typingsSlinky.knex.mod.Knex[_, js.Array[_]]) | Config
  var migrationsDir: String
  var models: js.Array[ModelClass]
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
}

