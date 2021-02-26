package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XIndexContainer
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** must be supported to provide access to a container of {@link GluePoint2} . */
@js.native
trait XGluePointsSupplier extends XInterface {
  
  /** @returns a container of {@link GluePoint2} structs. */
  val GluePoints: XIndexContainer = js.native
  
  /** @returns a container of {@link GluePoint2} structs. */
  def getGluePoints(): XIndexContainer = js.native
}
object XGluePointsSupplier {
  
  @scala.inline
  def apply(
    GluePoints: XIndexContainer,
    acquire: () => Unit,
    getGluePoints: () => XIndexContainer,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XGluePointsSupplier = {
    val __obj = js.Dynamic.literal(GluePoints = GluePoints.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getGluePoints = js.Any.fromFunction0(getGluePoints), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XGluePointsSupplier]
  }
  
  @scala.inline
  implicit class XGluePointsSupplierMutableBuilder[Self <: XGluePointsSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetGluePoints(value: () => XIndexContainer): Self = StObject.set(x, "getGluePoints", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGluePoints(value: XIndexContainer): Self = StObject.set(x, "GluePoints", value.asInstanceOf[js.Any])
  }
}
