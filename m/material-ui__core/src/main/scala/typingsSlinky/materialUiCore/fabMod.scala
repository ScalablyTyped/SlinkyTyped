package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.fabFabMod.FabProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fabMod extends Shortcut {
  
  @JSImport("@material-ui/core/Fab", JSImport.Default)
  @js.native
  val default: ReactComponentClass[FabProps] = js.native
  
  type _To = ReactComponentClass[FabProps]
  
  /* This means you don't have to write `default`, but can instead just say `fabMod.foo` */
  override def _to: ReactComponentClass[FabProps] = default
}
