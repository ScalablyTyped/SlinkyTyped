package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.typographyTypographyMod.TypographyProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typographyMod extends Shortcut {
  
  @JSImport("@material-ui/core/Typography", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TypographyProps] = js.native
  
  type _To = ReactComponentClass[TypographyProps]
  
  /* This means you don't have to write `default`, but can instead just say `typographyMod.foo` */
  override def _to: ReactComponentClass[TypographyProps] = default
}
