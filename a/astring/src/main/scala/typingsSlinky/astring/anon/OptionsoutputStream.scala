package typingsSlinky.astring.anon

import typingsSlinky.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined astring.astring.Options & {  output  :node.stream.Stream} */
@js.native
trait OptionsoutputStream extends js.Object {
  /** generate comments if true (defaults to false) */
  var comments: js.UndefOr[Boolean] = js.native
  /** custom code generator (defaults to astring.baseGenerator) */
  var generator: js.UndefOr[js.Object] = js.native
  /** string to use for indentation (defaults to "  ") */
  var indent: js.UndefOr[String] = js.native
  /** string to use for line endings (defaults to "\n") */
  var lineEnd: js.UndefOr[String] = js.native
  /** output stream to write the rendered code to (defaults to null) */
  var output: Stream = js.native
  /** source map generator (defaults to null), see https://github.com/mozilla/source-map#sourcemapgenerator */
  var sourceMap: js.UndefOr[js.Any] = js.native
  /** indent level to start from (defaults to 0) */
  var startingIndentLevel: js.UndefOr[Double] = js.native
}

object OptionsoutputStream {
  @scala.inline
  def apply(output: Stream): OptionsoutputStream = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsoutputStream]
  }
  @scala.inline
  implicit class OptionsoutputStreamOps[Self <: OptionsoutputStream] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutput(value: Stream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerator(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenerator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generator")(js.undefined)
        ret
    }
    @scala.inline
    def withIndent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(js.undefined)
        ret
    }
    @scala.inline
    def withLineEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceMap(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMap")(js.undefined)
        ret
    }
    @scala.inline
    def withStartingIndentLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startingIndentLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartingIndentLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startingIndentLevel")(js.undefined)
        ret
    }
  }
  
}

