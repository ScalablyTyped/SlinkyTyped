package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Windows81CompliancePolicy extends DeviceCompliancePolicy {
  
  // Maximum Windows 8.1 version.
  var osMaximumVersion: js.UndefOr[NullableOption[String]] = js.native
  
  // Minimum Windows 8.1 version.
  var osMinimumVersion: js.UndefOr[NullableOption[String]] = js.native
  
  // Indicates whether or not to block simple password.
  var passwordBlockSimple: js.UndefOr[Boolean] = js.native
  
  // Password expiration in days.
  var passwordExpirationDays: js.UndefOr[NullableOption[Double]] = js.native
  
  // The number of character sets required in the password.
  var passwordMinimumCharacterSetCount: js.UndefOr[NullableOption[Double]] = js.native
  
  // The minimum password length.
  var passwordMinimumLength: js.UndefOr[NullableOption[Double]] = js.native
  
  // Minutes of inactivity before a password is required.
  var passwordMinutesOfInactivityBeforeLock: js.UndefOr[NullableOption[Double]] = js.native
  
  // The number of previous passwords to prevent re-use of. Valid values 0 to 24
  var passwordPreviousPasswordBlockCount: js.UndefOr[NullableOption[Double]] = js.native
  
  // Require a password to unlock Windows device.
  var passwordRequired: js.UndefOr[Boolean] = js.native
  
  // The required password type. Possible values are: deviceDefault, alphanumeric, numeric.
  var passwordRequiredType: js.UndefOr[RequiredPasswordType] = js.native
  
  // Indicates whether or not to require encryption on a windows 8.1 device.
  var storageRequireEncryption: js.UndefOr[Boolean] = js.native
}
object Windows81CompliancePolicy {
  
  @scala.inline
  def apply(): Windows81CompliancePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Windows81CompliancePolicy]
  }
  
  @scala.inline
  implicit class Windows81CompliancePolicyOps[Self <: Windows81CompliancePolicy] (val x: Self) extends AnyVal {
    
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
    def setOsMaximumVersion(value: NullableOption[String]): Self = this.set("osMaximumVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOsMaximumVersion: Self = this.set("osMaximumVersion", js.undefined)
    
    @scala.inline
    def setOsMaximumVersionNull: Self = this.set("osMaximumVersion", null)
    
    @scala.inline
    def setOsMinimumVersion(value: NullableOption[String]): Self = this.set("osMinimumVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOsMinimumVersion: Self = this.set("osMinimumVersion", js.undefined)
    
    @scala.inline
    def setOsMinimumVersionNull: Self = this.set("osMinimumVersion", null)
    
    @scala.inline
    def setPasswordBlockSimple(value: Boolean): Self = this.set("passwordBlockSimple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordBlockSimple: Self = this.set("passwordBlockSimple", js.undefined)
    
    @scala.inline
    def setPasswordExpirationDays(value: NullableOption[Double]): Self = this.set("passwordExpirationDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordExpirationDays: Self = this.set("passwordExpirationDays", js.undefined)
    
    @scala.inline
    def setPasswordExpirationDaysNull: Self = this.set("passwordExpirationDays", null)
    
    @scala.inline
    def setPasswordMinimumCharacterSetCount(value: NullableOption[Double]): Self = this.set("passwordMinimumCharacterSetCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordMinimumCharacterSetCount: Self = this.set("passwordMinimumCharacterSetCount", js.undefined)
    
    @scala.inline
    def setPasswordMinimumCharacterSetCountNull: Self = this.set("passwordMinimumCharacterSetCount", null)
    
    @scala.inline
    def setPasswordMinimumLength(value: NullableOption[Double]): Self = this.set("passwordMinimumLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordMinimumLength: Self = this.set("passwordMinimumLength", js.undefined)
    
    @scala.inline
    def setPasswordMinimumLengthNull: Self = this.set("passwordMinimumLength", null)
    
    @scala.inline
    def setPasswordMinutesOfInactivityBeforeLock(value: NullableOption[Double]): Self = this.set("passwordMinutesOfInactivityBeforeLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordMinutesOfInactivityBeforeLock: Self = this.set("passwordMinutesOfInactivityBeforeLock", js.undefined)
    
    @scala.inline
    def setPasswordMinutesOfInactivityBeforeLockNull: Self = this.set("passwordMinutesOfInactivityBeforeLock", null)
    
    @scala.inline
    def setPasswordPreviousPasswordBlockCount(value: NullableOption[Double]): Self = this.set("passwordPreviousPasswordBlockCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordPreviousPasswordBlockCount: Self = this.set("passwordPreviousPasswordBlockCount", js.undefined)
    
    @scala.inline
    def setPasswordPreviousPasswordBlockCountNull: Self = this.set("passwordPreviousPasswordBlockCount", null)
    
    @scala.inline
    def setPasswordRequired(value: Boolean): Self = this.set("passwordRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordRequired: Self = this.set("passwordRequired", js.undefined)
    
    @scala.inline
    def setPasswordRequiredType(value: RequiredPasswordType): Self = this.set("passwordRequiredType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordRequiredType: Self = this.set("passwordRequiredType", js.undefined)
    
    @scala.inline
    def setStorageRequireEncryption(value: Boolean): Self = this.set("storageRequireEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageRequireEncryption: Self = this.set("storageRequireEncryption", js.undefined)
  }
}
