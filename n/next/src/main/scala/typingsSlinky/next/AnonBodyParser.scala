package typingsSlinky.next

import typingsSlinky.next.nextBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBodyParser extends js.Object {
  /**
    * The byte limit of the body. This is the number of bytes or any string
    * format supported by `bytes`, for example `1000`, `'500kb'` or `'3mb'`.
    */
  var bodyParser: js.UndefOr[AnonSizeLimit | `false`] = js.native
}

object AnonBodyParser {
  @scala.inline
  def apply(): AnonBodyParser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBodyParser]
  }
  @scala.inline
  implicit class AnonBodyParserOps[Self <: AnonBodyParser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBodyParser(value: AnonSizeLimit | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyParser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyParser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyParser")(js.undefined)
        ret
    }
  }
  
}

