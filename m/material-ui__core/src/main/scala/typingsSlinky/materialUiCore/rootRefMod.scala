package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.rootRefRootRefMod.RootRefProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rootRefMod extends Shortcut {
  
  @JSImport("@material-ui/core/RootRef", JSImport.Default)
  @js.native
  val default: ReactComponentClass[RootRefProps[js.Any]] = js.native
  
  type _To = ReactComponentClass[RootRefProps[js.Any]]
  
  /* This means you don't have to write `default`, but can instead just say `rootRefMod.foo` */
  override def _to: ReactComponentClass[RootRefProps[js.Any]] = default
}
