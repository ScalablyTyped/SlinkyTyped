package typingsSlinky.antd

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import typingsSlinky.antd.avatarAvatarMod.AvatarProps
import typingsSlinky.antd.groupMod.GroupProps
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/avatar", JSImport.Namespace)
@js.native
object avatarMod extends js.Object {
  @js.native
  trait CompoundedComponent extends ForwardRefExoticComponent[AvatarProps with RefAttributes[HTMLElement]] {
    var Group: ReactComponentClass[GroupProps] = js.native
  }
  
  val Group: ReactComponentClass[GroupProps] = js.native
  val default: CompoundedComponent = js.native
}

