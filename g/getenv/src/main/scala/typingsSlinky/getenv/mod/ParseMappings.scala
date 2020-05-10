package typingsSlinky.getenv.mod

import typingsSlinky.node.urlMod.UrlWithStringQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseMappings extends js.Object {
  var bool: Boolean = js.native
  var boolish: Boolean = js.native
  var float: Double = js.native
  var int: Double = js.native
  var string: String = js.native
  var url: UrlWithStringQuery = js.native
}

object ParseMappings {
  @scala.inline
  def apply(
    bool: Boolean,
    boolish: Boolean,
    float: Double,
    int: Double,
    string: String,
    url: UrlWithStringQuery
  ): ParseMappings = {
    val __obj = js.Dynamic.literal(bool = bool.asInstanceOf[js.Any], boolish = boolish.asInstanceOf[js.Any], float = float.asInstanceOf[js.Any], int = int.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseMappings]
  }
  @scala.inline
  implicit class ParseMappingsOps[Self <: ParseMappings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBool(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBoolish(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolish")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFloat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("float")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("int")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: UrlWithStringQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

