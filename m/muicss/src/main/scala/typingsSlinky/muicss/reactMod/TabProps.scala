package typingsSlinky.muicss.reactMod

import slinky.core.facade.ReactElement
import typingsSlinky.muicss.tabMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabProps extends StObject {
  
  var label: js.UndefOr[ReactElement] = js.native
  
  var onActive: js.UndefOr[js.Function1[/* tab */ default, Unit]] = js.native
  
  var value: js.UndefOr[js.Any] = js.native
}
object TabProps {
  
  @scala.inline
  def apply(): TabProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabProps]
  }
  
  @scala.inline
  implicit class TabPropsMutableBuilder[Self <: TabProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelReactElement(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setOnActive(value: /* tab */ default => Unit): Self = StObject.set(x, "onActive", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnActiveUndefined: Self = StObject.set(x, "onActive", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
