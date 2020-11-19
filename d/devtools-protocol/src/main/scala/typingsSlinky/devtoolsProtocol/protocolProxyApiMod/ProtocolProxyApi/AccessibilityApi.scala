package typingsSlinky.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typingsSlinky.devtoolsProtocol.mod.Protocol.Accessibility.GetFullAXTreeResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Accessibility.GetPartialAXTreeRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Accessibility.GetPartialAXTreeResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessibilityApi extends js.Object {
  
  /**
    * Disables the accessibility domain.
    */
  def disable(): js.Promise[Unit] = js.native
  
  /**
    * Enables the accessibility domain which causes `AXNodeId`s to remain consistent between method calls.
    * This turns on accessibility for the page, which can impact performance until accessibility is disabled.
    */
  def enable(): js.Promise[Unit] = js.native
  
  /**
    * Fetches the entire accessibility tree
    */
  def getFullAXTree(): js.Promise[GetFullAXTreeResponse] = js.native
  
  /**
    * Fetches the accessibility node and partial accessibility tree for this DOM node, if it exists.
    */
  def getPartialAXTree(params: GetPartialAXTreeRequest): js.Promise[GetPartialAXTreeResponse] = js.native
}
object AccessibilityApi {
  
  @scala.inline
  def apply(
    disable: () => js.Promise[Unit],
    enable: () => js.Promise[Unit],
    getFullAXTree: () => js.Promise[GetFullAXTreeResponse],
    getPartialAXTree: GetPartialAXTreeRequest => js.Promise[GetPartialAXTreeResponse]
  ): AccessibilityApi = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), getFullAXTree = js.Any.fromFunction0(getFullAXTree), getPartialAXTree = js.Any.fromFunction1(getPartialAXTree))
    __obj.asInstanceOf[AccessibilityApi]
  }
  
  @scala.inline
  implicit class AccessibilityApiOps[Self <: AccessibilityApi] (val x: Self) extends AnyVal {
    
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
    def setDisable(value: () => js.Promise[Unit]): Self = this.set("disable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnable(value: () => js.Promise[Unit]): Self = this.set("enable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFullAXTree(value: () => js.Promise[GetFullAXTreeResponse]): Self = this.set("getFullAXTree", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPartialAXTree(value: GetPartialAXTreeRequest => js.Promise[GetPartialAXTreeResponse]): Self = this.set("getPartialAXTree", js.Any.fromFunction1(value))
  }
}
