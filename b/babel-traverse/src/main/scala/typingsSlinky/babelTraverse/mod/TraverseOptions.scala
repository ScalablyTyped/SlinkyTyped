package typingsSlinky.babelTraverse.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TraverseOptions[S] extends Visitor[S] {
  var noScope: js.UndefOr[Boolean] = js.native
  var scope: js.UndefOr[Scope] = js.native
}

object TraverseOptions {
  @scala.inline
  def apply[S](): TraverseOptions[S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TraverseOptions[S]]
  }
  @scala.inline
  implicit class TraverseOptionsOps[Self[s] <: TraverseOptions[s], S] (val x: Self[S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[S] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[S] with Other]
    @scala.inline
    def withNoScope(value: Boolean): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoScope: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noScope")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: Scope): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
  }
  
}

