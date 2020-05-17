package typingsSlinky.less.Less

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderOutput extends js.Object {
  var css: String = js.native
  var imports: js.Array[String] = js.native
  var map: String = js.native
}

object RenderOutput {
  @scala.inline
  def apply(css: String, imports: js.Array[String], map: String): RenderOutput = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderOutput]
  }
  @scala.inline
  implicit class RenderOutputOps[Self <: RenderOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCss(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImports(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMap(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

