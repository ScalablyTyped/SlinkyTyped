package typingsSlinky.prettyFormat.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var callToJSON: Boolean = js.native
  var colors: Colors = js.native
  var escapeRegex: Boolean = js.native
  var escapeString: Boolean = js.native
  var indent: String = js.native
  var maxDepth: Double = js.native
  var min: Boolean = js.native
  var plugins: Plugins = js.native
  var printFunctionName: Boolean = js.native
  var spacingInner: String = js.native
  var spacingOuter: String = js.native
}

object Config {
  @scala.inline
  def apply(
    callToJSON: Boolean,
    colors: Colors,
    escapeRegex: Boolean,
    escapeString: Boolean,
    indent: String,
    maxDepth: Double,
    min: Boolean,
    plugins: Plugins,
    printFunctionName: Boolean,
    spacingInner: String,
    spacingOuter: String
  ): Config = {
    val __obj = js.Dynamic.literal(callToJSON = callToJSON.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], escapeRegex = escapeRegex.asInstanceOf[js.Any], escapeString = escapeString.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], maxDepth = maxDepth.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], printFunctionName = printFunctionName.asInstanceOf[js.Any], spacingInner = spacingInner.asInstanceOf[js.Any], spacingOuter = spacingOuter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
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
    def withColors(value: Colors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
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
    def withIndent(value: String): Self = {
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
    def withSpacingInner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacingInner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpacingOuter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacingOuter")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

