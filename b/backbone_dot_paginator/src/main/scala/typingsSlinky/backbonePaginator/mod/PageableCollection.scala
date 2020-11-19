package typingsSlinky.backbonePaginator.mod

import typingsSlinky.backbone.mod.Collection
import typingsSlinky.backbone.mod.CollectionFetchOptions
import typingsSlinky.backbone.mod.Model
import typingsSlinky.backbone.mod.ModelSetOptions
import typingsSlinky.backbonePaginator.anon.TypeofPageableCollection
import typingsSlinky.jquery.JQueryXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("backbone", "PageableCollection")
@js.native
class PageableCollection[TModel /* <: Model[_, ModelSetOptions] */] () extends Collection[TModel] {
  def this(models: js.Array[TModel]) = this()
  def this(models: js.UndefOr[scala.Nothing], options: PageableInitialOptions) = this()
  def this(models: js.Array[TModel], options: PageableInitialOptions) = this()
  
  var fullCollection: Collection[TModel] = js.native
  
  def getFirstPage(): JQueryXHR | PageableCollection[TModel] = js.native
  def getFirstPage(options: PageableGetPageOptions): JQueryXHR | PageableCollection[TModel] = js.native
  
  def getLastPage(): JQueryXHR | PageableCollection[TModel] = js.native
  def getLastPage(options: PageableGetPageOptions): JQueryXHR | PageableCollection[TModel] = js.native
  
  def getNextPage(): JQueryXHR | PageableCollection[TModel] = js.native
  def getNextPage(options: PageableGetPageOptions): JQueryXHR | PageableCollection[TModel] = js.native
  
  def getPage(index: String): JQueryXHR | PageableCollection[TModel] = js.native
  def getPage(index: String, options: PageableGetPageOptions): JQueryXHR | PageableCollection[TModel] = js.native
  def getPage(index: Double): JQueryXHR | PageableCollection[TModel] = js.native
  def getPage(index: Double, options: PageableGetPageOptions): JQueryXHR | PageableCollection[TModel] = js.native
  
  def getPageByOffset(offset: Double): JQueryXHR | PageableCollection[TModel] = js.native
  def getPageByOffset(offset: Double, options: PageableGetPageOptions): JQueryXHR | PageableCollection[TModel] = js.native
  
  def getPreviousPage(): JQueryXHR | PageableCollection[TModel] = js.native
  def getPreviousPage(options: PageableGetPageOptions): JQueryXHR | PageableCollection[TModel] = js.native
  
  def hasNextPage(): Boolean = js.native
  
  def hasPreviousPage(): Boolean = js.native
  
  var mode: String = js.native
  
  def parse(resp: js.Any): js.Array[_] = js.native
  def parse(resp: js.Any, options: js.Any): js.Array[_] = js.native
  
  def parseLinks(resp: js.Any): js.Any = js.native
  def parseLinks(resp: js.Any, options: PageableParseLinksOptions): js.Any = js.native
  
  def parseRecords(resp: js.Any): js.Array[_] = js.native
  def parseRecords(resp: js.Any, options: js.Any): js.Array[_] = js.native
  
  def parseState(resp: js.Any, queryParams: PageableQueryParams, state: PageableState): PageableState = js.native
  def parseState(resp: js.Any, queryParams: PageableQueryParams, state: PageableState, options: js.Any): PageableState = js.native
  
  var queryParams: PageableQueryParams = js.native
  
  def setPageSize(pageSize: Double): JQueryXHR | PageableCollection[TModel] = js.native
  def setPageSize(pageSize: Double, options: CollectionFetchOptions): JQueryXHR | PageableCollection[TModel] = js.native
  
  def setSorting(sortKey: String): PageableCollection[TModel] = js.native
  def setSorting(sortKey: String, order: js.UndefOr[scala.Nothing], options: PageableSetSortingOptions[TModel]): PageableCollection[TModel] = js.native
  def setSorting(sortKey: String, order: Double): PageableCollection[TModel] = js.native
  def setSorting(sortKey: String, order: Double, options: PageableSetSortingOptions[TModel]): PageableCollection[TModel] = js.native
  
  var state: PageableState = js.native
  
  def switchMode(): JQueryXHR | PageableCollection[TModel] = js.native
  def switchMode(mode: js.UndefOr[scala.Nothing], options: PageableSwitchModeOptions): JQueryXHR | PageableCollection[TModel] = js.native
  def switchMode(mode: String): JQueryXHR | PageableCollection[TModel] = js.native
  def switchMode(mode: String, options: PageableSwitchModeOptions): JQueryXHR | PageableCollection[TModel] = js.native
  
  def sync(method: String, model: TModel): JQueryXHR = js.native
  def sync(method: String, model: TModel, options: js.Any): JQueryXHR = js.native
  def sync(method: String, model: Collection[TModel]): JQueryXHR = js.native
  def sync(method: String, model: Collection[TModel], options: js.Any): JQueryXHR = js.native
}
/* static members */
@JSImport("backbone", "PageableCollection")
@js.native
object PageableCollection extends js.Object {
  
  def noConflict(): TypeofPageableCollection = js.native
}
