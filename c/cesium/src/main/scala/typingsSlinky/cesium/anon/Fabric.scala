package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.TextureMagnificationFilter
import typingsSlinky.cesium.mod.TextureMinificationFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fabric extends js.Object {
  var fabric: js.Any = js.native
  var magnificationFilter: js.UndefOr[TextureMagnificationFilter] = js.native
  var minificationFilter: js.UndefOr[TextureMinificationFilter] = js.native
  var strict: js.UndefOr[Boolean] = js.native
  var translucent: js.UndefOr[
    Boolean | (js.Function1[/* material */ typingsSlinky.cesium.mod.Material, Boolean])
  ] = js.native
}

object Fabric {
  @scala.inline
  def apply(fabric: js.Any): Fabric = {
    val __obj = js.Dynamic.literal(fabric = fabric.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fabric]
  }
  @scala.inline
  implicit class FabricOps[Self <: Fabric] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFabric(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fabric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMagnificationFilter(value: TextureMagnificationFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magnificationFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMagnificationFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magnificationFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withMinificationFilter(value: TextureMinificationFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minificationFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinificationFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minificationFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslucentFunction1(value: /* material */ typingsSlinky.cesium.mod.Material => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translucent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTranslucent(value: Boolean | (js.Function1[/* material */ typingsSlinky.cesium.mod.Material, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translucent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslucent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translucent")(js.undefined)
        ret
    }
  }
  
}

