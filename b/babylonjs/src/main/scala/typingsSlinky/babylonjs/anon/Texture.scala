package typingsSlinky.babylonjs.anon

import typingsSlinky.babylonjs.BABYLON.BaseTexture
import typingsSlinky.babylonjs.BABYLON.Color4
import typingsSlinky.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Texture extends js.Object {
  var color: Color4
  var texture: Nullable[BaseTexture]
}

object Texture {
  @scala.inline
  def apply(color: Color4, texture: Nullable[BaseTexture] = null): Texture = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], texture = texture.asInstanceOf[js.Any])
    __obj.asInstanceOf[Texture]
  }
}

