package typingsSlinky.ionicUtilsFs.mod

import typingsSlinky.ionicUtilsFs.ionicUtilsFsStrings.directory
import typingsSlinky.ionicUtilsFs.ionicUtilsFsStrings.file
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ionicUtilsFs.mod.RegularFileNode
  - typingsSlinky.ionicUtilsFs.mod.DirectoryNode
*/
trait FileNode extends js.Object
object FileNode {
  
  @scala.inline
  def RegularFileNode(parent: FileNode, path: String, `type`: file): FileNode = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileNode]
  }
  
  @scala.inline
  def DirectoryNode(children: js.Array[FileNode], path: String, `type`: directory): FileNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileNode]
  }
}
