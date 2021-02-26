package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Point
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @deprecated Deprecated */
@js.native
trait XConnectorShape extends XShape {
  
  /** connects the end of this instance. */
  def connectEnd(xShape: XConnectableShape, nPos: ConnectionType): Unit = js.native
  
  /** connects the start of this instance */
  def connectStart(xShape: XConnectableShape, nPos: ConnectionType): Unit = js.native
  
  /** disconnects the given {@link Shape} from the start of this instance. */
  def disconnectBegin(xShape: XConnectableShape): Unit = js.native
  
  /** disconnects the given {@link Shape} from the end of this instance. */
  def disconnectEnd(xShape: XConnectableShape): Unit = js.native
}
object XConnectorShape {
  
  @scala.inline
  def apply(
    Position: Point,
    ShapeType: String,
    Size: Size,
    acquire: () => Unit,
    connectEnd: (XConnectableShape, ConnectionType) => Unit,
    connectStart: (XConnectableShape, ConnectionType) => Unit,
    disconnectBegin: XConnectableShape => Unit,
    disconnectEnd: XConnectableShape => Unit,
    getPosition: () => Point,
    getShapeType: () => String,
    getSize: () => Size,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setPosition: Point => Unit,
    setSize: Size => Unit
  ): XConnectorShape = {
    val __obj = js.Dynamic.literal(Position = Position.asInstanceOf[js.Any], ShapeType = ShapeType.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), connectEnd = js.Any.fromFunction2(connectEnd), connectStart = js.Any.fromFunction2(connectStart), disconnectBegin = js.Any.fromFunction1(disconnectBegin), disconnectEnd = js.Any.fromFunction1(disconnectEnd), getPosition = js.Any.fromFunction0(getPosition), getShapeType = js.Any.fromFunction0(getShapeType), getSize = js.Any.fromFunction0(getSize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setPosition = js.Any.fromFunction1(setPosition), setSize = js.Any.fromFunction1(setSize))
    __obj.asInstanceOf[XConnectorShape]
  }
  
  @scala.inline
  implicit class XConnectorShapeMutableBuilder[Self <: XConnectorShape] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectEnd(value: (XConnectableShape, ConnectionType) => Unit): Self = StObject.set(x, "connectEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def setConnectStart(value: (XConnectableShape, ConnectionType) => Unit): Self = StObject.set(x, "connectStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDisconnectBegin(value: XConnectableShape => Unit): Self = StObject.set(x, "disconnectBegin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisconnectEnd(value: XConnectableShape => Unit): Self = StObject.set(x, "disconnectEnd", js.Any.fromFunction1(value))
  }
}
