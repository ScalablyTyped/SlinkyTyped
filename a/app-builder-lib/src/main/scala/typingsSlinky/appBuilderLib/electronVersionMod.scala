package typingsSlinky.appBuilderLib

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.appBuilderLib.configurationMod.Configuration
import typingsSlinky.lazyVal.mod.Lazy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("app-builder-lib/out/electron/electronVersion", JSImport.Namespace)
@js.native
object electronVersionMod extends js.Object {
  
  def getElectronPackage(projectDir: String): js.Promise[_] = js.native
  
  def getElectronVersion(projectDir: String): js.Promise[String] = js.native
  def getElectronVersion(projectDir: String, config: js.UndefOr[scala.Nothing], projectMetadata: MetadataValue): js.Promise[String] = js.native
  def getElectronVersion(projectDir: String, config: Configuration): js.Promise[String] = js.native
  def getElectronVersion(projectDir: String, config: Configuration, projectMetadata: MetadataValue): js.Promise[String] = js.native
  
  def getElectronVersionFromInstalled(projectDir: String): js.Promise[_] = js.native
  
  type MetadataValue = Lazy[StringDictionary[js.Any] | Null]
}
