package typingsSlinky.lovefield.mod.query

import typingsSlinky.lovefield.mod.Binder
import typingsSlinky.lovefield.mod.Row
import typingsSlinky.lovefield.mod.schema.Table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Insert extends Builder {
  def into(table: Table): Insert = js.native
  def values(rows: js.Array[Binder | Row]): Insert = js.native
  def values(rows: Binder): Insert = js.native
}

