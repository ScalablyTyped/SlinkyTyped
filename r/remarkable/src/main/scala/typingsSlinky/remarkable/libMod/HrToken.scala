package typingsSlinky.remarkable.libMod

import typingsSlinky.remarkable.remarkableStrings.hr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.remarkable.libMod._Token because Already inherited */ @js.native
trait HrToken extends TagToken {
  
  @JSName("type")
  var type_HrToken: hr = js.native
}
object HrToken {
  
  @scala.inline
  def apply(level: Double, `type`: hr): HrToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HrToken]
  }
  
  @scala.inline
  implicit class HrTokenMutableBuilder[Self <: HrToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: hr): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
