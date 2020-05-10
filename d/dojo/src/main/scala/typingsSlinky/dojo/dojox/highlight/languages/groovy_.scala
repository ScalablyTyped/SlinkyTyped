package typingsSlinky.dojo.dojox.highlight.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/highlight/languages/groovy.html
  *
  * Groovy highlight definitions
  *
  */
@js.native
trait groovy_ extends js.Object {
  /**
    *
    */
  var GROOVY_KEYWORDS: js.Object = js.native
  /**
    *
    */
  var defaultMode: js.Object = js.native
  /**
    *
    */
  var modes: js.Array[_] = js.native
}

object groovy_ {
  @scala.inline
  def apply(GROOVY_KEYWORDS: js.Object, defaultMode: js.Object, modes: js.Array[_]): groovy_ = {
    val __obj = js.Dynamic.literal(GROOVY_KEYWORDS = GROOVY_KEYWORDS.asInstanceOf[js.Any], defaultMode = defaultMode.asInstanceOf[js.Any], modes = modes.asInstanceOf[js.Any])
    __obj.asInstanceOf[groovy_]
  }
  @scala.inline
  implicit class groovy_Ops[Self <: groovy_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGROOVY_KEYWORDS(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GROOVY_KEYWORDS")(value.asInstanceOf[js.Any])
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

