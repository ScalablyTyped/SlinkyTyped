package typingsSlinky.kss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kss", "parse")
@js.native
object parse extends js.Object {
  
  /** Parse a string of documented CSS, or an array of file anys with their content. */
  def apply(input: String, options: Options): KssStyleguide = js.native
  def apply(input: js.Array[File], options: Options): KssStyleguide = js.native
}
