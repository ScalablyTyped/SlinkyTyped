package typingsSlinky.activexLibreoffice.com_.sun.star.task

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * use {@link XStatusIndicatorFactory} instead of this
  * @deprecated Deprecated
  */
@js.native
trait XStatusIndicatorSupplier extends XInterface {
  
  /**
    * use {@link XStatusIndicatorFactory.createStatusIndicator()} instead of this
    * @deprecated Deprecated
    */
  val StatusIndicator: XStatusIndicator = js.native
  
  /**
    * use {@link XStatusIndicatorFactory.createStatusIndicator()} instead of this
    * @deprecated Deprecated
    */
  def getStatusIndicator(): XStatusIndicator = js.native
}
object XStatusIndicatorSupplier {
  
  @scala.inline
  def apply(
    StatusIndicator: XStatusIndicator,
    acquire: () => Unit,
    getStatusIndicator: () => XStatusIndicator,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XStatusIndicatorSupplier = {
    val __obj = js.Dynamic.literal(StatusIndicator = StatusIndicator.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getStatusIndicator = js.Any.fromFunction0(getStatusIndicator), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XStatusIndicatorSupplier]
  }
  
  @scala.inline
  implicit class XStatusIndicatorSupplierMutableBuilder[Self <: XStatusIndicatorSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetStatusIndicator(value: () => XStatusIndicator): Self = StObject.set(x, "getStatusIndicator", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStatusIndicator(value: XStatusIndicator): Self = StObject.set(x, "StatusIndicator", value.asInstanceOf[js.Any])
  }
}
