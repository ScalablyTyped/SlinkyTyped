package typingsSlinky.node.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs", "Dirent")
@js.native
class Dirent () extends js.Object {
  
  def isBlockDevice(): Boolean = js.native
  
  def isCharacterDevice(): Boolean = js.native
  
  def isDirectory(): Boolean = js.native
  
  def isFIFO(): Boolean = js.native
  
  def isFile(): Boolean = js.native
  
  def isSocket(): Boolean = js.native
  
  def isSymbolicLink(): Boolean = js.native
  
  var name: String = js.native
}
