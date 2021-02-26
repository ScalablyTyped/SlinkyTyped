package typingsSlinky.natural.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BayesClassifierClassification extends StObject {
  
  var label: String = js.native
  
  var value: Double = js.native
}
object BayesClassifierClassification {
  
  @scala.inline
  def apply(label: String, value: Double): BayesClassifierClassification = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BayesClassifierClassification]
  }
  
  @scala.inline
  implicit class BayesClassifierClassificationMutableBuilder[Self <: BayesClassifierClassification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
