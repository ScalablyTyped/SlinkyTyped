package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XRSessionInit extends js.Object {
  var optionalFeatures: js.UndefOr[js.Array[XRReferenceSpaceType]] = js.native
  var requiredFeatures: js.UndefOr[js.Array[XRReferenceSpaceType]] = js.native
}

object XRSessionInit {
  @scala.inline
  def apply(): XRSessionInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XRSessionInit]
  }
  @scala.inline
  implicit class XRSessionInitOps[Self <: XRSessionInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptionalFeatures(value: js.Array[XRReferenceSpaceType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionalFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalFeatures")(js.undefined)
        ret
    }
    @scala.inline
    def withRequiredFeatures(value: js.Array[XRReferenceSpaceType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequiredFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredFeatures")(js.undefined)
        ret
    }
  }
  
}

