package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.checkboxCheckboxMod.CheckboxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxMod extends Shortcut {
  
  @JSImport("@material-ui/core/Checkbox", JSImport.Default)
  @js.native
  val default: ReactComponentClass[CheckboxProps] = js.native
  
  type _To = ReactComponentClass[CheckboxProps]
  
  /* This means you don't have to write `default`, but can instead just say `checkboxMod.foo` */
  override def _to: ReactComponentClass[CheckboxProps] = default
}
