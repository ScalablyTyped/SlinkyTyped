package typingsSlinky.rcTable

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.mod.MutableRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBody extends js.Object {
  var body: MutableRefObject[HTMLDivElement]
}

object AnonBody {
  @scala.inline
  def apply(body: MutableRefObject[HTMLDivElement]): AnonBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBody]
  }
}

