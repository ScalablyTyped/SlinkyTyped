package typingsSlinky.git.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git", "Diff")
@js.native
class Diff protected () extends js.Object {
  def this(
    repo: js.Any,
    aPath: js.Any,
    bPath: js.Any,
    aBlob: js.Any,
    bBlob: js.Any,
    aMode: js.Any,
    bMode: js.Any,
    newFile: js.Any,
    deletedFile: js.Any,
    diff: js.Any
  ) = this()
  
  var a_blob: js.Any = js.native
  
  var a_mode: js.Any = js.native
  
  var a_path: js.Any = js.native
  
  var b_blob: js.Any = js.native
  
  var b_mode: js.Any = js.native
  
  var b_path: js.Any = js.native
  
  var deleted_file: js.Any = js.native
  
  var diff: js.Any = js.native
  
  var new_file: js.Any = js.native
  
  var repo: js.Any = js.native
}
/* static members */
@JSImport("git", "Diff")
@js.native
object Diff extends js.Object {
  
  def list_from_string(repo: js.Any, text: js.Any, callback: js.Function): Unit = js.native
}
