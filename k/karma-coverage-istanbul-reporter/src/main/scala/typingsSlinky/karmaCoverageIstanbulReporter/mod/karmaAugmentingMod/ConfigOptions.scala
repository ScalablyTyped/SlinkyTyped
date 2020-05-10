package typingsSlinky.karmaCoverageIstanbulReporter.mod.karmaAugmentingMod

import typingsSlinky.karmaCoverageIstanbulReporter.mod.CoverageIstanbulReporter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigOptions extends js.Object {
  /** {@link https://github.com/istanbuljs/istanbuljs/blob/aae256fb8b9a3d19414dcf069c592e88712c32c6/packages/istanbul-api/lib/config.js#L33-L39 Any of these options are valid}. */
  val coverageIstanbulReporter: js.UndefOr[CoverageIstanbulReporter] = js.native
}

object ConfigOptions {
  @scala.inline
  def apply(): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigOptions]
  }
  @scala.inline
  implicit class ConfigOptionsOps[Self <: ConfigOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoverageIstanbulReporter(value: CoverageIstanbulReporter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverageIstanbulReporter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoverageIstanbulReporter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverageIstanbulReporter")(js.undefined)
        ret
    }
  }
  
}

