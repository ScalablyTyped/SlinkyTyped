package typingsSlinky.resolveOptions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resolver extends js.Object {
  def resolve(key: String): js.UndefOr[Double | String | Boolean | js.Date | Null] = js.native
}

object Resolver {
  @scala.inline
  def apply(resolve: String => js.UndefOr[Double | String | Boolean | js.Date | Null]): Resolver = {
    val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction1(resolve))
    __obj.asInstanceOf[Resolver]
  }
  @scala.inline
  implicit class ResolverOps[Self <: Resolver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResolve(value: String => js.UndefOr[Double | String | Boolean | js.Date | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

