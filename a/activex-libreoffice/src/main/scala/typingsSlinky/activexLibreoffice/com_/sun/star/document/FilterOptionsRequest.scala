package typingsSlinky.activexLibreoffice.com_.sun.star.document

import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.XModel
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.Exception
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Is used for interaction handle to get filter options.
  * @since OOo 1.1.2
  */
@js.native
trait FilterOptionsRequest extends Exception {
  /** The model of the document that should be provided to filters that supports {@link XExporter} interface. */
  var rModel: XModel = js.native
  /** The Media-descriptor of the document */
  var rProperties: SafeArray[PropertyValue] = js.native
}

object FilterOptionsRequest {
  @scala.inline
  def apply(Context: XInterface, Message: String, rModel: XModel, rProperties: SafeArray[PropertyValue]): FilterOptionsRequest = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], rModel = rModel.asInstanceOf[js.Any], rProperties = rProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterOptionsRequest]
  }
  @scala.inline
  implicit class FilterOptionsRequestOps[Self <: FilterOptionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRModel(value: XModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRProperties(value: SafeArray[PropertyValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rProperties")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

