package typingsSlinky.matterJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRendererOptions extends js.Object {
  /**
    * Sets scene background
    * @type string
    * default undefined
    */
  var background: js.UndefOr[String] = js.native
  /**
    * A flag that specifies if `render.bounds` should be used when rendering.
    *
    * @property options.hasBounds
    * @type boolean
    * @default false
    */
  var hasBounds: js.UndefOr[Boolean] = js.native
  /**
    * The target height in pixels of the `render.canvas` to be created.
    *
    * @property options.height
    * @type number
    * @default 600
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * The target width in pixels of the `render.canvas` to be created.
    *
    * @property options.width
    * @type number
    * @default 800
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * Sets wireframe background if `render.options.wireframes` is enabled
    * @type string
    * default undefined
    */
  var wireframeBackground: js.UndefOr[String] = js.native
  /**
    * Render wireframes only
    * @type boolean
    * @default true
    */
  var wireframes: js.UndefOr[Boolean] = js.native
}

object IRendererOptions {
  @scala.inline
  def apply(): IRendererOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRendererOptions]
  }
  @scala.inline
  implicit class IRendererOptionsOps[Self <: IRendererOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withHasBounds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasBounds")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withWireframeBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wireframeBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWireframeBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wireframeBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withWireframes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wireframes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWireframes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wireframes")(js.undefined)
        ret
    }
  }
  
}

