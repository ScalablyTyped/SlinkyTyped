package typingsSlinky.lodashDashDecorators

import typingsSlinky.lodashDashDecorators.applicatorsMod.Applicator
import typingsSlinky.lodashDashDecorators.factoryCommonMod.InstanceChainData
import typingsSlinky.lodashDashDecorators.factoryDecoratorConfigMod.DecoratorConfigOptions
import typingsSlinky.lodashDashDecorators.utilsMod.CompositeKeyWeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lodash-decorators/factory", JSImport.Namespace)
@js.native
object factoryMod extends js.Object {
  @js.native
  class DecoratorConfig protected ()
    extends typingsSlinky.lodashDashDecorators.factoryDecoratorConfigMod.DecoratorConfig {
    def this(execute: js.Function, applicator: Applicator) = this()
    def this(execute: js.Function, applicator: Applicator, options: DecoratorConfigOptions) = this()
  }
  
  @js.native
  class InternalDecoratorFactory ()
    extends typingsSlinky.lodashDashDecorators.factoryDecoratorFactoryMod.InternalDecoratorFactory
  
  val DecoratorFactory: typingsSlinky.lodashDashDecorators.factoryDecoratorFactoryMod.InternalDecoratorFactory = js.native
  val InstanceChainMap: CompositeKeyWeakMap[InstanceChainData] = js.native
}

