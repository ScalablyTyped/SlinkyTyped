package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.materialUiCore.materialUiCoreStrings.body
import typingsSlinky.materialUiCore.materialUiCoreStrings.footer
import typingsSlinky.materialUiCore.materialUiCoreStrings.head
import typingsSlinky.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tablelvl2ContextMod extends Shortcut {
  
  @JSImport("@material-ui/core/Table/Tablelvl2Context", JSImport.Default)
  @js.native
  val default: Context[js.UndefOr[Tablelvl2ContextProps]] = js.native
  
  @js.native
  trait Tablelvl2ContextProps extends StObject {
    
    var variant: head | body | footer = js.native
  }
  object Tablelvl2ContextProps {
    
    @scala.inline
    def apply(variant: head | body | footer): Tablelvl2ContextProps = {
      val __obj = js.Dynamic.literal(variant = variant.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tablelvl2ContextProps]
    }
    
    @scala.inline
    implicit class Tablelvl2ContextPropsMutableBuilder[Self <: Tablelvl2ContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVariant(value: head | body | footer): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Context[js.UndefOr[Tablelvl2ContextProps]]
  
  /* This means you don't have to write `default`, but can instead just say `tablelvl2ContextMod.foo` */
  override def _to: Context[js.UndefOr[Tablelvl2ContextProps]] = default
}
