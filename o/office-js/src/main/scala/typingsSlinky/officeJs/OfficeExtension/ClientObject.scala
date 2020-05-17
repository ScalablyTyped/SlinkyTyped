package typingsSlinky.officeJs.OfficeExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An abstract proxy object that represents an object in an Office document. 
  * You create proxy objects from the context (or from other proxy objects), add commands to a queue to act on the object, and then synchronize the 
  * proxy object state with the document by calling `context.sync()`.
  */
@js.native
trait ClientObject extends js.Object {
  /** The request context associated with the object */
  var context: ClientRequestContext = js.native
  /**
    *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the 
    * isNullObject property.
    */
  var isNullObject: Boolean = js.native
}

object ClientObject {
  @scala.inline
  def apply(context: ClientRequestContext, isNullObject: Boolean): ClientObject = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], isNullObject = isNullObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientObject]
  }
  @scala.inline
  implicit class ClientObjectOps[Self <: ClientObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: ClientRequestContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsNullObject(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNullObject")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

