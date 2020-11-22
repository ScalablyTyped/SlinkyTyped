package typingsSlinky.maximMazurokGapiClientAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaseSensitive extends js.Object {
  
  /** Indicates if the filter expressions are case sensitive. */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  
  /** Expression to extract from field A. */
  var extractA: js.UndefOr[String] = js.native
  
  /** Expression to extract from field B. */
  var extractB: js.UndefOr[String] = js.native
  
  /** Field A. */
  var fieldA: js.UndefOr[String] = js.native
  
  /** The Index of the custom dimension. Required if field is a CUSTOM_DIMENSION. */
  var fieldAIndex: js.UndefOr[Double] = js.native
  
  /** Indicates if field A is required to match. */
  var fieldARequired: js.UndefOr[Boolean] = js.native
  
  /** Field B. */
  var fieldB: js.UndefOr[String] = js.native
  
  /** The Index of the custom dimension. Required if field is a CUSTOM_DIMENSION. */
  var fieldBIndex: js.UndefOr[Double] = js.native
  
  /** Indicates if field B is required to match. */
  var fieldBRequired: js.UndefOr[Boolean] = js.native
  
  /** Expression used to construct the output value. */
  var outputConstructor: js.UndefOr[String] = js.native
  
  /** Output field. */
  var outputToField: js.UndefOr[String] = js.native
  
  /** The Index of the custom dimension. Required if field is a CUSTOM_DIMENSION. */
  var outputToFieldIndex: js.UndefOr[Double] = js.native
  
  /** Indicates if the existing value of the output field, if any, should be overridden by the output expression. */
  var overrideOutputField: js.UndefOr[Boolean] = js.native
}
object CaseSensitive {
  
  @scala.inline
  def apply(): CaseSensitive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaseSensitive]
  }
  
  @scala.inline
  implicit class CaseSensitiveOps[Self <: CaseSensitive] (val x: Self) extends AnyVal {
    
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
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaseSensitive: Self = this.set("caseSensitive", js.undefined)
    
    @scala.inline
    def setExtractA(value: String): Self = this.set("extractA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtractA: Self = this.set("extractA", js.undefined)
    
    @scala.inline
    def setExtractB(value: String): Self = this.set("extractB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtractB: Self = this.set("extractB", js.undefined)
    
    @scala.inline
    def setFieldA(value: String): Self = this.set("fieldA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldA: Self = this.set("fieldA", js.undefined)
    
    @scala.inline
    def setFieldAIndex(value: Double): Self = this.set("fieldAIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldAIndex: Self = this.set("fieldAIndex", js.undefined)
    
    @scala.inline
    def setFieldARequired(value: Boolean): Self = this.set("fieldARequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldARequired: Self = this.set("fieldARequired", js.undefined)
    
    @scala.inline
    def setFieldB(value: String): Self = this.set("fieldB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldB: Self = this.set("fieldB", js.undefined)
    
    @scala.inline
    def setFieldBIndex(value: Double): Self = this.set("fieldBIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldBIndex: Self = this.set("fieldBIndex", js.undefined)
    
    @scala.inline
    def setFieldBRequired(value: Boolean): Self = this.set("fieldBRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldBRequired: Self = this.set("fieldBRequired", js.undefined)
    
    @scala.inline
    def setOutputConstructor(value: String): Self = this.set("outputConstructor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputConstructor: Self = this.set("outputConstructor", js.undefined)
    
    @scala.inline
    def setOutputToField(value: String): Self = this.set("outputToField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputToField: Self = this.set("outputToField", js.undefined)
    
    @scala.inline
    def setOutputToFieldIndex(value: Double): Self = this.set("outputToFieldIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputToFieldIndex: Self = this.set("outputToFieldIndex", js.undefined)
    
    @scala.inline
    def setOverrideOutputField(value: Boolean): Self = this.set("overrideOutputField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrideOutputField: Self = this.set("overrideOutputField", js.undefined)
  }
}
