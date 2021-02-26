package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.avatarAvatarMod.AvatarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object avatarMod extends Shortcut {
  
  @JSImport("@material-ui/core/Avatar", JSImport.Default)
  @js.native
  val default: ReactComponentClass[AvatarProps] = js.native
  
  type _To = ReactComponentClass[AvatarProps]
  
  /* This means you don't have to write `default`, but can instead just say `avatarMod.foo` */
  override def _to: ReactComponentClass[AvatarProps] = default
}
