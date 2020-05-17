package typingsSlinky.reactJsonPretty.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Json extends js.Object {
  var data: String = js.native
  var json: String = js.native
  var silent: Boolean = js.native
  var space: Double = js.native
  var themeClassName: String = js.native
}

object Json {
  @scala.inline
  def apply(data: String, json: String, silent: Boolean, space: Double, themeClassName: String): Json = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], space = space.asInstanceOf[js.Any], themeClassName = themeClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Json]
  }
  @scala.inline
  implicit class JsonOps[Self <: Json] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJson(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpace(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThemeClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeClassName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

