package typingsSlinky.args.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationOptions extends js.Object {
  var help: js.UndefOr[Boolean] = js.native
  var mainColor: String | js.Array[String] = js.native
  var minimist: js.UndefOr[MinimistOptions] = js.native
  var mri: MriOptions = js.native
  var name: js.UndefOr[String] = js.native
  var subColor: String | js.Array[String] = js.native
  var usageFilter: js.UndefOr[js.Function1[/* output */ js.Any, _]] = js.native
  var value: js.UndefOr[String] = js.native
  var version: js.UndefOr[Boolean] = js.native
}

object ConfigurationOptions {
  @scala.inline
  def apply(mainColor: String | js.Array[String], mri: MriOptions, subColor: String | js.Array[String]): ConfigurationOptions = {
    val __obj = js.Dynamic.literal(mainColor = mainColor.asInstanceOf[js.Any], mri = mri.asInstanceOf[js.Any], subColor = subColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationOptions]
  }
  @scala.inline
  implicit class ConfigurationOptionsOps[Self <: ConfigurationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMainColor(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMri(value: MriOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubColor(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHelp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("help")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHelp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("help")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimist(value: MinimistOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimist")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withUsageFilter(value: /* output */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usageFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUsageFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usageFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

