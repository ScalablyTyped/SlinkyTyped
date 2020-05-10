package typingsSlinky.reactGateway.gatewayRegistryMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GatewayRegistry extends js.Object {
  var _children: StringDictionary[js.UndefOr[StringDictionary[TagMod[Any]]]] = js.native
  var _containers: StringDictionary[js.UndefOr[ReactComponentClass[js.Object] | Null]] = js.native
  var _currentId: Double = js.native
  def _renderContainer(name: String): Unit = js.native
  def addChild(name: String, gatewayId: String, child: TagMod[Any]): Unit = js.native
  def addContainer(name: String, container: ReactComponentClass[js.Object]): Unit = js.native
  def clearChild(name: String, gatewayId: String): Unit = js.native
  def register(name: String, child: TagMod[Any]): String = js.native
  def removeContainer(name: String): Unit = js.native
  def unregister(name: String, gatewayId: String): Unit = js.native
}

object GatewayRegistry {
  @scala.inline
  def apply(
    _children: StringDictionary[js.UndefOr[StringDictionary[TagMod[Any]]]],
    _containers: StringDictionary[js.UndefOr[ReactComponentClass[js.Object] | Null]],
    _currentId: Double,
    _renderContainer: String => Unit,
    addChild: (String, String, TagMod[Any]) => Unit,
    addContainer: (String, ReactComponentClass[js.Object]) => Unit,
    clearChild: (String, String) => Unit,
    register: (String, TagMod[Any]) => String,
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
    def with_children(value: StringDictionary[js.UndefOr[StringDictionary[TagMod[Any]]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_containers(value: StringDictionary[js.UndefOr[ReactComponentClass[js.Object] | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_containers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_currentId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_renderContainer(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_renderContainer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddChild(value: (String, String, TagMod[Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addChild")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withAddContainer(value: (String, ReactComponentClass[js.Object]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addContainer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withClearChild(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearChild")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRegister(value: (String, TagMod[Any]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveContainer(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeContainer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnregister(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unregister")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

