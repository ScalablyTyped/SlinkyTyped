package typingsSlinky.refreshFetch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fetch[T] extends js.Object {
  var fetch: T = js.native
  def refreshToken(): js.Promise[Unit] = js.native
  def shouldRefreshToken(error: js.Any): Boolean = js.native
}

object Fetch {
  @scala.inline
  def apply[T](fetch: T, refreshToken: () => js.Promise[Unit], shouldRefreshToken: js.Any => Boolean): Fetch[T] = {
    val __obj = js.Dynamic.literal(fetch = fetch.asInstanceOf[js.Any], refreshToken = js.Any.fromFunction0(refreshToken), shouldRefreshToken = js.Any.fromFunction1(shouldRefreshToken))
    __obj.asInstanceOf[Fetch[T]]
  }
  @scala.inline
  implicit class FetchOps[Self[t] <: Fetch[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withFetch(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefreshToken(value: () => js.Promise[Unit]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshToken")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShouldRefreshToken(value: js.Any => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldRefreshToken")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

