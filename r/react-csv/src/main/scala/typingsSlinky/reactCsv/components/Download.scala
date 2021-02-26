package typingsSlinky.reactCsv.components

import typingsSlinky.reactCsv.commonPropTypesMod.Data
import typingsSlinky.reactCsv.downloadMod.DownloadPropTypes
import typingsSlinky.reactCsv.downloadMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Download {
  
  @scala.inline
  def apply(data: String | Data): SharedBuilder_DownloadPropTypes1077784257[default] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new SharedBuilder_DownloadPropTypes1077784257[default](js.Array(this.component, __props.asInstanceOf[DownloadPropTypes]))
  }
  
  @JSImport("react-csv/components/Download", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: DownloadPropTypes): SharedBuilder_DownloadPropTypes1077784257[default] = new SharedBuilder_DownloadPropTypes1077784257[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
