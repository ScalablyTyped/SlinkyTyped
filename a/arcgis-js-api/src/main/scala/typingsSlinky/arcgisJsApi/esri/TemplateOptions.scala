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
trait TemplateOptions extends Accessor {
  
  /**
    * When `false`, the attribution is not displayed on the printout.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#attributionEnabled)
    */
  var attributionEnabled: Boolean = js.native
  
  /**
    * The text used for the author if the specified layout contains an author text element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#author)
    */
  var author: String = js.native
  
  /**
    * The text used for the copyright if the specified layout contains an copyright text element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#copyright)
    */
  var copyright: String = js.native
  
  /**
    * Resolution in dots per inch.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#dpi)
    */
  var dpi: String = js.native
  
  /**
    * This property only applies when the [layout](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#layout) value is `map-only`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#fileName)
    */
  var fileName: String = js.native
  
  /**
    * When true, the feature's attributes are included in feature collection layers even when they are not needed for rendering.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#forceFeatureAttributes)
    */
  var forceFeatureAttributes: Boolean = js.native
  
  /**
    * The output format for the printed map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#format)
    */
  var format: pdf | png32 | png8 | jpg | gif | eps | svg | svgz = js.native
  
  /**
    * Map height.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#height)
    */
  var height: Double = js.native
  
  /**
    * The layout used for the print output.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#layout)
    */
  var layout: `map-only` | `a3-landscape` | `a3-portrait` | `a4-landscape` | `a4-portrait` | `letter-ansi-a-landscape` | `letter-ansi-a-portrait` | `tabloid-ansi-b-landscape` | `tabloid-ansi-b-portrait` = js.native
  
  /**
    * When `false`, the legend is not displayed on the printout.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#legendEnabled)
    */
  var legendEnabled: Boolean = js.native
  
  /**
    * The map scale of the printed map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#scale)
    */
  var scale: Double = js.native
  
  /**
    * When `true`, [scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#scale) is used in the printed map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#scaleEnabled)
    */
  var scaleEnabled: Boolean = js.native
  
  /**
    * The text used for the map title if the specified layout contains a title text element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#title)
    */
  var title: String = js.native
  
  /**
    * Map width.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#width)
    */
  var width: Double = js.native
}
