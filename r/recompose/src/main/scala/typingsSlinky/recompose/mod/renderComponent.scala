package typingsSlinky.recompose.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("recompose", "renderComponent")
@js.native
object renderComponent extends js.Object {
  
  def apply[TProps](component: String): ComponentEnhancer[_, _] = js.native
  def apply[TProps](component: ReactComponentClass[TProps]): ComponentEnhancer[_, _] = js.native
}
