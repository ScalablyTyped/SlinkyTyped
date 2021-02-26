package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.zoomZoomMod.ZoomProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zoomMod extends Shortcut {
  
  @JSImport("@material-ui/core/Zoom", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ZoomProps] = js.native
  
  type _To = ReactComponentClass[ZoomProps]
  
  /* This means you don't have to write `default`, but can instead just say `zoomMod.foo` */
  override def _to: ReactComponentClass[ZoomProps] = default
}
