package typingsSlinky.lodashDecorators

import typingsSlinky.lodashDecorators.commonMod.LodashDecorator
import typingsSlinky.lodashDecorators.decoratorConfigMod.DecoratorConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decoratorFactoryMod {
  
  @JSImport("lodash-decorators/factory/DecoratorFactory", "DecoratorFactory")
  @js.native
  val DecoratorFactory: InternalDecoratorFactory = js.native
  
  @JSImport("lodash-decorators/factory/DecoratorFactory", "InternalDecoratorFactory")
  @js.native
  class InternalDecoratorFactory () extends StObject {
    
    /* private */ def _isApplicable(context: js.Any, config: js.Any): js.Any = js.native
    
    /* private */ def _resolveDescriptor(target: js.Any, name: js.Any, descriptor: js.Any): js.Any = js.native
    
    def createDecorator(config: DecoratorConfig): GenericDecorator = js.native
    
    def createInstanceDecorator(config: DecoratorConfig): GenericDecorator = js.native
  }
  
  type GenericDecorator = js.Function1[/* repeated */ js.Any, LodashDecorator]
}
