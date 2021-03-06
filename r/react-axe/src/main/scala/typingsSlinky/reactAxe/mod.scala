package typingsSlinky.reactAxe

import typingsSlinky.axeCore.mod.Spec
import typingsSlinky.reactAxe.anon.TypeofReact
import typingsSlinky.reactAxe.anon.TypeofReactDOM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-axe", JSImport.Namespace)
  @js.native
  def apply(react: TypeofReact, reactDOM: TypeofReactDOM, timeout: Double): Unit = js.native
  @JSImport("react-axe", JSImport.Namespace)
  @js.native
  def apply(react: TypeofReact, reactDOM: TypeofReactDOM, timeout: Double, config: ReactAxeConfig): Unit = js.native
  
  type ReactAxeConfig = Spec
}
