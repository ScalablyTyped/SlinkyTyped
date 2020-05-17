package typingsSlinky.amapJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Keyword extends js.Object {
  var city: String = js.native
  var keyword: String = js.native
}

object Keyword {
  @scala.inline
  def apply(city: String, keyword: String): Keyword = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any])
    __obj.asInstanceOf[Keyword]
  }
  @scala.inline
  implicit class KeywordOps[Self <: Keyword] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyword")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

