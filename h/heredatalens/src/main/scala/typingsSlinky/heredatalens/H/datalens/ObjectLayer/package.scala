package typingsSlinky.heredatalens.H.datalens

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object ObjectLayer {
  
  /**
    * Input data quantization domain, used to optimize styling performance.
    * The option must have properties corresponding to the properties of ObjectLayer.Row. Values must be represented as an Array of Numbers that defines the quantization domain.
    * When provided, the input data will be quantized, and rowToStyle will be called only for quantized values.
    */
  type DataDomains = js.Any
  
  /**
    * User defined modification of a data-driven style
    * StyleState appears as a parameter in the rowToStyle callback. By default it is 'DEFAULT_STATE'. To change StyleState, use the ObjectLayer.updateObjectStyle method.
    */
  type StyleState = js.Any
}
