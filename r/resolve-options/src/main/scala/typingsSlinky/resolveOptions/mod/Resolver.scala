package typingsSlinky.resolveOptions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resolver extends js.Object {
  def resolve(key: String): js.UndefOr[Double | String | Boolean | js.Date | Null]
}

object Resolver {
  @scala.inline
  def apply(resolve: String => js.UndefOr[Double | String | Boolean | js.Date | Null]): Resolver = {
    val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction1(resolve))
    __obj.asInstanceOf[Resolver]
  }
}

