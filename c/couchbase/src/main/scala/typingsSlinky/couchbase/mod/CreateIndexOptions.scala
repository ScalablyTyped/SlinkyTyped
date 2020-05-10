package typingsSlinky.couchbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateIndexOptions extends js.Object {
  /**
    * True to defer building of the index until buildDeferredIndexes is called (or a direct call to the corresponding query service API).
    */
  var deferred: js.UndefOr[Boolean] = js.native
  /**
    * If a secondary index already exists, an error will be thrown unless this is set to true.
    */
  var ignoreIfExists: js.UndefOr[Boolean] = js.native
}

object CreateIndexOptions {
  @scala.inline
  def apply(): CreateIndexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateIndexOptions]
  }
  @scala.inline
  implicit class CreateIndexOptionsOps[Self <: CreateIndexOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeferred(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferred")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeferred: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferred")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreIfExists(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreIfExists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreIfExists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreIfExists")(js.undefined)
        ret
    }
  }
  
}

