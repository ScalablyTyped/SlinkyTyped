package typingsSlinky.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateThemeAliasRequest extends StObject {
  
  /**
    * The name of the theme alias that you want to update.
    */
  var AliasName: typingsSlinky.awsSdk.quicksightMod.AliasName = js.native
  
  /**
    * The ID of the AWS account that contains the theme alias that you're updating.
    */
  var AwsAccountId: typingsSlinky.awsSdk.quicksightMod.AwsAccountId = js.native
  
  /**
    * The ID for the theme.
    */
  var ThemeId: RestrictiveResourceId = js.native
  
  /**
    * The version number of the theme that the alias should reference.
    */
  var ThemeVersionNumber: VersionNumber = js.native
}
object UpdateThemeAliasRequest {
  
  @scala.inline
  def apply(
    AliasName: AliasName,
    AwsAccountId: AwsAccountId,
    ThemeId: RestrictiveResourceId,
    ThemeVersionNumber: VersionNumber
  ): UpdateThemeAliasRequest = {
    val __obj = js.Dynamic.literal(AliasName = AliasName.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any], ThemeId = ThemeId.asInstanceOf[js.Any], ThemeVersionNumber = ThemeVersionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateThemeAliasRequest]
  }
  
  @scala.inline
  implicit class UpdateThemeAliasRequestMutableBuilder[Self <: UpdateThemeAliasRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliasName(value: AliasName): Self = StObject.set(x, "AliasName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeId(value: RestrictiveResourceId): Self = StObject.set(x, "ThemeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeVersionNumber(value: VersionNumber): Self = StObject.set(x, "ThemeVersionNumber", value.asInstanceOf[js.Any])
  }
}
