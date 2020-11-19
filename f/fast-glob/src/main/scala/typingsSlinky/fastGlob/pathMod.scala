package typingsSlinky.fastGlob

import typingsSlinky.fastGlob.typesMod.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fast-glob/out/utils/path", JSImport.Namespace)
@js.native
object pathMod extends js.Object {
  
  def escape(pattern: Pattern): Pattern = js.native
  
  def makeAbsolute(cwd: String, filepath: String): String = js.native
  
  def removeLeadingDotSegment(entry: String): String = js.native
  
  def unixify(filepath: String): String = js.native
}
