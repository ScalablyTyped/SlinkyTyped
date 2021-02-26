package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.chipChipMod.ChipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chipMod extends Shortcut {
  
  @JSImport("@material-ui/core/Chip", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ChipProps] = js.native
  
  type _To = ReactComponentClass[ChipProps]
  
  /* This means you don't have to write `default`, but can instead just say `chipMod.foo` */
  override def _to: ReactComponentClass[ChipProps] = default
}
