package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.linkLinkMod.LinkProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkMod extends Shortcut {
  
  @JSImport("@material-ui/core/Link", JSImport.Default)
  @js.native
  val default: ReactComponentClass[LinkProps] = js.native
  
  type _To = ReactComponentClass[LinkProps]
  
  /* This means you don't have to write `default`, but can instead just say `linkMod.foo` */
  override def _to: ReactComponentClass[LinkProps] = default
}
