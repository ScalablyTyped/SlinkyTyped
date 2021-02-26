package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Point
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is implemented by {@link Shapes} that contain other {@link Shapes} .
  * @deprecated Deprecated
  */
@js.native
trait XShapeGroup extends XShape {
  
  /**
    * enters the group which enables the editing function for the parts of a grouped {@link Shape} . Then the parts can be edited instead of the group as a
    * whole.
    *
    * This affects only the user interface. The behavior is not specified if this instance is not visible on any view. In this case it may or may not work.
    */
  def enterGroup(): Unit = js.native
  
  /**
    * leaves the group, which disables the editing function for the parts of a grouped {@link Shape} . Then only the group as a whole can be edited.
    *
    * This affects only the user interface. The behavior is not specified if this instance is not visible on any view. In this case it may or may not work.
    */
  def leaveGroup(): Unit = js.native
}
object XShapeGroup {
  
  @scala.inline
  def apply(
    Position: Point,
    ShapeType: String,
    Size: Size,
    acquire: () => Unit,
    enterGroup: () => Unit,
    getPosition: () => Point,
    getShapeType: () => String,
    getSize: () => Size,
    leaveGroup: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setPosition: Point => Unit,
    setSize: Size => Unit
  ): XShapeGroup = {
    val __obj = js.Dynamic.literal(Position = Position.asInstanceOf[js.Any], ShapeType = ShapeType.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), enterGroup = js.Any.fromFunction0(enterGroup), getPosition = js.Any.fromFunction0(getPosition), getShapeType = js.Any.fromFunction0(getShapeType), getSize = js.Any.fromFunction0(getSize), leaveGroup = js.Any.fromFunction0(leaveGroup), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setPosition = js.Any.fromFunction1(setPosition), setSize = js.Any.fromFunction1(setSize))
    __obj.asInstanceOf[XShapeGroup]
  }
  
  @scala.inline
  implicit class XShapeGroupMutableBuilder[Self <: XShapeGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnterGroup(value: () => Unit): Self = StObject.set(x, "enterGroup", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLeaveGroup(value: () => Unit): Self = StObject.set(x, "leaveGroup", js.Any.fromFunction0(value))
  }
}
