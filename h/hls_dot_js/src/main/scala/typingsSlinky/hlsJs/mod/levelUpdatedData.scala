package typingsSlinky.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait levelUpdatedData extends StObject {
  
  var details: LevelDetails = js.native
  
  var level: Double = js.native
}
object levelUpdatedData {
  
  @scala.inline
  def apply(details: LevelDetails, level: Double): levelUpdatedData = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[levelUpdatedData]
  }
  
  @scala.inline
  implicit class levelUpdatedDataMutableBuilder[Self <: levelUpdatedData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: LevelDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
  }
}
