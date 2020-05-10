package typingsSlinky.got.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GotBodyOptions[E /* <: String | Null */] extends GotOptions[E] {
  var body: js.UndefOr[String | Buffer | Readable] = js.native
  var hooks: js.UndefOr[Hooks[GotBodyOptions[E], String | Buffer | Readable]] = js.native
}

object GotBodyOptions {
  @scala.inline
  def apply[E](): GotBodyOptions[E] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GotBodyOptions[E]]
  }
  @scala.inline
  implicit class GotBodyOptionsOps[Self[e] <: GotBodyOptions[e], E] (val x: Self[E]) extends AnyVal {
    @scala.inline
    def duplicate: Self[E] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[E]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[E] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[E] with Other]
    @scala.inline
    def withBody(value: String | Buffer | Readable): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withHooks(value: Hooks[GotBodyOptions[E], String | Buffer | Readable]): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHooks: Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hooks")(js.undefined)
        ret
    }
  }
  
}

