package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`a3-landscape`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`a3-portrait`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`a4-landscape`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`a4-portrait`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`letter-ansi-a-landscape`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`letter-ansi-a-portrait`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`map-only`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`tabloid-ansi-b-landscape`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`tabloid-ansi-b-portrait`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.eps
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.gif
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.jpg
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.pdf
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.png32
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.png8
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.svg
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.svgz
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrintTemplate extends Accessor {
  
  /**
    * When `false`, the attribution is not displayed on the printout.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#attributionVisible)
    */
  var attributionVisible: Boolean = js.native
  
  /**
    * Define the map width, height and dpi.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#exportOptions)
    */
  var exportOptions: PrintTemplateExportOptions = js.native
  
  /**
    * When true, the feature's attributes are included in feature collection layers even when they are not needed for rendering.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#forceFeatureAttributes)
    */
  var forceFeatureAttributes: Boolean = js.native
  
  /**
    * The output format for the printed map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#format)
    */
  var format: pdf | png32 | png8 | jpg | gif | eps | svg | svgz = js.native
  
  /**
    * The layout used for the print output.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#layout)
    */
  var layout: `map-only` | `a3-landscape` | `a3-portrait` | `a4-landscape` | `a4-portrait` | `letter-ansi-a-landscape` | `letter-ansi-a-portrait` | `tabloid-ansi-b-landscape` | `tabloid-ansi-b-portrait` = js.native
  
  /**
    * Defines the layout elements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#layoutOptions)
    */
  var layoutOptions: PrintTemplateLayoutOptions = js.native
  
  /**
    * The optional map scale of the printed map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#outScale)
    */
  var outScale: Double = js.native
  
  /**
    * Define whether the printed map should preserve map scale or map extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#preserveScale)
    */
  var preserveScale: Boolean = js.native
  
  /**
    * Define whether the printed map should preserve map scale or map extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#scalePreserved)
    */
  var scalePreserved: Boolean = js.native
  
  /**
    * When `true`, labels will be shown on the layout.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#showLabels)
    */
  var showLabels: Boolean = js.native
}
