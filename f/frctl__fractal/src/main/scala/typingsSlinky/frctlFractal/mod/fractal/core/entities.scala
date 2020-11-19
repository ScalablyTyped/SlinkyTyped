package typingsSlinky.frctlFractal.mod.fractal.core

import typingsSlinky.frctlFractal.anon.Register
import typingsSlinky.frctlFractal.frctlFractalBooleans.`true`
import typingsSlinky.frctlFractal.mod.Adapter
import typingsSlinky.frctlFractal.mod.fractal.core.mixins.Collection
import typingsSlinky.frctlFractal.mod.fractal.core.mixins.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@frctl/fractal", "fractal.core.entities")
@js.native
object entities extends js.Object {
  
  @js.native
  abstract class Entity ()
    extends typingsSlinky.frctlFractal.mod.fractal.core.mixins.Entity {
    
    def getContext(): js.Any = js.native
    
    def getResolvedContext(): js.Any = js.native
    
    def hasContext(): js.Promise[Boolean] = js.native
    
    val isCollection: js.UndefOr[`true`] = js.native
    
    val isComponent: js.UndefOr[`true`] = js.native
    
    val isDoc: js.UndefOr[`true`] = js.native
    
    val isVariant: js.UndefOr[`true`] = js.native
    
    def setContext(data: js.Any): Unit = js.native
    
    val status: StatusInfo = js.native
  }
  
  @js.native
  trait EntityCollection[T /* <: Entity */]
    extends typingsSlinky.frctlFractal.mod.fractal.core.mixins.Entity
       with Collection[T] {
    
    val entities: this.type = js.native
    
    /* InferMemberOverrides */
    override def toJSON(): js.Object = js.native
  }
  
  @js.native
  trait EntitySource[T /* <: Entity */, TConfig] extends Source[T, TConfig] {
    
    def engine[TEngine](): Adapter[TEngine] = js.native
    def engine[TEngine](adapterFactory: String): Adapter[TEngine] = js.native
    def engine[TEngine](adapterFactory: js.Function0[Register[T, TEngine]]): Adapter[TEngine] = js.native
    def engine[TEngine](adapterFactory: Register[T, TEngine]): Adapter[TEngine] = js.native
    
    def entities(): js.Array[T] = js.native
    
    def getProp(key: String): String | js.Object = js.native
    
    def statusInfo(handle: String): StatusInfo | Null = js.native
  }
}
