package typingsSlinky.babylonjs.pbrBRDFConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMaterialBRDFDefines extends js.Object {
  var BRDF_V_HEIGHT_CORRELATED: Boolean = js.native
  var MS_BRDF_ENERGY_CONSERVATION: Boolean = js.native
  var SPECULAR_GLOSSINESS_ENERGY_CONSERVATION: Boolean = js.native
  var SPHERICAL_HARMONICS: Boolean = js.native
  /** @hidden */
  var _areMiscDirty: Boolean = js.native
}

object IMaterialBRDFDefines {
  @scala.inline
  def apply(
    BRDF_V_HEIGHT_CORRELATED: Boolean,
    MS_BRDF_ENERGY_CONSERVATION: Boolean,
    SPECULAR_GLOSSINESS_ENERGY_CONSERVATION: Boolean,
    SPHERICAL_HARMONICS: Boolean,
    _areMiscDirty: Boolean
  ): IMaterialBRDFDefines = {
    val __obj = js.Dynamic.literal(BRDF_V_HEIGHT_CORRELATED = BRDF_V_HEIGHT_CORRELATED.asInstanceOf[js.Any], MS_BRDF_ENERGY_CONSERVATION = MS_BRDF_ENERGY_CONSERVATION.asInstanceOf[js.Any], SPECULAR_GLOSSINESS_ENERGY_CONSERVATION = SPECULAR_GLOSSINESS_ENERGY_CONSERVATION.asInstanceOf[js.Any], SPHERICAL_HARMONICS = SPHERICAL_HARMONICS.asInstanceOf[js.Any], _areMiscDirty = _areMiscDirty.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMaterialBRDFDefines]
  }
  @scala.inline
  implicit class IMaterialBRDFDefinesOps[Self <: IMaterialBRDFDefines] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBRDF_V_HEIGHT_CORRELATED(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BRDF_V_HEIGHT_CORRELATED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMS_BRDF_ENERGY_CONSERVATION(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MS_BRDF_ENERGY_CONSERVATION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSPECULAR_GLOSSINESS_ENERGY_CONSERVATION(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SPECULAR_GLOSSINESS_ENERGY_CONSERVATION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSPHERICAL_HARMONICS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SPHERICAL_HARMONICS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_areMiscDirty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_areMiscDirty")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

