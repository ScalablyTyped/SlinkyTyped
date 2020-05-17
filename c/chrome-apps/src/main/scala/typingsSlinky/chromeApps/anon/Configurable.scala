package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chromeAppsStrings.network
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configurable extends js.Object {
  /**
    * For example, if *configurable* is set to **true**,
    * then a menu item for configuring volumes will be rendered.
    */
  var configurable: js.UndefOr[Boolean] = js.native
  /**
    * If *multiple_mounts* is set to **true**, then *Files app*
    * will allow to add more than one mount points from the UI.
    */
  var multiple_mounts: js.UndefOr[Boolean] = js.native
  var source: js.UndefOr[network] = js.native
  /**
    * If *watchable* is **false**, then a refresh button will be rendered.
    * Note, that if possible you should add support for watchers, so changes
    * on the file system can be reflected immediately and automatically.
    */
  var watchable: js.UndefOr[Boolean] = js.native
}

object Configurable {
  @scala.inline
  def apply(): Configurable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Configurable]
  }
  @scala.inline
  implicit class ConfigurableOps[Self <: Configurable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurable")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiple_mounts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple_mounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiple_mounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple_mounts")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: network): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withWatchable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatchable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchable")(js.undefined)
        ret
    }
  }
  
}

