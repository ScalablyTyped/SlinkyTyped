package typingsSlinky.oracleOraclejet

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.others
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.phone
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.tablet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@oracle/oraclejet/ojconfig", JSImport.Namespace)
@js.native
object ojconfigMod extends js.Object {
  
  def getAutomationMode(): String = js.native
  
  def getDeviceType(): phone | tablet | others = js.native
  
  def getLocale(): String = js.native
  
  def getResourceUrl(relativePath: String): String = js.native
  
  def getVersionInfo(): String = js.native
  
  def logVersionInfo(): js.UndefOr[scala.Nothing] = js.native
  
  def setAutomationMode(mode: String): js.UndefOr[scala.Nothing] = js.native
  
  def setLocale(locale: String): js.UndefOr[scala.Nothing] = js.native
  def setLocale(locale: String, callback: js.Function0[Unit]): js.UndefOr[scala.Nothing] = js.native
  
  def setResourceBaseUrl(baseUrl: String): js.UndefOr[scala.Nothing] = js.native
}
