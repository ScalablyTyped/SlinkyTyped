package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.nativeSelectNativeSelectMod.NativeSelectProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeSelectMod extends Shortcut {
  
  @JSImport("@material-ui/core/NativeSelect", JSImport.Default)
  @js.native
  val default: ReactComponentClass[NativeSelectProps] = js.native
  
  type _To = ReactComponentClass[NativeSelectProps]
  
  /* This means you don't have to write `default`, but can instead just say `nativeSelectMod.foo` */
  override def _to: ReactComponentClass[NativeSelectProps] = default
}
