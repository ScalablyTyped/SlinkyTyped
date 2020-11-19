package typingsSlinky.arcgisJsApi.global.esri

import typingsSlinky.arcgisJsApi.esri.PrintProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.Print")
@js.native
/**
  * The Print widget connects your application with a [printing service](https://server.arcgis.com/en/portal/latest/administer/windows/configure-the-portal-to-print-maps.htm) to allow the map to be printed. It takes advantage of server-side, high-quality, full cartographic print functionality using the ExportWebMap service of ArcGIS, which can be configured with custom layout templates. One is provided that shows the map only, while another provides a layout with legend, etc. The Print widget works with the [PrintTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-PrintTask.html) which generates a printer-ready version of the map.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html)
  */
class PrintCls ()
  extends typingsSlinky.arcgisJsApi.esri.Print {
  def this(properties: PrintProperties) = this()
}
