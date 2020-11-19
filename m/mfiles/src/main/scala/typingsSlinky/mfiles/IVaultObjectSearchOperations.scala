package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFFacetSearchFlags
import typingsSlinky.mfiles.MFiles.MFFullTextSearchFlags
import typingsSlinky.mfiles.MFiles.MFSearchFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVaultObjectSearchOperations extends js.Object {
  
  def FindFile(RelativePath: String, UpdateFromServer: Boolean): IObjectFileAndVersion = js.native
  
  def FindObjectVersionAndProperties(RelativePath: String, UpdateFromServer: Boolean): IObjectVersionAndProperties = js.native
  
  def GetFacetValues(
    SearchConditions: ISearchConditions,
    Facets: IExpressions,
    FacetValuesMaxCount: Double,
    Flags: MFFacetSearchFlags
  ): IStringData = js.native
  
  def GetFacetValuesByPath(RelativePath: String, Facets: IExpressions, FacetValuesMaxCount: Double, Flags: MFFacetSearchFlags): IStringData = js.native
  
  def GetObjectCountInSearch(SearchConditions: ISearchConditions, SearchFlags: MFSearchFlags): Double = js.native
  
  def GetObjectsInPath(RelativePath: String, SortResults: Boolean, UpdateFromServer: Boolean): IObjectSearchResults = js.native
  
  def GetSearchHits(Input: String, SearchCondition: ISearchCondition): IStrings = js.native
  
  def IsObjectPathInMFiles(RelativePath: String): Boolean = js.native
  
  def SearchForObjectsByCondition(SearchCondition: ISearchCondition, SortResults: Boolean): IObjectSearchResults = js.native
  
  def SearchForObjectsByConditions(SearchConditions: ISearchConditions, SearchFlags: MFSearchFlags, SortResults: Boolean): IObjectSearchResults = js.native
  
  def SearchForObjectsByConditionsEx(
    SearchConditions: ISearchConditions,
    SearchFlags: MFSearchFlags,
    SortResults: Boolean,
    MaxResultCount: Double,
    SearchTimeoutInSeconds: Double
  ): IObjectSearchResults = js.native
  
  def SearchForObjectsByConditionsXML(SearchConditions: ISearchConditions, SortResults: Boolean): IXMLSearchResult = js.native
  
  def SearchForObjectsByExportedSearchConditions(ExportedSearchString: String, SortResults: Boolean): IObjectSearchResults = js.native
  
  def SearchForObjectsByExportedSearchConditionsXML(SearchString: String, SortResults: Boolean): IXMLSearchResult = js.native
  
  def SearchForObjectsByString(SearchString: String, SortResults: Boolean, FullTextSearchFlags: MFFullTextSearchFlags): IObjectSearchResults = js.native
}
object IVaultObjectSearchOperations {
  
