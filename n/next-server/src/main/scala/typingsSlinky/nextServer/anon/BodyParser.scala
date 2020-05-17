package typingsSlinky.nextServer.anon

import typingsSlinky.nextServer.nextServerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BodyParser extends js.Object {
  /**
    * The byte limit of the body. This is the number of bytes or any string
    * format supported by `bytes`, for example `1000`, `'500kb'` or `'3mb'`.
    */
  var bodyParser: js.UndefOr[SizeLimit | `false`] = js.native
}

object BodyParser {
  @scala.inline
  def apply(): BodyParser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BodyParser]
  }
  @scala.inline
  implicit class BodyParserOps[Self <: BodyParser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBodyParser(value: SizeLimit | `false`): Self = {
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

