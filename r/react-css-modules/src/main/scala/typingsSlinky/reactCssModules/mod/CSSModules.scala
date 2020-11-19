package typingsSlinky.reactCssModules.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSSModules extends js.Object {
  
  def apply(defaultStyles: StylesObject): js.Function1[/* Component */ js.Function, js.Function] = js.native
  def apply(defaultStyles: StylesObject, options: TypeOptions): js.Function1[/* Component */ js.Function, js.Function] = js.native
  def apply[C /* <: js.Function */](Component: C, defaultStyles: StylesObject): C = js.native
  def apply[C /* <: js.Function */](Component: C, defaultStyles: StylesObject, options: TypeOptions): C = js.native
}
