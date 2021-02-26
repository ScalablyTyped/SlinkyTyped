package typingsSlinky.antd.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.antd.hookModalMod.HookModalProps
import typingsSlinky.antd.hookModalMod.HookModalRef
import typingsSlinky.antd.modalModalMod.ModalFuncProps
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HookModal {
  
  @scala.inline
  def apply(afterClose: () => Unit, config: ModalFuncProps): Default[tag.type, HookModalRef] = {
    val __props = js.Dynamic.literal(afterClose = js.Any.fromFunction0(afterClose), config = config.asInstanceOf[js.Any])
    new Default[tag.type, HookModalRef](js.Array(this.component, __props.asInstanceOf[HookModalProps with RefAttributes[HookModalRef]]))
  }
  
  @JSImport("antd/lib/modal/useModal/HookModal", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: HookModalProps with RefAttributes[HookModalRef]): Default[tag.type, HookModalRef] = new Default[tag.type, HookModalRef](js.Array(this.component, p.asInstanceOf[js.Any]))
}
