package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.cardCardMod.CardProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardMod extends Shortcut {
  
  @JSImport("@material-ui/core/Card", JSImport.Default)
  @js.native
  val default: ReactComponentClass[CardProps] = js.native
  
  type _To = ReactComponentClass[CardProps]
  
  /* This means you don't have to write `default`, but can instead just say `cardMod.foo` */
  override def _to: ReactComponentClass[CardProps] = default
}
