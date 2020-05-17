package typingsSlinky.reactFns.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsLoading extends js.Object {
  var isLoading: Boolean = js.native
}

object IsLoading {
  @scala.inline
  def apply(isLoading: Boolean): IsLoading = {
    val __obj = js.Dynamic.literal(isLoading = isLoading.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsLoading]
  }
  @scala.inline
  implicit class IsLoadingOps[Self <: IsLoading] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsLoading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoading")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

