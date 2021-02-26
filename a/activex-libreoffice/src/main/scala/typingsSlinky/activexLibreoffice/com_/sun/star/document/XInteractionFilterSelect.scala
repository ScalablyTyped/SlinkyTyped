package typingsSlinky.activexLibreoffice.com_.sun.star.document

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.task.XInteractionContinuation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * continuation used by interaction mechanism at filter detection during loading documents
  *
  * If during loading time the filter can't be detected and wasn't given at calling time, a possible {@link com.sun.star.task.InteractionHandler} will be
  * used. (it's a part of used {@link MediaDescriptor} ) A {@link NoSuchFilterRequest} will be used then to start right interaction on that to get a
  * decision which filter should be used for given URL. A possible continuation of that can be this {@link XInteractionFilterSelect} . It will transport
  * the decision back to generic filter detection and force using of it. Of course it's possible to abort the loading process by use another continuation
  * {@link com.sun.star.task.XInteractionAbort} .
  * @see MediaDescriptor
  * @see com.sun.star.task.InteractionHandler
  * @see NoSuchFilterRequest
  * @see com.sun.star.task.XInteractionAbort
  */
@js.native
trait XInteractionFilterSelect extends XInteractionContinuation {
  
  /** used by detection to get selected filter */
  var Filter: String = js.native
  
  /** used by detection to get selected filter */
  def getFilter(): String = js.native
  
  /**
    * used by interaction to set selected filter
    *
    * This value must be saved till another one will be set and must be provided on {@link getFilter()} for interest users.
    */
  def setFilter(Name: String): Unit = js.native
}
object XInteractionFilterSelect {
  
  @scala.inline
  def apply(
    Filter: String,
    acquire: () => Unit,
    getFilter: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    select: () => Unit,
    setFilter: String => Unit
  ): XInteractionFilterSelect = {
    val __obj = js.Dynamic.literal(Filter = Filter.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getFilter = js.Any.fromFunction0(getFilter), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), select = js.Any.fromFunction0(select), setFilter = js.Any.fromFunction1(setFilter))
    __obj.asInstanceOf[XInteractionFilterSelect]
  }
  
  @scala.inline
  implicit class XInteractionFilterSelectMutableBuilder[Self <: XInteractionFilterSelect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetFilter(value: () => String): Self = StObject.set(x, "getFilter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetFilter(value: String => Unit): Self = StObject.set(x, "setFilter", js.Any.fromFunction1(value))
  }
}
