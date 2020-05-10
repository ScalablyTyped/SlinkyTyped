package typingsSlinky.reactGtmModule.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagManagerArgs extends DataLayerArgs {
  /**
    * Used to set environments.
    */
  var auth: js.UndefOr[String] = js.native
  /**
    * Additional events such as 'gtm.start': new Date().getTime(),event:'gtm.js'.
    */
  var events: js.UndefOr[js.Object] = js.native
  /**
    * GTM id, must be something like GTM-000000.
    */
  var gtmId: String = js.native
  /**
    * Used to set environments, something like env-00.
    */
  var preview: js.UndefOr[String] = js.native
}

object TagManagerArgs {
  @scala.inline
  def apply(gtmId: String): TagManagerArgs = {
    val __obj = js.Dynamic.literal(gtmId = gtmId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagManagerArgs]
  }
  @scala.inline
  implicit class TagManagerArgsOps[Self <: TagManagerArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGtmId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gtmId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: js.Object): Self = {
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
    def withPreview(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview")(js.undefined)
        ret
    }
  }
  
}

