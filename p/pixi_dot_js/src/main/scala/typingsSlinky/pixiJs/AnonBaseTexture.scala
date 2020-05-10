package typingsSlinky.pixiJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBaseTexture extends js.Object {
  var baseTexture: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[Boolean] = js.native
  var texture: js.UndefOr[Boolean] = js.native
}

object AnonBaseTexture {
  @scala.inline
  def apply(): AnonBaseTexture = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBaseTexture]
  }
  @scala.inline
  implicit class AnonBaseTextureOps[Self <: AnonBaseTexture] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseTexture(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseTexture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseTexture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseTexture")(js.undefined)
        ret
    }
    @scala.inline
    def withChildren(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withTexture(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("texture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTexture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("texture")(js.undefined)
        ret
    }
  }
  
}

