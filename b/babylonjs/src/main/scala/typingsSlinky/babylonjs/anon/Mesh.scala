package typingsSlinky.babylonjs.anon

import typingsSlinky.babylonjs.BABYLON.AbstractMesh
import typingsSlinky.babylonjs.BABYLON.WebVRController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mesh extends js.Object {
  var controller: WebVRController
  var mesh: AbstractMesh
}

object Mesh {
  @scala.inline
  def apply(controller: WebVRController, mesh: AbstractMesh): Mesh = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any], mesh = mesh.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mesh]
  }
}

