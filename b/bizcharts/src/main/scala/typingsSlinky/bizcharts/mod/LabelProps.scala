package typingsSlinky.bizcharts.mod

import typingsSlinky.antvG2.mod.Styles.line
import typingsSlinky.antvG2.mod.Styles.text
import typingsSlinky.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelProps
  extends Props[js.Any] {
  var autoRotate: js.UndefOr[Boolean] = js.native
  var content: js.UndefOr[
    String | (js.Tuple2[String, js.Function2[/* x */ js.UndefOr[_], /* y */ js.UndefOr[_], String]])
  ] = js.native
  var formatter: js.UndefOr[
    (js.Function3[
      /* text */ js.UndefOr[js.Any], 
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      String
    ]) | Double
  ] = js.native
  var htmlTemplate: js.UndefOr[
    (js.Function3[
      /* text */ js.UndefOr[js.Any], 
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      String
    ]) | String
  ] = js.native
  var labelEmit: js.UndefOr[Boolean] = js.native
  var labelLine: js.UndefOr[
    (js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any], line]) | line | Boolean
  ] = js.native
  var offset: js.UndefOr[Double] = js.native
  var textStyle: js.UndefOr[text | (js.Function1[/* t */ js.UndefOr[js.Any], text])] = js.native
}

object LabelProps {
  @scala.inline
  def apply(): LabelProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelProps]
  }
  @scala.inline
  implicit class LabelPropsOps[Self <: LabelProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoRotate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoRotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRotate")(js.undefined)
        ret
    }
    @scala.inline
    def withContent(
      value: String | (js.Tuple2[String, js.Function2[/* x */ js.UndefOr[_], /* y */ js.UndefOr[_], String]])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatterFunction3(
      value: (/* text */ js.UndefOr[js.Any], /* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withFormatter(
      value: (js.Function3[
          /* text */ js.UndefOr[js.Any], 
          /* item */ js.UndefOr[js.Any], 
          /* index */ js.UndefOr[Double], 
          String
        ]) | Double
    ): Self = {
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
    def withHtmlTemplateFunction3(
      value: (/* text */ js.UndefOr[js.Any], /* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlTemplate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withHtmlTemplate(
      value: (js.Function3[
          /* text */ js.UndefOr[js.Any], 
          /* item */ js.UndefOr[js.Any], 
          /* index */ js.UndefOr[Double], 
          String
        ]) | String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelEmit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelEmit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelEmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelEmit")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelLineFunction2(value: (/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any]) => line): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelLine")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLabelLine(
      value: (js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any], line]) | line | Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelLine")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withTextStyleFunction1(value: /* t */ js.UndefOr[js.Any] => text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTextStyle(value: text | (js.Function1[/* t */ js.UndefOr[js.Any], text])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(js.undefined)
        ret
    }
  }
  
}

