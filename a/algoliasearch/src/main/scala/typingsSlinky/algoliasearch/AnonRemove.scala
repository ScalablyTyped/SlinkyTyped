package typingsSlinky.algoliasearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRemove extends js.Object {
  /**
    * Tokens (literals or placeholders) from the query pattern
    * that should be removed from the query string.
    */
  var remove: js.Array[String] = js.native
}

object AnonRemove {
  @scala.inline
  def apply(remove: js.Array[String]): AnonRemove = {
    val __obj = js.Dynamic.literal(remove = remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRemove]
  }
  @scala.inline
  implicit class AnonRemoveOps[Self <: AnonRemove] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemove(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

