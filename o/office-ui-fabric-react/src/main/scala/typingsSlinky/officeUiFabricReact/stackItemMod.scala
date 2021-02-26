package typingsSlinky.officeUiFabricReact

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.stackItemTypesMod.IStackItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackItemMod extends Shortcut {
  
  @JSImport("office-ui-fabric-react/lib/components/Stack/StackItem/StackItem", JSImport.Default)
  @js.native
  val default: ReactComponentClass[IStackItemProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Stack/StackItem/StackItem", "StackItem")
  @js.native
  val StackItem: ReactComponentClass[IStackItemProps] = js.native
  
  type _To = ReactComponentClass[IStackItemProps]
  
  /* This means you don't have to write `default`, but can instead just say `stackItemMod.foo` */
  override def _to: ReactComponentClass[IStackItemProps] = default
}
