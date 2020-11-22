package typingsSlinky.googleOneTap.mod

import typingsSlinky.googleOneTap.googleOneTapStrings.auto_cancel
import typingsSlinky.googleOneTap.googleOneTapStrings.browser_not_supported
import typingsSlinky.googleOneTap.googleOneTapStrings.cancel_called
import typingsSlinky.googleOneTap.googleOneTapStrings.credential_returned
import typingsSlinky.googleOneTap.googleOneTapStrings.dismissed
import typingsSlinky.googleOneTap.googleOneTapStrings.display
import typingsSlinky.googleOneTap.googleOneTapStrings.flow_restarted
import typingsSlinky.googleOneTap.googleOneTapStrings.invalid_client
import typingsSlinky.googleOneTap.googleOneTapStrings.issuing_failed
import typingsSlinky.googleOneTap.googleOneTapStrings.missing_client_id
import typingsSlinky.googleOneTap.googleOneTapStrings.opt_out_or_no_session
import typingsSlinky.googleOneTap.googleOneTapStrings.secure_http_required
import typingsSlinky.googleOneTap.googleOneTapStrings.skipped
import typingsSlinky.googleOneTap.googleOneTapStrings.suppressed_by_user
import typingsSlinky.googleOneTap.googleOneTapStrings.tap_outside
import typingsSlinky.googleOneTap.googleOneTapStrings.unknown_reason
import typingsSlinky.googleOneTap.googleOneTapStrings.unregistered_origin
import typingsSlinky.googleOneTap.googleOneTapStrings.user_cancel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromptMomentNotification extends js.Object {
  
  def getDismissedReason(): credential_returned | cancel_called | flow_restarted = js.native
  
  def getMomentType(): display | skipped | dismissed = js.native
  
  def getNotDisplayedReason(): browser_not_supported | invalid_client | missing_client_id | opt_out_or_no_session | secure_http_required | suppressed_by_user | unregistered_origin | unknown_reason = js.native
  
  def getSkippedReason(): auto_cancel | user_cancel | tap_outside | issuing_failed = js.native
  
  def isDismissedMoment(): Boolean = js.native
  
  def isDisplayMoment(): Boolean = js.native
  
  def isDisplayed(): Boolean = js.native
  
  def isNotDisplayed(): Boolean = js.native
  
  def isSkippedMoment(): Boolean = js.native
}
object PromptMomentNotification {
  
  @scala.inline
  def apply(
    getDismissedReason: () => credential_returned | cancel_called | flow_restarted,
    getMomentType: () => display | skipped | dismissed,
    getNotDisplayedReason: () => browser_not_supported | invalid_client | missing_client_id | opt_out_or_no_session | secure_http_required | suppressed_by_user | unregistered_origin | unknown_reason,
    getSkippedReason: () => auto_cancel | user_cancel | tap_outside | issuing_failed,
    isDismissedMoment: () => Boolean,
    isDisplayMoment: () => Boolean,
    isDisplayed: () => Boolean,
    isNotDisplayed: () => Boolean,
    isSkippedMoment: () => Boolean
  ): PromptMomentNotification = {
    val __obj = js.Dynamic.literal(getDismissedReason = js.Any.fromFunction0(getDismissedReason), getMomentType = js.Any.fromFunction0(getMomentType), getNotDisplayedReason = js.Any.fromFunction0(getNotDisplayedReason), getSkippedReason = js.Any.fromFunction0(getSkippedReason), isDismissedMoment = js.Any.fromFunction0(isDismissedMoment), isDisplayMoment = js.Any.fromFunction0(isDisplayMoment), isDisplayed = js.Any.fromFunction0(isDisplayed), isNotDisplayed = js.Any.fromFunction0(isNotDisplayed), isSkippedMoment = js.Any.fromFunction0(isSkippedMoment))
    __obj.asInstanceOf[PromptMomentNotification]
  }
  
  @scala.inline
  implicit class PromptMomentNotificationOps[Self <: PromptMomentNotification] (val x: Self) extends AnyVal {
    
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
    def setGetDismissedReason(value: () => credential_returned | cancel_called | flow_restarted): Self = this.set("getDismissedReason", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMomentType(value: () => display | skipped | dismissed): Self = this.set("getMomentType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNotDisplayedReason(
      value: () => browser_not_supported | invalid_client | missing_client_id | opt_out_or_no_session | secure_http_required | suppressed_by_user | unregistered_origin | unknown_reason
    ): Self = this.set("getNotDisplayedReason", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSkippedReason(value: () => auto_cancel | user_cancel | tap_outside | issuing_failed): Self = this.set("getSkippedReason", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsDismissedMoment(value: () => Boolean): Self = this.set("isDismissedMoment", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsDisplayMoment(value: () => Boolean): Self = this.set("isDisplayMoment", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsDisplayed(value: () => Boolean): Self = this.set("isDisplayed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsNotDisplayed(value: () => Boolean): Self = this.set("isNotDisplayed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsSkippedMoment(value: () => Boolean): Self = this.set("isSkippedMoment", js.Any.fromFunction0(value))
  }
}
