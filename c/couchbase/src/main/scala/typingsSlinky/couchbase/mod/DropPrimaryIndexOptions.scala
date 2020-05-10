package typingsSlinky.couchbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropPrimaryIndexOptions extends js.Object {
  /**
    * If true, attempting to drop on a bucket without the specified index won't cause an error to be thrown.
    */
  var ignoreIfNotExists: js.UndefOr[Boolean] = js.native
  /**
    * The custom name for the primary index.
    */
  var name: js.UndefOr[String] = js.native
}

object DropPrimaryIndexOptions {
  @scala.inline
  def apply(): DropPrimaryIndexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropPrimaryIndexOptions]
  }
  @scala.inline
  implicit class DropPrimaryIndexOptionsOps[Self <: DropPrimaryIndexOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnoreIfNotExists(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreIfNotExists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreIfNotExists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreIfNotExists")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

