package typingsSlinky.bookshelf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionFetchOptions extends js.Object {
  var require: js.UndefOr[Boolean] = js.native
  var withRelated: js.UndefOr[String | js.Array[String]] = js.native
}

object CollectionFetchOptions {
  @scala.inline
  def apply(): CollectionFetchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionFetchOptions]
  }
  @scala.inline
  implicit class CollectionFetchOptionsOps[Self <: CollectionFetchOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequire(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequire: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require")(js.undefined)
        ret
    }
    @scala.inline
    def withWithRelated(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withRelated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithRelated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withRelated")(js.undefined)
        ret
    }
  }
  
}

