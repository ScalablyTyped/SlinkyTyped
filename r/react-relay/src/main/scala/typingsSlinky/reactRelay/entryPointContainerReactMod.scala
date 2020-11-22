package typingsSlinky.reactRelay

import slinky.core.facade.ReactElement
import typingsSlinky.reactRelay.anon.EntryPointReference
import typingsSlinky.reactRelay.entryPointTypesMod.PreloadedEntryPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-relay/lib/relay-experimental/EntryPointContainer.react", JSImport.Namespace)
@js.native
object entryPointContainerReactMod extends js.Object {
  
  def EntryPointContainer[TPreloadedEntryPoint /* <: PreloadedEntryPoint[_] */](hasEntryPointReferenceProps: EntryPointReference[TPreloadedEntryPoint]): ReactElement = js.native
  
  type GetComponentFromPreloadedEntryPoint[T] = js.Any
  
  type GetRuntimePropsFromComponent[T] = js.Any
}
