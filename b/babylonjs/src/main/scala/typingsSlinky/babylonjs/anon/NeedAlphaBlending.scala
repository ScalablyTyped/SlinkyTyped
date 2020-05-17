package typingsSlinky.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NeedAlphaBlending extends js.Object {
  var needAlphaBlending: Boolean = js.native
  var needAlphaTesting: Boolean = js.native
  var needWorldViewMatrix: Boolean = js.native
  var needWorldViewProjectionMatrix: Boolean = js.native
}

object NeedAlphaBlending {
  @scala.inline
  def apply(
    needAlphaBlending: Boolean,
    needAlphaTesting: Boolean,
    needWorldViewMatrix: Boolean,
    needWorldViewProjectionMatrix: Boolean
  ): NeedAlphaBlending = {
    val __obj = js.Dynamic.literal(needAlphaBlending = needAlphaBlending.asInstanceOf[js.Any], needAlphaTesting = needAlphaTesting.asInstanceOf[js.Any], needWorldViewMatrix = needWorldViewMatrix.asInstanceOf[js.Any], needWorldViewProjectionMatrix = needWorldViewProjectionMatrix.asInstanceOf[js.Any])
    __obj.asInstanceOf[NeedAlphaBlending]
  }
  @scala.inline
  implicit class NeedAlphaBlendingOps[Self <: NeedAlphaBlending] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNeedAlphaBlending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needAlphaBlending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNeedAlphaTesting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needAlphaTesting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNeedWorldViewMatrix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needWorldViewMatrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNeedWorldViewProjectionMatrix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needWorldViewProjectionMatrix")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

