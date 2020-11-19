package typingsSlinky.androiduix.android.app

import typingsSlinky.androiduix.android.graphics.drawable.Drawable
import typingsSlinky.androiduix.android.view.View
import typingsSlinky.androiduix.android.view.View.OnClickListener
import typingsSlinky.androiduix.android.view.ViewGroup.MarginLayoutParams
import typingsSlinky.androiduix.android.widget.FrameLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionBar extends FrameLayout {
  
  def getCustomView(): View = js.native
  
  def getSubtitle(): String = js.native
  
  def getTitle(): String = js.native
  
  def hide(): Unit = js.native
  
  def hideActionLeft(): Unit = js.native
  
  def hideActionRight(): Unit = js.native
  
  def isShowing(): Boolean = js.native
  
  var mActionLeft: js.Any = js.native
  
  var mActionRight: js.Any = js.native
  
  var mCenterLayout: js.Any = js.native
  
  var mCustomView: js.Any = js.native
  
  var mSubTitleView: js.Any = js.native
  
  var mTitleView: js.Any = js.native
  
  def setActionLeft(name: String, icon: Drawable, listener: OnClickListener): Unit = js.native
  
  def setActionRight(name: String, icon: Drawable, listener: OnClickListener): Unit = js.native
  
  def setCustomView(view: View): Unit = js.native
  def setCustomView(view: View, layoutParams: MarginLayoutParams): Unit = js.native
  
  def setIcon(icon: Drawable): Unit = js.native
  
  def setLogo(logo: Drawable): Unit = js.native
  
  def setSubtitle(subtitle: String): Unit = js.native
  
  def setTitle(title: String): Unit = js.native
  
  def show(): Unit = js.native
}
