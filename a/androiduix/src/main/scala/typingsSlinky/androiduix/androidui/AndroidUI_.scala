package typingsSlinky.androiduix.androidui

import typingsSlinky.androiduix.android.graphics.Rect
import typingsSlinky.androiduix.android.view.View
import typingsSlinky.androiduix.android.view.WindowManager
import typingsSlinky.androiduix.androidui.AndroidUI.UIClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AndroidUI_ extends js.Object {
  
  var _canvas: js.Any = js.native
  
  var _viewRootImpl: js.Any = js.native
  
  var _windowBound: js.Any = js.native
  
  var androidUIElement: AndroidUIElement = js.native
  
  var appName: String = js.native
  
  /* private */ def hideDebugLayout(): js.Any = js.native
  
  /* private */ def init(): js.Any = js.native
  
  /* private */ def initAndroidUIElement(): js.Any = js.native
  
  /* private */ def initApplication(): js.Any = js.native
  
  /* private */ def initBrowserVisibleChange(): js.Any = js.native
  
  /* private */ def initEvent(): js.Any = js.native
  
  /* private */ def initGenericEvent(): js.Any = js.native
  
  /* private */ def initGlobalCrashHandle(): js.Any = js.native
  
  /* private */ def initKeyEvent(): js.Any = js.native
  
  /* private */ def initLaunchActivity(): js.Any = js.native
  
  /* private */ def initMouseEvent(): js.Any = js.native
  
  /* private */ def initRootSizeChange(): js.Any = js.native
  
  /* private */ def initTouchEvent(): js.Any = js.native
  
  var ketEvent: js.Any = js.native
  
  var mActivityThread: js.Any = js.native
  
  var mApplication: js.Any = js.native
  
  /* private */ def notifyRootSizeChange(): js.Any = js.native
  
  /* private */ def refreshWindowBound(): js.Any = js.native
  
  def setDebugEnable(): Unit = js.native
  def setDebugEnable(enable: Boolean): Unit = js.native
  
  def setShowDebugLayout(): Unit = js.native
  def setShowDebugLayout(showDebugLayoutDefault: Boolean): Unit = js.native
  
  def setUIClient(uiClient: UIClient): Unit = js.native
  
  def showAppClosed(): Unit = js.native
  
  /* private */ def showDebugLayout(): js.Any = js.native
  
  var showDebugLayoutDefault: js.Any = js.native
  
  var tempRect: js.Any = js.native
  
  var touchEvent: js.Any = js.native
  
  var uiClient: js.Any = js.native
  
  def viewAttachedDependOnDebugLayout(view: View): Unit = js.native
  
  def viewDetachedDependOnDebugLayout(view: View): Unit = js.native
  
  var viewsDependOnDebugLayout: js.Any = js.native
  
  val windowBound: Rect = js.native
  
  val windowManager: WindowManager = js.native
}
