package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.dialogDialogMod.DialogProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogMod extends Shortcut {
  
  @JSImport("@material-ui/core/Dialog", JSImport.Default)
  @js.native
  val default: ReactComponentClass[DialogProps] = js.native
  
  type _To = ReactComponentClass[DialogProps]
  
  /* This means you don't have to write `default`, but can instead just say `dialogMod.foo` */
  override def _to: ReactComponentClass[DialogProps] = default
}
