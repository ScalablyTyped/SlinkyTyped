package typingsSlinky.cordovaPluginQrscanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
* An object representing an error issued by QRScanner.
*
* Many QRScanner functions accept a callback with an `error` parameter. When
* QRScanner experiences errors, this parameter contains a QRScannerError object
* with properties `name` (_string_), `code` (_number_), and `_message`
* (_string_). When handling errors, rely only on the `name` or `code` parameter,
*as the specific content of `_message` is not considered part of the plugin's
* stable API.
*
* # Possible Error Types
*
* Code | Name                        | Description
* ---: | :-------------------------- | :----------------------------------------
*    0 | `UNEXPECTED_ERROR`          | An unexpected error. Returned only by bugs in QRScanner.
*    1 | `CAMERA_ACCESS_DENIED`      | The user denied camera access.
*    2 | `CAMERA_ACCESS_RESTRICTED`  | Camera access is restricted (due to parental controls, organization security configuration profiles, or similar reasons).
*    3 | `BACK_CAMERA_UNAVAILABLE`   | The back camera is unavailable.
*    4 | `FRONT_CAMERA_UNAVAILABLE`  | The front camera is unavailable.
*    5 | `CAMERA_UNAVAILABLE`        | The camera is unavailable because it doesn't exist or is otherwise unable to be configured. (Returned if QRScanner cannot return one of the more specific `BACK_CAMERA_UNAVAILABLE` or `FRONT_CAMERA_UNAVAILABLE` errors.)
*    6 | `SCAN_CANCELED`             | Scan was canceled by the `cancelScan()` method. (Returned exclusively to the `QRScanner.scan()` method.)
*    7 | `LIGHT_UNAVAILABLE`         | The device light is unavailable because it doesn't exist or is otherwise unable to be configured.
*    8 | `OPEN_SETTINGS_UNAVAILABLE` | The device is unable to open settings.
*/
@js.native
trait QRScannerError extends StObject {
  
  /**
    * A simple message describing this QRScannerError.
    */
  var _message: String = js.native
  
  /**
    * The standard number identifying the type of this QRScannerError.
    */
  var code: Double = js.native
  
  /**
    * The standard string identifying the type of this QRScannerError.
    */
  var name: String = js.native
}
object QRScannerError {
  
  @scala.inline
  def apply(_message: String, code: Double, name: String): QRScannerError = {
    val __obj = js.Dynamic.literal(_message = _message.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[QRScannerError]
  }
  
  @scala.inline
  implicit class QRScannerErrorMutableBuilder[Self <: QRScannerError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_message(value: String): Self = StObject.set(x, "_message", value.asInstanceOf[js.Any])
  }
}
