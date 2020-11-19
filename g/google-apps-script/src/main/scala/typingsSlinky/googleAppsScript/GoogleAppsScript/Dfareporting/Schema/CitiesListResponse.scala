package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CitiesListResponse extends js.Object {
  
  var cities: js.UndefOr[js.Array[City]] = js.native
  
  var kind: js.UndefOr[String] = js.native
}
object CitiesListResponse {
  
  @scala.inline
  def apply(): CitiesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CitiesListResponse]
  }
  
  @scala.inline
  implicit class CitiesListResponseOps[Self <: CitiesListResponse] (val x: Self) extends AnyVal {
    
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
    def setCitiesVarargs(value: City*): Self = this.set("cities", js.Array(value :_*))
    
    @scala.inline
    def setCities(value: js.Array[City]): Self = this.set("cities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCities: Self = this.set("cities", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
