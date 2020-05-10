package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITextureAssetTask[TEX /* <: BaseTexture */] extends js.Object {
  /**
    * Gets the loaded texture
    */
  var texture: TEX = js.native
}

object ITextureAssetTask {
  @scala.inline
  def apply[TEX](texture: TEX): ITextureAssetTask[TEX] = {
    val __obj = js.Dynamic.literal(texture = texture.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextureAssetTask[TEX]]
  }
  @scala.inline
  implicit class ITextureAssetTaskOps[Self[tex] <: ITextureAssetTask[tex], TEX] (val x: Self[TEX]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TEX] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TEX]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TEX] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TEX] with Other]
    @scala.inline
    def withTexture(value: TEX): Self[TEX] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("texture")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

