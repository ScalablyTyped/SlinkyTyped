package typingsSlinky.cliTable3.mod

import typingsSlinky.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenericTable[T] extends Array[T] {
  
  var options: TableInstanceOptions = js.native
  
  val width: Double = js.native
}
