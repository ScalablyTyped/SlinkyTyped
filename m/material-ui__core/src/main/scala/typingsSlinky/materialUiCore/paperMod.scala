package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.paperPaperMod.PaperProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paperMod extends Shortcut {
  
  @JSImport("@material-ui/core/Paper", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PaperProps] = js.native
  
  type _To = ReactComponentClass[PaperProps]
  
  /* This means you don't have to write `default`, but can instead just say `paperMod.foo` */
  override def _to: ReactComponentClass[PaperProps] = default
}
