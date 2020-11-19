package typingsSlinky.cordovaPluginCamera

import typingsSlinky.cordovaPluginCamera.anon.ALLMEDIA
import typingsSlinky.cordovaPluginCamera.anon.ARROWANY
import typingsSlinky.cordovaPluginCamera.anon.BACK
import typingsSlinky.cordovaPluginCamera.anon.CAMERA
import typingsSlinky.cordovaPluginCamera.anon.DATAURL
import typingsSlinky.cordovaPluginCamera.anon.JPEG
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object Camera extends js.Object {
    
    // Camera constants, defined in Camera plugin
    var DestinationType: DATAURL = js.native
    
    var Direction: BACK = js.native
    
    var EncodingType: JPEG = js.native
    
    var MediaType: ALLMEDIA = js.native
    
    var PictureSourceType: CAMERA = js.native
    
    // Used only on iOS
    var PopoverArrowDirection: ARROWANY = js.native
  }
  
  /**
    * iOS-only parameters that specify the anchor element location and arrow direction
    * of the popover when selecting images from an iPad's library or album.
    */
  @js.native
  class CameraPopoverOptions ()
    extends typingsSlinky.cordovaPluginCamera.CameraPopoverOptions {
    def this(x: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], width: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, width: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], width: Double) = this()
    def this(x: Double, y: Double, width: Double) = this()
    def this(
      x: js.UndefOr[scala.Nothing],
      y: js.UndefOr[scala.Nothing],
      width: js.UndefOr[scala.Nothing],
      height: Double
    ) = this()
    def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], width: Double, height: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, width: js.UndefOr[scala.Nothing], height: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, width: Double, height: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], width: js.UndefOr[scala.Nothing], height: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], width: Double, height: Double) = this()
    def this(x: Double, y: Double, width: js.UndefOr[scala.Nothing], height: Double) = this()
    def this(x: Double, y: Double, width: Double, height: Double) = this()
    def this(
      x: js.UndefOr[scala.Nothing],
      y: js.UndefOr[scala.Nothing],
      width: js.UndefOr[scala.Nothing],
      height: js.UndefOr[scala.Nothing],
      arrowDir: Double
    ) = this()
    def this(
      x: js.UndefOr[scala.Nothing],
      y: js.UndefOr[scala.Nothing],
      width: js.UndefOr[scala.Nothing],
      height: Double,
      arrowDir: Double
    ) = this()
    def this(
      x: js.UndefOr[scala.Nothing],
      y: js.UndefOr[scala.Nothing],
      width: Double,
      height: js.UndefOr[scala.Nothing],
      arrowDir: Double
    ) = this()
    def this(
      x: js.UndefOr[scala.Nothing],
      y: js.UndefOr[scala.Nothing],
      width: Double,
      height: Double,
      arrowDir: Double
    ) = this()
    def this(
      x: js.UndefOr[scala.Nothing],
      y: Double,
      width: js.UndefOr[scala.Nothing],
      height: js.UndefOr[scala.Nothing],
      arrowDir: Double
    ) = this()
    def this(
      x: js.UndefOr[scala.Nothing],
      y: Double,
      width: js.UndefOr[scala.Nothing],
      height: Double,
      arrowDir: Double
    ) = this()
    def this(
      x: js.UndefOr[scala.Nothing],
      y: Double,
      width: Double,
      height: js.UndefOr[scala.Nothing],
      arrowDir: Double
    ) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, width: Double, height: Double, arrowDir: Double) = this()
    def this(
      x: Double,
      y: js.UndefOr[scala.Nothing],
      width: js.UndefOr[scala.Nothing],
      height: js.UndefOr[scala.Nothing],
      arrowDir: Double
    ) = this()
    def this(
      x: Double,
      y: js.UndefOr[scala.Nothing],
      width: js.UndefOr[scala.Nothing],
      height: Double,
      arrowDir: Double
    ) = this()
    def this(
      x: Double,
      y: js.UndefOr[scala.Nothing],
      width: Double,
      height: js.UndefOr[scala.Nothing],
      arrowDir: Double
    ) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], width: Double, height: Double, arrowDir: Double) = this()
    def this(
      x: Double,
      y: Double,
      width: js.UndefOr[scala.Nothing],
      height: js.UndefOr[scala.Nothing],
      arrowDir: Double
    ) = this()
    def this(x: Double, y: Double, width: js.UndefOr[scala.Nothing], height: Double, arrowDir: Double) = this()
    def this(x: Double, y: Double, width: Double, height: js.UndefOr[scala.Nothing], arrowDir: Double) = this()
    def this(x: Double, y: Double, width: Double, height: Double, arrowDir: Double) = this()
  }
}
