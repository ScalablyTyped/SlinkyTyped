package typingsSlinky.reactRelay

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ClassicElement
import typingsSlinky.reactRelay.entryPointTypesMod.EntryPointProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay/lib/relay-experimental/EntryPointContainer", JSImport.Namespace)
@js.native
object entryPointContainerMod extends js.Object {
  def EntryPointContainer[TPreloadedQueries /* <: js.Object */, TPreloadedNestedEntryPoints /* <: js.Object */, TRuntimeProps /* <: js.Object */, TExtraProps, TEntryPointComponent /* <: ReactComponentClass[
    EntryPointProps[TPreloadedQueries, TPreloadedNestedEntryPoints, TRuntimeProps, TExtraProps]
  ] */](
    hasEntryPointReferenceProps: AnonEntryPointReference[
      TEntryPointComponent, 
      TRuntimeProps, 
      TPreloadedQueries, 
      TPreloadedNestedEntryPoints, 
      TExtraProps
    ]
  ): ClassicElement[ReactElement] = js.native
}

