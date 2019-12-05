package typingsSlinky.reactDashGateway.gatewayRegistryMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GatewayRegistry extends js.Object {
  var _children: StringDictionary[js.UndefOr[StringDictionary[TagMod[Any]]]]
  var _containers: StringDictionary[js.UndefOr[ReactComponentClass[js.Object] | Null]]
  var _currentId: Double
  def _renderContainer(name: String): Unit
  def addChild(name: String, gatewayId: String, child: TagMod[Any]): Unit
  def addContainer(name: String, container: ReactComponentClass[js.Object]): Unit
  def clearChild(name: String, gatewayId: String): Unit
  def register(name: String, child: TagMod[Any]): String
  def removeContainer(name: String): Unit
  def unregister(name: String, gatewayId: String): Unit
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
}

