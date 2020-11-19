package typingsSlinky.lodashDecorators

import typingsSlinky.lodashDecorators.applicatorsMod.Applicator
import typingsSlinky.lodashDecorators.commonMod.InstanceChainData
import typingsSlinky.lodashDecorators.decoratorConfigMod.DecoratorConfigOptions
import typingsSlinky.lodashDecorators.utilsMod.CompositeKeyWeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("lodash-decorators/factory", JSImport.Namespace)
@js.native
object factoryMod extends js.Object {
  
  val DecoratorFactory: typingsSlinky.lodashDecorators.decoratorFactoryMod.InternalDecoratorFactory = js.native
  
  val InstanceChainMap: CompositeKeyWeakMap[InstanceChainData] = js.native
  
  @js.native
  class DecoratorConfig protected ()
    extends typingsSlinky.lodashDecorators.decoratorConfigMod.DecoratorConfig {
    def this(execute: js.Function, applicator: Applicator) = this()
    def this(execute: js.Function, applicator: Applicator, options: DecoratorConfigOptions) = this()
  }
  
  @js.native
  class InternalDecoratorFactory ()
    extends typingsSlinky.lodashDecorators.decoratorFactoryMod.InternalDecoratorFactory
}
