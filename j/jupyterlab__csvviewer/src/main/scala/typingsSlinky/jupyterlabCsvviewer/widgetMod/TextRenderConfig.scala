package typingsSlinky.jupyterlabCsvviewer.widgetMod

import typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.HorizontalAlignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/csvviewer/lib/widget", "TextRenderConfig")
@js.native
class TextRenderConfig () extends js.Object {
  
  /**
    * background color for the current search match.
    */
  var currentMatchBackgroundColor: String = js.native
  
  /**
    * horizontalAlignment of the text
    */
  var horizontalAlignment: HorizontalAlignment = js.native
  
  /**
    * background color for a search match
    */
  var matchBackgroundColor: String = js.native
  
  /**
    * default text color
    */
  var textColor: String = js.native
}
