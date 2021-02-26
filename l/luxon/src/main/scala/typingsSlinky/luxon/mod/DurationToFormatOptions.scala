package typingsSlinky.luxon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DurationToFormatOptions
  extends typingsSlinky.std.Intl.DateTimeFormatOptions {
  
  var floor: js.UndefOr[Boolean] = js.native
  
  var round: js.UndefOr[Boolean] = js.native
}
object DurationToFormatOptions {
  
  @scala.inline
  def apply(): DurationToFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DurationToFormatOptions]
  }
  
  @scala.inline
  implicit class DurationToFormatOptionsMutableBuilder[Self <: DurationToFormatOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFloor(value: Boolean): Self = StObject.set(x, "floor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloorUndefined: Self = StObject.set(x, "floor", js.undefined)
    
    @scala.inline
    def setRound(value: Boolean): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
  }
}
