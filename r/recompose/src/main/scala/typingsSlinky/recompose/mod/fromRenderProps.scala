package typingsSlinky.recompose.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("recompose", "fromRenderProps")
@js.native
object fromRenderProps extends js.Object {
  
  def apply[TInner, TOutter, TRenderProps](
    RenderPropsComponent: ReactComponentClass[_],
    propsMapper: js.Function1[/* props */ TRenderProps, TInner]
  ): ComponentEnhancer[TInner with TOutter, TOutter] = js.native
  def apply[TInner, TOutter, TRenderProps](
    RenderPropsComponent: ReactComponentClass[_],
    propsMapper: js.Function1[/* props */ TRenderProps, TInner],
    renderPropName: String
  ): ComponentEnhancer[TInner with TOutter, TOutter] = js.native
}
