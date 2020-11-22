package typingsSlinky.editorconfig.fnmatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("editorconfig/src/lib/fnmatch", "match")
@js.native
object `match` extends js.Object {
  
  /**
    * Match against the list of files, in the style of fnmatch or glob.
    * If nothing is matched, and options.nonull is set,
    * then return a list containing the pattern itself.
    */
  def apply(list: js.Array[String], pattern: String): js.Array[String] = js.native
  def apply(list: js.Array[String], pattern: String, options: IOptions): js.Array[String] = js.native
}
