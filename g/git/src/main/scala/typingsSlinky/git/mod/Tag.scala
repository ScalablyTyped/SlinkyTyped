package typingsSlinky.git.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git", "Tag")
@js.native
class Tag protected () extends js.Object {
  def this(name: js.Any, commit: js.Any) = this()
  
  var commit: js.Any = js.native
  
  var name: js.Any = js.native
}
/* static members */
@JSImport("git", "Tag")
@js.native
object Tag extends js.Object {
  
  def find_all(repo: js.Any, callback: js.Function): Unit = js.native
  def find_all(repo: js.Any, options: js.Any, callback: js.Function): Unit = js.native
}
