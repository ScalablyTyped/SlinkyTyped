package typingsSlinky.activexLibreoffice.com_.sun.star.frame

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Allows to receive notifications when the frame title changes */
@js.native
trait XTitleChangeListener extends XEventListener {
  
  /** The frame title has changed */
  def titleChanged(aEvent: TitleChangedEvent): Unit = js.native
}
object XTitleChangeListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    titleChanged: TitleChangedEvent => Unit
  ): XTitleChangeListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), titleChanged = js.Any.fromFunction1(titleChanged))
    __obj.asInstanceOf[XTitleChangeListener]
  }
  
  @scala.inline
  implicit class XTitleChangeListenerMutableBuilder[Self <: XTitleChangeListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTitleChanged(value: TitleChangedEvent => Unit): Self = StObject.set(x, "titleChanged", js.Any.fromFunction1(value))
  }
}
