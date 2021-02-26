package typingsSlinky.microsoftAjax.Sys

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes how the collection was changed.
  * @see {@link http://msdn.microsoft.com/en-us/library/dd393665(v=vs.100).aspx}
  */
@js.native
trait NotifyCollectionChangedEventArgs extends EventArgs {
  
  //#endregion
  //#region Properties
  /**
    * Gets an array of changes that were performed on the collection since the last event.
    * @return An array of CollectionChange objects that were performed on the collection since the last event.
    */
  def get_changes(): js.Array[CollectionChange] = js.native
}
object NotifyCollectionChangedEventArgs {
  
  @scala.inline
  def apply(Empty: EventArgs, get_changes: () => js.Array[CollectionChange]): NotifyCollectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_changes = js.Any.fromFunction0(get_changes))
    __obj.asInstanceOf[NotifyCollectionChangedEventArgs]
  }
  
  @scala.inline
  implicit class NotifyCollectionChangedEventArgsMutableBuilder[Self <: NotifyCollectionChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet_changes(value: () => js.Array[CollectionChange]): Self = StObject.set(x, "get_changes", js.Any.fromFunction0(value))
  }
}
