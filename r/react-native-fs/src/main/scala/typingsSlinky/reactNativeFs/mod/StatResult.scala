package typingsSlinky.reactNativeFs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatResult extends StObject {
  
  // UNIX file mode
  var ctime: Double = js.native
  
  // Is the file just a file?
  def isDirectory(): Boolean = js.native
  
  // In case of content uri this is the pointed file path, otherwise is the same as path
  def isFile(): Boolean = js.native
  
  // Size in bytes
  var mode: Double = js.native
  
  // Created date
  var mtime: Double = js.native
  
  var name: js.UndefOr[String] = js.native
  
  // Last modified date
  var originalFilepath: String = js.native
  
  // The name of the item TODO: why is this not documented?
  var path: String = js.native
  
  // The absolute path to the item
  var size: String = js.native
}
object StatResult {
  
  @scala.inline
  def apply(
    ctime: Double,
    isDirectory: () => Boolean,
    isFile: () => Boolean,
    mode: Double,
    mtime: Double,
    originalFilepath: String,
    path: String,
    size: String
  ): StatResult = {
    val __obj = js.Dynamic.literal(ctime = ctime.asInstanceOf[js.Any], isDirectory = js.Any.fromFunction0(isDirectory), isFile = js.Any.fromFunction0(isFile), mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], originalFilepath = originalFilepath.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatResult]
  }
  
  @scala.inline
  implicit class StatResultMutableBuilder[Self <: StatResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCtime(value: Double): Self = StObject.set(x, "ctime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDirectory(value: () => Boolean): Self = StObject.set(x, "isDirectory", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsFile(value: () => Boolean): Self = StObject.set(x, "isFile", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMtime(value: Double): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOriginalFilepath(value: String): Self = StObject.set(x, "originalFilepath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
