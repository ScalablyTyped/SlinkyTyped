package typingsSlinky.bech32.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Prefix extends js.Object {
  var prefix: String = js.native
  var words: js.Array[Double] = js.native
}

object Prefix {
  @scala.inline
  def apply(prefix: String, words: js.Array[Double]): Prefix = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
    __obj.asInstanceOf[Prefix]
  }
  @scala.inline
  implicit class PrefixOps[Self <: Prefix] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWords(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("words")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

