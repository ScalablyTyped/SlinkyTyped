package typingsSlinky.baiduApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Level extends StObject {
  
  /**
    * TRIM_MEMORY_RUNNING_MODERATE = 5
    * TRIM_MEMORY_RUNNING_LOW = 10
    * TRIM_MEMORY_RUNNING_CRITICAL = 15
    */
  var level: Double = js.native
}
object Level {
  
  @scala.inline
  def apply(level: Double): Level = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Level]
  }
  
  @scala.inline
  implicit class LevelMutableBuilder[Self <: Level] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
  }
}
