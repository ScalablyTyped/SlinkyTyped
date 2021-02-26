package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows notification when a new volatile function result is available.
  * @see com.sun.star.sheet.XVolatileResult
  */
@js.native
trait XResultListener extends XEventListener {
  
  /** is called when a new value is available. */
  def modified(aEvent: ResultEvent): Unit = js.native
}
object XResultListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    modified: ResultEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XResultListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), modified = js.Any.fromFunction1(modified), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XResultListener]
  }
  
  @scala.inline
  implicit class XResultListenerMutableBuilder[Self <: XResultListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModified(value: ResultEvent => Unit): Self = StObject.set(x, "modified", js.Any.fromFunction1(value))
  }
}
