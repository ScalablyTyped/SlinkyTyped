package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents something that provides a {@link DrawPage} .
  *
  * This interface is provided if the container only supports exactly one {@link DrawPage} . For containers which support multiple {@link DrawPages}
  * interface {@link XDrawPagesSupplier} is supported.
  * @deprecated Deprecated
  */
@js.native
trait XDrawPageSupplier extends XInterface {
  
  /** returns the {@link DrawPage} . */
  val DrawPage: XDrawPage = js.native
  
  /** returns the {@link DrawPage} . */
  def getDrawPage(): XDrawPage = js.native
}
object XDrawPageSupplier {
  
  @scala.inline
  def apply(
    DrawPage: XDrawPage,
    acquire: () => Unit,
    getDrawPage: () => XDrawPage,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDrawPageSupplier = {
    val __obj = js.Dynamic.literal(DrawPage = DrawPage.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDrawPage = js.Any.fromFunction0(getDrawPage), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDrawPageSupplier]
  }
  
  @scala.inline
  implicit class XDrawPageSupplierMutableBuilder[Self <: XDrawPageSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDrawPage(value: XDrawPage): Self = StObject.set(x, "DrawPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDrawPage(value: () => XDrawPage): Self = StObject.set(x, "getDrawPage", js.Any.fromFunction0(value))
  }
}
