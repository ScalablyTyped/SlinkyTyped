package typingsSlinky.ionic.definitionsMod

import typingsSlinky.ionic.ionicStrings.`ionic-angular`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonicAngularBuildOptions extends BuildOptions[`ionic-angular`] {
  var aot: Boolean = js.native
  var env: js.UndefOr[String] = js.native
  var minifycss: Boolean = js.native
  var minifyjs: Boolean = js.native
  var optimizejs: Boolean = js.native
  var prod: Boolean = js.native
  var sourcemaps: js.UndefOr[Boolean] = js.native
}

object IonicAngularBuildOptions {
  @scala.inline
  def apply(
    `--`: js.Array[String],
    aot: Boolean,
    engine: String,
    minifycss: Boolean,
    minifyjs: Boolean,
    optimizejs: Boolean,
    prod: Boolean,
    `type`: `ionic-angular`
  ): IonicAngularBuildOptions = {
    val __obj = js.Dynamic.literal(aot = aot.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], minifycss = minifycss.asInstanceOf[js.Any], minifyjs = minifyjs.asInstanceOf[js.Any], optimizejs = optimizejs.asInstanceOf[js.Any], prod = prod.asInstanceOf[js.Any])
    __obj.updateDynamic("--")(`--`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonicAngularBuildOptions]
  }
  @scala.inline
  implicit class IonicAngularBuildOptionsOps[Self <: IonicAngularBuildOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinifycss(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minifycss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinifyjs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minifyjs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptimizejs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizejs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnv(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(js.undefined)
        ret
    }
    @scala.inline
    def withSourcemaps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcemaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourcemaps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcemaps")(js.undefined)
        ret
    }
  }
  
}

