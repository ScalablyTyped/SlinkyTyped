package typingsSlinky.lodashDecorators

import typingsSlinky.lodashDecorators.commonMod.LodashDecorator
import typingsSlinky.lodashDecorators.decoratorConfigMod.DecoratorConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("lodash-decorators/factory/DecoratorFactory", JSImport.Namespace)
@js.native
object decoratorFactoryMod extends js.Object {
  
  val DecoratorFactory: InternalDecoratorFactory = js.native
  
  @js.native
  class InternalDecoratorFactory () extends js.Object {
    
    /* private */ def _isApplicable(context: js.Any, config: js.Any): js.Any = js.native
    
    /* private */ def _resolveDescriptor(target: js.Any, name: js.Any, descriptor: js.Any): js.Any = js.native
    
    def createDecorator(config: DecoratorConfig): GenericDecorator = js.native
    
    def createInstanceDecorator(config: DecoratorConfig): GenericDecorator = js.native
  }
  
  type GenericDecorator = js.Function1[/* repeated */ js.Any, LodashDecorator]
}
