package typingsSlinky.reBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListenToOptions extends StObject {
  
  /**
    * Returns the Firebase data at the specified endpoint as an Array
    * instead of an Object.
    */
  var asArray: js.UndefOr[Boolean] = js.native
  
  /**
    * The context of your component.
    */
  var context: js.Object = js.native
  
  /**
    * The callback function that will be invoked if the current user does
    * not have read permissions at the location.
    */
  var onFailure: js.UndefOr[js.Function1[/* error */ js.Any, Unit]] = js.native
  
  /**
    * Queries to be used with your read operations. See
    * [Query Options](https://github.com/tylermcginnis/re-base#queries)
    * for more details.
    */
  var queries: js.UndefOr[js.Object] = js.native
  
  /**
    * The callback function that will be invoked with the data from the
    * specified endpoint when the endpoint changes.
    */
  def `then`(result: js.Any): Unit = js.native
}
object ListenToOptions {
  
  @scala.inline
  def apply(context: js.Object, `then`: js.Any => Unit): ListenToOptions = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.updateDynamic("then")(js.Any.fromFunction1(`then`))
    __obj.asInstanceOf[ListenToOptions]
  }
  
  @scala.inline
  implicit class ListenToOptionsMutableBuilder[Self <: ListenToOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsArray(value: Boolean): Self = StObject.set(x, "asArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsArrayUndefined: Self = StObject.set(x, "asArray", js.undefined)
    
    @scala.inline
    def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnFailure(value: /* error */ js.Any => Unit): Self = StObject.set(x, "onFailure", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFailureUndefined: Self = StObject.set(x, "onFailure", js.undefined)
    
    @scala.inline
    def setQueries(value: js.Object): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueriesUndefined: Self = StObject.set(x, "queries", js.undefined)
    
    @scala.inline
    def setThen(value: js.Any => Unit): Self = StObject.set(x, "then", js.Any.fromFunction1(value))
  }
}
