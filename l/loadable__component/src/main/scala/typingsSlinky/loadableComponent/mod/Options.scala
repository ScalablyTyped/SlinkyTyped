package typingsSlinky.loadableComponent.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options[Props, Module] extends OptionsWithoutResolver[Props] {
  
  var resolveComponent: js.UndefOr[ComponentResolver[Props, Module]] = js.native
}
object Options {
  
  @scala.inline
  def apply[Props, Module](): Options[Props, Module] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[Props, Module]]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options[_, _], Props, Module] (val x: Self with (Options[Props, Module])) extends AnyVal {
    
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
    def setResolveComponent(value: (Module, Props) => ReactComponentClass[Props]): Self = this.set("resolveComponent", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteResolveComponent: Self = this.set("resolveComponent", js.undefined)
  }
}
