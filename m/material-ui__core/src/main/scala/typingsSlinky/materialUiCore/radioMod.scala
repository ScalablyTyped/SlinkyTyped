package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.radioRadioMod.RadioProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioMod extends Shortcut {
  
  @JSImport("@material-ui/core/Radio", JSImport.Default)
  @js.native
  val default: ReactComponentClass[RadioProps] = js.native
  
  type _To = ReactComponentClass[RadioProps]
  
  /* This means you don't have to write `default`, but can instead just say `radioMod.foo` */
  override def _to: ReactComponentClass[RadioProps] = default
}
