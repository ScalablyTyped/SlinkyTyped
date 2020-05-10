package typingsSlinky.hapiJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectPatternOptions extends js.Object {
  var fallthrough: js.UndefOr[Boolean] = js.native
  var matches: SchemaLike | Reference = js.native
}

object ObjectPatternOptions {
  @scala.inline
  def apply(): ObjectPatternOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectPatternOptions]
  }
  @scala.inline
  implicit class ObjectPatternOptionsOps[Self <: ObjectPatternOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFallthrough(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallthrough")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallthrough: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallthrough")(js.undefined)
        ret
    }
    @scala.inline
    def withMatches(value: SchemaLike | Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(null)
        ret
    }
  }
  
}

