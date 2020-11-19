package typingsSlinky.appleMapkitJs.global.mapkit

import typingsSlinky.appleMapkitJs.mapkit.TileOverlayConstructorOptions
import typingsSlinky.appleMapkitJs.mapkit.URLTemplateCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An overlay that covers an area of the map with bitmap tiles.
  */
@JSGlobal("mapkit.TileOverlay")
@js.native
class TileOverlay protected ()
  extends typingsSlinky.appleMapkitJs.mapkit.TileOverlay {
  /**
    * Creates a tile overlay with a URL template and style options.
    */
  def this(urlTemplate: String) = this()
  def this(urlTemplate: URLTemplateCallback) = this()
  def this(urlTemplate: String, options: TileOverlayConstructorOptions) = this()
  def this(urlTemplate: URLTemplateCallback, options: TileOverlayConstructorOptions) = this()
}
