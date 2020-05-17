package typingsSlinky.powerAssertFormatter.powerAssertFormatter

import typingsSlinky.powerAssertFormatter.anon.Instantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var ambiguousEastAsianCharWidth: js.UndefOr[Double] = js.native
  var anonymous: js.UndefOr[String] = js.native
  var circular: js.UndefOr[String] = js.native
  var diff: js.UndefOr[js.Function] = js.native
  var lineDiffThreshold: js.UndefOr[Double] = js.native
  var lineSeparator: js.UndefOr[String] = js.native
  var maxDepth: js.UndefOr[Double] = js.native
  var outputOffset: js.UndefOr[Double] = js.native
  var renderers: js.UndefOr[js.Array[_]] = js.native
  var stringify: js.UndefOr[js.Function] = js.native
  var widthOf: js.UndefOr[js.Function] = js.native
  var writerClass: js.UndefOr[Instantiable] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmbiguousEastAsianCharWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ambiguousEastAsianCharWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmbiguousEastAsianCharWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ambiguousEastAsianCharWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withAnonymous(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anonymous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnonymous: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anonymous")(js.undefined)
        ret
    }
    @scala.inline
    def withCircular(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circular")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCircular: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circular")(js.undefined)
        ret
    }
    @scala.inline
    def withDiff(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diff")(js.undefined)
        ret
    }
    @scala.inline
    def withLineDiffThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineDiffThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineDiffThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineDiffThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withLineSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDepth")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderers(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderers")(js.undefined)
        ret
    }
    @scala.inline
    def withStringify(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringify")(js.undefined)
        ret
    }
    @scala.inline
    def withWidthOf(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidthOf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthOf")(js.undefined)
        ret
    }
    @scala.inline
    def withWriterClass(value: Instantiable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writerClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriterClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writerClass")(js.undefined)
        ret
    }
  }
  
}

