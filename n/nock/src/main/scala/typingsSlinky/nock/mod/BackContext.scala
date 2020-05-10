package typingsSlinky.nock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackContext extends js.Object {
  var isLoaded: Boolean = js.native
  var scopes: js.Array[Scope] = js.native
  def assertScopesFinished(): Unit = js.native
}

object BackContext {
  @scala.inline
  def apply(assertScopesFinished: () => Unit, isLoaded: Boolean, scopes: js.Array[Scope]): BackContext = {
    val __obj = js.Dynamic.literal(assertScopesFinished = js.Any.fromFunction0(assertScopesFinished), isLoaded = isLoaded.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackContext]
  }
  @scala.inline
  implicit class BackContextOps[Self <: BackContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssertScopesFinished(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assertScopesFinished")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsLoaded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopes(value: js.Array[Scope]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

