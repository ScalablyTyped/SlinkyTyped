package typingsSlinky.breeze.breeze

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.breeze.breeze.core.IEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityState extends IEnum {
  var Added: EntityStateSymbol = js.native
  var Deleted: EntityStateSymbol = js.native
  var Detached: EntityStateSymbol = js.native
  var Modified: EntityStateSymbol = js.native
  var Unchanged: EntityStateSymbol = js.native
}

@JSGlobal("breeze.EntityState")
@js.native
object EntityState extends TopLevel[EntityState]

