package typingsSlinky.activexLibreoffice.com_.sun.star.animations

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.NamedValue
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XEnumeration
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @since LibreOffice 4.1 */
@js.native
trait XParallelTimeContainer
  extends XTimeContainer
     with XEnumerationAccess
object XParallelTimeContainer {
  
  @scala.inline
  def apply(
    Acceleration: Double,
    AutoReverse: Boolean,
    Begin: js.Any,
    Decelerate: Double,
    Duration: js.Any,
    ElementType: `type`,
    End: js.Any,
    EndSync: js.Any,
    Fill: Double,
    FillDefault: Double,
    Parent: XInterface,
    RepeatCount: js.Any,
    RepeatDuration: js.Any,
    Restart: Double,
    RestartDefault: Double,
    Type: Double,
    UserData: SafeArray[NamedValue],
    acquire: () => Unit,
    appendChild: XAnimationNode => XAnimationNode,
    createEnumeration: () => XEnumeration,
    getElementType: () => `type`,
    getParent: () => XInterface,
    hasElements: () => Boolean,
    insertAfter: (XAnimationNode, XAnimationNode) => XAnimationNode,
    insertBefore: (XAnimationNode, XAnimationNode) => XAnimationNode,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeChild: XAnimationNode => XAnimationNode,
    replaceChild: (XAnimationNode, XAnimationNode) => XAnimationNode,
    setParent: XInterface => Unit
  ): XParallelTimeContainer = {
    val __obj = js.Dynamic.literal(Acceleration = Acceleration.asInstanceOf[js.Any], AutoReverse = AutoReverse.asInstanceOf[js.Any], Begin = Begin.asInstanceOf[js.Any], Decelerate = Decelerate.asInstanceOf[js.Any], Duration = Duration.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], End = End.asInstanceOf[js.Any], EndSync = EndSync.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], FillDefault = FillDefault.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RepeatCount = RepeatCount.asInstanceOf[js.Any], RepeatDuration = RepeatDuration.asInstanceOf[js.Any], Restart = Restart.asInstanceOf[js.Any], RestartDefault = RestartDefault.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UserData = UserData.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), appendChild = js.Any.fromFunction1(appendChild), createEnumeration = js.Any.fromFunction0(createEnumeration), getElementType = js.Any.fromFunction0(getElementType), getParent = js.Any.fromFunction0(getParent), hasElements = js.Any.fromFunction0(hasElements), insertAfter = js.Any.fromFunction2(insertAfter), insertBefore = js.Any.fromFunction2(insertBefore), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild), setParent = js.Any.fromFunction1(setParent))
    __obj.asInstanceOf[XParallelTimeContainer]
  }
}
