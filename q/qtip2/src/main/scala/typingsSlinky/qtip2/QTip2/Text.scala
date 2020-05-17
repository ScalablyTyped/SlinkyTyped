package typingsSlinky.qtip2.QTip2

import typingsSlinky.jquery.JQueryGenericPromise
import typingsSlinky.qtip2.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.qtip2.JQuery
  - typingsSlinky.qtip2.QTip2.EventApiFunc
  - scala.Boolean
  - typingsSlinky.jquery.JQueryGenericPromise[js.Any]
*/
trait Text extends js.Object

object Text {
  @scala.inline
  implicit def apply(value: Boolean): Text = value.asInstanceOf[Text]
  @scala.inline
  implicit def apply(value: EventApiFunc): Text = value.asInstanceOf[Text]
  @scala.inline
  implicit def apply(value: JQuery): Text = value.asInstanceOf[Text]
  @scala.inline
  implicit def apply(value: JQueryGenericPromise[js.Any]): Text = value.asInstanceOf[Text]
  @scala.inline
  implicit def apply(value: String): Text = value.asInstanceOf[Text]
}

