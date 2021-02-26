package typingsSlinky.baseui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.phoneInputMod.FlagProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Flag {
  
  @scala.inline
  def apply(iso: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 241 */ js.Any): Builder = {
    val __props = js.Dynamic.literal(iso = iso.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[FlagProps]))
  }
  
  @JSImport("baseui/phone-input", "Flag")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def width(value: String): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FlagProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
