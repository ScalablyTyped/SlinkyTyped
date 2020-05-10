package typingsSlinky.bunyanBugsnag.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var bugsnagClient: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Bugsnag.Client */ js.Any = js.native
  var errorLevel: js.UndefOr[Double | String] = js.native
  var systemInfo: js.UndefOr[js.Array[String]] = js.native
  var warningLevel: js.UndefOr[Double | String] = js.native
}

object Options {
  @scala.inline
  def apply(
    bugsnagClient: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Bugsnag.Client */ js.Any
  ): Options = {
    val __obj = js.Dynamic.literal(bugsnagClient = bugsnagClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBugsnagClient(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Bugsnag.Client */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bugsnagClient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorLevel(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withSystemInfo(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystemInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withWarningLevel(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarningLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningLevel")(js.undefined)
        ret
    }
  }
  
}

