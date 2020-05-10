package typingsSlinky.roads.buildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoadsBuildOptions extends js.Object {
  var babelify: js.UndefOr[js.Any] = js.native
  var envify: js.UndefOr[js.Any] = js.native
  var exclude: js.UndefOr[js.Any] = js.native
  var ignore: js.UndefOr[js.Any] = js.native
  var ignore_missing: js.UndefOr[js.Any] = js.native
  var use_sourcemaps: js.UndefOr[js.Any] = js.native
}

object RoadsBuildOptions {
  @scala.inline
  def apply(): RoadsBuildOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoadsBuildOptions]
  }
  @scala.inline
  implicit class RoadsBuildOptionsOps[Self <: RoadsBuildOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBabelify(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("babelify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBabelify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("babelify")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvify(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("envify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("envify")(js.undefined)
        ret
    }
    @scala.inline
    def withExclude(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnore(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnore_missing(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore_missing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnore_missing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore_missing")(js.undefined)
        ret
    }
    @scala.inline
    def withUse_sourcemaps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use_sourcemaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUse_sourcemaps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use_sourcemaps")(js.undefined)
        ret
    }
  }
  
}

