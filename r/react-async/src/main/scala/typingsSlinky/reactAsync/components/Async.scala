package typingsSlinky.reactAsync.components

import typingsSlinky.reactAsync.mod.AsyncCls
import typingsSlinky.reactAsync.mod.AsyncProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Async {
  
  @scala.inline
  def apply[T](): SharedBuilder_AsyncProps2092416102[AsyncCls[T], T] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_AsyncProps2092416102[AsyncCls[T], T](js.Array(this.component, __props.asInstanceOf[AsyncProps[T]]))
  }
  
  @JSImport("react-async", "Async")
  @js.native
  val component: js.Object = js.native
  
  implicit def make[T](companion: Async.type): SharedBuilder_AsyncProps2092416102[AsyncCls[T], T] = new SharedBuilder_AsyncProps2092416102[AsyncCls[T], T](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[T](p: AsyncProps[T]): SharedBuilder_AsyncProps2092416102[AsyncCls[T], T] = new SharedBuilder_AsyncProps2092416102[AsyncCls[T], T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
