package typingsSlinky.reactContentLoader

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.reactContentLoader.mod.IContentLoaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object facebookStyleMod extends Shortcut {
  
  @JSImport("react-content-loader/dist/web/presets/FacebookStyle", JSImport.Default)
  @js.native
  val default: ReactComponentClass[IContentLoaderProps] = js.native
  
  type _To = ReactComponentClass[IContentLoaderProps]
  
  /* This means you don't have to write `default`, but can instead just say `facebookStyleMod.foo` */
  override def _to: ReactComponentClass[IContentLoaderProps] = default
}
