package typingsSlinky.flexmonster.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Level extends StObject {
  
  var caption: String = js.native
  
  var uniqueName: String = js.native
}
object Level {
  
  @scala.inline
  def apply(caption: String, uniqueName: String): Level = {
    val __obj = js.Dynamic.literal(caption = caption.asInstanceOf[js.Any], uniqueName = uniqueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Level]
  }
  
  @scala.inline
  implicit class LevelMutableBuilder[Self <: Level] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
  }
}
