package typingsSlinky.activexLibreoffice.com_.sun.star.chart

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.XShape
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XSecondAxisTitleSupplier extends XInterface {
  
  val SecondXAxisTitle: XShape = js.native
  
  val SecondYAxisTitle: XShape = js.native
  
  def getSecondXAxisTitle(): XShape = js.native
  
  def getSecondYAxisTitle(): XShape = js.native
}
object XSecondAxisTitleSupplier {
  
  @scala.inline
  def apply(
    SecondXAxisTitle: XShape,
    SecondYAxisTitle: XShape,
    acquire: () => Unit,
    getSecondXAxisTitle: () => XShape,
    getSecondYAxisTitle: () => XShape,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSecondAxisTitleSupplier = {
    val __obj = js.Dynamic.literal(SecondXAxisTitle = SecondXAxisTitle.asInstanceOf[js.Any], SecondYAxisTitle = SecondYAxisTitle.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getSecondXAxisTitle = js.Any.fromFunction0(getSecondXAxisTitle), getSecondYAxisTitle = js.Any.fromFunction0(getSecondYAxisTitle), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSecondAxisTitleSupplier]
  }
  
  @scala.inline
  implicit class XSecondAxisTitleSupplierMutableBuilder[Self <: XSecondAxisTitleSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetSecondXAxisTitle(value: () => XShape): Self = StObject.set(x, "getSecondXAxisTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSecondYAxisTitle(value: () => XShape): Self = StObject.set(x, "getSecondYAxisTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSecondXAxisTitle(value: XShape): Self = StObject.set(x, "SecondXAxisTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondYAxisTitle(value: XShape): Self = StObject.set(x, "SecondYAxisTitle", value.asInstanceOf[js.Any])
  }
}
