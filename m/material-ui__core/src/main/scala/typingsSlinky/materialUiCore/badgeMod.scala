package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.badgeBadgeMod.BadgeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badgeMod extends Shortcut {
  
  @JSImport("@material-ui/core/Badge", JSImport.Default)
  @js.native
  val default: ReactComponentClass[BadgeProps] = js.native
  
  type _To = ReactComponentClass[BadgeProps]
  
  /* This means you don't have to write `default`, but can instead just say `badgeMod.foo` */
  override def _to: ReactComponentClass[BadgeProps] = default
}
