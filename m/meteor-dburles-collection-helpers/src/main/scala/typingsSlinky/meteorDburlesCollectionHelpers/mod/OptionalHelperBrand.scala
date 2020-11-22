package typingsSlinky.meteorDburlesCollectionHelpers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionalHelperBrand
  extends _OptionalHelper[js.Any] {
  
  var _meteor_dburles_collection_helpers_isBrandUnsupportedOptionalHelper: js.UndefOr[Brand] = js.native
}
object OptionalHelperBrand {
  
  @scala.inline
  def apply(): OptionalHelperBrand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionalHelperBrand]
  }
  
  @scala.inline
  implicit class OptionalHelperBrandOps[Self <: OptionalHelperBrand] (val x: Self) extends AnyVal {
    
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
    def set_meteor_dburles_collection_helpers_isBrandUnsupportedOptionalHelper(value: Brand): Self = this.set("_meteor_dburles_collection_helpers_isBrandUnsupportedOptionalHelper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_meteor_dburles_collection_helpers_isBrandUnsupportedOptionalHelper: Self = this.set("_meteor_dburles_collection_helpers_isBrandUnsupportedOptionalHelper", js.undefined)
  }
}
