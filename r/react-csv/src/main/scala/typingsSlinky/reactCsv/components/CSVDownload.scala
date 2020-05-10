package typingsSlinky.reactCsv.components

import typingsSlinky.reactCsv.commonPropTypesMod.Data
import typingsSlinky.reactCsv.downloadMod.DownloadPropTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CSVDownload {
  @JSImport("react-csv", "CSVDownload")
  @js.native
  object component extends js.Object
  
  def withProps(p: DownloadPropTypes): SharedBuilder_DownloadPropTypes1077784257[typingsSlinky.reactCsv.mod.CSVDownload] = new SharedBuilder_DownloadPropTypes1077784257[typingsSlinky.reactCsv.mod.CSVDownload](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(data: String | Data): SharedBuilder_DownloadPropTypes1077784257[typingsSlinky.reactCsv.mod.CSVDownload] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new SharedBuilder_DownloadPropTypes1077784257[typingsSlinky.reactCsv.mod.CSVDownload](js.Array(this.component, __props.asInstanceOf[DownloadPropTypes]))
  }
}

