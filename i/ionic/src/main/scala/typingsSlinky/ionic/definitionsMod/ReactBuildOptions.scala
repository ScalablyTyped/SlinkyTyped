package typingsSlinky.ionic.definitionsMod

import typingsSlinky.ionic.ionicStrings.react
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactBuildOptions extends BuildOptions[react] {
  var ci: js.UndefOr[Boolean] = js.native
  var inlineRuntimeChunk: js.UndefOr[Boolean] = js.native
  var publicUrl: js.UndefOr[String] = js.native
  var sourceMap: js.UndefOr[Boolean] = js.native
}

object ReactBuildOptions {
  @scala.inline
  def apply(`--`: js.Array[String], engine: String, `type`: react): ReactBuildOptions = {
    val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any])
    __obj.updateDynamic("--")(`--`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactBuildOptions]
  }
  @scala.inline
  implicit class ReactBuildOptionsOps[Self <: ReactBuildOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCi(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ci")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ci")(js.undefined)
        ret
    }
    @scala.inline
    def withInlineRuntimeChunk(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineRuntimeChunk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineRuntimeChunk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineRuntimeChunk")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceMap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMap")(js.undefined)
        ret
    }
  }
  
}

