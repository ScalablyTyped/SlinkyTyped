package typingsSlinky.nodelibFsWalk.settingsMod

import typingsSlinky.nodelibFsWalk.typesMod.Entry
import typingsSlinky.nodelibFsWalk.typesMod.Errno
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  var _getValue: js.Any = js.native
  val _options: js.Any = js.native
  val basePath: js.UndefOr[String] = js.native
  val concurrency: Double = js.native
  val deepFilter: DeepFilterFunction | Null = js.native
  val entryFilter: EntryFilterFunction | Null = js.native
  val errorFilter: ErrorFilterFunction | Null = js.native
  val fsScandirSettings: typingsSlinky.nodelibFsScandir.mod.Settings = js.native
  val pathSegmentSeparator: String = js.native
}

object Settings {
  @scala.inline
  def apply(
    _getValue: js.Any,
    _options: js.Any,
    concurrency: Double,
    fsScandirSettings: typingsSlinky.nodelibFsScandir.mod.Settings,
    pathSegmentSeparator: String
  ): Settings = {
    val __obj = js.Dynamic.literal(_getValue = _getValue.asInstanceOf[js.Any], _options = _options.asInstanceOf[js.Any], concurrency = concurrency.asInstanceOf[js.Any], fsScandirSettings = fsScandirSettings.asInstanceOf[js.Any], pathSegmentSeparator = pathSegmentSeparator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_getValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_getValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_options(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConcurrency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFsScandirSettings(value: typingsSlinky.nodelibFsScandir.mod.Settings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fsScandirSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathSegmentSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathSegmentSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBasePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePath")(js.undefined)
        ret
    }
    @scala.inline
    def withDeepFilter(value: Entry => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deepFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeepFilterNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deepFilter")(null)
        ret
    }
    @scala.inline
    def withEntryFilter(value: Entry => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEntryFilterNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryFilter")(null)
        ret
    }
    @scala.inline
    def withErrorFilter(value: Errno => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withErrorFilterNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorFilter")(null)
        ret
    }
  }
  
}

