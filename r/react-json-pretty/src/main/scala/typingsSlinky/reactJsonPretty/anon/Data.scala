package typingsSlinky.reactJsonPretty.anon

import typingsSlinky.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data extends js.Object {
  var data: Requireable[_] = js.native
  var json: Requireable[_] = js.native
  var onJSONPrettyError: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var replacer: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var silent: Requireable[Boolean] = js.native
  var space: Requireable[String | Double] = js.native
  var theme: Requireable[js.Object] = js.native
  var themeClassName: Requireable[String] = js.native
}

object Data {
  @scala.inline
  def apply(
    data: Requireable[_],
    json: Requireable[_],
    onJSONPrettyError: Requireable[js.Function1[/* repeated */ _, _]],
    replacer: Requireable[js.Function1[/* repeated */ _, _]],
    silent: Requireable[Boolean],
    space: Requireable[String | Double],
    theme: Requireable[js.Object],
    themeClassName: Requireable[String]
  ): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], onJSONPrettyError = onJSONPrettyError.asInstanceOf[js.Any], replacer = replacer.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], space = space.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], themeClassName = themeClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  @scala.inline
  implicit class DataOps[Self <: Data] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: Requireable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJson(value: Requireable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnJSONPrettyError(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onJSONPrettyError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplacer(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSilent(value: Requireable[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpace(value: Requireable[String | Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTheme(value: Requireable[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThemeClassName(value: Requireable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeClassName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

