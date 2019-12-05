package typingsSlinky.ol

import typingsSlinky.ol.controlAttributionMod.Options
import typingsSlinky.ol.controlAttributionMod.default
import typingsSlinky.ol.controlUtilMod.DefaultsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/control", JSImport.Namespace)
@js.native
object controlMod extends js.Object {
  @js.native
  class Attribution () extends default {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  class Control protected ()
    extends typingsSlinky.ol.controlControlMod.default {
    def this(options: typingsSlinky.ol.controlControlMod.Options) = this()
  }
  
  @js.native
  class FullScreen ()
    extends typingsSlinky.ol.controlFullScreenMod.default {
    def this(opt_options: typingsSlinky.ol.controlFullScreenMod.Options) = this()
  }
  
  @js.native
  class MousePosition ()
    extends typingsSlinky.ol.controlMousePositionMod.default {
    def this(opt_options: typingsSlinky.ol.controlMousePositionMod.Options) = this()
  }
  
  @js.native
  class OverviewMap ()
    extends typingsSlinky.ol.controlOverviewMapMod.default {
    def this(opt_options: typingsSlinky.ol.controlOverviewMapMod.Options) = this()
  }
  
  @js.native
  class Rotate ()
    extends typingsSlinky.ol.controlRotateMod.default {
    def this(opt_options: typingsSlinky.ol.controlRotateMod.Options) = this()
  }
  
  @js.native
  class ScaleLine ()
    extends typingsSlinky.ol.controlScaleLineMod.default {
    def this(opt_options: typingsSlinky.ol.controlScaleLineMod.Options) = this()
  }
  
  @js.native
  class Zoom ()
    extends typingsSlinky.ol.controlZoomMod.default {
    def this(opt_options: typingsSlinky.ol.controlZoomMod.Options) = this()
  }
  
  @js.native
  class ZoomSlider ()
    extends typingsSlinky.ol.controlZoomSliderMod.default {
    def this(opt_options: typingsSlinky.ol.controlZoomSliderMod.Options) = this()
  }
  
  @js.native
  class ZoomToExtent ()
    extends typingsSlinky.ol.controlZoomToExtentMod.default {
    def this(opt_options: typingsSlinky.ol.controlZoomToExtentMod.Options) = this()
  }
  
  def defaults(): typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.controlControlMod.default] = js.native
  def defaults(opt_options: DefaultsOptions): typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.controlControlMod.default] = js.native
}

