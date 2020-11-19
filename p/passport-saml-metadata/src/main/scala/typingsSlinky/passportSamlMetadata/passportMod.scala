package typingsSlinky.passportSamlMetadata

import typingsSlinky.passportSaml.mod.SamlConfig
import typingsSlinky.passportSamlMetadata.anon.MultipleCerts
import typingsSlinky.passportSamlMetadata.readerMod.MetadataReader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("passport-saml-metadata/src/passport", JSImport.Namespace)
@js.native
object passportMod extends js.Object {
  
  def claimsToCamelCase(claims: js.Any, claimSchema: js.Any): js.Any = js.native
  
  def toPassportConfig(): SamlConfig = js.native
  def toPassportConfig(reader: js.UndefOr[scala.Nothing], options: MultipleCerts): SamlConfig = js.native
  def toPassportConfig(reader: MetadataReader): SamlConfig = js.native
  def toPassportConfig(reader: MetadataReader, options: MultipleCerts): SamlConfig = js.native
}
