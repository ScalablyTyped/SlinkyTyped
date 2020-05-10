package typingsSlinky.babylonjs.htmlElementTextureMod

import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.thinEngineMod.ThinEngine
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHtmlElementTextureOptions extends js.Object {
  /**
    * Defines the engine instance to use the texture with. It is not mandatory if you define a scene.
    */
  var engine: Nullable[ThinEngine] = js.native
  /**
    * Defines wether mip maps should be created or not.
    */
  var generateMipMaps: js.UndefOr[Boolean] = js.native
  /**
    * Defines the sampling mode of the texture.
    */
  var samplingMode: js.UndefOr[Double] = js.native
  /**
    * Defines the scene the texture belongs to. It is not mandatory if you define an engine.
    */
  var scene: Nullable[Scene] = js.native
}

object IHtmlElementTextureOptions {
  @scala.inline
  def apply(): IHtmlElementTextureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHtmlElementTextureOptions]
  }
  @scala.inline
  implicit class IHtmlElementTextureOptionsOps[Self <: IHtmlElementTextureOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEngine(value: Nullable[ThinEngine]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEngineNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engine")(null)
        ret
    }
    @scala.inline
    def withGenerateMipMaps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateMipMaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenerateMipMaps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateMipMaps")(js.undefined)
        ret
    }
    @scala.inline
    def withSamplingMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samplingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSamplingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samplingMode")(js.undefined)
        ret
    }
    @scala.inline
    def withScene(value: Nullable[Scene]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scene")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSceneNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scene")(null)
        ret
    }
  }
  
}

