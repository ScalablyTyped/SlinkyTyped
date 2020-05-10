package typingsSlinky.keystonejsAppNuxt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NuxtOptions extends js.Object {
  var buildDir: js.UndefOr[String] = js.native
  var srcDir: js.UndefOr[String] = js.native
}

object NuxtOptions {
  @scala.inline
  def apply(): NuxtOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NuxtOptions]
  }
  @scala.inline
  implicit class NuxtOptionsOps[Self <: NuxtOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuildDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuildDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildDir")(js.undefined)
        ret
    }
    @scala.inline
    def withSrcDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrcDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcDir")(js.undefined)
        ret
    }
  }
  
}

