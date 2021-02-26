package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.cardHeaderCardHeaderMod.CardHeaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardHeaderMod extends Shortcut {
  
  @JSImport("@material-ui/core/CardHeader", JSImport.Default)
  @js.native
  val default: ReactComponentClass[CardHeaderProps] = js.native
  
  type _To = ReactComponentClass[CardHeaderProps]
  
  /* This means you don't have to write `default`, but can instead just say `cardHeaderMod.foo` */
  override def _to: ReactComponentClass[CardHeaderProps] = default
}
