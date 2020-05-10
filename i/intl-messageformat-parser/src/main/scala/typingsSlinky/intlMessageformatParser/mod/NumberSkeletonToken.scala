package typingsSlinky.intlMessageformatParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberSkeletonToken extends js.Object {
  var options: js.Array[String] = js.native
  var stem: String = js.native
}

object NumberSkeletonToken {
  @scala.inline
  def apply(options: js.Array[String], stem: String): NumberSkeletonToken = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], stem = stem.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberSkeletonToken]
  }
  @scala.inline
  implicit class NumberSkeletonTokenOps[Self <: NumberSkeletonToken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stem")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

