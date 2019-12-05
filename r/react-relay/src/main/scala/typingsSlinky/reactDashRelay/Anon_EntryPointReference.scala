package typingsSlinky.reactDashRelay

import slinky.core.ReactComponentClass
import typingsSlinky.reactDashRelay.libRelayDashExperimentalEntryPointTypesMod.EntryPointProps
import typingsSlinky.reactDashRelay.libRelayDashExperimentalEntryPointTypesMod.PreloadedEntryPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EntryPointReference[TEntryPointComponent /* <: ReactComponentClass[
EntryPointProps[TPreloadedQueries, TPreloadedNestedEntryPoints, TRuntimeProps, TExtraProps]] */, TRuntimeProps /* <: js.Object */] extends js.Object {
  var entryPointReference: PreloadedEntryPoint[TEntryPointComponent]
  var props: TRuntimeProps
}

object Anon_EntryPointReference {
  @scala.inline
  def apply[TEntryPointComponent /* <: ReactComponentClass[
    EntryPointProps[TPreloadedQueries, TPreloadedNestedEntryPoints, TRuntimeProps, TExtraProps]
  ] */, TRuntimeProps /* <: js.Object */](entryPointReference: PreloadedEntryPoint[TEntryPointComponent], props: TRuntimeProps): Anon_EntryPointReference[TEntryPointComponent, TRuntimeProps] = {
    val __obj = js.Dynamic.literal(entryPointReference = entryPointReference.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EntryPointReference[TEntryPointComponent, TRuntimeProps]]
  }
}

