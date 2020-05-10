package typingsSlinky.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentPlatform extends js.Object {
  /**
    * The list of programming languages that are available for the specified platform.
    */
  var languages: js.UndefOr[EnvironmentLanguages] = js.native
  /**
    * The platform's name.
    */
  var platform: js.UndefOr[PlatformType] = js.native
}

object EnvironmentPlatform {
  @scala.inline
  def apply(): EnvironmentPlatform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentPlatform]
  }
  @scala.inline
  implicit class EnvironmentPlatformOps[Self <: EnvironmentPlatform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLanguages(value: EnvironmentLanguages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languages")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatform(value: PlatformType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(js.undefined)
        ret
    }
  }
  
}

