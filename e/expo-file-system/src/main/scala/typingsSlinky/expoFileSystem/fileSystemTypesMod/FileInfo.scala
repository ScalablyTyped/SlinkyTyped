package typingsSlinky.expoFileSystem.fileSystemTypesMod

import typingsSlinky.expoFileSystem.expoFileSystemBooleans.`false`
import typingsSlinky.expoFileSystem.expoFileSystemBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.expoFileSystem.anon.Exists
  - typingsSlinky.expoFileSystem.anon.IsDirectory
*/
trait FileInfo extends StObject
object FileInfo {
  
  @scala.inline
  def Exists(exists: `true`, isDirectory: Boolean, modificationTime: Double, size: Double, uri: String): typingsSlinky.expoFileSystem.anon.Exists = {
    val __obj = js.Dynamic.literal(exists = exists.asInstanceOf[js.Any], isDirectory = isDirectory.asInstanceOf[js.Any], modificationTime = modificationTime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.expoFileSystem.anon.Exists]
  }
  
  @scala.inline
  def IsDirectory(exists: `false`, isDirectory: `false`, uri: String): typingsSlinky.expoFileSystem.anon.IsDirectory = {
    val __obj = js.Dynamic.literal(exists = exists.asInstanceOf[js.Any], isDirectory = isDirectory.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.expoFileSystem.anon.IsDirectory]
  }
}
