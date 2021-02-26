package typingsSlinky.arangodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deletion extends StObject {
  
  var count: Double = js.native
  
  var deletion: Double = js.native
  
  var size: Double = js.native
}
object Deletion {
  
  @scala.inline
  def apply(count: Double, deletion: Double, size: Double): Deletion = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], deletion = deletion.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deletion]
  }
  
  @scala.inline
  implicit class DeletionMutableBuilder[Self <: Deletion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletion(value: Double): Self = StObject.set(x, "deletion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
