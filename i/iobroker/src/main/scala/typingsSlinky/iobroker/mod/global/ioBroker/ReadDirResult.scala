package typingsSlinky.iobroker.mod.global.ioBroker

import typingsSlinky.iobroker.objectsMod.global.ioBroker.EvaluatedFileACL
import typingsSlinky.node.fsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the return values of readDir */
@js.native
trait ReadDirResult extends StObject {
  
  /** Access rights */
  var acl: js.UndefOr[EvaluatedFileACL] = js.native
  
  /** Date of creation */
  var createdAt: js.UndefOr[Double] = js.native
  
  /** Name of the file or directory */
  var file: String = js.native
  
  /** Whether this is a directory or a file */
  var isDir: Boolean = js.native
  
  /** Date of last modification */
  var modifiedAt: js.UndefOr[Double] = js.native
  
  /** File system stats */
  var stats: Stats = js.native
}
object ReadDirResult {
  
  @scala.inline
  def apply(file: String, isDir: Boolean, stats: Stats): ReadDirResult = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], isDir = isDir.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadDirResult]
  }
  
  @scala.inline
  implicit class ReadDirResultMutableBuilder[Self <: ReadDirResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcl(value: EvaluatedFileACL): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAclUndefined: Self = StObject.set(x, "acl", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: Double): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDir(value: Boolean): Self = StObject.set(x, "isDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedAt(value: Double): Self = StObject.set(x, "modifiedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedAtUndefined: Self = StObject.set(x, "modifiedAt", js.undefined)
    
    @scala.inline
    def setStats(value: Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}
