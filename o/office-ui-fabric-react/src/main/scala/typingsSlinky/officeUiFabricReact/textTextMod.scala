package typingsSlinky.officeUiFabricReact

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.textTypesMod.ITextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textTextMod extends Shortcut {
  
  @JSImport("office-ui-fabric-react/lib/components/Text/Text", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ITextProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Text/Text", "Text")
  @js.native
  val Text: ReactComponentClass[ITextProps] = js.native
  
  type _To = ReactComponentClass[ITextProps]
  
  /* This means you don't have to write `default`, but can instead just say `textTextMod.foo` */
  override def _to: ReactComponentClass[ITextProps] = default
}
