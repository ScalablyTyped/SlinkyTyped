package typingsSlinky.googleapis.cloudbuildV1Mod.cloudbuildV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Push contains filter properties for matching GitHub git pushes.
  */
@js.native
trait SchemaPushFilter extends js.Object {
  /**
    * Regexes of branches to match.  The syntax of the regular expressions
    * accepted is the syntax accepted by RE2 and described at
    * https://github.com/google/re2/wiki/Syntax
    */
  var branch: js.UndefOr[String] = js.native
  /**
    * Regexes of tags to match.  The syntax of the regular expressions accepted
    * is the syntax accepted by RE2 and described at
    * https://github.com/google/re2/wiki/Syntax
    */
  var tag: js.UndefOr[String] = js.native
}

object SchemaPushFilter {
  @scala.inline
  def apply(): SchemaPushFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPushFilter]
  }
  @scala.inline
  implicit class SchemaPushFilterOps[Self <: SchemaPushFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBranch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBranch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branch")(js.undefined)
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(js.undefined)
        ret
    }
  }
  
}

