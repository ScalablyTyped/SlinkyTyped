package typingsSlinky.ipfsCore.srcUtilsMod

import typingsSlinky.ipfsCore.ipfsCoreStrings.dir
import typingsSlinky.ipfsCore.ipfsCoreStrings.file
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ipfsCore.srcUtilsMod.File
  - typingsSlinky.ipfsCore.srcUtilsMod.Directory
*/
trait IPFSEntry extends js.Object
object IPFSEntry {
  
  @scala.inline
  def File(
    cid: typingsSlinky.cids.mod.^,
    depth: Double,
    name: String,
    path: String,
    size: Double,
    `type`: file
  ): IPFSEntry = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPFSEntry]
  }
  
  @scala.inline
  def Directory(
    cid: typingsSlinky.cids.mod.^,
    depth: Double,
    name: String,
    path: String,
    size: Double,
    `type`: dir
  ): IPFSEntry = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPFSEntry]
  }
}
