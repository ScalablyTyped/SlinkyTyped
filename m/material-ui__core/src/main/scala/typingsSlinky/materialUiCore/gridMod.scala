package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.gridGridMod.GridProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridMod extends Shortcut {
  
  @JSImport("@material-ui/core/Grid", JSImport.Default)
  @js.native
  val default: ReactComponentClass[GridProps] = js.native
  
  type _To = ReactComponentClass[GridProps]
  
  /* This means you don't have to write `default`, but can instead just say `gridMod.foo` */
  override def _to: ReactComponentClass[GridProps] = default
}
