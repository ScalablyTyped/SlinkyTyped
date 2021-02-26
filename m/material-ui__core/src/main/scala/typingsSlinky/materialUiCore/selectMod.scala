package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.selectSelectMod.SelectProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectMod extends Shortcut {
  
  @JSImport("@material-ui/core/Select", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SelectProps] = js.native
  
  type _To = ReactComponentClass[SelectProps]
  
  /* This means you don't have to write `default`, but can instead just say `selectMod.foo` */
  override def _to: ReactComponentClass[SelectProps] = default
}
