package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Objects implementing this interface can be used to align {@link Shapes} .
  * @deprecated Deprecated
  */
@js.native
trait XShapeAligner extends XInterface {
  
  /** aligns the specified {@link Shapes} . */
  def alignShapes(aShapes: js.Array[XShapes], eType: Alignment): Unit = js.native
}
object XShapeAligner {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    alignShapes: (js.Array[XShapes], Alignment) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XShapeAligner = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), alignShapes = js.Any.fromFunction2(alignShapes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XShapeAligner]
  }
  
  @scala.inline
  implicit class XShapeAlignerMutableBuilder[Self <: XShapeAligner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignShapes(value: (js.Array[XShapes], Alignment) => Unit): Self = StObject.set(x, "alignShapes", js.Any.fromFunction2(value))
  }
}
