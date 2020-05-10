package typingsSlinky.nestdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnsureIndexOptions extends js.Object {
  var expireAfterSeconds: js.UndefOr[Double] = js.native
  var fieldName: String = js.native
  var sparse: js.UndefOr[Boolean] = js.native
  var unique: js.UndefOr[Boolean] = js.native
}

object EnsureIndexOptions {
  @scala.inline
  def apply(fieldName: String): EnsureIndexOptions = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnsureIndexOptions]
  }
  @scala.inline
  implicit class EnsureIndexOptionsOps[Self <: EnsureIndexOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFieldName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpireAfterSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expireAfterSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpireAfterSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expireAfterSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withSparse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sparse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSparse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sparse")(js.undefined)
        ret
    }
    @scala.inline
    def withUnique(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unique")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnique: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unique")(js.undefined)
        ret
    }
  }
  
}

