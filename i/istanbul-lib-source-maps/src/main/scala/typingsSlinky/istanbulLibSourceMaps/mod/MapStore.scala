package typingsSlinky.istanbulLibSourceMaps.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.istanbulLibCoverage.mod.CoverageMap
import typingsSlinky.istanbulLibSourceMaps.AnonData
import typingsSlinky.sourceMap.mod.RawSourceMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapStore extends js.Object {
  var baseDir: String | Null = js.native
  var data: StringDictionary[AnonData] = js.native
  var sourceStore: SourceStore = js.native
  var verbose: Boolean = js.native
  def addInputSourceMapsSync(coverageData: js.Any): Unit = js.native
  def dispose(): Unit = js.native
  def getSourceMapSync(filePath: String): js.Any = js.native
  def registerMap(filename: String, sourceMap: RawSourceMap): Unit = js.native
  def registerURL(transformedFilePath: String, sourceMapUrl: String): Unit = js.native
  def sourceFinder(filePath: String): String = js.native
  def transformCoverage(coverageMap: CoverageMap): js.Promise[CoverageMap] = js.native
}

object MapStore {
  @scala.inline
  def apply(
    addInputSourceMapsSync: js.Any => Unit,
    data: StringDictionary[AnonData],
    dispose: () => Unit,
    getSourceMapSync: String => js.Any,
    registerMap: (String, RawSourceMap) => Unit,
    registerURL: (String, String) => Unit,
    sourceFinder: String => String,
    sourceStore: SourceStore,
    transformCoverage: CoverageMap => js.Promise[CoverageMap],
    verbose: Boolean
  ): MapStore = {
    val __obj = js.Dynamic.literal(addInputSourceMapsSync = js.Any.fromFunction1(addInputSourceMapsSync), data = data.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), getSourceMapSync = js.Any.fromFunction1(getSourceMapSync), registerMap = js.Any.fromFunction2(registerMap), registerURL = js.Any.fromFunction2(registerURL), sourceFinder = js.Any.fromFunction1(sourceFinder), sourceStore = sourceStore.asInstanceOf[js.Any], transformCoverage = js.Any.fromFunction1(transformCoverage), verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapStore]
  }
  @scala.inline
  implicit class MapStoreOps[Self <: MapStore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddInputSourceMapsSync(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addInputSourceMapsSync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withData(value: StringDictionary[AnonData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDispose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSourceMapSync(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSourceMapSync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterMap(value: (String, RawSourceMap) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerMap")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRegisterURL(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerURL")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSourceFinder(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceFinder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSourceStore(value: SourceStore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceStore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransformCoverage(value: CoverageMap => js.Promise[CoverageMap]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformCoverage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseDirNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseDir")(null)
        ret
    }
  }
  
}

