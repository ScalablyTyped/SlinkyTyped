package typingsSlinky.dojo.dojox.gfx3d.lighting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx3d/lighting.finish.html
  *
  *
  */
@js.native
trait finish extends js.Object {
  /**
    *
    */
  var defaults: js.Object = js.native
  /**
    *
    */
  var dull: js.Object = js.native
  /**
    *
    */
  var glossy: js.Object = js.native
  /**
    *
    */
  var luminous: js.Object = js.native
  /**
    *
    */
  var metalA: js.Object = js.native
  /**
    *
    */
  var metalB: js.Object = js.native
  /**
    *
    */
  var metalC: js.Object = js.native
  /**
    *
    */
  var metalD: js.Object = js.native
  /**
    *
    */
  var metalE: js.Object = js.native
  /**
    *
    */
  var phong_dull: js.Object = js.native
  /**
    *
    */
  var phong_glossy: js.Object = js.native
  /**
    *
    */
  var phong_shiny: js.Object = js.native
  /**
    *
    */
  var shiny: js.Object = js.native
}

object finish {
  @scala.inline
  def apply(
    defaults: js.Object,
    dull: js.Object,
    glossy: js.Object,
    luminous: js.Object,
    metalA: js.Object,
    metalB: js.Object,
    metalC: js.Object,
    metalD: js.Object,
    metalE: js.Object,
    phong_dull: js.Object,
    phong_glossy: js.Object,
    phong_shiny: js.Object,
    shiny: js.Object
  ): finish = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any], dull = dull.asInstanceOf[js.Any], glossy = glossy.asInstanceOf[js.Any], luminous = luminous.asInstanceOf[js.Any], metalA = metalA.asInstanceOf[js.Any], metalB = metalB.asInstanceOf[js.Any], metalC = metalC.asInstanceOf[js.Any], metalD = metalD.asInstanceOf[js.Any], metalE = metalE.asInstanceOf[js.Any], phong_dull = phong_dull.asInstanceOf[js.Any], phong_glossy = phong_glossy.asInstanceOf[js.Any], phong_shiny = phong_shiny.asInstanceOf[js.Any], shiny = shiny.asInstanceOf[js.Any])
    __obj.asInstanceOf[finish]
  }
  @scala.inline
  implicit class finishOps[Self <: finish] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaults(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDull(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlossy(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glossy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLuminous(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("luminous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetalA(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metalA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetalB(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metalB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetalC(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metalC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetalD(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metalD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetalE(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metalE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhong_dull(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phong_dull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhong_glossy(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phong_glossy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhong_shiny(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phong_shiny")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShiny(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shiny")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

