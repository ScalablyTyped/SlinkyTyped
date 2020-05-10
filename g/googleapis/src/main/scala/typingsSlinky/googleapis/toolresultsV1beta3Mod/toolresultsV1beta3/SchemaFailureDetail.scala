package typingsSlinky.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaFailureDetail extends js.Object {
  /**
    * If the failure was severe because the system (app) under test crashed.
    */
  var crashed: js.UndefOr[Boolean] = js.native
  /**
    * If an app is not installed and thus no test can be run with the app. This
    * might be caused by trying to run a test on an unsupported platform.
    */
  var notInstalled: js.UndefOr[Boolean] = js.native
  /**
    * If a native process (including any other than the app) crashed.
    */
  var otherNativeCrash: js.UndefOr[Boolean] = js.native
  /**
    * If the test overran some time limit, and that is why it failed.
    */
  var timedOut: js.UndefOr[Boolean] = js.native
  /**
    * If the robo was unable to crawl the app; perhaps because the app did not
    * start.
    */
  var unableToCrawl: js.UndefOr[Boolean] = js.native
}

object SchemaFailureDetail {
  @scala.inline
  def apply(): SchemaFailureDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFailureDetail]
  }
  @scala.inline
  implicit class SchemaFailureDetailOps[Self <: SchemaFailureDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrashed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crashed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrashed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crashed")(js.undefined)
        ret
    }
    @scala.inline
    def withNotInstalled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notInstalled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotInstalled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notInstalled")(js.undefined)
        ret
    }
    @scala.inline
    def withOtherNativeCrash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherNativeCrash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOtherNativeCrash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherNativeCrash")(js.undefined)
        ret
    }
    @scala.inline
    def withTimedOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timedOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimedOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timedOut")(js.undefined)
        ret
    }
    @scala.inline
    def withUnableToCrawl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unableToCrawl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnableToCrawl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unableToCrawl")(js.undefined)
        ret
    }
  }
  
}

