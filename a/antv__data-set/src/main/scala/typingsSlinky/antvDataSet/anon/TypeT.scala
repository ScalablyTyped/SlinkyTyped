package typingsSlinky.antvDataSet.anon

import typingsSlinky.antvDataSet.antvDataSetStrings.GeoJSON
import typingsSlinky.antvDataSet.antvDataSetStrings.HexJSON
import typingsSlinky.antvDataSet.antvDataSetStrings.TopoJSON
import typingsSlinky.antvDataSet.antvDataSetStrings.`hex-json`
import typingsSlinky.antvDataSet.antvDataSetStrings.csv
import typingsSlinky.antvDataSet.antvDataSetStrings.diagram
import typingsSlinky.antvDataSet.antvDataSetStrings.dsv
import typingsSlinky.antvDataSet.antvDataSetStrings.geo
import typingsSlinky.antvDataSet.antvDataSetStrings.geojson_
import typingsSlinky.antvDataSet.antvDataSetStrings.graph
import typingsSlinky.antvDataSet.antvDataSetStrings.hex
import typingsSlinky.antvDataSet.antvDataSetStrings.hexjson_
import typingsSlinky.antvDataSet.antvDataSetStrings.hierarchy
import typingsSlinky.antvDataSet.antvDataSetStrings.topojson_
import typingsSlinky.antvDataSet.antvDataSetStrings.tree
import typingsSlinky.antvDataSet.antvDataSetStrings.tsv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeT[T /* <: csv | tsv | dsv | graph | diagram | hex | hexjson_ | `hex-json` | HexJSON | geo | geojson_ | GeoJSON | hierarchy | tree | topojson_ | TopoJSON */] extends js.Object {
  
  var `type`: T = js.native
}
object TypeT {
  
  @scala.inline
  def apply[T /* <: csv | tsv | dsv | graph | diagram | hex | hexjson_ | `hex-json` | HexJSON | geo | geojson_ | GeoJSON | hierarchy | tree | topojson_ | TopoJSON */](`type`: T): TypeT[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeT[T]]
  }
  
  @scala.inline
  implicit class TypeTOps[Self <: TypeT[_], T /* <: csv | tsv | dsv | graph | diagram | hex | hexjson_ | `hex-json` | HexJSON | geo | geojson_ | GeoJSON | hierarchy | tree | topojson_ | TopoJSON */] (val x: Self with TypeT[T]) extends AnyVal {
    
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
    def setType(value: T): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
