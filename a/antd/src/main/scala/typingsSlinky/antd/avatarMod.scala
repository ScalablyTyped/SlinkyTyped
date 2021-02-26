package typingsSlinky.antd

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import typingsSlinky.antd.avatarAvatarMod.AvatarProps
import typingsSlinky.antd.groupMod.GroupProps
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object avatarMod extends Shortcut {
  
  @JSImport("antd/lib/avatar", JSImport.Default)
  @js.native
  val default: CompoundedComponent = js.native
  
  @JSImport("antd/lib/avatar", "Group")
  @js.native
  val Group: ReactComponentClass[GroupProps] = js.native
  
  @js.native
  trait CompoundedComponent extends ForwardRefExoticComponent[AvatarProps with RefAttributes[HTMLElement]] {
    
    var Group: ReactComponentClass[GroupProps] = js.native
  }
  
  type _To = CompoundedComponent
  
  /* This means you don't have to write `default`, but can instead just say `avatarMod.foo` */
  override def _to: CompoundedComponent = default
}
