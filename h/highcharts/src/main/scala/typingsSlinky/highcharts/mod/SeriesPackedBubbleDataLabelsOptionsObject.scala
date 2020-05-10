package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesPackedBubbleDataLabelsOptionsObject extends DataLabelsOptionsObject {
  /**
    * Callback JavaScript function to format the data label for a node. Note
    * that if a `format` is defined, the format takes precedence and the
    * formatter is ignored.
    */
  @JSName("formatter")
  var formatter_SeriesPackedBubbleDataLabelsOptionsObject: js.UndefOr[SeriesPackedBubbleDataLabelsFormatterCallbackFunction] = js.native
  var parentNodeFormat: js.UndefOr[String] = js.native
  /**
    * Callback to format data labels for _parentNodes_. The `parentNodeFormat`
    * option takes precedence over the `parentNodeFormatter`.
    */
  var parentNodeFormatter: js.UndefOr[FormatterCallbackFunction[DataLabelsFormatterContextObject]] = js.native
  /**
    * Options for a _parentNode_ label text.
    */
  var parentNodeTextPath: js.UndefOr[SeriesPackedBubbleDataLabelsTextPathOptionsObject] = js.native
  /**
    * Options for a _node_ label text which should follow marker's shape.
    * **Note:** Only SVG-based renderer supports this option.
    */
  @JSName("textPath")
  var textPath_SeriesPackedBubbleDataLabelsOptionsObject: js.UndefOr[SeriesPackedBubbleDataLabelsTextPathOptionsObject] = js.native
}

object SeriesPackedBubbleDataLabelsOptionsObject {
  @scala.inline
  def apply(): SeriesPackedBubbleDataLabelsOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesPackedBubbleDataLabelsOptionsObject]
  }
  @scala.inline
  implicit class SeriesPackedBubbleDataLabelsOptionsObjectOps[Self <: SeriesPackedBubbleDataLabelsOptionsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormatter(value: SeriesPackedBubbleDataLabelsFormatterCallbackFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.undefined)
        ret
    }
    @scala.inline
    def withParentNodeFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentNodeFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentNodeFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentNodeFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withParentNodeFormatter(value: FormatterCallbackFunction[DataLabelsFormatterContextObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentNodeFormatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentNodeFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentNodeFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withParentNodeTextPath(value: SeriesPackedBubbleDataLabelsTextPathOptionsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentNodeTextPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentNodeTextPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentNodeTextPath")(js.undefined)
        ret
    }
    @scala.inline
    def withTextPath(value: SeriesPackedBubbleDataLabelsTextPathOptionsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textPath")(js.undefined)
        ret
    }
  }
  
}

