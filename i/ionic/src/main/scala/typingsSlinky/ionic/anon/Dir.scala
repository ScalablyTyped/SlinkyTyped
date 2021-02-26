package typingsSlinky.ionic.anon

import typingsSlinky.ionic.definitionsMod.ProjectType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dir extends StObject {
  
  var dir: String = js.native
  
  var srcDir: String = js.native
  
  var `type`: ProjectType = js.native
}
object Dir {
  
  @scala.inline
  def apply(dir: String, srcDir: String, `type`: ProjectType): Dir = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], srcDir = srcDir.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dir]
  }
  
  @scala.inline
  implicit class DirMutableBuilder[Self <: Dir] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcDir(value: String): Self = StObject.set(x, "srcDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ProjectType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
