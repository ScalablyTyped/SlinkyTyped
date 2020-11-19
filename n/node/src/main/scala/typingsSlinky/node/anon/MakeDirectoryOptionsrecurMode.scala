package typingsSlinky.node.anon

import typingsSlinky.node.fsMod.Mode
import typingsSlinky.node.nodeBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined node.fs.MakeDirectoryOptions & {  recursive :false | undefined} */
@js.native
trait MakeDirectoryOptionsrecurMode extends js.Object {
  
  /**
    * A file mode. If a string is passed, it is parsed as an octal integer. If not specified
    * @default 0o777
    */
  var mode: js.UndefOr[Mode] = js.native
  
  /**
    * Indicates whether parent folders should be created.
    * If a folder was created, the path to the first created folder will be returned.
    * @default false
    */
  var recursive: js.UndefOr[Boolean] with js.UndefOr[`false`] = js.native
}
object MakeDirectoryOptionsrecurMode {
  
  @scala.inline
  def apply(recursive: js.UndefOr[Boolean] with js.UndefOr[`false`]): MakeDirectoryOptionsrecurMode = {
    val __obj = js.Dynamic.literal(recursive = recursive.asInstanceOf[js.Any])
    __obj.asInstanceOf[MakeDirectoryOptionsrecurMode]
  }
  
  @scala.inline
  implicit class MakeDirectoryOptionsrecurModeOps[Self <: MakeDirectoryOptionsrecurMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRecursive(value: js.UndefOr[Boolean] with js.UndefOr[`false`]): Self = this.set("recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: Mode): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
}
