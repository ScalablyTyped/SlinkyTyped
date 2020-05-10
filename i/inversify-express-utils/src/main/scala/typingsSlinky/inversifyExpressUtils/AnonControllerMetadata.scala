package typingsSlinky.inversifyExpressUtils

import typingsSlinky.inversifyExpressUtils.interfacesMod.interfaces.ControllerMetadata
import typingsSlinky.inversifyExpressUtils.interfacesMod.interfaces.ControllerMethodMetadata
import typingsSlinky.inversifyExpressUtils.interfacesMod.interfaces.ControllerParameterMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonControllerMetadata extends js.Object {
  var controllerMetadata: ControllerMetadata = js.native
  var methodMetadata: js.Array[ControllerMethodMetadata] = js.native
  var parameterMetadata: ControllerParameterMetadata = js.native
}

object AnonControllerMetadata {
  @scala.inline
  def apply(
    controllerMetadata: ControllerMetadata,
    methodMetadata: js.Array[ControllerMethodMetadata],
    parameterMetadata: ControllerParameterMetadata
  ): AnonControllerMetadata = {
    val __obj = js.Dynamic.literal(controllerMetadata = controllerMetadata.asInstanceOf[js.Any], methodMetadata = methodMetadata.asInstanceOf[js.Any], parameterMetadata = parameterMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonControllerMetadata]
  }
  @scala.inline
  implicit class AnonControllerMetadataOps[Self <: AnonControllerMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withControllerMetadata(value: ControllerMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controllerMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethodMetadata(value: js.Array[ControllerMethodMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameterMetadata(value: ControllerParameterMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterMetadata")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

