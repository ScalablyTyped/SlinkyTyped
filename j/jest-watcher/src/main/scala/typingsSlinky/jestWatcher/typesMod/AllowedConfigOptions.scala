package typingsSlinky.jestWatcher.typesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jestTypes.configMod.Glob
import typingsSlinky.jestTypes.configMod.NotifyMode
import typingsSlinky.jestTypes.configMod.ReporterConfig
import typingsSlinky.jestTypes.configMod.SnapshotUpdateState
import typingsSlinky.jestWatcher.jestWatcherStrings.`html-spa`
import typingsSlinky.jestWatcher.jestWatcherStrings.`json-summary`
import typingsSlinky.jestWatcher.jestWatcherStrings.`text-lcov`
import typingsSlinky.jestWatcher.jestWatcherStrings.`text-summary`
import typingsSlinky.jestWatcher.jestWatcherStrings.clover
import typingsSlinky.jestWatcher.jestWatcherStrings.cobertura
import typingsSlinky.jestWatcher.jestWatcherStrings.html
import typingsSlinky.jestWatcher.jestWatcherStrings.json
import typingsSlinky.jestWatcher.jestWatcherStrings.lcov
import typingsSlinky.jestWatcher.jestWatcherStrings.lcovonly
import typingsSlinky.jestWatcher.jestWatcherStrings.teamcity
import typingsSlinky.jestWatcher.jestWatcherStrings.text
import typingsSlinky.jestWatcher.jestWatcherStrings.watch
import typingsSlinky.jestWatcher.jestWatcherStrings.watchAll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<@jest/types.@jest/types.Config.GlobalConfig, 'bail' | 'changedSince' | 'collectCoverage' | 'collectCoverageFrom' | 'collectCoverageOnlyFrom' | 'coverageDirectory' | 'coverageReporters' | 'notify' | 'notifyMode' | 'onlyFailures' | 'reporters' | 'testNamePattern' | 'testPathPattern' | 'updateSnapshot' | 'verbose'> & {  mode :'watch' | 'watchAll'}> */
@js.native
trait AllowedConfigOptions extends js.Object {
  
  var bail: js.UndefOr[Double] = js.native
  
  var changedSince: js.UndefOr[String] = js.native
  
  var collectCoverage: js.UndefOr[Boolean] = js.native
  
  var collectCoverageFrom: js.UndefOr[js.Array[Glob]] = js.native
  
  var collectCoverageOnlyFrom: js.UndefOr[StringDictionary[Boolean] | Null] = js.native
  
  var coverageDirectory: js.UndefOr[String] = js.native
  
  var coverageReporters: js.UndefOr[
    js.Array[
      clover | cobertura | `html-spa` | html | json | `json-summary` | lcov | lcovonly | teamcity | text | `text-lcov` | `text-summary`
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
  
  var verbose: js.UndefOr[Boolean | Null] = js.native
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBail(value: Double): Self = this.set("bail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBail: Self = this.set("bail", js.undefined)
    
    @scala.inline
    def setChangedSince(value: String): Self = this.set("changedSince", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangedSince: Self = this.set("changedSince", js.undefined)
    
    @scala.inline
    def setCollectCoverage(value: Boolean): Self = this.set("collectCoverage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollectCoverage: Self = this.set("collectCoverage", js.undefined)
    
    @scala.inline
    def setCollectCoverageFromVarargs(value: Glob*): Self = this.set("collectCoverageFrom", js.Array(value :_*))
    
    @scala.inline
    def setCollectCoverageFrom(value: js.Array[Glob]): Self = this.set("collectCoverageFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollectCoverageFrom: Self = this.set("collectCoverageFrom", js.undefined)
    
    @scala.inline
    def setCollectCoverageOnlyFrom(value: StringDictionary[Boolean]): Self = this.set("collectCoverageOnlyFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollectCoverageOnlyFrom: Self = this.set("collectCoverageOnlyFrom", js.undefined)
    
    @scala.inline
    def setCollectCoverageOnlyFromNull: Self = this.set("collectCoverageOnlyFrom", null)
    
    @scala.inline
    def setCoverageDirectory(value: String): Self = this.set("coverageDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoverageDirectory: Self = this.set("coverageDirectory", js.undefined)
    
    @scala.inline
    def setCoverageReportersVarargs(
      value: (clover | cobertura | `html-spa` | html | json | `json-summary` | lcov | lcovonly | teamcity | text | `text-lcov` | `text-summary`)*
    ): Self = this.set("coverageReporters", js.Array(value :_*))
    
    @scala.inline
    def setCoverageReporters(
      value: js.Array[
          clover | cobertura | `html-spa` | html | json | `json-summary` | lcov | lcovonly | teamcity | text | `text-lcov` | `text-summary`
        ]
    ): Self = this.set("coverageReporters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoverageReporters: Self = this.set("coverageReporters", js.undefined)
    
    @scala.inline
    def setMode(value: watch | watchAll): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setNotify(value: Boolean): Self = this.set("notify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotify: Self = this.set("notify", js.undefined)
    
    @scala.inline
    def setNotifyMode(value: NotifyMode): Self = this.set("notifyMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotifyMode: Self = this.set("notifyMode", js.undefined)
    
    @scala.inline
    def setOnlyFailures(value: Boolean): Self = this.set("onlyFailures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyFailures: Self = this.set("onlyFailures", js.undefined)
    
    @scala.inline
    def setReportersVarargs(value: (String | ReporterConfig)*): Self = this.set("reporters", js.Array(value :_*))
    
    @scala.inline
    def setReporters(value: js.Array[String | ReporterConfig]): Self = this.set("reporters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReporters: Self = this.set("reporters", js.undefined)
    
    @scala.inline
    def setTestNamePattern(value: String): Self = this.set("testNamePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestNamePattern: Self = this.set("testNamePattern", js.undefined)
    
    @scala.inline
    def setTestPathPattern(value: String): Self = this.set("testPathPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestPathPattern: Self = this.set("testPathPattern", js.undefined)
    
    @scala.inline
    def setUpdateSnapshot(value: SnapshotUpdateState): Self = this.set("updateSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateSnapshot: Self = this.set("updateSnapshot", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
    
    @scala.inline
    def setVerboseNull: Self = this.set("verbose", null)
  }
}
