package typingsSlinky.androiduix.global.android.widget

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.androiduix.android.content.Context
import typingsSlinky.androiduix.android.widget.ImageView.ScaleType
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.ImageView")
@js.native
class ImageView protected ()
  extends typingsSlinky.androiduix.android.widget.ImageView {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
}

/* static members */
@JSGlobal("android.widget.ImageView")
@js.native
object ImageView extends js.Object {
  var sS2FArray: js.Any = js.native
  def parseScaleType(s: String, defaultType: ScaleType): ScaleType = js.native
  /* private */ def scaleTypeToScaleToFit(st: js.Any): js.Any = js.native
  @js.native
  object ScaleType extends js.Object {
    /* 5 */ val CENTER: typingsSlinky.androiduix.android.widget.ImageView.ScaleType.CENTER with Double = js.native
    /* 6 */ val CENTER_CROP: typingsSlinky.androiduix.android.widget.ImageView.ScaleType.CENTER_CROP with Double = js.native
    /* 7 */ val CENTER_INSIDE: typingsSlinky.androiduix.android.widget.ImageView.ScaleType.CENTER_INSIDE with Double = js.native
    /* 3 */ val FIT_CENTER: typingsSlinky.androiduix.android.widget.ImageView.ScaleType.FIT_CENTER with Double = js.native
    /* 4 */ val FIT_END: typingsSlinky.androiduix.android.widget.ImageView.ScaleType.FIT_END with Double = js.native
    /* 2 */ val FIT_START: typingsSlinky.androiduix.android.widget.ImageView.ScaleType.FIT_START with Double = js.native
    /* 1 */ val FIT_XY: typingsSlinky.androiduix.android.widget.ImageView.ScaleType.FIT_XY with Double = js.native
    /* 0 */ val MATRIX: typingsSlinky.androiduix.android.widget.ImageView.ScaleType.MATRIX with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.androiduix.android.widget.ImageView.ScaleType with Double] = js.native
  }
  
}

