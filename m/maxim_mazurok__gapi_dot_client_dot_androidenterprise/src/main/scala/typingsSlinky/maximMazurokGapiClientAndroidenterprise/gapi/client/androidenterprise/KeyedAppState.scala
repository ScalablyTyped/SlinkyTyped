package typingsSlinky.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyedAppState extends StObject {
  
  /** Additional field intended for machine-readable data. For example, a number or JSON object. To prevent XSS, we recommend removing any HTML from the data before displaying it. */
  var data: js.UndefOr[String] = js.native
  
  /**
    * Key indicating what the app is providing a state for. The content of the key is set by the app's developer. To prevent XSS, we recommend removing any HTML from the key before
    * displaying it. This field will always be present.
    */
  var key: js.UndefOr[String] = js.native
  
  /** Free-form, human-readable message describing the app state. For example, an error message. To prevent XSS, we recommend removing any HTML from the message before displaying it. */
  var message: js.UndefOr[String] = js.native
  
  /** Severity of the app state. This field will always be present. */
  var severity: js.UndefOr[String] = js.native
  
  /** Timestamp of when the app set the state in milliseconds since epoch. This field will always be present. */
  var stateTimestampMillis: js.UndefOr[String] = js.native
}
object KeyedAppState {
  
  @scala.inline
  def apply(): KeyedAppState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyedAppState]
  }
  
  @scala.inline
  implicit class KeyedAppStateMutableBuilder[Self <: KeyedAppState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    @scala.inline
    def setStateTimestampMillis(value: String): Self = StObject.set(x, "stateTimestampMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateTimestampMillisUndefined: Self = StObject.set(x, "stateTimestampMillis", js.undefined)
  }
}
