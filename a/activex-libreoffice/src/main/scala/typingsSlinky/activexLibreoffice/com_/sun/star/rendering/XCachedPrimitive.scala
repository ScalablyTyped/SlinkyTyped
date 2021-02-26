package typingsSlinky.activexLibreoffice.com_.sun.star.rendering

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for cached repaint of already drawn {@link XCanvas} primitives.
  *
  * This interface provides a method to quickly redraw some {@link XCanvas} primitives, using cached data.
  * @since OOo 2.0
  */
@js.native
trait XCachedPrimitive extends XInterface {
  
  /**
    * Redraw the cached primitive.
    *
    * Redraw the cached primitive, with a possibly new view state.
    * @param aState The view state to be used when redrawing the primitive. The view state is of course permitted to differ from the one used for initial rend
    * @returns a value of type {@link RepaintResult} , denoting the result of this operation.
    * @throws com::sun::star::lang::IllegalArgumentException if the view transformation matrix is singular.
    */
  def redraw(aState: ViewState): Double = js.native
}
object XCachedPrimitive {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    redraw: ViewState => Double,
    release: () => Unit
  ): XCachedPrimitive = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), redraw = js.Any.fromFunction1(redraw), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCachedPrimitive]
  }
  
  @scala.inline
  implicit class XCachedPrimitiveMutableBuilder[Self <: XCachedPrimitive] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRedraw(value: ViewState => Double): Self = StObject.set(x, "redraw", js.Any.fromFunction1(value))
  }
}
