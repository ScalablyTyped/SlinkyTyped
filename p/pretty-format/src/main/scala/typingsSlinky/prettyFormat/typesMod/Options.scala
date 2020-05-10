package typingsSlinky.prettyFormat.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var callToJSON: Boolean = js.native
  var escapeRegex: Boolean = js.native
  var escapeString: Boolean = js.native
  var highlight: Boolean = js.native
  var indent: Double = js.native
  var maxDepth: Double = js.native
  var min: Boolean = js.native
  var plugins: Plugins = js.native
  var printFunctionName: Boolean = js.native
  var theme: Theme = js.native
}

object Options {
  @scala.inline
  def apply(
    callToJSON: Boolean,
    escapeRegex: Boolean,
    escapeString: Boolean,
    highlight: Boolean,
    indent: Double,
    maxDepth: Double,
    min: Boolean,
    plugins: Plugins,
    printFunctionName: Boolean,
    theme: Theme
  ): Options = {
    val __obj = js.Dynamic.literal(callToJSON = callToJSON.asInstanceOf[js.Any], escapeRegex = escapeRegex.asInstanceOf[js.Any], escapeString = escapeString.asInstanceOf[js.Any], highlight = highlight.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], maxDepth = maxDepth.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], printFunctionName = printFunctionName.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallToJSON(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callToJSON")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEscapeRegex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeRegex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEscapeString(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlugins(value: Plugins): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrintFunctionName(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printFunctionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTheme(value: Theme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

