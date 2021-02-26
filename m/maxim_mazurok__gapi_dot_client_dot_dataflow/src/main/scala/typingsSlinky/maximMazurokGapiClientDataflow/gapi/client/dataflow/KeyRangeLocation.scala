package typingsSlinky.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyRangeLocation extends StObject {
  
  /**
    * The name of the data disk where data for this range is stored. This name is local to the Google Cloud Platform project and uniquely identifies the disk within that project, for
    * example "myproject-1014-104817-4c2-harness-0-disk-1".
    */
  var dataDisk: js.UndefOr[String] = js.native
  
  /** The physical location of this range assignment to be used for streaming computation cross-worker message delivery. */
  var deliveryEndpoint: js.UndefOr[String] = js.native
  
  /** DEPRECATED. The location of the persistent state for this range, as a persistent directory in the worker local filesystem. */
  var deprecatedPersistentDirectory: js.UndefOr[String] = js.native
  
  /** The end (exclusive) of the key range. */
  var end: js.UndefOr[String] = js.native
  
  /** The start (inclusive) of the key range. */
  var start: js.UndefOr[String] = js.native
}
object KeyRangeLocation {
  
  @scala.inline
  def apply(): KeyRangeLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyRangeLocation]
  }
  
  @scala.inline
  implicit class KeyRangeLocationMutableBuilder[Self <: KeyRangeLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataDisk(value: String): Self = StObject.set(x, "dataDisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataDiskUndefined: Self = StObject.set(x, "dataDisk", js.undefined)
    
    @scala.inline
    def setDeliveryEndpoint(value: String): Self = StObject.set(x, "deliveryEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryEndpointUndefined: Self = StObject.set(x, "deliveryEndpoint", js.undefined)
    
    @scala.inline
    def setDeprecatedPersistentDirectory(value: String): Self = StObject.set(x, "deprecatedPersistentDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedPersistentDirectoryUndefined: Self = StObject.set(x, "deprecatedPersistentDirectory", js.undefined)
    
    @scala.inline
    def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
