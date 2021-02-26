package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.switchSwitchMod.SwitchProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object switchMod extends Shortcut {
  
  @JSImport("@material-ui/core/Switch", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SwitchProps] = js.native
  
  type _To = ReactComponentClass[SwitchProps]
  
  /* This means you don't have to write `default`, but can instead just say `switchMod.foo` */
  override def _to: ReactComponentClass[SwitchProps] = default
}
