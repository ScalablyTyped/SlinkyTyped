package typingsSlinky.reactCalendarTimeline.mod

import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomMarkerChildrenProps extends StObject {
  
  var date: Double = js.native
  
  var styles: CSSProperties = js.native
}
object CustomMarkerChildrenProps {
  
  @scala.inline
  def apply(date: Double, styles: CSSProperties): CustomMarkerChildrenProps = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomMarkerChildrenProps]
  }
  
  @scala.inline
  implicit class CustomMarkerChildrenPropsMutableBuilder[Self <: CustomMarkerChildrenProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyles(value: CSSProperties): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
  }
}
