package typingsSlinky.columnify.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.columnify.PickOptionsminWidthmaxWid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalOptions extends Options {
  var columnSplitter: js.UndefOr[String] = js.native
  var columns: js.UndefOr[js.Array[String]] = js.native
  var config: js.UndefOr[StringDictionary[Options]] = js.native
  var maxLineWidth: js.UndefOr[Double] = js.native
  var truncate: js.UndefOr[Boolean] = js.native
  var widths: js.UndefOr[StringDictionary[PickOptionsminWidthmaxWid]] = js.native
}

object GlobalOptions {
  @scala.inline
  def apply(): GlobalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalOptions]
  }
  @scala.inline
  implicit class GlobalOptionsOps[Self <: GlobalOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnSplitter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSplitter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnSplitter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSplitter")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withConfig(value: StringDictionary[Options]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLineWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withTruncate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTruncate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncate")(js.undefined)
        ret
    }
    @scala.inline
    def withWidths(value: StringDictionary[PickOptionsminWidthmaxWid]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widths")(js.undefined)
        ret
    }
  }
  
}

