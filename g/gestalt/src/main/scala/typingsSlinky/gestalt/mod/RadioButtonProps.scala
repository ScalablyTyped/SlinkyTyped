package typingsSlinky.gestalt.mod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.gestalt.anon.Checked
import typingsSlinky.gestalt.gestaltStrings.md
import typingsSlinky.gestalt.gestaltStrings.sm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadioButtonProps extends StObject {
  
  var checked: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var id: String = js.native
  
  var image: js.UndefOr[ReactElement] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var onChange: AbstractEventHandler[SyntheticEvent[Event, HTMLInputElement], Checked] = js.native
  
  var size: js.UndefOr[sm | md] = js.native
  
  var subtext: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object RadioButtonProps {
  
  @scala.inline
  def apply(
    id: String,
    onChange: /* arg */ Checked with (typingsSlinky.gestalt.anon.Event[SyntheticEvent[Event, HTMLInputElement]]) => Unit
  ): RadioButtonProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[RadioButtonProps]
  }
  
  @scala.inline
  implicit class RadioButtonPropsMutableBuilder[Self <: RadioButtonProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: ReactElement): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageReactElement(value: ReactElement): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOnChange(
      value: /* arg */ Checked with (typingsSlinky.gestalt.anon.Event[SyntheticEvent[Event, HTMLInputElement]]) => Unit
    ): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSize(value: sm | md): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSubtext(value: String): Self = StObject.set(x, "subtext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtextUndefined: Self = StObject.set(x, "subtext", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
