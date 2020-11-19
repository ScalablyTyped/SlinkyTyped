package typingsSlinky.jssPresetDefault.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var defaultUnit: js.UndefOr[typingsSlinky.jssPluginDefaultUnit.mod.Options] = js.native
  
  var observable: js.UndefOr[typingsSlinky.jssPluginRuleValueObservable.mod.Options] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setDefaultUnit(value: typingsSlinky.jssPluginDefaultUnit.mod.Options): Self = this.set("defaultUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultUnit: Self = this.set("defaultUnit", js.undefined)
    
    @scala.inline
    def setObservable(value: typingsSlinky.jssPluginRuleValueObservable.mod.Options): Self = this.set("observable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObservable: Self = this.set("observable", js.undefined)
  }
}
