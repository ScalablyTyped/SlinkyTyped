package typingsSlinky.dynogels.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Throughput extends StObject {
  
  var readCapacity: Double = js.native
  
  var writeCapacity: Double = js.native
}
object Throughput {
  
  @scala.inline
  def apply(readCapacity: Double, writeCapacity: Double): Throughput = {
    val __obj = js.Dynamic.literal(readCapacity = readCapacity.asInstanceOf[js.Any], writeCapacity = writeCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Throughput]
  }
  
  @scala.inline
  implicit class ThroughputMutableBuilder[Self <: Throughput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReadCapacity(value: Double): Self = StObject.set(x, "readCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteCapacity(value: Double): Self = StObject.set(x, "writeCapacity", value.asInstanceOf[js.Any])
  }
}
