package typingsSlinky.chromeApps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Global extends js.Object {
  /** Command description */
  var description: js.UndefOr[String] = js.native
  /** Global scope? */
  var global: js.UndefOr[Boolean] = js.native
  /**
    * Keys can be provided matching this pattern:
    * ^(Ctrl|Command|MacCtrl|Alt|Option)\\+(Shift\\+)?[A-Z]
    * @example
    * 'suggested_key': {
    *     'default': 'Ctrl+Shift+Y',
    *     'mac': 'Command+Shift+Y'
    * },
    */
  var suggested_key: js.UndefOr[Chromeos] = js.native
}

object Global {
  @scala.inline
  def apply(): Global = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Global]
  }
  @scala.inline
  implicit class GlobalOps[Self <: Global] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggested_key(value: Chromeos): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggested_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggested_key: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggested_key")(js.undefined)
        ret
    }
  }
  
}

