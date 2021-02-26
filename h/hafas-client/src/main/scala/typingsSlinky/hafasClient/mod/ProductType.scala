package typingsSlinky.hafasClient.mod

import typingsSlinky.hafasClient.hafasClientStrings.aircraft
import typingsSlinky.hafasClient.hafasClientStrings.bicycle
import typingsSlinky.hafasClient.hafasClientStrings.bus
import typingsSlinky.hafasClient.hafasClientStrings.car
import typingsSlinky.hafasClient.hafasClientStrings.gondola
import typingsSlinky.hafasClient.hafasClientStrings.taxi
import typingsSlinky.hafasClient.hafasClientStrings.train
import typingsSlinky.hafasClient.hafasClientStrings.walking
import typingsSlinky.hafasClient.hafasClientStrings.watercraft
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A ProductType relates to how a means of transport "works" in local context.
  * Example: Even though S-Bahn and U-Bahn in Berlin are both trains, they have different operators, service patterns,
  * stations and look different. Therefore, they are two distinct products subway and suburban.
  */
@js.native
trait ProductType extends StObject {
  
  var default: Boolean = js.native
  
  var bitmasks: js.Array[Double] = js.native
  
  var id: String = js.native
  
  var mode: train | bus | watercraft | taxi | gondola | aircraft | car | bicycle | walking = js.native
  
  var name: String = js.native
  
  var short: String = js.native
}
object ProductType {
  
  @scala.inline
  def apply(
    bitmasks: js.Array[Double],
    default: Boolean,
    id: String,
    mode: train | bus | watercraft | taxi | gondola | aircraft | car | bicycle | walking,
    name: String,
    short: String
  ): ProductType = {
    val __obj = js.Dynamic.literal(bitmasks = bitmasks.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductType]
  }
  
  @scala.inline
  implicit class ProductTypeMutableBuilder[Self <: ProductType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBitmasks(value: js.Array[Double]): Self = StObject.set(x, "bitmasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitmasksVarargs(value: Double*): Self = StObject.set(x, "bitmasks", js.Array(value :_*))
    
    @scala.inline
    def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: train | bus | watercraft | taxi | gondola | aircraft | car | bicycle | walking): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
  }
}
