package typingsSlinky.expressMongoSanitize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MongoSanitizeOptions extends js.Object {
  var replaceWith: js.Any = js.native
}

object MongoSanitizeOptions {
  @scala.inline
  def apply(replaceWith: js.Any): MongoSanitizeOptions = {
    val __obj = js.Dynamic.literal(replaceWith = replaceWith.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongoSanitizeOptions]
  }
  @scala.inline
  implicit class MongoSanitizeOptionsOps[Self <: MongoSanitizeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplaceWith(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceWith")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

