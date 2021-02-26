package typingsSlinky.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelayProfiler extends StObject {
  
  def attachAggregateHandler(name: String, handler: js.Function2[/* name */ String, /* callback */ js.Function0[Unit], Unit]): Unit = js.native
  
  def attachProfileHandler(
    name: String,
    handler: js.Function2[/* name */ String, /* state */ js.UndefOr[js.Any], js.Function0[Unit]]
  ): Unit = js.native
}
object RelayProfiler {
  
  @scala.inline
  def apply(
    attachAggregateHandler: (String, js.Function2[/* name */ String, /* callback */ js.Function0[Unit], Unit]) => Unit,
    attachProfileHandler: (String, js.Function2[/* name */ String, /* state */ js.UndefOr[js.Any], js.Function0[Unit]]) => Unit
  ): RelayProfiler = {
    val __obj = js.Dynamic.literal(attachAggregateHandler = js.Any.fromFunction2(attachAggregateHandler), attachProfileHandler = js.Any.fromFunction2(attachProfileHandler))
    __obj.asInstanceOf[RelayProfiler]
  }
  
  @scala.inline
  implicit class RelayProfilerMutableBuilder[Self <: RelayProfiler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachAggregateHandler(value: (String, js.Function2[/* name */ String, /* callback */ js.Function0[Unit], Unit]) => Unit): Self = StObject.set(x, "attachAggregateHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAttachProfileHandler(
      value: (String, js.Function2[/* name */ String, /* state */ js.UndefOr[js.Any], js.Function0[Unit]]) => Unit
    ): Self = StObject.set(x, "attachProfileHandler", js.Any.fromFunction2(value))
  }
}
