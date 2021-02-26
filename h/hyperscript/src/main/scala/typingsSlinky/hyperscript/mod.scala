package typingsSlinky.hyperscript

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("hyperscript", JSImport.Namespace)
  @js.native
  val ^ : HyperScript = js.native
  
  @js.native
  trait HyperScript extends StObject {
    
    def apply[T /* <: /* keyof hyperscript.anon.ElementTagNameMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 172 */ js.Any */](tagName: T, attrs: js.UndefOr[scala.Nothing], children: js.Any*): /* import warning: importer.ImportType#apply Failed type conversion: hyperscript.anon.ElementTagNameMap[T] */ js.Any = js.native
    /** Creates an Element */
    def apply[T /* <: /* keyof hyperscript.anon.ElementTagNameMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 172 */ js.Any */](tagName: T, attrs: js.Object, children: js.Any*): /* import warning: importer.ImportType#apply Failed type conversion: hyperscript.anon.ElementTagNameMap[T] */ js.Any = js.native
    def apply[T /* <: Element */](tagName: String, attrs: js.UndefOr[scala.Nothing], children: js.Any*): T = js.native
    def apply[T /* <: Element */](tagName: String, attrs: js.Object, children: js.Any*): T = js.native
    
    /** Cleans up any event handlers created by this hyperscript context */
    def cleanup(): Unit = js.native
    
    /** Creates a new hyperscript context */
    def context(): HyperScript = js.native
  }
  
  type _To = HyperScript
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: HyperScript = ^
}
