package typingsSlinky.gestalt.mod

import typingsSlinky.gestalt.anon.EventValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwitchProps extends js.Object {
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var id: String = js.native
  
  var name: js.UndefOr[String] = js.native
  
  def onChange(args: EventValue): Unit = js.native
  
  var switched: js.UndefOr[Boolean] = js.native
}
object SwitchProps {
  
  @scala.inline
  def apply(id: String, onChange: EventValue => Unit): SwitchProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[SwitchProps]
  }
  
  @scala.inline
  implicit class SwitchPropsOps[Self <: SwitchProps] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChange(value: EventValue => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSwitched(value: Boolean): Self = this.set("switched", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwitched: Self = this.set("switched", js.undefined)
  }
}
