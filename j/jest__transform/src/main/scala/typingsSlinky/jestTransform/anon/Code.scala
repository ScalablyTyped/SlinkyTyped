package typingsSlinky.jestTransform.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Code extends js.Object {
  var code: String = js.native
  var mapCoverage: Boolean = js.native
  var sourceMapPath: String | Null = js.native
}

object Code {
  @scala.inline
  def apply(code: String, mapCoverage: Boolean): Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], mapCoverage = mapCoverage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
  @scala.inline
  implicit class CodeOps[Self <: Code] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMapCoverage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapCoverage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceMapPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceMapPathNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapPath")(null)
        ret
    }
  }
  
}

