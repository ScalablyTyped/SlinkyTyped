package typingsSlinky.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BooleanPropertyOptions extends js.Object {
  
  /** If set, describes how the boolean should be used as a search operator. */
  var operatorOptions: js.UndefOr[BooleanOperatorOptions] = js.native
}
object BooleanPropertyOptions {
  
  @scala.inline
  def apply(): BooleanPropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BooleanPropertyOptions]
  }
  
  @scala.inline
  implicit class BooleanPropertyOptionsOps[Self <: BooleanPropertyOptions] (val x: Self) extends AnyVal {
    
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
    def setOperatorOptions(value: BooleanOperatorOptions): Self = this.set("operatorOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperatorOptions: Self = this.set("operatorOptions", js.undefined)
  }
}
