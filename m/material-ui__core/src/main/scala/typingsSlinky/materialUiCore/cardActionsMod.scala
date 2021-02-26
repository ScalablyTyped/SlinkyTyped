package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.cardActionsCardActionsMod.CardActionsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardActionsMod extends Shortcut {
  
  @JSImport("@material-ui/core/CardActions", JSImport.Default)
  @js.native
  val default: ReactComponentClass[CardActionsProps] = js.native
  
  type _To = ReactComponentClass[CardActionsProps]
  
  /* This means you don't have to write `default`, but can instead just say `cardActionsMod.foo` */
  override def _to: ReactComponentClass[CardActionsProps] = default
}
