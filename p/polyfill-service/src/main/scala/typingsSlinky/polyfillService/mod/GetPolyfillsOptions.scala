package typingsSlinky.polyfillService.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPolyfillsOptions extends js.Object {
  var excludes: js.UndefOr[js.Array[String]] = js.native
  var features: js.UndefOr[Features] = js.native
  var uaString: String = js.native
}

object GetPolyfillsOptions {
  @scala.inline
  def apply(uaString: String): GetPolyfillsOptions = {
    val __obj = js.Dynamic.literal(uaString = uaString.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPolyfillsOptions]
  }
  @scala.inline
  implicit class GetPolyfillsOptionsOps[Self <: GetPolyfillsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUaString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uaString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcludes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludes")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatures(value: Features): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(js.undefined)
        ret
    }
  }
  
}

