package typingsSlinky.inversifyExpressUtils.anon

import typingsSlinky.inversifyExpressUtils.interfacesMod.interfaces.ControllerMethodMetadata
import typingsSlinky.inversifyExpressUtils.interfacesMod.interfaces.ControllerParameterMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControllerMetadata extends js.Object {
  var controllerMetadata: typingsSlinky.inversifyExpressUtils.interfacesMod.interfaces.ControllerMetadata
  var methodMetadata: js.Array[ControllerMethodMetadata]
  var parameterMetadata: ControllerParameterMetadata
}

object ControllerMetadata {
  @scala.inline
  def apply(
    controllerMetadata: typingsSlinky.inversifyExpressUtils.interfacesMod.interfaces.ControllerMetadata,
    methodMetadata: js.Array[ControllerMethodMetadata],
    parameterMetadata: ControllerParameterMetadata
  ): ControllerMetadata = {
    val __obj = js.Dynamic.literal(controllerMetadata = controllerMetadata.asInstanceOf[js.Any], methodMetadata = methodMetadata.asInstanceOf[js.Any], parameterMetadata = parameterMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControllerMetadata]
  }
}

