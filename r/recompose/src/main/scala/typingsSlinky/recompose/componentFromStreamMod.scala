package typingsSlinky.recompose

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.recompose.mod.ObservableConfig
import typingsSlinky.recompose.mod.Subscribable
import typingsSlinky.recompose.mod.mapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#componentfromstream
object componentFromStreamMod {
  
  @JSImport("recompose/componentFromStream", JSImport.Default)
  @js.native
  def default[TProps](propsToReactNode: mapper[Subscribable[TProps], Subscribable[ReactElement]]): ReactComponentClass[TProps] = js.native
  
  @JSImport("recompose/componentFromStream", "componentFromStreamWithConfig")
  @js.native
  def componentFromStreamWithConfig(config: ObservableConfig): js.Function1[
    /* propsToReactNode */ mapper[Subscribable[_], Subscribable[ReactElement]], 
    ReactComponentClass[_]
  ] = js.native
}
