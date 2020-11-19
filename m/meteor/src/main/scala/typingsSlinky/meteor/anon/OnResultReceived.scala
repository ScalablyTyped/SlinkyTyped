package typingsSlinky.meteor.anon

import typingsSlinky.meteor.EJSONable
import typingsSlinky.meteor.EJSONableProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnResultReceived[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */] extends js.Object {
  
  var onResultReceived: js.UndefOr[
    js.Function2[
      /* error */ js.UndefOr[js.Error | typingsSlinky.meteor.meteorMod.Meteor.Error], 
      /* result */ js.UndefOr[Result], 
      Unit
    ]
  ] = js.native
  
  var returnStubValue: js.UndefOr[Boolean] = js.native
  
  var throwStubExceptions: js.UndefOr[Boolean] = js.native
  
  @JSName("wait")
  var wait_FOnResultReceived: js.UndefOr[Boolean] = js.native
}
object OnResultReceived {
  
  @scala.inline
  def apply[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */](): OnResultReceived[Result] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnResultReceived[Result]]
  }
  
  @scala.inline
  implicit class OnResultReceivedOps[Self <: OnResultReceived[_], Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */] (val x: Self with OnResultReceived[Result]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnResultReceived(
      value: (/* error */ js.UndefOr[js.Error | typingsSlinky.meteor.meteorMod.Meteor.Error], /* result */ js.UndefOr[Result]) => Unit
    ): Self = this.set("onResultReceived", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnResultReceived: Self = this.set("onResultReceived", js.undefined)
    
    @scala.inline
    def setReturnStubValue(value: Boolean): Self = this.set("returnStubValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnStubValue: Self = this.set("returnStubValue", js.undefined)
    
    @scala.inline
    def setThrowStubExceptions(value: Boolean): Self = this.set("throwStubExceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrowStubExceptions: Self = this.set("throwStubExceptions", js.undefined)
    
    @scala.inline
    def setWait(value: Boolean): Self = this.set("wait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWait: Self = this.set("wait", js.undefined)
  }
}
