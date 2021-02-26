package typingsSlinky.recompose

import typingsSlinky.recompose.mod.InferableComponentEnhancerWithProps
import typingsSlinky.recompose.mod.mapper
import typingsSlinky.recompose.mod.predicateDiff
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#withpropsonchange
object withPropsOnChangeMod {
  
  @JSImport("recompose/withPropsOnChange", JSImport.Default)
  @js.native
  def default[TInner, TOutter](shouldMapOrKeys: js.Array[String], createProps: mapper[TOutter, TInner]): InferableComponentEnhancerWithProps[TInner with TOutter, TOutter] = js.native
  @JSImport("recompose/withPropsOnChange", JSImport.Default)
  @js.native
  def default[TInner, TOutter](shouldMapOrKeys: predicateDiff[TOutter], createProps: mapper[TOutter, TInner]): InferableComponentEnhancerWithProps[TInner with TOutter, TOutter] = js.native
}
