package typingsSlinky.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemeVersion extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var Arn: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.Arn] = js.native
  
  /**
    * The Amazon QuickSight-defined ID of the theme that a custom theme inherits from. All themes initially inherit from a default QuickSight theme.
    */
  var BaseThemeId: js.UndefOr[RestrictiveResourceId] = js.native
  
  /**
    * The theme configuration, which contains all the theme display properties.
    */
  var Configuration: js.UndefOr[ThemeConfiguration] = js.native
  
  /**
    * The date and time that this theme version was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The description of the theme.
    */
  var Description: js.UndefOr[VersionDescription] = js.native
  
  /**
    * Errors associated with the theme.
    */
  var Errors: js.UndefOr[ThemeErrorList] = js.native
  
  /**
    * The status of the theme version.
    */
  var Status: js.UndefOr[ResourceStatus] = js.native
  
  /**
    * The version number of the theme.
    */
  var VersionNumber: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.VersionNumber] = js.native
}
object ThemeVersion {
  
  @scala.inline
  def apply(): ThemeVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeVersion]
  }
  
  @scala.inline
  implicit class ThemeVersionMutableBuilder[Self <: ThemeVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setBaseThemeId(value: RestrictiveResourceId): Self = StObject.set(x, "BaseThemeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseThemeIdUndefined: Self = StObject.set(x, "BaseThemeId", js.undefined)
    
    @scala.inline
    def setConfiguration(value: ThemeConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    @scala.inline
    def setDescription(value: VersionDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setErrors(value: ThemeErrorList): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: ThemeError*): Self = StObject.set(x, "Errors", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: ResourceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setVersionNumber(value: VersionNumber): Self = StObject.set(x, "VersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNumberUndefined: Self = StObject.set(x, "VersionNumber", js.undefined)
  }
}
