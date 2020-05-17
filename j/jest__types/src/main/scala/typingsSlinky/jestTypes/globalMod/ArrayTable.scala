package typingsSlinky.jestTypes.globalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jestTypes.globalMod.Table
  - typingsSlinky.jestTypes.globalMod.Row
*/
trait ArrayTable extends EachTable

object ArrayTable {
  @scala.inline
  implicit def apply(value: Row | Table): ArrayTable = value.asInstanceOf[ArrayTable]
}

