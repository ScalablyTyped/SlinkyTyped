package typingsSlinky.oclazyload.oc

import typingsSlinky.angular.mod.IRequestShortcutConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOptionsConfig extends IRequestShortcutConfig {
  /**
    * If true, bypasses browser cache by appending a timestamp to URLs. Defaults to true.
    */
  @JSName("cache")
  var cache_IOptionsConfig: js.UndefOr[Boolean] = js.native
  /**
    * If set, will insert files immediately before the provided CSS selector, instead of the default behavior of inserting files immediately before the
    * last child of the <head> element. Defaults to undefined.
    */
  var insertBefore: js.UndefOr[String] = js.native
  /**
    * If true, a module config will be invoked each time the module is reloaded. Use with caution, as re-invoking configs can lead to unexpected results.
    * Defaults to false.
    */
  var reconfig: js.UndefOr[Boolean] = js.native
  /**
    * If true, a module run block will be invoked each time the module is reloaded. Use with caution, as re-invoking run blocks can lead to unexpected results.
    * Defaults to false.
    */
  var rerun: js.UndefOr[Boolean] = js.native
  /**
    * If true, will load files in a series, instead of in parallel. Defaults to false.
    */
  var serie: js.UndefOr[Boolean] = js.native
}

object IOptionsConfig {
  @scala.inline
  def apply(): IOptionsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptionsConfig]
  }
  @scala.inline
  implicit class IOptionsConfigOps[Self <: IOptionsConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertBefore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withReconfig(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReconfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconfig")(js.undefined)
        ret
    }
    @scala.inline
    def withRerun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rerun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRerun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rerun")(js.undefined)
        ret
    }
    @scala.inline
    def withSerie(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerie: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serie")(js.undefined)
        ret
    }
  }
  
}

