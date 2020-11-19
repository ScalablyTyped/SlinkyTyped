package typingsSlinky.lineColumn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("line-column", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Returns a `LineColumnFinder` instance for given `string` str.
    * @param str the string to find the line-column info for.
    * @param options options for the finder or a number representing the 'from' index.
    * @returns a `LineColumnFinder` instance.
    */
  def apply(str: String): LineColumnFinder = js.native
  def apply(str: String, options: Double): LineColumnFinder = js.native
  def apply(str: String, options: LineColumnOptions): LineColumnFinder = js.native
}
