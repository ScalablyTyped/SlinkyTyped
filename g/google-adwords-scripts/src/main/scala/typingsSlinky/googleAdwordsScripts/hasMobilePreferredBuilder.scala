package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait hasMobilePreferredBuilder[B] extends js.Object {
  def withMobilePreferred(): B = js.native
}

object hasMobilePreferredBuilder {
  @scala.inline
  def apply[B](withMobilePreferred: () => B): hasMobilePreferredBuilder[B] = {
    val __obj = js.Dynamic.literal(withMobilePreferred = js.Any.fromFunction0(withMobilePreferred))
    __obj.asInstanceOf[hasMobilePreferredBuilder[B]]
  }
  @scala.inline
  implicit class hasMobilePreferredBuilderOps[Self[b] <: hasMobilePreferredBuilder[b], B] (val x: Self[B]) extends AnyVal {
    @scala.inline
    def duplicate: Self[B] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[B]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[B] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[B] with Other]
    @scala.inline
    def withWithMobilePreferred(value: () => B): Self[B] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withMobilePreferred")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

