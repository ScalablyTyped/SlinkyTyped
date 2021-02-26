package typingsSlinky.ink

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spacerMod extends Shortcut {
  
  /**
    * A flexible space that expands along the major axis of its containing layout.
    * It's useful as a shortcut for filling all the available spaces between elements.
    */
  @JSImport("ink/build/components/Spacer", JSImport.Default)
  @js.native
  val default: ReactComponentClass[js.Object] = js.native
  
  type _To = ReactComponentClass[js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `spacerMod.foo` */
  override def _to: ReactComponentClass[js.Object] = default
}
