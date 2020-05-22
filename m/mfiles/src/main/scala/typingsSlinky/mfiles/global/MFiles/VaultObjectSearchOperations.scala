package typingsSlinky.mfiles.global.MFiles

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.mfiles.IExpressions
import typingsSlinky.mfiles.IObjectFileAndVersion
import typingsSlinky.mfiles.IObjectSearchResults
import typingsSlinky.mfiles.IObjectVersionAndProperties
import typingsSlinky.mfiles.ISearchCondition
import typingsSlinky.mfiles.ISearchConditions
import typingsSlinky.mfiles.IStringData
import typingsSlinky.mfiles.IStrings
import typingsSlinky.mfiles.IVaultObjectSearchOperations
import typingsSlinky.mfiles.IXMLSearchResult
import typingsSlinky.mfiles.MFiles.MFFacetSearchFlags
import typingsSlinky.mfiles.MFiles.MFFullTextSearchFlags
import typingsSlinky.mfiles.MFiles.MFSearchFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultObjectSearchOperations")
@js.native
class VaultObjectSearchOperations () extends IVaultObjectSearchOperations {
  /* CompleteClass */
  override def FindFile(RelativePath: String, UpdateFromServer: Boolean): IObjectFileAndVersion = js.native
  /* CompleteClass */
  override def FindObjectVersionAndProperties(RelativePath: String, UpdateFromServer: Boolean): IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def GetFacetValues(
    SearchConditions: ISearchConditions,
    Facets: IExpressions,
    FacetValuesMaxCount: Double,
    Flags: MFFacetSearchFlags
  ): IStringData = js.native
  /* CompleteClass */
  override def GetFacetValuesByPath(RelativePath: String, Facets: IExpressions, FacetValuesMaxCount: Double, Flags: MFFacetSearchFlags): IStringData = js.native
  /* CompleteClass */
  override def GetObjectCountInSearch(SearchConditions: ISearchConditions, SearchFlags: MFSearchFlags): Double = js.native
  /* CompleteClass */
  override def GetObjectsInPath(RelativePath: String, SortResults: Boolean, UpdateFromServer: Boolean): IObjectSearchResults = js.native
  /* CompleteClass */
  override def GetSearchHits(Input: String, SearchCondition: ISearchCondition): IStrings = js.native
  /* CompleteClass */
  override def IsObjectPathInMFiles(RelativePath: String): Boolean = js.native
  /* CompleteClass */
  override def SearchForObjectsByCondition(SearchCondition: ISearchCondition, SortResults: Boolean): IObjectSearchResults = js.native
  /* CompleteClass */
  override def SearchForObjectsByConditions(SearchConditions: ISearchConditions, SearchFlags: MFSearchFlags, SortResults: Boolean): IObjectSearchResults = js.native
  /* CompleteClass */
  override def SearchForObjectsByConditionsEx(
    SearchConditions: ISearchConditions,
    SearchFlags: MFSearchFlags,
    SortResults: Boolean,
    MaxResultCount: Double,
    SearchTimeoutInSeconds: Double
  ): IObjectSearchResults = js.native
  /* CompleteClass */
  override def SearchForObjectsByConditionsXML(SearchConditions: ISearchConditions, SortResults: Boolean): IXMLSearchResult = js.native
  /* CompleteClass */
  override def SearchForObjectsByExportedSearchConditions(ExportedSearchString: String, SortResults: Boolean): IObjectSearchResults = js.native
  /* CompleteClass */
  override def SearchForObjectsByExportedSearchConditionsXML(SearchString: String, SortResults: Boolean): IXMLSearchResult = js.native
  /* CompleteClass */
  override def SearchForObjectsByString(SearchString: String, SortResults: Boolean, FullTextSearchFlags: MFFullTextSearchFlags): IObjectSearchResults = js.native
}

@JSGlobal("MFiles.VaultObjectSearchOperations")
@js.native
object VaultObjectSearchOperations extends Instantiable0[IVaultObjectSearchOperations]

