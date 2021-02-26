package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.popoverPopoverMod.PopoverProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverMod extends Shortcut {
  
  @JSImport("@material-ui/core/Popover", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PopoverProps] = js.native
  
  type _To = ReactComponentClass[PopoverProps]
  
  /* This means you don't have to write `default`, but can instead just say `popoverMod.foo` */
  override def _to: ReactComponentClass[PopoverProps] = default
}
