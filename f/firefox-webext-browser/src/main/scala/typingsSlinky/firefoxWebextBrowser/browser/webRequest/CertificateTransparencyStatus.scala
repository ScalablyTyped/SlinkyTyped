package typingsSlinky.firefoxWebextBrowser.browser.webRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.not_applicable
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.policy_compliant
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.policy_not_enough_scts
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.policy_not_diverse_scts
*/
trait CertificateTransparencyStatus extends js.Object

object CertificateTransparencyStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def not_applicable: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.not_applicable = this.cast("not_applicable")
  @scala.inline
  def policy_compliant: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.policy_compliant = this.cast("policy_compliant")
  @scala.inline
  def policy_not_diverse_scts: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.policy_not_diverse_scts = this.cast("policy_not_diverse_scts")
  @scala.inline
  def policy_not_enough_scts: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.policy_not_enough_scts = this.cast("policy_not_enough_scts")
}

