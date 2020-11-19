package typingsSlinky.androiduix.global.android.widget

import typingsSlinky.androiduix.android.content.Context
import typingsSlinky.androiduix.android.view.View
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.widget.PopupWindow")
@js.native
class PopupWindow protected ()
  extends typingsSlinky.androiduix.android.widget.PopupWindow {
  def this(contentView: View) = this()
  def this(context: Context) = this()
  def this(contentView: View, width: Double) = this()
  def this(context: Context, styleAttr: Map[String, String]) = this()
  def this(contentView: View, width: js.UndefOr[scala.Nothing], height: Double) = this()
  def this(contentView: View, width: Double, height: Double) = this()
  def this(
    contentView: View,
    width: js.UndefOr[scala.Nothing],
    height: js.UndefOr[scala.Nothing],
    focusable: Boolean
  ) = this()
  def this(contentView: View, width: js.UndefOr[scala.Nothing], height: Double, focusable: Boolean) = this()
  def this(contentView: View, width: Double, height: js.UndefOr[scala.Nothing], focusable: Boolean) = this()
  def this(contentView: View, width: Double, height: Double, focusable: Boolean) = this()
}
/* static members */
@JSGlobal("android.widget.PopupWindow")
@js.native
object PopupWindow extends js.Object {
  
  var DEFAULT_ANCHORED_GRAVITY: js.Any = js.native
  
  var INPUT_METHOD_FROM_FOCUSABLE: Double = js.native
  
  var INPUT_METHOD_NEEDED: Double = js.native
  
  var INPUT_METHOD_NOT_NEEDED: Double = js.native
}
