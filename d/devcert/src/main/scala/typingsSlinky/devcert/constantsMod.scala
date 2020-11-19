package typingsSlinky.devcert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("devcert/dist/constants", JSImport.Namespace)
@js.native
object constantsMod extends js.Object {
  
  val VALID_DOMAIN: js.RegExp = js.native
  
  val VALID_IP: js.RegExp = js.native
  
  val caSelfSignConfig: String = js.native
  
  val caVersionFile: String = js.native
  
  val configDir: js.Any = js.native
  
  def configPath(pathSegments: String*): String = js.native
  
  val domainsDir: String = js.native
  
  def ensureConfigDirs(): Unit = js.native
  
  def getLegacyConfigDir(): String = js.native
  
  val isLinux: Boolean = js.native
  
  val isMac: Boolean = js.native
  
  val isWindows: Boolean = js.native
  
  val opensslDatabaseFilePath: String = js.native
  
  val opensslSerialFilePath: String = js.native
  
  def pathForDomain(domain: String, pathSegments: String*): String = js.native
  
  val rootCACertPath: String = js.native
  
  val rootCADir: String = js.native
  
  val rootCAKeyPath: String = js.native
  
  def withDomainCertificateConfig(domain: String, cb: js.Function1[/* filepath */ String, Unit]): Unit = js.native
  
  def withDomainSigningRequestConfig(domain: String, cb: js.Function1[/* filepath */ String, Unit]): Unit = js.native
}
