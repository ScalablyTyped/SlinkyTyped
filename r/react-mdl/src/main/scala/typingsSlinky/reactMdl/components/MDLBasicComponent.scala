package typingsSlinky.reactMdl.components

import typingsSlinky.react.mod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MDLBasicComponent {
  @JSImport("react-mdl", "__MDLBasicComponent")
  @js.native
  object component extends js.Object
  
  def withProps(p: HTMLProps[js.Any]): SharedBuilder_MDLOtherProps_1174833659[typingsSlinky.reactMdl.mod.MDLBasicComponent] = new SharedBuilder_MDLOtherProps_1174833659[typingsSlinky.reactMdl.mod.MDLBasicComponent](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: MDLBasicComponent.type): SharedBuilder_MDLOtherProps_1174833659[typingsSlinky.reactMdl.mod.MDLBasicComponent] = new SharedBuilder_MDLOtherProps_1174833659[typingsSlinky.reactMdl.mod.MDLBasicComponent](js.Array(this.component, js.Dictionary.empty))()
}

