package typingsSlinky.firefoxWebextBrowser

import typingsSlinky.firefoxWebextBrowser.browser.experiments.APIChildScope
import typingsSlinky.firefoxWebextBrowser.browser.experiments.APIPaths
import typingsSlinky.firefoxWebextBrowser.browser.experiments.ExperimentURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPaths extends js.Object {
  var paths: APIPaths = js.native
  var scopes: js.Array[APIChildScope] = js.native
  var script: ExperimentURL = js.native
}

object AnonPaths {
  @scala.inline
  def apply(paths: APIPaths, scopes: js.Array[APIChildScope], script: ExperimentURL): AnonPaths = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPaths]
  }
  @scala.inline
  implicit class AnonPathsOps[Self <: AnonPaths] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPaths(value: APIPaths): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopes(value: js.Array[APIChildScope]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScript(value: ExperimentURL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("script")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

