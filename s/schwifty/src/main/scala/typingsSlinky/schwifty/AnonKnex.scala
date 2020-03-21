package typingsSlinky.schwifty

import typingsSlinky.knex.mod.Config
import typingsSlinky.knex.mod.Knex
import typingsSlinky.schwifty.mod.ModelClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKnex extends js.Object {
  var knex: (Knex[_, js.Array[_]]) | Config
  var migrationsDir: String
  var models: js.Array[ModelClass]
}

object AnonKnex {
  @scala.inline
  def apply(knex: (Knex[_, js.Array[_]]) | Config, migrationsDir: String, models: js.Array[ModelClass]): AnonKnex = {
    val __obj = js.Dynamic.literal(knex = knex.asInstanceOf[js.Any], migrationsDir = migrationsDir.asInstanceOf[js.Any], models = models.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKnex]
  }
}

