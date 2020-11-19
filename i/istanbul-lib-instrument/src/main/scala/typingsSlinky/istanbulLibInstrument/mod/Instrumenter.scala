package typingsSlinky.istanbulLibInstrument.mod

import typingsSlinky.istanbulLibCoverage.mod.FileCoverage
import typingsSlinky.istanbulLibCoverage.mod.FileCoverageData
import typingsSlinky.istanbulLibInstrument.anon.PartialInstrumenterOption
import typingsSlinky.sourceMap.mod.RawSourceMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("istanbul-lib-instrument", "Instrumenter")
@js.native
class Instrumenter () extends js.Object {
  def this(options: PartialInstrumenterOption) = this()
  
  var fileCoverage: FileCoverage = js.native
  
  def instrument(code: String, filenameOrCallback: String): Unit = js.native
  def instrument(
    code: String,
    filenameOrCallback: String,
    callback: js.UndefOr[scala.Nothing],
    inputSourceMap: RawSourceMap
  ): Unit = js.native
  def instrument(code: String, filenameOrCallback: String, callback: InstrumenterCallback): Unit = js.native
  def instrument(
    code: String,
    filenameOrCallback: String,
    callback: InstrumenterCallback,
    inputSourceMap: RawSourceMap
  ): Unit = js.native
  def instrument(code: String, filenameOrCallback: InstrumenterCallback): Unit = js.native
  def instrument(
    code: String,
    filenameOrCallback: InstrumenterCallback,
    callback: js.UndefOr[scala.Nothing],
    inputSourceMap: RawSourceMap
  ): Unit = js.native
  def instrument(code: String, filenameOrCallback: InstrumenterCallback, callback: InstrumenterCallback): Unit = js.native
  def instrument(
    code: String,
    filenameOrCallback: InstrumenterCallback,
    callback: InstrumenterCallback,
    inputSourceMap: RawSourceMap
  ): Unit = js.native
  
  def instrumentSync(code: String, filename: String): String = js.native
  def instrumentSync(code: String, filename: String, inputSourceMap: RawSourceMap): String = js.native
  
  def lastFileCoverage(): FileCoverageData = js.native
  
  def lastSourceMap(): RawSourceMap = js.native
  
  def normalizeOpts(): InstrumenterOptions = js.native
  def normalizeOpts(options: PartialInstrumenterOption): InstrumenterOptions = js.native
  
  var opts: InstrumenterOptions = js.native
  
  var sourceMap: RawSourceMap | Null = js.native
}
