package typingsSlinky.passportSamlMetadata

import typingsSlinky.passportSaml.mod.SamlConfig
import typingsSlinky.passportSamlMetadata.anon.MultipleCerts
import typingsSlinky.passportSamlMetadata.anon.PartialMetadataConstructo
import typingsSlinky.passportSamlMetadata.fetchMod.FetchConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-saml-metadata", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MetadataReader protected ()
    extends typingsSlinky.passportSamlMetadata.srcMod.MetadataReader {
    def this(metadata: String) = this()
    def this(metadata: String, options: PartialMetadataConstructo) = this()
  }
  
  def claimsToCamelCase(claims: js.Any, claimSchema: js.Any): js.Any = js.native
  def fetch(config: FetchConfig): js.Promise[typingsSlinky.passportSamlMetadata.readerMod.MetadataReader] = js.native
  def metadata(config: SamlConfig): js.Function0[Unit] = js.native
  def toPassportConfig(): SamlConfig = js.native
  def toPassportConfig(reader: typingsSlinky.passportSamlMetadata.readerMod.MetadataReader): SamlConfig = js.native
  def toPassportConfig(reader: typingsSlinky.passportSamlMetadata.readerMod.MetadataReader, options: MultipleCerts): SamlConfig = js.native
}

