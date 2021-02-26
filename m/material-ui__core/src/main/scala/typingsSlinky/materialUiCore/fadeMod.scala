package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.fadeFadeMod.FadeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fadeMod extends Shortcut {
  
  @JSImport("@material-ui/core/Fade", JSImport.Default)
  @js.native
  val default: ReactComponentClass[FadeProps] = js.native
  
  type _To = ReactComponentClass[FadeProps]
  
  /* This means you don't have to write `default`, but can instead just say `fadeMod.foo` */
  override def _to: ReactComponentClass[FadeProps] = default
}
