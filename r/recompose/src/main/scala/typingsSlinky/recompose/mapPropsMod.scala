package typingsSlinky.recompose

import typingsSlinky.recompose.mod.InferableComponentEnhancerWithProps
import typingsSlinky.recompose.mod.mapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#mapprops
object mapPropsMod {
  
  @JSImport("recompose/mapProps", JSImport.Default)
  @js.native
  def default[TInner, TOutter](propsMapper: mapper[TOutter, TInner]): InferableComponentEnhancerWithProps[TInner, TOutter] = js.native
}
