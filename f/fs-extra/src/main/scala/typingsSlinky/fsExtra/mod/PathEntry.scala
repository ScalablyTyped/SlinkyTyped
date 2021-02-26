package typingsSlinky.fsExtra.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathEntry extends StObject {
  
  var path: String = js.native
  
  var stats: typingsSlinky.node.fsMod.Stats = js.native
}
object PathEntry {
  
  @scala.inline
  def apply(path: String, stats: typingsSlinky.node.fsMod.Stats): PathEntry = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathEntry]
  }
  
  @scala.inline
  implicit class PathEntryMutableBuilder[Self <: PathEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStats(value: typingsSlinky.node.fsMod.Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}
