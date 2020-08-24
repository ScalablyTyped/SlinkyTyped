package typingsSlinky.reactGateway.gatewayRegistryMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GatewayRegistry extends js.Object {
  var _children: StringDictionary[js.UndefOr[StringDictionary[ReactElement]]] = js.native
  var _containers: StringDictionary[js.UndefOr[ReactComponentClass[js.Object] | Null]] = js.native
  var _currentId: Double = js.native
  def _renderContainer(name: String): Unit = js.native
  def addChild(name: String, gatewayId: String, child: ReactElement): Unit = js.native
  def addContainer(name: String, container: ReactComponentClass[js.Object]): Unit = js.native
  def clearChild(name: String, gatewayId: String): Unit = js.native
  def register(name: String, child: ReactElement): String = js.native
  def removeContainer(name: String): Unit = js.native
  def unregister(name: String, gatewayId: String): Unit = js.native
}

object GatewayRegistry {
  @scala.inline
  def apply(
    _children: StringDictionary[js.UndefOr[StringDictionary[ReactElement]]],
    _containers: StringDictionary[js.UndefOr[ReactComponentClass[js.Object] | Null]],
    _currentId: Double,
    _renderContainer: String => Unit,
    addChild: (String, String, ReactElement) => Unit,
    addContainer: (String, ReactComponentClass[js.Object]) => Unit,
    clearChild: (String, String) => Unit,
    register: (String, ReactElement) => String,
    removeContainer: String => Unit,
    unregister: (String, String) => Unit
  ): GatewayRegistry = {
    val __obj = js.Dynamic.literal(_children = _children.asInstanceOf[js.Any], _containers = _containers.asInstanceOf[js.Any], _currentId = _currentId.asInstanceOf[js.Any], _renderContainer = js.Any.fromFunction1(_renderContainer), addChild = js.Any.fromFunction3(addChild), addContainer = js.Any.fromFunction2(addContainer), clearChild = js.Any.fromFunction2(clearChild), register = js.Any.fromFunction2(register), removeContainer = js.Any.fromFunction1(removeContainer), unregister = js.Any.fromFunction2(unregister))
    __obj.asInstanceOf[GatewayRegistry]
  }
  @scala.inline
  implicit class GatewayRegistryOps[Self <: GatewayRegistry] (val x: Self) extends AnyVal {
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
    def set_children(value: StringDictionary[js.UndefOr[StringDictionary[ReactElement]]]): Self = this.set("_children", value.asInstanceOf[js.Any])
    @scala.inline
    def set_containers(value: StringDictionary[js.UndefOr[ReactComponentClass[js.Object] | Null]]): Self = this.set("_containers", value.asInstanceOf[js.Any])
    @scala.inline
    def set_currentId(value: Double): Self = this.set("_currentId", value.asInstanceOf[js.Any])
    @scala.inline
    def set_renderContainer(value: String => Unit): Self = this.set("_renderContainer", js.Any.fromFunction1(value))
    @scala.inline
    def setAddChild(value: (String, String, ReactElement) => Unit): Self = this.set("addChild", js.Any.fromFunction3(value))
    @scala.inline
    def setAddContainer(value: (String, ReactComponentClass[js.Object]) => Unit): Self = this.set("addContainer", js.Any.fromFunction2(value))
    @scala.inline
    def setClearChild(value: (String, String) => Unit): Self = this.set("clearChild", js.Any.fromFunction2(value))
    @scala.inline
    def setRegister(value: (String, ReactElement) => String): Self = this.set("register", js.Any.fromFunction2(value))
    @scala.inline
    def setRemoveContainer(value: String => Unit): Self = this.set("removeContainer", js.Any.fromFunction1(value))
    @scala.inline
    def setUnregister(value: (String, String) => Unit): Self = this.set("unregister", js.Any.fromFunction2(value))
  }
  
}

