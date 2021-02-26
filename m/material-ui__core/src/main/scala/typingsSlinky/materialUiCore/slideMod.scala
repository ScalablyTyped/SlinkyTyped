package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.slideSlideMod.SlideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slideMod extends Shortcut {
  
  @JSImport("@material-ui/core/Slide", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SlideProps] = js.native
  
  type _To = ReactComponentClass[SlideProps]
  
  /* This means you don't have to write `default`, but can instead just say `slideMod.foo` */
  override def _to: ReactComponentClass[SlideProps] = default
}
