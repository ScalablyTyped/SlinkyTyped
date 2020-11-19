package typingsSlinky.openGraphScraper.mod

import typingsSlinky.openGraphScraper.anon.Error
import typingsSlinky.openGraphScraper.openGraphScraperBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorResult extends js.Object {
  
  var error: `true` = js.native
  
  var result: Error = js.native
}
object ErrorResult {
  
  @scala.inline
  def apply(error: `true`, result: Error): ErrorResult = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorResult]
  }
  
  @scala.inline
  implicit class ErrorResultOps[Self <: ErrorResult] (val x: Self) extends AnyVal {
    
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
    def setError(value: `true`): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: Error): Self = this.set("result", value.asInstanceOf[js.Any])
  }
}
