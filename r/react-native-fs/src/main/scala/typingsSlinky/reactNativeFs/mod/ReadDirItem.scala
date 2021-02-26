package typingsSlinky.reactNativeFs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadDirItem extends StObject {
  
  var ctime: js.UndefOr[js.Date] = js.native
  
  // Is the file just a file?
  def isDirectory(): Boolean = js.native
  
  // Size in bytes
  def isFile(): Boolean = js.native
  
  // The creation date of the file (iOS only)
  var mtime: js.UndefOr[js.Date] = js.native
  
  // The last modified date of the file
  var name: String = js.native
  
  // The name of the item
  var path: String = js.native
  
  // The absolute path to the item
  var size: String = js.native
}
object ReadDirItem {
  
  @scala.inline
  def apply(isDirectory: () => Boolean, isFile: () => Boolean, name: String, path: String, size: String): ReadDirItem = {
    val __obj = js.Dynamic.literal(isDirectory = js.Any.fromFunction0(isDirectory), isFile = js.Any.fromFunction0(isFile), name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadDirItem]
  }
  
  @scala.inline
  implicit class ReadDirItemMutableBuilder[Self <: ReadDirItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCtime(value: js.Date): Self = StObject.set(x, "ctime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtimeUndefined: Self = StObject.set(x, "ctime", js.undefined)
    
    @scala.inline
    def setIsDirectory(value: () => Boolean): Self = StObject.set(x, "isDirectory", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsFile(value: () => Boolean): Self = StObject.set(x, "isFile", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMtime(value: js.Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
