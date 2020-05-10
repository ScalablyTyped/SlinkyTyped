package typingsSlinky.dojo.dojox.highlight.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/highlight/languages/css.html
  *
  * CSS Language definition file.
  *
  */
@js.native
trait css_ extends js.Object {
  /**
    *
    */
  var case_insensitive: Boolean = js.native
  /**
    *
    */
  var defaultMode: js.Object = js.native
  /**
    *
    */
  var modes: js.Array[_] = js.native
}

object css_ {
  @scala.inline
  def apply(case_insensitive: Boolean, defaultMode: js.Object, modes: js.Array[_]): css_ = {
    val __obj = js.Dynamic.literal(case_insensitive = case_insensitive.asInstanceOf[js.Any], defaultMode = defaultMode.asInstanceOf[js.Any], modes = modes.asInstanceOf[js.Any])
    __obj.asInstanceOf[css_]
  }
  @scala.inline
  implicit class css_Ops[Self <: css_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCase_insensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("case_insensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultMode(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModes(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

