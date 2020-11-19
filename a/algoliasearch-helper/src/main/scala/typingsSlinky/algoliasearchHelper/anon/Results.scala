package typingsSlinky.algoliasearchHelper.anon

import typingsSlinky.algoliasearchHelper.mod.SearchParameters
import typingsSlinky.algoliasearchHelper.mod.SearchResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Results extends js.Object {
  
  var results: SearchResults[_] = js.native
  
  var state: SearchParameters = js.native
}
object Results {
  
  @scala.inline
  def apply(results: SearchResults[_], state: SearchParameters): Results = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Results]
  }
  
  @scala.inline
  implicit class ResultsOps[Self <: Results] (val x: Self) extends AnyVal {
    
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
    def setResults(value: SearchResults[_]): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: SearchParameters): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}
