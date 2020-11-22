package typingsSlinky.reactRelay.anon

import typingsSlinky.reactRelay.reactRelayStrings.refetch
import typingsSlinky.reactRelay.useRefetchableFragmentNodeMod.Action
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.RenderPolicy
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefetchVariables extends Action {
  
  var environment: js.UndefOr[typingsSlinky.relayRuntime.relayStoreTypesMod.Environment | Null] = js.native
  
  var fetchPolicy: js.UndefOr[typingsSlinky.relayRuntime.relayRuntimeTypesMod.FetchPolicy] = js.native
  
  var onComplete: js.UndefOr[js.Function1[/* args */ js.Error | Null, Unit]] = js.native
  
  var refetchVariables: Variables = js.native
  
  var renderPolicy: js.UndefOr[RenderPolicy] = js.native
  
  var `type`: refetch = js.native
}
object RefetchVariables {
  
  @scala.inline
  def apply(refetchVariables: Variables, `type`: refetch): RefetchVariables = {
    val __obj = js.Dynamic.literal(refetchVariables = refetchVariables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefetchVariables]
  }
  
  @scala.inline
  implicit class RefetchVariablesOps[Self <: RefetchVariables] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRefetchVariables(value: Variables): Self = this.set("refetchVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: refetch): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironment(value: typingsSlinky.relayRuntime.relayStoreTypesMod.Environment): Self = this.set("environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    
    @scala.inline
    def setEnvironmentNull: Self = this.set("environment", null)
    
    @scala.inline
    def setFetchPolicy(value: typingsSlinky.relayRuntime.relayRuntimeTypesMod.FetchPolicy): Self = this.set("fetchPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetchPolicy: Self = this.set("fetchPolicy", js.undefined)
    
    @scala.inline
    def setOnComplete(value: /* args */ js.Error | Null => Unit): Self = this.set("onComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnComplete: Self = this.set("onComplete", js.undefined)
    
    @scala.inline
    def setRenderPolicy(value: RenderPolicy): Self = this.set("renderPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderPolicy: Self = this.set("renderPolicy", js.undefined)
  }
}
