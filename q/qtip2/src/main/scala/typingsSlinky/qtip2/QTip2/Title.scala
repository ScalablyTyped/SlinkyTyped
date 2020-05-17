package typingsSlinky.qtip2.QTip2

import typingsSlinky.jquery.JQueryGenericPromise
import typingsSlinky.qtip2.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Content property
	 */
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.qtip2.JQuery
  - typingsSlinky.qtip2.QTip2.EventApiFunc
  - scala.Boolean
  - typingsSlinky.jquery.JQueryGenericPromise[js.Any]
*/
trait Title extends js.Object

object Title {
  @scala.inline
  implicit def apply(value: Boolean): Title = value.asInstanceOf[Title]
  @scala.inline
  implicit def apply(value: EventApiFunc): Title = value.asInstanceOf[Title]
  @scala.inline
  implicit def apply(value: JQuery): Title = value.asInstanceOf[Title]
  @scala.inline
  implicit def apply(value: JQueryGenericPromise[js.Any]): Title = value.asInstanceOf[Title]
  @scala.inline
  implicit def apply(value: String): Title = value.asInstanceOf[Title]
}

