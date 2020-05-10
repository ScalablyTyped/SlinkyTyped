package typingsSlinky.googleAppsScript.GoogleAppsScript.Charts

import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Chart object, which can be converted to a static image. For charts embedded in spreadsheets,
  * see EmbeddedChart.
  */
@js.native
trait Chart extends js.Object {
  def getAs(contentType: String): Blob = js.native
  def getBlob(): Blob = js.native
  def getOptions(): ChartOptions = js.native
}

object Chart {
  @scala.inline
  def apply(getAs: String => Blob, getBlob: () => Blob, getOptions: () => ChartOptions): Chart = {
    val __obj = js.Dynamic.literal(getAs = js.Any.fromFunction1(getAs), getBlob = js.Any.fromFunction0(getBlob), getOptions = js.Any.fromFunction0(getOptions))
    __obj.asInstanceOf[Chart]
  }
  @scala.inline
  implicit class ChartOps[Self <: Chart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAs(value: String => Blob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAs")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetBlob(value: () => Blob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBlob")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOptions(value: () => ChartOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOptions")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

