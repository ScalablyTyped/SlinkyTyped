package typingsSlinky.reactRelay.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactRelay.anon.EntryPointReference
import typingsSlinky.reactRelay.entryPointContainerReactMod.GetComponentFromPreloadedEntryPoint
import typingsSlinky.reactRelay.entryPointContainerReactMod.GetRuntimePropsFromComponent
import typingsSlinky.reactRelay.entryPointTypesMod.PreloadedEntryPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EntryPointContainer {
  
  @scala.inline
  def apply[TPreloadedEntryPoint /* <: PreloadedEntryPoint[js.Any] */](
    entryPointReference: TPreloadedEntryPoint,
    props: GetRuntimePropsFromComponent[GetComponentFromPreloadedEntryPoint[TPreloadedEntryPoint]]
  ): Builder[TPreloadedEntryPoint] = {
    val __props = js.Dynamic.literal(entryPointReference = entryPointReference.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    new Builder[TPreloadedEntryPoint](js.Array(this.component, __props.asInstanceOf[EntryPointReference[TPreloadedEntryPoint]]))
  }
  
  @JSImport("react-relay/hooks", "EntryPointContainer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[TPreloadedEntryPoint /* <: PreloadedEntryPoint[js.Any] */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object]
  
  def withProps[TPreloadedEntryPoint /* <: PreloadedEntryPoint[js.Any] */](p: EntryPointReference[TPreloadedEntryPoint]): Builder[TPreloadedEntryPoint] = new Builder[TPreloadedEntryPoint](js.Array(this.component, p.asInstanceOf[js.Any]))
}
