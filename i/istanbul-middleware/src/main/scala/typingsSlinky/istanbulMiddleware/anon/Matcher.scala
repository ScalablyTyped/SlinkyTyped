package typingsSlinky.istanbulMiddleware.anon

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.istanbulMiddleware.mod.ClientMatcher
import typingsSlinky.istanbulMiddleware.mod.PathTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matcher extends js.Object {
  var matcher: js.UndefOr[ClientMatcher] = js.native
  var pathTransformer: js.UndefOr[PathTransformer] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
}

object Matcher {
  @scala.inline
  def apply(): Matcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Matcher]
  }
  @scala.inline
  implicit class MatcherOps[Self <: Matcher] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMatcher(value: /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matcher")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMatcher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matcher")(js.undefined)
        ret
    }
    @scala.inline
    def withPathTransformer(value: /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathTransformer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPathTransformer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathTransformer")(js.undefined)
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(js.undefined)
        ret
    }
  }
  
}

