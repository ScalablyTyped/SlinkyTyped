package typingsSlinky.apigeeDashAccess.apigeeDashAccessMod

import typingsSlinky.apigeeDashAccess.apigeeDashAccessMod.ApigeeAccess.CacheOptions
import typingsSlinky.apigeeDashAccess.apigeeDashAccessMod.ApigeeAccess.QuotaService
import typingsSlinky.apigeeDashAccess.apigeeDashAccessMod.ApigeeAccess.SecureVault
import typingsSlinky.apigeeDashAccess.apigeeDashAccessStrings.apigee
import typingsSlinky.apigeeDashAccess.apigeeDashAccessStrings.environment
import typingsSlinky.apigeeDashAccess.apigeeDashAccessStrings.organization
import typingsSlinky.apigeeDashAccess.apigeeDashAccessStrings.standalone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apigee-access", JSImport.Default)
@js.native
object default extends js.Object {
  def deleteVariable(request: js.Any, name: String): Unit = js.native
  def getCache(name: String): js.Any = js.native
  def getCache(name: String, options: CacheOptions): js.Any = js.native
  def getMode(): apigee | standalone = js.native
  def getQuota(): QuotaService = js.native
  def getQuota(options: js.Any): QuotaService = js.native
  def getVariable(request: js.Any, name: String): String | Double | Boolean = js.native
  def getVault(name: String): SecureVault = js.native
  @JSName("getVault")
  def getVault_environment(name: String, scope: environment): SecureVault = js.native
  @JSName("getVault")
  def getVault_organization(name: String, scope: organization): SecureVault = js.native
  def setIntVariable(request: js.Any, name: String, value: String): Unit = js.native
  def setIntVariable(request: js.Any, name: String, value: Double): Unit = js.native
  def setVariable(request: js.Any, name: String, value: String): Unit = js.native
  def setVariable(request: js.Any, name: String, value: Boolean): Unit = js.native
  def setVariable(request: js.Any, name: String, value: Double): Unit = js.native
}

