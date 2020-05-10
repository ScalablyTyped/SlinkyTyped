package typingsSlinky.jasmineNode.jasmine

import typingsSlinky.jasmine.jasmine.Runner
import typingsSlinky.jasmineNode.AnonConsolidate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecuteSpecsOptions extends js.Object {
  var growl: js.UndefOr[Boolean] = js.native
  var includeStackTrace: js.UndefOr[Boolean] = js.native
  var isVerbose: js.UndefOr[Boolean] = js.native
  var junitreport: js.UndefOr[AnonConsolidate] = js.native
  var onComplete: js.UndefOr[js.Function1[/* runner */ Runner, Unit]] = js.native
  var regExpSpec: js.RegExp = js.native
  var showColors: js.UndefOr[Boolean] = js.native
  var specFolders: js.Array[String] = js.native
  var teamcity: js.UndefOr[String | Boolean] = js.native
  var useRequireJs: js.UndefOr[Boolean] = js.native
}

object ExecuteSpecsOptions {
  @scala.inline
  def apply(regExpSpec: js.RegExp, specFolders: js.Array[String]): ExecuteSpecsOptions = {
    val __obj = js.Dynamic.literal(regExpSpec = regExpSpec.asInstanceOf[js.Any], specFolders = specFolders.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteSpecsOptions]
  }
  @scala.inline
  implicit class ExecuteSpecsOptionsOps[Self <: ExecuteSpecsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegExpSpec(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regExpSpec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpecFolders(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specFolders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrowl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("growl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrowl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("growl")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeStackTrace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeStackTrace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeStackTrace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeStackTrace")(js.undefined)
        ret
    }
    @scala.inline
    def withIsVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVerbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsVerbose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVerbose")(js.undefined)
        ret
    }
    @scala.inline
    def withJunitreport(value: AnonConsolidate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("junitreport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJunitreport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("junitreport")(js.undefined)
        ret
    }
    @scala.inline
    def withOnComplete(value: /* runner */ Runner => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withShowColors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showColors")(js.undefined)
        ret
    }
    @scala.inline
    def withTeamcity(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamcity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeamcity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamcity")(js.undefined)
        ret
    }
    @scala.inline
    def withUseRequireJs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useRequireJs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseRequireJs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useRequireJs")(js.undefined)
        ret
    }
  }
  
}

