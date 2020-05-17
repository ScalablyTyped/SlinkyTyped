package typingsSlinky.aframe.anon

import typingsSlinky.three.anon.AlphaMap
import typingsSlinky.three.anon.AmbientLightColor
import typingsSlinky.three.anon.AoMap
import typingsSlinky.three.anon.BumpMap
import typingsSlinky.three.anon.Diffuse
import typingsSlinky.three.anon.DisplacementBias
import typingsSlinky.three.anon.EmissiveMap
import typingsSlinky.three.anon.EnvMap
import typingsSlinky.three.anon.FogColor
import typingsSlinky.three.anon.GradientMap
import typingsSlinky.three.anon.LightMap
import typingsSlinky.three.anon.MetalnessMap
import typingsSlinky.three.anon.NormalMap
import typingsSlinky.three.anon.RoughnessMap
import typingsSlinky.three.anon.SpecularMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Aomap extends js.Object {
  var aomap: AoMap = js.native
  var bumpmap: BumpMap = js.native
  var common: AlphaMap = js.native
  var displacementmap: DisplacementBias = js.native
  var emissivemap: EmissiveMap = js.native
  var envmap: EnvMap = js.native
  var fog: FogColor = js.native
  var gradientmap: GradientMap = js.native
  var lightmap: LightMap = js.native
  var lights: AmbientLightColor = js.native
  var metalnessmap: MetalnessMap = js.native
  var normalmap: NormalMap = js.native
  var points: Diffuse = js.native
  var roughnessmap: RoughnessMap = js.native
  var specularmap: SpecularMap = js.native
}

object Aomap {
  @scala.inline
  def apply(
    aomap: AoMap,
    bumpmap: BumpMap,
    common: AlphaMap,
    displacementmap: DisplacementBias,
    emissivemap: EmissiveMap,
    envmap: EnvMap,
    fog: FogColor,
    gradientmap: GradientMap,
    lightmap: LightMap,
    lights: AmbientLightColor,
    metalnessmap: MetalnessMap,
    normalmap: NormalMap,
    points: Diffuse,
    roughnessmap: RoughnessMap,
    specularmap: SpecularMap
  ): Aomap = {
    val __obj = js.Dynamic.literal(aomap = aomap.asInstanceOf[js.Any], bumpmap = bumpmap.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], displacementmap = displacementmap.asInstanceOf[js.Any], emissivemap = emissivemap.asInstanceOf[js.Any], envmap = envmap.asInstanceOf[js.Any], fog = fog.asInstanceOf[js.Any], gradientmap = gradientmap.asInstanceOf[js.Any], lightmap = lightmap.asInstanceOf[js.Any], lights = lights.asInstanceOf[js.Any], metalnessmap = metalnessmap.asInstanceOf[js.Any], normalmap = normalmap.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], roughnessmap = roughnessmap.asInstanceOf[js.Any], specularmap = specularmap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aomap]
  }
  @scala.inline
  implicit class AomapOps[Self <: Aomap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAomap(value: AoMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aomap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBumpmap(value: BumpMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bumpmap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommon(value: AlphaMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("common")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplacementmap(value: DisplacementBias): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displacementmap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmissivemap(value: EmissiveMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emissivemap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvmap(value: EnvMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("envmap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFog(value: FogColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGradientmap(value: GradientMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientmap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLightmap(value: LightMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightmap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLights(value: AmbientLightColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetalnessmap(value: MetalnessMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metalnessmap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormalmap(value: NormalMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalmap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoints(value: Diffuse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoughnessmap(value: RoughnessMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roughnessmap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpecularmap(value: SpecularMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specularmap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

