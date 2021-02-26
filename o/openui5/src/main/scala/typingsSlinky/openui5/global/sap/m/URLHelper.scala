package typingsSlinky.openui5.global.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object URLHelper {
  
  /**
    * Adds an event registration for redirect.
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener The object, that wants to be notified, when the event occurs.
    * @returns sap.m.URLHelper instance
    */
  @JSGlobal("sap.m.URLHelper.attachRedirect")
  @js.native
  def attachRedirect(fnFunction: js.Any): js.Any = js.native
  @JSGlobal("sap.m.URLHelper.attachRedirect")
  @js.native
  def attachRedirect(fnFunction: js.Any, oListener: js.Any): js.Any = js.native
  
  /**
    * Detach already registered redirect event.
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener The object, that wants to be notified, when the event occurs.
    * @returns sap.m.URLHelper instance
    */
  @JSGlobal("sap.m.URLHelper.detachRedirect")
  @js.native
  def detachRedirect(fnFunction: js.Any): js.Any = js.native
  @JSGlobal("sap.m.URLHelper.detachRedirect")
  @js.native
  def detachRedirect(fnFunction: js.Any, oListener: js.Any): js.Any = js.native
  
  /**
    * Builds Email URI from given parameter.Trims spaces from email addresses.
    * @param sEmail Destination email address
    * @param sSubject Subject of the email address
    * @param sBody Default message text
    * @param sCC Carbon Copy email address
    * @param sBCC Blind carbon copy email address
    * @returns Email URI scheme
    */
  @JSGlobal("sap.m.URLHelper.normalizeEmail")
  @js.native
  def normalizeEmail(sEmail: String): String = js.native
  @JSGlobal("sap.m.URLHelper.normalizeEmail")
  @js.native
  def normalizeEmail(
    sEmail: String,
    sSubject: js.UndefOr[scala.Nothing],
    sBody: js.UndefOr[scala.Nothing],
    sCC: js.UndefOr[scala.Nothing],
    sBCC: String
  ): String = js.native
  @JSGlobal("sap.m.URLHelper.normalizeEmail")
  @js.native
  def normalizeEmail(sEmail: String, sSubject: js.UndefOr[scala.Nothing], sBody: js.UndefOr[scala.Nothing], sCC: String): String = js.native
  @JSGlobal("sap.m.URLHelper.normalizeEmail")
  @js.native
  def normalizeEmail(
    sEmail: String,
    sSubject: js.UndefOr[scala.Nothing],
    sBody: js.UndefOr[scala.Nothing],
    sCC: String,
    sBCC: String
  ): String = js.native
  @JSGlobal("sap.m.URLHelper.normalizeEmail")
  @js.native
  def normalizeEmail(sEmail: String, sSubject: js.UndefOr[scala.Nothing], sBody: String): String = js.native
  @JSGlobal("sap.m.URLHelper.normalizeEmail")
  @js.native
  def normalizeEmail(
    sEmail: String,
    sSubject: js.UndefOr[scala.Nothing],
    sBody: String,
    sCC: js.UndefOr[scala.Nothing],
    sBCC: String
  ): String = js.native
  @JSGlobal("sap.m.URLHelper.normalizeEmail")
  @js.native
  def normalizeEmail(sEmail: String, sSubject: js.UndefOr[scala.Nothing], sBody: String, sCC: String): String = js.native
  @JSGlobal("sap.m.URLHelper.normalizeEmail")
  @js.native
  def normalizeEmail(sEmail: String, sSubject: js.UndefOr[scala.Nothing], sBody: String, sCC: String, sBCC: String): String = js.native
  @JSGlobal("sap.m.URLHelper.normalizeEmail")
  @js.native
  def normalizeEmail(sEmail: String, sSubject: String): String = js.native
  @JSGlobal("sap.m.URLHelper.normalizeEmail")
  @js.native
  def normalizeEmail(
    sEmail: String,
    sSubject: String,
    sBody: js.UndefOr[scala.Nothing],
    sCC: js.UndefOr[scala.Nothing],
    sBCC: String
  ): String = js.native
  @JSGlobal("sap.m.URLHelper.normalizeEmail")
  @js.native
  def normalizeEmail(sEmail: String, sSubject: String, sBody: js.UndefOr[scala.Nothing], sCC: String): String = js.native
  @JSGlobal("sap.m.URLHelper.normalizeEmail")
  @js.native
  def normalizeEmail(sEmail: String, sSubject: String, sBody: js.UndefOr[scala.Nothing], sCC: String, sBCC: String): String = js.native
  @JSGlobal("sap.m.URLHelper.normalizeEmail")
  @js.native
  def normalizeEmail(sEmail: String, sSubject: String, sBody: String): String = js.native
  @JSGlobal("sap.m.URLHelper.normalizeEmail")
  @js.native
  def normalizeEmail(sEmail: String, sSubject: String, sBody: String, sCC: js.UndefOr[scala.Nothing], sBCC: String): String = js.native
  @JSGlobal("sap.m.URLHelper.normalizeEmail")
  @js.native
  def normalizeEmail(sEmail: String, sSubject: String, sBody: String, sCC: String): String = js.native
  @JSGlobal("sap.m.URLHelper.normalizeEmail")
  @js.native
  def normalizeEmail(sEmail: String, sSubject: String, sBody: String, sCC: String, sBCC: String): String = js.native
  
  /**
    * Sanitizes the given telephone number and returns SMS URI scheme.
    * @param sTel Telephone number
    * @returns SMS URI scheme
    */
  @JSGlobal("sap.m.URLHelper.normalizeSms")
  @js.native
  def normalizeSms(sTel: String): String = js.native
  
  /**
    * Sanitizes the given telephone number and returns a telephone URI scheme.
    * @param sTel Telephone number
    * @returns Telephone URI scheme
    */
  @JSGlobal("sap.m.URLHelper.normalizeTel")
  @js.native
  def normalizeTel(sTel: String): String = js.native
  
  /**
    * Redirects to the given URL.This method fires "redirect" event before opening the URL.
    * @param sURL Uniform resource locator
    * @param bNewWindow Opens URL in a new browser window or tab. Please note that, opening a new
    * window/tab can be ignored by browsers(e.g. on Windows Phone) or by popup blockers.NOTE: On Windows
    * Phone the URL will be enforced to open in the same window if opening in a new window/tab fails
    * (because of a known system restriction on cross-window communications). Use sap.m.Link instead (with
    * blank target) if you necessarily need to open URL in a new window.
    */
  @JSGlobal("sap.m.URLHelper.redirect")
  @js.native
  def redirect(sURL: String): Unit = js.native
  @JSGlobal("sap.m.URLHelper.redirect")
  @js.native
  def redirect(sURL: String, bNewWindow: Boolean): Unit = js.native
  
  /**
    * Trigger email application to send email.Trims spaces from email addresses.
    * @param sEmail Destination email address
    * @param sSubject Subject of the email address
    * @param sBody Default message text
    * @param sCC Carbon Copy email address
    * @param sBCC Blind carbon copy email address
    */
  @JSGlobal("sap.m.URLHelper.triggerEmail")
  @js.native
  def triggerEmail(sEmail: String): Unit = js.native
  @JSGlobal("sap.m.URLHelper.triggerEmail")
  @js.native
  def triggerEmail(
    sEmail: String,
    sSubject: js.UndefOr[scala.Nothing],
    sBody: js.UndefOr[scala.Nothing],
    sCC: js.UndefOr[scala.Nothing],
    sBCC: String
  ): Unit = js.native
  @JSGlobal("sap.m.URLHelper.triggerEmail")
  @js.native
  def triggerEmail(sEmail: String, sSubject: js.UndefOr[scala.Nothing], sBody: js.UndefOr[scala.Nothing], sCC: String): Unit = js.native
  @JSGlobal("sap.m.URLHelper.triggerEmail")
  @js.native
  def triggerEmail(
    sEmail: String,
    sSubject: js.UndefOr[scala.Nothing],
    sBody: js.UndefOr[scala.Nothing],
    sCC: String,
    sBCC: String
  ): Unit = js.native
  @JSGlobal("sap.m.URLHelper.triggerEmail")
  @js.native
  def triggerEmail(sEmail: String, sSubject: js.UndefOr[scala.Nothing], sBody: String): Unit = js.native
  @JSGlobal("sap.m.URLHelper.triggerEmail")
  @js.native
  def triggerEmail(
    sEmail: String,
    sSubject: js.UndefOr[scala.Nothing],
    sBody: String,
    sCC: js.UndefOr[scala.Nothing],
    sBCC: String
  ): Unit = js.native
  @JSGlobal("sap.m.URLHelper.triggerEmail")
  @js.native
  def triggerEmail(sEmail: String, sSubject: js.UndefOr[scala.Nothing], sBody: String, sCC: String): Unit = js.native
  @JSGlobal("sap.m.URLHelper.triggerEmail")
  @js.native
  def triggerEmail(sEmail: String, sSubject: js.UndefOr[scala.Nothing], sBody: String, sCC: String, sBCC: String): Unit = js.native
  @JSGlobal("sap.m.URLHelper.triggerEmail")
  @js.native
  def triggerEmail(sEmail: String, sSubject: String): Unit = js.native
  @JSGlobal("sap.m.URLHelper.triggerEmail")
  @js.native
  def triggerEmail(
    sEmail: String,
    sSubject: String,
    sBody: js.UndefOr[scala.Nothing],
    sCC: js.UndefOr[scala.Nothing],
    sBCC: String
  ): Unit = js.native
  @JSGlobal("sap.m.URLHelper.triggerEmail")
  @js.native
  def triggerEmail(sEmail: String, sSubject: String, sBody: js.UndefOr[scala.Nothing], sCC: String): Unit = js.native
  @JSGlobal("sap.m.URLHelper.triggerEmail")
  @js.native
  def triggerEmail(sEmail: String, sSubject: String, sBody: js.UndefOr[scala.Nothing], sCC: String, sBCC: String): Unit = js.native
  @JSGlobal("sap.m.URLHelper.triggerEmail")
  @js.native
  def triggerEmail(sEmail: String, sSubject: String, sBody: String): Unit = js.native
  @JSGlobal("sap.m.URLHelper.triggerEmail")
  @js.native
  def triggerEmail(sEmail: String, sSubject: String, sBody: String, sCC: js.UndefOr[scala.Nothing], sBCC: String): Unit = js.native
  @JSGlobal("sap.m.URLHelper.triggerEmail")
  @js.native
  def triggerEmail(sEmail: String, sSubject: String, sBody: String, sCC: String): Unit = js.native
  @JSGlobal("sap.m.URLHelper.triggerEmail")
  @js.native
  def triggerEmail(sEmail: String, sSubject: String, sBody: String, sCC: String, sBCC: String): Unit = js.native
  
  /**
    * Trigger SMS application to send SMS to given telephone number.
    * @param sTel Telephone number
    */
  @JSGlobal("sap.m.URLHelper.triggerSms")
  @js.native
  def triggerSms(sTel: String): Unit = js.native
  
  /**
    * Trigger telephone to call given telephone number.
    * @param sTel Telephone number
    */
  @JSGlobal("sap.m.URLHelper.triggerTel")
  @js.native
  def triggerTel(sTel: String): Unit = js.native
}
