package typingsSlinky.nodePgMigrate.anon

import typingsSlinky.nodePgMigrate.indexesTypesMod.CreateIndexFn
import typingsSlinky.nodePgMigrate.indexesTypesMod.CreateIndexOptions
import typingsSlinky.nodePgMigrate.indexesTypesMod.DropIndexOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReverseCreateIndexFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: CreateIndexFn = js.native
  def reverse(tableName: typingsSlinky.nodePgMigrate.generalTypesMod.Name, columns: String): String | js.Array[String] = js.native
  def reverse(
    tableName: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    columns: String,
    options: CreateIndexOptions with DropIndexOptions
  ): String | js.Array[String] = js.native
  def reverse(tableName: typingsSlinky.nodePgMigrate.generalTypesMod.Name, columns: js.Array[String]): String | js.Array[String] = js.native
  def reverse(
    tableName: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    columns: js.Array[String],
    options: CreateIndexOptions with DropIndexOptions
  ): String | js.Array[String] = js.native
}

