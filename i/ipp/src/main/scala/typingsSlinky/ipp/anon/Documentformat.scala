package typingsSlinky.ipp.anon

import typingsSlinky.ipp.mod.CharacterSet
import typingsSlinky.ipp.mod.MimeMediaType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Documentformat extends StObject {
  
  var `attributes-charset`: js.UndefOr[CharacterSet] = js.native
  
  var `attributes-natural-language`: js.UndefOr[String] = js.native
  
  var compression: js.UndefOr[typingsSlinky.ipp.mod.Compression] = js.native
  
  var `document-format`: js.UndefOr[MimeMediaType] = js.native
  
  var `document-name`: js.UndefOr[String] = js.native
  
  var `document-natural-language`: js.UndefOr[String] = js.native
  
  var `document-uri`: String = js.native
  
  var `ipp-attribute-fidelity`: js.UndefOr[Boolean] = js.native
  
  var `job-impressions`: js.UndefOr[Double] = js.native
  
  var `job-k-octets`: js.UndefOr[Double] = js.native
  
  var `job-media-sheets`: js.UndefOr[Double] = js.native
  
  var `job-name`: js.UndefOr[String] = js.native
  
  var `printer-uri`: js.UndefOr[String] = js.native
  
  var `requesting-user-name`: String = js.native
}
object Documentformat {
  
  @scala.inline
  def apply(`document-uri`: String, `requesting-user-name`: String): Documentformat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("document-uri")(`document-uri`.asInstanceOf[js.Any])
    __obj.updateDynamic("requesting-user-name")(`requesting-user-name`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Documentformat]
  }
  
  @scala.inline
  implicit class DocumentformatMutableBuilder[Self <: Documentformat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setAttributes-charset`(value: CharacterSet): Self = StObject.set(x, "attributes-charset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAttributes-charsetUndefined`: Self = StObject.set(x, "attributes-charset", js.undefined)
    
    @scala.inline
    def `setAttributes-natural-language`(value: String): Self = StObject.set(x, "attributes-natural-language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAttributes-natural-languageUndefined`: Self = StObject.set(x, "attributes-natural-language", js.undefined)
    
    @scala.inline
    def setCompression(value: typingsSlinky.ipp.mod.Compression): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
    
    @scala.inline
    def `setDocument-format`(value: MimeMediaType): Self = StObject.set(x, "document-format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDocument-formatUndefined`: Self = StObject.set(x, "document-format", js.undefined)
    
    @scala.inline
    def `setDocument-name`(value: String): Self = StObject.set(x, "document-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDocument-nameUndefined`: Self = StObject.set(x, "document-name", js.undefined)
    
    @scala.inline
    def `setDocument-natural-language`(value: String): Self = StObject.set(x, "document-natural-language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDocument-natural-languageUndefined`: Self = StObject.set(x, "document-natural-language", js.undefined)
    
    @scala.inline
    def `setDocument-uri`(value: String): Self = StObject.set(x, "document-uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setIpp-attribute-fidelity`(value: Boolean): Self = StObject.set(x, "ipp-attribute-fidelity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setIpp-attribute-fidelityUndefined`: Self = StObject.set(x, "ipp-attribute-fidelity", js.undefined)
    
    @scala.inline
    def `setJob-impressions`(value: Double): Self = StObject.set(x, "job-impressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-impressionsUndefined`: Self = StObject.set(x, "job-impressions", js.undefined)
    
    @scala.inline
    def `setJob-k-octets`(value: Double): Self = StObject.set(x, "job-k-octets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-k-octetsUndefined`: Self = StObject.set(x, "job-k-octets", js.undefined)
    
    @scala.inline
    def `setJob-media-sheets`(value: Double): Self = StObject.set(x, "job-media-sheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-media-sheetsUndefined`: Self = StObject.set(x, "job-media-sheets", js.undefined)
    
    @scala.inline
    def `setJob-name`(value: String): Self = StObject.set(x, "job-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-nameUndefined`: Self = StObject.set(x, "job-name", js.undefined)
    
    @scala.inline
    def `setPrinter-uri`(value: String): Self = StObject.set(x, "printer-uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPrinter-uriUndefined`: Self = StObject.set(x, "printer-uri", js.undefined)
    
    @scala.inline
    def `setRequesting-user-name`(value: String): Self = StObject.set(x, "requesting-user-name", value.asInstanceOf[js.Any])
  }
}
