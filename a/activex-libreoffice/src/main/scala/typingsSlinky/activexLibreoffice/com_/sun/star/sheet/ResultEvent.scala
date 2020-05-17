package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains the new value of a volatile function result.
  * @see com.sun.star.sheet.XVolatileResult
  */
@js.native
trait ResultEvent extends EventObject {
  /**
    * contains the value.
    *
    * This can be any of the possible return types described for the {@link AddIn} service, except {@link XVolatileResult} .
    */
  var Value: js.Any = js.native
}

object ResultEvent {
  @scala.inline
  def apply(Source: XInterface, Value: js.Any): ResultEvent = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultEvent]
  }
  @scala.inline
  implicit class ResultEventOps[Self <: ResultEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

