package typingsSlinky.recompose

import slinky.core.ReactComponentClass
import typingsSlinky.recompose.mod.ComponentEnhancer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#fromrenderprops
@JSImport("recompose/fromRenderProps", JSImport.Namespace)
@js.native
object fromRenderPropsMod extends js.Object {
  
  def default[TInner, TOutter, TRenderProps](
    RenderPropsComponent: ReactComponentClass[_],
    propsMapper: js.Function1[/* props */ TRenderProps, TInner]
  ): ComponentEnhancer[TInner with TOutter, TOutter] = js.native
  def default[TInner, TOutter, TRenderProps](
    RenderPropsComponent: ReactComponentClass[_],
    propsMapper: js.Function1[/* props */ TRenderProps, TInner],
    renderPropName: String
  ): ComponentEnhancer[TInner with TOutter, TOutter] = js.native
}
