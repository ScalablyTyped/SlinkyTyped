package typingsSlinky.ol.dragPanMod

import typingsSlinky.ol.conditionMod.Condition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var condition: js.UndefOr[Condition] = js.native
  
  var kinetic: js.UndefOr[typingsSlinky.ol.kineticMod.default] = js.native
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
    def setCondition(value: Condition): Self = this.set("condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    
    @scala.inline
    def setKinetic(value: typingsSlinky.ol.kineticMod.default): Self = this.set("kinetic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKinetic: Self = this.set("kinetic", js.undefined)
  }
}
