package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.cardMediaCardMediaMod.CardMediaProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardMediaMod extends Shortcut {
  
  @JSImport("@material-ui/core/CardMedia", JSImport.Default)
  @js.native
  val default: ReactComponentClass[CardMediaProps] = js.native
  
  type _To = ReactComponentClass[CardMediaProps]
  
  /* This means you don't have to write `default`, but can instead just say `cardMediaMod.foo` */
  override def _to: ReactComponentClass[CardMediaProps] = default
}
