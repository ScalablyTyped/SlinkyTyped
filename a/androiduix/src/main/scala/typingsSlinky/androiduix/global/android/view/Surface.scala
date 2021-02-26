package typingsSlinky.androiduix.global.android.view

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.view.Surface")
@js.native
class Surface protected ()
  extends typingsSlinky.androiduix.android.view.Surface {
  def this(canvasElement: HTMLCanvasElement, viewRoot: typingsSlinky.androiduix.android.view.ViewRootImpl) = this()
}
object Surface {
  
  @JSGlobal("android.view.Surface")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("android.view.Surface.DrawToCacheFirstMode")
  @js.native
  def DrawToCacheFirstMode: Boolean = js.native
  @scala.inline
  def DrawToCacheFirstMode_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DrawToCacheFirstMode")(x.asInstanceOf[js.Any])
}
