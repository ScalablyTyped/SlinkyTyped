package typingsSlinky.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The constraints for this update.
  */
@js.native
trait SchemaConstraints extends StObject {
  
  /**
    * A client&#39;s physical location, expressed as a ISO 31166-1 alpha-2
    * region code.
    */
  var deviceLocation: js.UndefOr[String] = js.native
  
  /**
    * Requests the lists for a specific language. Expects ISO 639 alpha-2
    * format.
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * Sets the maximum number of entries that the client is willing to have in
    * the local database. This should be a power of 2 between 2**10 and 2**20.
    * If zero, no database size limit is set.
    */
  var maxDatabaseEntries: js.UndefOr[Double] = js.native
  
  /**
    * The maximum size in number of entries. The update will not contain more
    * entries than this value.  This should be a power of 2 between 2**10 and
    * 2**20.  If zero, no update size limit is set.
    */
  var maxUpdateEntries: js.UndefOr[Double] = js.native
  
  /**
    * Requests the list for a specific geographic location. If not set the
    * server may pick that value based on the user&#39;s IP address. Expects
    * ISO 3166-1 alpha-2 format.
    */
  var region: js.UndefOr[String] = js.native
  
  /**
    * The compression types supported by the client.
    */
  var supportedCompressions: js.UndefOr[js.Array[String]] = js.native
}
object SchemaConstraints {
  
  @scala.inline
  def apply(): SchemaConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConstraints]
  }
  
  @scala.inline
  implicit class SchemaConstraintsMutableBuilder[Self <: SchemaConstraints] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceLocation(value: String): Self = StObject.set(x, "deviceLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceLocationUndefined: Self = StObject.set(x, "deviceLocation", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setMaxDatabaseEntries(value: Double): Self = StObject.set(x, "maxDatabaseEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDatabaseEntriesUndefined: Self = StObject.set(x, "maxDatabaseEntries", js.undefined)
    
    @scala.inline
    def setMaxUpdateEntries(value: Double): Self = StObject.set(x, "maxUpdateEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUpdateEntriesUndefined: Self = StObject.set(x, "maxUpdateEntries", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setSupportedCompressions(value: js.Array[String]): Self = StObject.set(x, "supportedCompressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedCompressionsUndefined: Self = StObject.set(x, "supportedCompressions", js.undefined)
    
    @scala.inline
    def setSupportedCompressionsVarargs(value: String*): Self = StObject.set(x, "supportedCompressions", js.Array(value :_*))
  }
}
