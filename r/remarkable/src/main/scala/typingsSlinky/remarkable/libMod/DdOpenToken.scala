package typingsSlinky.remarkable.libMod

import typingsSlinky.remarkable.remarkableStrings.dd_open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.remarkable.libMod._Token because Already inherited */ @js.native
trait DdOpenToken extends TagToken {
  
  @JSName("type")
  var type_DdOpenToken: dd_open = js.native
}
object DdOpenToken {
  
  @scala.inline
  def apply(level: Double, `type`: dd_open): DdOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DdOpenToken]
  }
  
  @scala.inline
  implicit class DdOpenTokenMutableBuilder[Self <: DdOpenToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: dd_open): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
