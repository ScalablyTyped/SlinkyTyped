package typingsSlinky.oracleOraclejet

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.others
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.phone
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.tablet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojconfigMod {
  
  @JSImport("@oracle/oraclejet/ojconfig", "getAutomationMode")
  @js.native
  def getAutomationMode(): String = js.native
  
  @JSImport("@oracle/oraclejet/ojconfig", "getDeviceType")
  @js.native
  def getDeviceType(): phone | tablet | others = js.native
  
  @JSImport("@oracle/oraclejet/ojconfig", "getLocale")
  @js.native
  def getLocale(): String = js.native
  
  @JSImport("@oracle/oraclejet/ojconfig", "getResourceUrl")
  @js.native
  def getResourceUrl(relativePath: String): String = js.native
  
  @JSImport("@oracle/oraclejet/ojconfig", "getVersionInfo")
  @js.native
  def getVersionInfo(): String = js.native
  
  @JSImport("@oracle/oraclejet/ojconfig", "logVersionInfo")
  @js.native
  def logVersionInfo(): js.UndefOr[scala.Nothing] = js.native
  
  @JSImport("@oracle/oraclejet/ojconfig", "setAutomationMode")
  @js.native
  def setAutomationMode(mode: String): js.UndefOr[scala.Nothing] = js.native
  
  @JSImport("@oracle/oraclejet/ojconfig", "setLocale")
  @js.native
  def setLocale(locale: String): js.UndefOr[scala.Nothing] = js.native
  @JSImport("@oracle/oraclejet/ojconfig", "setLocale")
  @js.native
  def setLocale(locale: String, callback: js.Function0[Unit]): js.UndefOr[scala.Nothing] = js.native
  
  @JSImport("@oracle/oraclejet/ojconfig", "setResourceBaseUrl")
  @js.native
  def setResourceBaseUrl(baseUrl: String): js.UndefOr[scala.Nothing] = js.native
}
