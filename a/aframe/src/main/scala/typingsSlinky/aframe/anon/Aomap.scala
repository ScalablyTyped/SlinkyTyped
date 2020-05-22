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

trait Aomap extends js.Object {
  var aomap: AoMap
  var bumpmap: BumpMap
  var common: AlphaMap
  var displacementmap: DisplacementBias
  var emissivemap: EmissiveMap
  var envmap: EnvMap
  var fog: FogColor
  var gradientmap: GradientMap
  var lightmap: LightMap
  var lights: AmbientLightColor
  var metalnessmap: MetalnessMap
  var normalmap: NormalMap
  var points: Diffuse
  var roughnessmap: RoughnessMap
  var specularmap: SpecularMap
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
}

