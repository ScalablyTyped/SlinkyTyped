package typingsSlinky.materializeCss.M

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<PushpinOptions> * / any */ @js.native
trait Pushpin extends StObject {
  
  /**
    * Original offsetTop of element
    */
  var originalOffset: Double = js.native
}
object Pushpin {
  
  @scala.inline
  def apply(originalOffset: Double): Pushpin = {
    val __obj = js.Dynamic.literal(originalOffset = originalOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pushpin]
  }
  
  @scala.inline
  implicit class PushpinMutableBuilder[Self <: Pushpin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginalOffset(value: Double): Self = StObject.set(x, "originalOffset", value.asInstanceOf[js.Any])
  }
}
