package typingsSlinky.d3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "csvParseRows")
@js.native
object csvParseRows extends js.Object {
  
  def apply(csvString: String): js.Array[js.Array[String]] = js.native
  def apply[ParsedRow /* <: js.Object */](
    csvString: String,
    row: js.Function2[/* rawRow */ js.Array[String], /* index */ Double, js.UndefOr[ParsedRow | Null]]
  ): js.Array[ParsedRow] = js.native
}
