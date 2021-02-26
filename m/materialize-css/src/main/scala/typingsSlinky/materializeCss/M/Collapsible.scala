package typingsSlinky.materializeCss.M

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<CollapsibleOptions> * / any */ @js.native
trait Collapsible extends StObject {
  
  /**
    * Close collapsible section
    * @param n Nth section to close
    */
  def close(n: Double): Unit = js.native
  
  /**
    * Open collapsible section
    * @param n Nth section to open
    */
  def open(n: Double): Unit = js.native
}
object Collapsible {
  
  @scala.inline
  def apply(close: Double => Unit, open: Double => Unit): Collapsible = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close), open = js.Any.fromFunction1(open))
    __obj.asInstanceOf[Collapsible]
  }
  
  @scala.inline
  implicit class CollapsibleMutableBuilder[Self <: Collapsible] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: Double => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpen(value: Double => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
  }
}
