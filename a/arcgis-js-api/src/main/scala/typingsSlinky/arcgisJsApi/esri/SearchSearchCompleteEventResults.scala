package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchSearchCompleteEventResults extends Object {
  
  var results: js.Array[SearchResult] = js.native
  
  var source: js.Any = js.native
  
  var sourceIndex: Double = js.native
}
object SearchSearchCompleteEventResults {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    results: js.Array[SearchResult],
    source: js.Any,
    sourceIndex: Double
  ): SearchSearchCompleteEventResults = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), results = results.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSearchCompleteEventResults]
  }
  
  @scala.inline
  implicit class SearchSearchCompleteEventResultsOps[Self <: SearchSearchCompleteEventResults] (val x: Self) extends AnyVal {
    
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
    def setResultsVarargs(value: SearchResult*): Self = this.set("results", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[SearchResult]): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: js.Any): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIndex(value: Double): Self = this.set("sourceIndex", value.asInstanceOf[js.Any])
  }
}
