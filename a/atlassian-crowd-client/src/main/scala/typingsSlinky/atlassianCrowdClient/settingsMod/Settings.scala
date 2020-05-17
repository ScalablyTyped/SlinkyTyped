package typingsSlinky.atlassianCrowdClient.settingsMod

import typingsSlinky.atlassianCrowdClient.anon.Password
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  val application: Password = js.native
  val attributesEncoder: js.UndefOr[js.Function1[/* obj */ js.Any, String]] = js.native
  val attributesParser: js.UndefOr[js.Function1[/* json */ String, _]] = js.native
  val baseUrl: String = js.native
  val debug: js.UndefOr[Boolean] = js.native
  val nesting: js.UndefOr[Boolean] = js.native
  val sessionTimeout: js.UndefOr[Double] = js.native
}

object Settings {
  @scala.inline
  def apply(application: Password, baseUrl: String): Settings = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], baseUrl = baseUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: Password): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributesEncoder(value: /* obj */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributesEncoder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAttributesEncoder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributesEncoder")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributesParser(value: /* json */ String => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributesParser")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAttributesParser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributesParser")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withNesting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nesting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNesting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nesting")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionTimeout")(js.undefined)
        ret
    }
  }
  
}

