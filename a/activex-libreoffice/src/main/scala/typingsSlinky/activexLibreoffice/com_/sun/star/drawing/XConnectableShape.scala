package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Point
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @deprecated Deprecated */
@js.native
trait XConnectableShape extends XInterface {
  
  def canConnect(nPos: Point, bCreateGluePoint: Boolean, nMaxDist: Double): Boolean = js.native
  
  def doConnect(nPos: Point, bCreateGluePoint: Boolean, nMaxDist: Double): Boolean = js.native
}
object XConnectableShape {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    canConnect: (Point, Boolean, Double) => Boolean,
    doConnect: (Point, Boolean, Double) => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XConnectableShape = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), canConnect = js.Any.fromFunction3(canConnect), doConnect = js.Any.fromFunction3(doConnect), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XConnectableShape]
  }
  
  @scala.inline
  implicit class XConnectableShapeMutableBuilder[Self <: XConnectableShape] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanConnect(value: (Point, Boolean, Double) => Boolean): Self = StObject.set(x, "canConnect", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDoConnect(value: (Point, Boolean, Double) => Boolean): Self = StObject.set(x, "doConnect", js.Any.fromFunction3(value))
  }
}
