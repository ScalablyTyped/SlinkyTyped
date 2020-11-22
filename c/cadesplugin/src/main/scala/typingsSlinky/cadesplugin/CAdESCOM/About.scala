package typingsSlinky.cadesplugin.CAdESCOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait About extends js.Object {
  
  val BuildVersion: Double = js.native
  
  def CSPName(): String = js.native
  def CSPName(ProviderType: Double): String = js.native
  
  def CSPVersion(): typingsSlinky.cadesplugin.CAdESCOM.Version = js.native
  def CSPVersion(ProviderName: js.UndefOr[scala.Nothing], ProviderType: Double): typingsSlinky.cadesplugin.CAdESCOM.Version = js.native
  def CSPVersion(ProviderName: String): typingsSlinky.cadesplugin.CAdESCOM.Version = js.native
  def CSPVersion(ProviderName: String, ProviderType: Double): typingsSlinky.cadesplugin.CAdESCOM.Version = js.native
  
  val MajorVersion: Double = js.native
  
  val MinorVersion: Double = js.native
  
  val PluginVersion: typingsSlinky.cadesplugin.CAdESCOM.Version = js.native
  
  def ProviderVersion(): String = js.native
  def ProviderVersion(ProviderName: js.UndefOr[scala.Nothing], ProviderType: Double): String = js.native
  def ProviderVersion(ProviderName: String): String = js.native
  def ProviderVersion(ProviderName: String, ProviderType: Double): String = js.native
  
  val Version: String = js.native
}
