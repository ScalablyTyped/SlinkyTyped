package typingsSlinky.meteor.anon

import typingsSlinky.meteor.EJSONable
import typingsSlinky.meteor.EJSONableProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnStubValue[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */] extends StObject {
  
  var onResultReceived: js.UndefOr[
    js.Function2[
      /* error */ js.UndefOr[js.Error | typingsSlinky.meteor.Meteor.Error], 
      /* result */ js.UndefOr[Result], 
      Unit
    ]
  ] = js.native
  
  var returnStubValue: js.UndefOr[Boolean] = js.native
  
  var throwStubExceptions: js.UndefOr[Boolean] = js.native
  
  @JSName("wait")
  var wait_FReturnStubValue: js.UndefOr[Boolean] = js.native
}
object ReturnStubValue {
  
  @scala.inline
  def apply[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */](): ReturnStubValue[Result] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReturnStubValue[Result]]
  }
  
  @scala.inline
  implicit class ReturnStubValueMutableBuilder[Self <: ReturnStubValue[_], Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */] (val x: Self with ReturnStubValue[Result]) extends AnyVal {
    
    @scala.inline
    def setOnResultReceived(
      value: (/* error */ js.UndefOr[js.Error | typingsSlinky.meteor.Meteor.Error], /* result */ js.UndefOr[Result]) => Unit
    ): Self = StObject.set(x, "onResultReceived", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnResultReceivedUndefined: Self = StObject.set(x, "onResultReceived", js.undefined)
    
    @scala.inline
    def setReturnStubValue(value: Boolean): Self = StObject.set(x, "returnStubValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnStubValueUndefined: Self = StObject.set(x, "returnStubValue", js.undefined)
    
    @scala.inline
    def setThrowStubExceptions(value: Boolean): Self = StObject.set(x, "throwStubExceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrowStubExceptionsUndefined: Self = StObject.set(x, "throwStubExceptions", js.undefined)
    
    @scala.inline
    def setWait_(value: Boolean): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
  }
}
