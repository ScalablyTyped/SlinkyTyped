package typingsSlinky.reactNavigationCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object staticContainerMod extends Shortcut {
  
  @JSImport("@react-navigation/core/lib/typescript/src/StaticContainer", JSImport.Default)
  @js.native
  val default: ReactComponentClass[js.Function1[/* props */ js.Any, js.Any]] = js.native
  
  type _To = ReactComponentClass[js.Function1[/* props */ js.Any, js.Any]]
  
  /* This means you don't have to write `default`, but can instead just say `staticContainerMod.foo` */
  override def _to: ReactComponentClass[js.Function1[/* props */ js.Any, js.Any]] = default
}
