package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.dialogTitleDialogTitleMod.DialogTitleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogTitleMod extends Shortcut {
  
  @JSImport("@material-ui/core/DialogTitle", JSImport.Default)
  @js.native
  val default: ReactComponentClass[DialogTitleProps] = js.native
  
  type _To = ReactComponentClass[DialogTitleProps]
  
  /* This means you don't have to write `default`, but can instead just say `dialogTitleMod.foo` */
  override def _to: ReactComponentClass[DialogTitleProps] = default
}
