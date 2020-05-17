package typingsSlinky.apolloLinkHttpCommon.anon

import typingsSlinky.apolloLinkHttpCommon.mod.HttpConfig
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Body extends js.Object {
  var body: typingsSlinky.apolloLinkHttpCommon.mod.Body = js.native
  var options: HttpConfig with (Record[String, _]) = js.native
}

object Body {
  @scala.inline
  def apply(body: typingsSlinky.apolloLinkHttpCommon.mod.Body, options: HttpConfig with (Record[String, _])): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
  @scala.inline
  implicit class BodyOps[Self <: Body] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: typingsSlinky.apolloLinkHttpCommon.mod.Body): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: HttpConfig with (Record[String, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

