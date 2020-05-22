package typingsSlinky.rcTable.anon

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.mod.MutableRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Body extends js.Object {
  var body: MutableRefObject[HTMLDivElement]
}

object Body {
  @scala.inline
  def apply(body: MutableRefObject[HTMLDivElement]): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
}

