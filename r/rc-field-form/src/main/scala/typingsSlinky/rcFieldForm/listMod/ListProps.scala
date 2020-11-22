package typingsSlinky.rcFieldForm.listMod

import slinky.core.facade.ReactElement
import typingsSlinky.rcFieldForm.interfaceMod.Meta
import typingsSlinky.rcFieldForm.interfaceMod.NamePath
import typingsSlinky.rcFieldForm.interfaceMod.ValidatorRule
import typingsSlinky.rcFieldForm.rcFieldFormBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListProps extends js.Object {
  
  var children: js.UndefOr[
    js.Function3[
      /* fields */ js.Array[ListField], 
      /* operations */ ListOperations, 
      /* meta */ Meta, 
      ReactElement
    ]
  ] = js.native
  
  var name: NamePath = js.native
  
  var rules: js.UndefOr[js.Array[ValidatorRule]] = js.native
  
  var validateTrigger: js.UndefOr[String | js.Array[String] | `false`] = js.native
}
object ListProps {
  
  @scala.inline
  def apply(name: NamePath): ListProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProps]
  }
  
  @scala.inline
  implicit class ListPropsOps[Self <: ListProps] (val x: Self) extends AnyVal {
    
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
    def setNameVarargs(value: (String | Double)*): Self = this.set("name", js.Array(value :_*))
    
    @scala.inline
    def setName(value: NamePath): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(
      value: (/* fields */ js.Array[ListField], /* operations */ ListOperations, /* meta */ Meta) => ReactElement
    ): Self = this.set("children", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: ValidatorRule*): Self = this.set("rules", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: js.Array[ValidatorRule]): Self = this.set("rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
    
    @scala.inline
    def setValidateTriggerVarargs(value: String*): Self = this.set("validateTrigger", js.Array(value :_*))
    
    @scala.inline
    def setValidateTrigger(value: String | js.Array[String] | `false`): Self = this.set("validateTrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateTrigger: Self = this.set("validateTrigger", js.undefined)
  }
}
