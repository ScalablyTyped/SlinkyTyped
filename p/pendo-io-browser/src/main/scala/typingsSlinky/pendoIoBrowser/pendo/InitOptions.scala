package typingsSlinky.pendoIoBrowser.pendo

import typingsSlinky.pendoIoBrowser.AnonDelay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitOptions extends Identity {
  var apiKey: js.UndefOr[String] = js.native
  var disablePersistence: js.UndefOr[Boolean] = js.native
  var events: js.UndefOr[EventCallbacks] = js.native
  var excludeAllText: js.UndefOr[Boolean] = js.native
  var excludeTitle: js.UndefOr[Boolean] = js.native
  var guides: js.UndefOr[AnonDelay] = js.native
}

object InitOptions {
  @scala.inline
  def apply(): InitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitOptions]
  }
  @scala.inline
  implicit class InitOptionsOps[Self <: InitOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiKey")(js.undefined)
        ret
    }
    @scala.inline
    def withDisablePersistence(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablePersistence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisablePersistence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablePersistence")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: EventCallbacks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeAllText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeAllText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeAllText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeAllText")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withGuides(value: AnonDelay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guides")(js.undefined)
        ret
    }
  }
  
}

