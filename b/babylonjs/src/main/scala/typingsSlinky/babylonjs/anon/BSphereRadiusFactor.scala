package typingsSlinky.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BSphereRadiusFactor extends js.Object {
  var bSphereRadiusFactor: js.UndefOr[Double] = js.native
  var boundingSphereOnly: js.UndefOr[Boolean] = js.native
  var enableDepthSort: js.UndefOr[Boolean] = js.native
  var enableMultiMaterial: js.UndefOr[Boolean] = js.native
  var expandable: js.UndefOr[Boolean] = js.native
  var isPickable: js.UndefOr[Boolean] = js.native
  var particleIntersection: js.UndefOr[Boolean] = js.native
  var updatable: js.UndefOr[Boolean] = js.native
  var useModelMaterial: js.UndefOr[Boolean] = js.native
}

object BSphereRadiusFactor {
  @scala.inline
  def apply(): BSphereRadiusFactor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BSphereRadiusFactor]
  }
  @scala.inline
  implicit class BSphereRadiusFactorOps[Self <: BSphereRadiusFactor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBSphereRadiusFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bSphereRadiusFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBSphereRadiusFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bSphereRadiusFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withBoundingSphereOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundingSphereOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundingSphereOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundingSphereOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDepthSort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDepthSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDepthSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDepthSort")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableMultiMaterial(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMultiMaterial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableMultiMaterial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMultiMaterial")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandable")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPickable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPickable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPickable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPickable")(js.undefined)
        ret
    }
    @scala.inline
    def withParticleIntersection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("particleIntersection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParticleIntersection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("particleIntersection")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatable")(js.undefined)
        ret
    }
    @scala.inline
    def withUseModelMaterial(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useModelMaterial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseModelMaterial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useModelMaterial")(js.undefined)
        ret
    }
  }
  
}

