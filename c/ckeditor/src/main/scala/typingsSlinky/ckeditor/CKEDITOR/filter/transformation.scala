package typingsSlinky.ckeditor.CKEDITOR.filter

import typingsSlinky.ckeditor.CKEDITOR.htmlParser.element
import typingsSlinky.ckeditor.CKEDITOR.style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait transformation extends js.Object {
  var check: js.UndefOr[String] = js.native
  var element: js.UndefOr[String | style] = js.native
  var left: js.UndefOr[js.Function1[/* element */ element | style, Boolean]] = js.native
  def right(element: element, tools: String): Boolean = js.native
  def right(element: element, tools: transformationTools): Boolean = js.native
}

