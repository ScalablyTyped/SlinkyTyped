package typingsSlinky.angularGrowlV2.mod.growl

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angular.mod.global.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Custom configuration used in single message call.
  */
@js.native
trait IGrowlMessageConfig extends js.Object {
  var disableCloseButton: js.UndefOr[Boolean] = js.native
  var disableCountDown: js.UndefOr[Boolean] = js.native
  var disableIcons: js.UndefOr[Boolean] = js.native
  var onclose: js.UndefOr[Function] = js.native
  var onopen: js.UndefOr[Function] = js.native
  var position: js.UndefOr[String] = js.native
  var referenceId: js.UndefOr[Double] = js.native
  var title: js.UndefOr[String] = js.native
  var translateMessage: js.UndefOr[Boolean] = js.native
  var ttl: js.UndefOr[Double] = js.native
  var variables: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object IGrowlMessageConfig {
  @scala.inline
  def apply(): IGrowlMessageConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGrowlMessageConfig]
  }
  @scala.inline
  implicit class IGrowlMessageConfigOps[Self <: IGrowlMessageConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableCloseButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCloseButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableCloseButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCloseButton")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableCountDown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCountDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableCountDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCountDown")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableIcons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableIcons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableIcons")(js.undefined)
        ret
    }
    @scala.inline
    def withOnclose(value: Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnclose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnopen(value: Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onopen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnopen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onopen")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceId")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslateMessage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslateMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withTtl(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(js.undefined)
        ret
    }
    @scala.inline
    def withVariables(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(js.undefined)
        ret
    }
  }
  
}

