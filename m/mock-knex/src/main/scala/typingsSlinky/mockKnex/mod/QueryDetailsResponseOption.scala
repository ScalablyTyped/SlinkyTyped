package typingsSlinky.mockKnex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryDetailsResponseOption extends js.Object {
  /**
    * Is this a stream response, defaults to false
    */
  var stream: Boolean = js.native
}

object QueryDetailsResponseOption {
  @scala.inline
  def apply(stream: Boolean): QueryDetailsResponseOption = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDetailsResponseOption]
  }
  @scala.inline
  implicit class QueryDetailsResponseOptionOps[Self <: QueryDetailsResponseOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStream(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

