package typingsSlinky.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Query extends StObject {
  
  var data: js.Array[_] = js.native
  
  def filter(filters: js.Array[DataSourceFilterItem]): Query = js.native
  def filter(filters: DataSourceFilterItem): Query = js.native
  def filter(filters: DataSourceFilters): Query = js.native
  
  def group(descriptors: js.Array[DataSourceGroupItem]): Query = js.native
  def group(descriptors: DataSourceGroupItem): Query = js.native
  
  def order(selector: String): Query = js.native
  def order(selector: String, dir: String): Query = js.native
  def order(selector: js.Function): Query = js.native
  def order(selector: js.Function, dir: String): Query = js.native
  
  def range(intex: Double, count: Double): Query = js.native
  
  def select(selector: js.Function): Query = js.native
  
  def skip(count: Double): Query = js.native
  
  def take(count: Double): Query = js.native
  
  def toArray(): js.Array[_] = js.native
}
