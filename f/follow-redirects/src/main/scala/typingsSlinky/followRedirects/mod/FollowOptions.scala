package typingsSlinky.followRedirects.mod

import typingsSlinky.followRedirects.anon.Http
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FollowOptions[Options] extends js.Object {
  var agents: js.UndefOr[Http] = js.native
  var beforeRedirect: js.UndefOr[js.Function1[/* options */ Options with FollowOptions[Options], Unit]] = js.native
  var followRedirects: js.UndefOr[Boolean] = js.native
  var maxBodyLength: js.UndefOr[Double] = js.native
  var maxRedirects: js.UndefOr[Double] = js.native
  var trackRedirects: js.UndefOr[Boolean] = js.native
}

object FollowOptions {
  @scala.inline
  def apply[Options](): FollowOptions[Options] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FollowOptions[Options]]
  }
  @scala.inline
  implicit class FollowOptionsOps[Self[options] <: FollowOptions[options], Options] (val x: Self[Options]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Options] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Options]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Options] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Options] with Other]
    @scala.inline
    def withAgents(value: Http): Self[Options] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgents: Self[Options] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agents")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeRedirect(value: /* options */ Options with FollowOptions[Options] => Unit): Self[Options] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRedirect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeRedirect: Self[Options] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRedirect")(js.undefined)
        ret
    }
    @scala.inline
    def withFollowRedirects(value: Boolean): Self[Options] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followRedirects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollowRedirects: Self[Options] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followRedirects")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxBodyLength(value: Double): Self[Options] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBodyLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxBodyLength: Self[Options] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBodyLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRedirects(value: Double): Self[Options] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRedirects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRedirects: Self[Options] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRedirects")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackRedirects(value: Boolean): Self[Options] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackRedirects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackRedirects: Self[Options] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackRedirects")(js.undefined)
        ret
    }
  }
  
}

