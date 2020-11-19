package typingsSlinky.istanbulLibCoverage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("istanbul-lib-coverage", "CoverageMap")
@js.native
class CoverageMap protected () extends js.Object {
  def this(data: CoverageMap) = this()
  def this(data: CoverageMapData) = this()
  
  def addFileCoverage(pathOrObject: String): Unit = js.native
  def addFileCoverage(pathOrObject: FileCoverage): Unit = js.native
  def addFileCoverage(pathOrObject: FileCoverageData): Unit = js.native
  
  var data: CoverageMapData = js.native
  
  def fileCoverageFor(filename: String): FileCoverage = js.native
  
  def files(): js.Array[String] = js.native
  
  def filter(callback: js.Function1[/* key */ String, Boolean]): Unit = js.native
  
  def getCoverageSummary(): CoverageSummary = js.native
  
  def merge(data: CoverageMap): Unit = js.native
  def merge(data: CoverageMapData): Unit = js.native
  
  def toJSON(): CoverageMapData = js.native
}
