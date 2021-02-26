package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.growGrowMod.GrowProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object growMod extends Shortcut {
  
  @JSImport("@material-ui/core/Grow", JSImport.Default)
  @js.native
  val default: ReactComponentClass[GrowProps] = js.native
  
  type _To = ReactComponentClass[GrowProps]
  
  /* This means you don't have to write `default`, but can instead just say `growMod.foo` */
  override def _to: ReactComponentClass[GrowProps] = default
}
