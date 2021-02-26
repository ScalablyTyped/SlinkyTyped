package typingsSlinky.passportSamlMetadata

import typingsSlinky.passportSaml.mod.SamlConfig
import typingsSlinky.passportSamlMetadata.anon.MultipleCerts
import typingsSlinky.passportSamlMetadata.anon.PartialMetadataConstructo
import typingsSlinky.passportSamlMetadata.fetchMod.FetchConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMod {
  
  @JSImport("passport-saml-metadata/src", "MetadataReader")
  @js.native
  class MetadataReader protected ()
    extends typingsSlinky.passportSamlMetadata.readerMod.MetadataReader {
    def this(metadata: String) = this()
    def this(metadata: String, options: PartialMetadataConstructo) = this()
  }
  
  @JSImport("passport-saml-metadata/src", "claimsToCamelCase")
  @js.native
  def claimsToCamelCase(claims: js.Any, claimSchema: js.Any): js.Any = js.native
  
  @JSImport("passport-saml-metadata/src", "fetch")
  @js.native
  def fetch(config: FetchConfig): js.Promise[typingsSlinky.passportSamlMetadata.readerMod.MetadataReader] = js.native
  
  @JSImport("passport-saml-metadata/src", "metadata")
  @js.native
  def metadata(config: SamlConfig): js.Function0[Unit] = js.native
  
  @JSImport("passport-saml-metadata/src", "toPassportConfig")
  @js.native
  def toPassportConfig(): SamlConfig = js.native
  @JSImport("passport-saml-metadata/src", "toPassportConfig")
  @js.native
  def toPassportConfig(reader: js.UndefOr[scala.Nothing], options: MultipleCerts): SamlConfig = js.native
  @JSImport("passport-saml-metadata/src", "toPassportConfig")
  @js.native
  def toPassportConfig(reader: typingsSlinky.passportSamlMetadata.readerMod.MetadataReader): SamlConfig = js.native
  @JSImport("passport-saml-metadata/src", "toPassportConfig")
  @js.native
  def toPassportConfig(reader: typingsSlinky.passportSamlMetadata.readerMod.MetadataReader, options: MultipleCerts): SamlConfig = js.native
}
