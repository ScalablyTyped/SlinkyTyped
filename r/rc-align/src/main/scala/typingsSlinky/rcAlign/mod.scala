package typingsSlinky.rcAlign

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.rcAlign.alignMod.AlignProps
import typingsSlinky.rcAlign.alignMod.RefAlign
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rc-align", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[AlignProps with RefAttributes[RefAlign]] = js.native
  
  type _To = ForwardRefExoticComponent[AlignProps with RefAttributes[RefAlign]]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ForwardRefExoticComponent[AlignProps with RefAttributes[RefAlign]] = default
}
