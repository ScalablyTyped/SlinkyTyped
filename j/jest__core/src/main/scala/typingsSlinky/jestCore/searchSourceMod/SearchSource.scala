package typingsSlinky.jestCore.searchSourceMod

import typingsSlinky.jestChangedFiles.typesMod.ChangedFiles
import typingsSlinky.jestCore.typesMod.Filter
import typingsSlinky.jestTypes.configMod.GlobalConfig
import typingsSlinky.jestTypes.configMod.Path
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchSource extends js.Object {
  
  var _context: js.Any = js.native
  
  var _dependencyResolver: js.Any = js.native
  
  var _filterTestPathsWithStats: js.Any = js.native
  
  var _getAllTestPaths: js.Any = js.native
  
  var _getOrBuildDependencyResolver: js.Any = js.native
  
  var _getTestPaths: js.Any = js.native
  
  var _testPathCases: js.Any = js.native
  
  def findMatchingTests(): SearchResult = js.native
  def findMatchingTests(testPathPattern: String): SearchResult = js.native
  
  def findRelatedSourcesFromTestsInChangedFiles(changedFilesInfo: ChangedFiles): js.Array[String] = js.native
  
  def findRelatedTests(allPaths: Set[Path], collectCoverage: Boolean): SearchResult = js.native
  
  def findRelatedTestsFromPattern(paths: js.Array[Path], collectCoverage: Boolean): SearchResult = js.native
  
  def findTestRelatedToChangedFiles(changedFilesInfo: ChangedFiles, collectCoverage: Boolean): SearchResult = js.native
  
  def findTestsByPaths(paths: js.Array[Path]): SearchResult = js.native
  
  def getTestPaths(globalConfig: GlobalConfig): js.Promise[SearchResult] = js.native
  def getTestPaths(globalConfig: GlobalConfig, changedFiles: js.UndefOr[scala.Nothing], filter: Filter): js.Promise[SearchResult] = js.native
  def getTestPaths(globalConfig: GlobalConfig, changedFiles: ChangedFiles): js.Promise[SearchResult] = js.native
  def getTestPaths(globalConfig: GlobalConfig, changedFiles: ChangedFiles, filter: Filter): js.Promise[SearchResult] = js.native
  
  def isTestFilePath(path: Path): Boolean = js.native
}
