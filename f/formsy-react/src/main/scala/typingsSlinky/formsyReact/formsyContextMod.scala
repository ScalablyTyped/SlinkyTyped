package typingsSlinky.formsyReact

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.formsyReact.interfacesMod.FormsyContextInterface
import typingsSlinky.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formsyContextMod extends Shortcut {
  
  @JSImport("formsy-react/dist/FormsyContext", JSImport.Default)
  @js.native
  val default: Context[FormsyContextInterface] = js.native
  
  type _To = Context[FormsyContextInterface]
  
  /* This means you don't have to write `default`, but can instead just say `formsyContextMod.foo` */
  override def _to: Context[FormsyContextInterface] = default
}