  @scala.inline
  def apply(
    FindFile: (String, Boolean) => IObjectFileAndVersion,
    FindObjectVersionAndProperties: (String, Boolean) => IObjectVersionAndProperties,
    GetFacetValues: (ISearchConditions, IExpressions, Double, MFFacetSearchFlags) => IStringData,
    GetFacetValuesByPath: (String, IExpressions, Double, MFFacetSearchFlags) => IStringData,
    GetObjectCountInSearch: (ISearchConditions, MFSearchFlags) => Double,
    GetObjectsInPath: (String, Boolean, Boolean) => IObjectSearchResults,
    GetSearchHits: (String, ISearchCondition) => IStrings,
    IsObjectPathInMFiles: String => Boolean,
    SearchForObjectsByCondition: (ISearchCondition, Boolean) => IObjectSearchResults,
    SearchForObjectsByConditions: (ISearchConditions, MFSearchFlags, Boolean) => IObjectSearchResults,
    SearchForObjectsByConditionsEx: (ISearchConditions, MFSearchFlags, Boolean, Double, Double) => IObjectSearchResults,
    SearchForObjectsByConditionsXML: (ISearchConditions, Boolean) => IXMLSearchResult,
    SearchForObjectsByExportedSearchConditions: (String, Boolean) => IObjectSearchResults,
    SearchForObjectsByExportedSearchConditionsXML: (String, Boolean) => IXMLSearchResult,
    SearchForObjectsByString: (String, Boolean, MFFullTextSearchFlags) => IObjectSearchResults
  ): IVaultObjectSearchOperations = {
    val __obj = js.Dynamic.literal(FindFile = js.Any.fromFunction2(FindFile), FindObjectVersionAndProperties = js.Any.fromFunction2(FindObjectVersionAndProperties), GetFacetValues = js.Any.fromFunction4(GetFacetValues), GetFacetValuesByPath = js.Any.fromFunction4(GetFacetValuesByPath), GetObjectCountInSearch = js.Any.fromFunction2(GetObjectCountInSearch), GetObjectsInPath = js.Any.fromFunction3(GetObjectsInPath), GetSearchHits = js.Any.fromFunction2(GetSearchHits), IsObjectPathInMFiles = js.Any.fromFunction1(IsObjectPathInMFiles), SearchForObjectsByCondition = js.Any.fromFunction2(SearchForObjectsByCondition), SearchForObjectsByConditions = js.Any.fromFunction3(SearchForObjectsByConditions), SearchForObjectsByConditionsEx = js.Any.fromFunction5(SearchForObjectsByConditionsEx), SearchForObjectsByConditionsXML = js.Any.fromFunction2(SearchForObjectsByConditionsXML), SearchForObjectsByExportedSearchConditions = js.Any.fromFunction2(SearchForObjectsByExportedSearchConditions), SearchForObjectsByExportedSearchConditionsXML = js.Any.fromFunction2(SearchForObjectsByExportedSearchConditionsXML), SearchForObjectsByString = js.Any.fromFunction3(SearchForObjectsByString))
    __obj.asInstanceOf[IVaultObjectSearchOperations]
  }
  
  @scala.inline
  implicit class IVaultObjectSearchOperationsOps[Self <: IVaultObjectSearchOperations] (val x: Self) extends AnyVal {
    
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
    def setFindFile(value: (String, Boolean) => IObjectFileAndVersion): Self = this.set("FindFile", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFindObjectVersionAndProperties(value: (String, Boolean) => IObjectVersionAndProperties): Self = this.set("FindObjectVersionAndProperties", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetFacetValues(value: (ISearchConditions, IExpressions, Double, MFFacetSearchFlags) => IStringData): Self = this.set("GetFacetValues", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGetFacetValuesByPath(value: (String, IExpressions, Double, MFFacetSearchFlags) => IStringData): Self = this.set("GetFacetValuesByPath", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGetObjectCountInSearch(value: (ISearchConditions, MFSearchFlags) => Double): Self = this.set("GetObjectCountInSearch", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetObjectsInPath(value: (String, Boolean, Boolean) => IObjectSearchResults): Self = this.set("GetObjectsInPath", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetSearchHits(value: (String, ISearchCondition) => IStrings): Self = this.set("GetSearchHits", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsObjectPathInMFiles(value: String => Boolean): Self = this.set("IsObjectPathInMFiles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSearchForObjectsByCondition(value: (ISearchCondition, Boolean) => IObjectSearchResults): Self = this.set("SearchForObjectsByCondition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSearchForObjectsByConditions(value: (ISearchConditions, MFSearchFlags, Boolean) => IObjectSearchResults): Self = this.set("SearchForObjectsByConditions", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSearchForObjectsByConditionsEx(value: (ISearchConditions, MFSearchFlags, Boolean, Double, Double) => IObjectSearchResults): Self = this.set("SearchForObjectsByConditionsEx", js.Any.fromFunction5(value))
    
    @scala.inline
    def setSearchForObjectsByConditionsXML(value: (ISearchConditions, Boolean) => IXMLSearchResult): Self = this.set("SearchForObjectsByConditionsXML", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSearchForObjectsByExportedSearchConditions(value: (String, Boolean) => IObjectSearchResults): Self = this.set("SearchForObjectsByExportedSearchConditions", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSearchForObjectsByExportedSearchConditionsXML(value: (String, Boolean) => IXMLSearchResult): Self = this.set("SearchForObjectsByExportedSearchConditionsXML", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSearchForObjectsByString(value: (String, Boolean, MFFullTextSearchFlags) => IObjectSearchResults): Self = this.set("SearchForObjectsByString", js.Any.fromFunction3(value))
  }
}
