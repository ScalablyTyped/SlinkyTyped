package typingsSlinky.maximMazurokGapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1StudyConfigParameterSpecCategoricalValueSpec extends js.Object {
  
  /** Must be specified if type is `CATEGORICAL`. The list of possible categories. */
  var values: js.UndefOr[js.Array[String]] = js.native
}
object GoogleCloudMlV1StudyConfigParameterSpecCategoricalValueSpec {
  
  @scala.inline
  def apply(): GoogleCloudMlV1StudyConfigParameterSpecCategoricalValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1StudyConfigParameterSpecCategoricalValueSpec]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1StudyConfigParameterSpecCategoricalValueSpecOps[Self <: GoogleCloudMlV1StudyConfigParameterSpecCategoricalValueSpec] (val x: Self) extends AnyVal {
    
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
    def setValuesVarargs(value: String*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
