package typingsSlinky.jestWatcher.typesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jestTypes.configMod.Glob
import typingsSlinky.jestTypes.configMod.NotifyMode
import typingsSlinky.jestTypes.configMod.ReporterConfig
import typingsSlinky.jestTypes.configMod.SnapshotUpdateState
import typingsSlinky.jestWatcher.jestWatcherStrings.`json-summary`
import typingsSlinky.jestWatcher.jestWatcherStrings.`text-lcov`
import typingsSlinky.jestWatcher.jestWatcherStrings.`text-summary`
import typingsSlinky.jestWatcher.jestWatcherStrings.clover
import typingsSlinky.jestWatcher.jestWatcherStrings.cobertura
import typingsSlinky.jestWatcher.jestWatcherStrings.html
import typingsSlinky.jestWatcher.jestWatcherStrings.json
import typingsSlinky.jestWatcher.jestWatcherStrings.lcovonly
import typingsSlinky.jestWatcher.jestWatcherStrings.none
import typingsSlinky.jestWatcher.jestWatcherStrings.teamcity
import typingsSlinky.jestWatcher.jestWatcherStrings.text
import typingsSlinky.jestWatcher.jestWatcherStrings.watch
import typingsSlinky.jestWatcher.jestWatcherStrings.watchAll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<@jest/types.@jest/types.Config.GlobalConfig, 'bail' | 'changedSince' | 'collectCoverage' | 'collectCoverageFrom' | 'collectCoverageOnlyFrom' | 'coverageDirectory' | 'coverageReporters' | 'notify' | 'notifyMode' | 'onlyFailures' | 'reporters' | 'testNamePattern' | 'testPathPattern' | 'updateSnapshot' | 'verbose'> & {  mode  :'watch' | 'watchAll'}> */
@js.native
trait AllowedConfigOptions extends js.Object {
  var bail: js.UndefOr[Double] = js.native
  var changedSince: js.UndefOr[String] = js.native
  var collectCoverage: js.UndefOr[Boolean] = js.native
  var collectCoverageFrom: js.UndefOr[js.Array[Glob]] = js.native
  var collectCoverageOnlyFrom: js.UndefOr[StringDictionary[Boolean]] = js.native
  var coverageDirectory: js.UndefOr[String] = js.native
  var coverageReporters: js.UndefOr[
    js.Array[
      clover | cobertura | html | json | `json-summary` | lcovonly | none | teamcity | text | `text-lcov` | `text-summary`
    ]
  ] = js.native
  var mode: js.UndefOr[watch | watchAll] = js.native
  var notifyMode: js.UndefOr[NotifyMode] = js.native
  @JSName("notify")
  var notify_FAllowedConfigOptions: js.UndefOr[Boolean] = js.native
  var onlyFailures: js.UndefOr[Boolean] = js.native
  var reporters: js.UndefOr[js.Array[String | ReporterConfig]] = js.native
  var testNamePattern: js.UndefOr[String] = js.native
  var testPathPattern: js.UndefOr[String] = js.native
  var updateSnapshot: js.UndefOr[SnapshotUpdateState] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
}

object AllowedConfigOptions {
  @scala.inline
  def apply(): AllowedConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowedConfigOptions]
  }
  @scala.inline
  implicit class AllowedConfigOptionsOps[Self <: AllowedConfigOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBail(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bail")(js.undefined)
        ret
    }
    @scala.inline
    def withChangedSince(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedSince")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangedSince: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedSince")(js.undefined)
        ret
    }
    @scala.inline
    def withCollectCoverage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectCoverage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectCoverage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectCoverage")(js.undefined)
        ret
    }
    @scala.inline
    def withCollectCoverageFrom(value: js.Array[Glob]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectCoverageFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectCoverageFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectCoverageFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withCollectCoverageOnlyFrom(value: StringDictionary[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectCoverageOnlyFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectCoverageOnlyFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectCoverageOnlyFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withCoverageDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverageDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoverageDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverageDirectory")(js.undefined)
        ret
    }
    @scala.inline
    def withCoverageReporters(
      value: js.Array[
          clover | cobertura | html | json | `json-summary` | lcovonly | none | teamcity | text | `text-lcov` | `text-summary`
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverageReporters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoverageReporters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverageReporters")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: watch | watchAll): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withNotify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notify")(js.undefined)
        ret
    }
    @scala.inline
    def withNotifyMode(value: NotifyMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotifyMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyMode")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlyFailures(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyFailures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlyFailures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyFailures")(js.undefined)
        ret
    }
    @scala.inline
    def withReporters(value: js.Array[String | ReporterConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reporters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReporters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reporters")(js.undefined)
        ret
    }
    @scala.inline
    def withTestNamePattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testNamePattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestNamePattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testNamePattern")(js.undefined)
        ret
    }
    @scala.inline
    def withTestPathPattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testPathPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestPathPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testPathPattern")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateSnapshot(value: SnapshotUpdateState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateSnapshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateSnapshot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateSnapshot")(js.undefined)
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(js.undefined)
        ret
    }
  }
  
}

