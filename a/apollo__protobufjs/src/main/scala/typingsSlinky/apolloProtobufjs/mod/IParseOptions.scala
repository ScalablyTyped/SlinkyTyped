package typingsSlinky.apolloProtobufjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IParseOptions extends js.Object {
  /** Recognize double-slash comments in addition to doc-block comments. */
  var alternateCommentMode: js.UndefOr[Boolean] = js.native
  /** Keeps field casing instead of converting to camel case */
  var keepCase: js.UndefOr[Boolean] = js.native
}

object IParseOptions {
  @scala.inline
  def apply(): IParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IParseOptions]
  }
  @scala.inline
  implicit class IParseOptionsOps[Self <: IParseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlternateCommentMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternateCommentMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlternateCommentMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternateCommentMode")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepCase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepCase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepCase")(js.undefined)
        ret
    }
  }
  
}

