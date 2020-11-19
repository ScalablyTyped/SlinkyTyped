package typingsSlinky.cathoQuantum.radioGroupMod

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactElement
import typingsSlinky.cathoQuantum.anon.ColorsSpacing
import typingsSlinky.cathoQuantum.anon.Disabled
import typingsSlinky.cathoQuantum.cathoQuantumStrings.button
import typingsSlinky.cathoQuantum.cathoQuantumStrings.large
import typingsSlinky.cathoQuantum.cathoQuantumStrings.medium
import typingsSlinky.cathoQuantum.cathoQuantumStrings.radio
import typingsSlinky.cathoQuantum.cathoQuantumStrings.small
import typingsSlinky.cathoQuantum.cathoQuantumStrings.xlarge
import typingsSlinky.cathoQuantum.cathoQuantumStrings.xsmall
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.ChangeEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadioGroupProps extends js.Object {
  
  var children: js.UndefOr[js.Array[ReactElement] | ReactElement] = js.native
  
  var error: js.UndefOr[String] = js.native
  
  var `inline`: js.UndefOr[Boolean] = js.native
  
  var name: String = js.native
  
  var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.native
  
  var options: js.UndefOr[js.Array[Disabled]] = js.native
  
  var size: js.UndefOr[xsmall | small | medium | large | xlarge] = js.native
  
  var theme: js.UndefOr[ColorsSpacing] = js.native
  
  var `type`: js.UndefOr[radio | button] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object RadioGroupProps {
  
  @scala.inline
  def apply(name: String): RadioGroupProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioGroupProps]
  }
  
  @scala.inline
  implicit class RadioGroupPropsOps[Self <: RadioGroupProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: ReactElement*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[ReactElement] | ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    
    @scala.inline
    def setOnChange(value: ChangeEvent[HTMLInputElement] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: Disabled*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[Disabled]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setSize(value: xsmall | small | medium | large | xlarge): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setTheme(value: ColorsSpacing): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setType(value: radio | button): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
