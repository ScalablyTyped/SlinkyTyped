package typingsSlinky.fineUploader.coreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResumeOptions extends StObject {
  
  /**
    * Define custom keys used to identify this file among other resume records.
    * 
    * The file's ID will be passed to your provided function
    * 
    * @default `function(fileId) { return [] }`
    */
  var customKeys: js.UndefOr[js.Function] = js.native
  
  /**
    * Enable or disable the ability to resume failed or stopped chunked uploads
    *
    * @default `false`
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * paramNames.resuming - Sent with the first request of the resume with a value of `true`.
    *
    * @default `'qqresume'`
    */
  var paramNames: js.UndefOr[ParamNamesOptions] = js.native
  
  /**
    * The number of days before a persistent resume record will expire
    *
    * @default `7`
    */
  var recordsExpireIn: js.UndefOr[Double] = js.native
}
object ResumeOptions {
  
  @scala.inline
  def apply(): ResumeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResumeOptions]
  }
  
  @scala.inline
  implicit class ResumeOptionsMutableBuilder[Self <: ResumeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomKeys(value: js.Function): Self = StObject.set(x, "customKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomKeysUndefined: Self = StObject.set(x, "customKeys", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setParamNames(value: ParamNamesOptions): Self = StObject.set(x, "paramNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamNamesUndefined: Self = StObject.set(x, "paramNames", js.undefined)
    
    @scala.inline
    def setRecordsExpireIn(value: Double): Self = StObject.set(x, "recordsExpireIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordsExpireInUndefined: Self = StObject.set(x, "recordsExpireIn", js.undefined)
  }
}
