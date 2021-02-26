package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.iconIconMod.IconProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconMod extends Shortcut {
  
  @JSImport("@material-ui/core/Icon", JSImport.Default)
  @js.native
  val default: ReactComponentClass[IconProps] = js.native
  
  type _To = ReactComponentClass[IconProps]
  
  /* This means you don't have to write `default`, but can instead just say `iconMod.foo` */
  override def _to: ReactComponentClass[IconProps] = default
}
