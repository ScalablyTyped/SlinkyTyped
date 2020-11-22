package typingsSlinky.maximMazurokGapiClientBigquery.anon

import typingsSlinky.maximMazurokGapiClientBigquery.gapi.client.bigquery.ErrorProto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Errors extends js.Object {
  
  /** Error information for the row indicated by the index property. */
  var errors: js.UndefOr[js.Array[ErrorProto]] = js.native
  
  /** The index of the row that error applies to. */
  var index: js.UndefOr[Double] = js.native
}
object Errors {
  
  @scala.inline
  def apply(): Errors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Errors]
  }
  
  @scala.inline
  implicit class ErrorsOps[Self <: Errors] (val x: Self) extends AnyVal {
    
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
    def setErrorsVarargs(value: ErrorProto*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[ErrorProto]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
  }
}
