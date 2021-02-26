package typingsSlinky.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsLambdaLayerVersionDetails extends StObject {
  
  /**
    * The layer's compatible runtimes. Maximum number of five items. Valid values: nodejs10.x | nodejs12.x | java8 | java11 | python2.7 | python3.6 | python3.7 | python3.8 | dotnetcore1.0 | dotnetcore2.1 | go1.x | ruby2.5 | provided 
    */
  var CompatibleRuntimes: js.UndefOr[NonEmptyStringList] = js.native
  
  /**
    * Indicates when the version was created. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var CreatedDate: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The version number.
    */
  var Version: js.UndefOr[AwsLambdaLayerVersionNumber] = js.native
}
object AwsLambdaLayerVersionDetails {
  
  @scala.inline
  def apply(): AwsLambdaLayerVersionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsLambdaLayerVersionDetails]
  }
  
  @scala.inline
  implicit class AwsLambdaLayerVersionDetailsMutableBuilder[Self <: AwsLambdaLayerVersionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompatibleRuntimes(value: NonEmptyStringList): Self = StObject.set(x, "CompatibleRuntimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompatibleRuntimesUndefined: Self = StObject.set(x, "CompatibleRuntimes", js.undefined)
    
    @scala.inline
    def setCompatibleRuntimesVarargs(value: NonEmptyString*): Self = StObject.set(x, "CompatibleRuntimes", js.Array(value :_*))
    
    @scala.inline
    def setCreatedDate(value: NonEmptyString): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    @scala.inline
    def setVersion(value: AwsLambdaLayerVersionNumber): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
