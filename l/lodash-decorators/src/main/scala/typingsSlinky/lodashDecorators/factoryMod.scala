package typingsSlinky.lodashDecorators

import typingsSlinky.lodashDecorators.applicatorsMod.Applicator
import typingsSlinky.lodashDecorators.commonMod.InstanceChainData
import typingsSlinky.lodashDecorators.decoratorConfigMod.DecoratorConfigOptions
import typingsSlinky.lodashDecorators.utilsMod.CompositeKeyWeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoryMod {
  
  @JSImport("lodash-decorators/factory", "DecoratorConfig")
  @js.native
  class DecoratorConfig protected ()
    extends typingsSlinky.lodashDecorators.decoratorConfigMod.DecoratorConfig {
    def this(execute: js.Function, applicator: Applicator) = this()
    def this(execute: js.Function, applicator: Applicator, options: DecoratorConfigOptions) = this()
  }
  
  @JSImport("lodash-decorators/factory", "DecoratorFactory")
  @js.native
  val DecoratorFactory: typingsSlinky.lodashDecorators.decoratorFactoryMod.InternalDecoratorFactory = js.native
  
  @JSImport("lodash-decorators/factory", "InstanceChainMap")
  @js.native
  val InstanceChainMap: CompositeKeyWeakMap[InstanceChainData] = js.native
  
  @JSImport("lodash-decorators/factory", "InternalDecoratorFactory")
  @js.native
  class InternalDecoratorFactory ()
    extends typingsSlinky.lodashDecorators.decoratorFactoryMod.InternalDecoratorFactory
}
