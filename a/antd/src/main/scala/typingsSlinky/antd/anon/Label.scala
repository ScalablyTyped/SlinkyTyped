package typingsSlinky.antd.anon

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Label extends StObject {
  
  var label: ReactElement = js.native
  
  var style: CSSProperties = js.native
}
object Label {
  
  @scala.inline
  def apply(style: CSSProperties): Label = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
  
  @scala.inline
  implicit class LabelMutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
