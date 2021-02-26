package typingsSlinky.mobx

import typingsSlinky.mobx.anon.Configurable
import typingsSlinky.mobx.anon.Enumerable
import typingsSlinky.mobx.anon.Get
import typingsSlinky.mobx.anon.Set
import typingsSlinky.mobx.decoratorsMod.BabelDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actiondecoratorMod {
  
  @JSImport("mobx/lib/api/actiondecorator", "actionFieldDecorator")
  @js.native
  def actionFieldDecorator(name: String): js.Function3[/* target */ js.Any, /* prop */ js.Any, /* descriptor */ js.Any, Unit] = js.native
  
  @JSImport("mobx/lib/api/actiondecorator", "boundActionDecorator")
  @js.native
  def boundActionDecorator(target: js.Any, propertyName: js.Any, descriptor: js.Any): Get | Set | Null = js.native
  @JSImport("mobx/lib/api/actiondecorator", "boundActionDecorator")
  @js.native
  def boundActionDecorator(target: js.Any, propertyName: js.Any, descriptor: js.Any, applyToInstance: Boolean): Get | Set | Null = js.native
  
  @JSImport("mobx/lib/api/actiondecorator", "namedActionDecorator")
  @js.native
  def namedActionDecorator(name: String): js.Function3[
    /* target */ js.Any, 
    /* prop */ js.Any, 
    /* descriptor */ BabelDescriptor, 
    Unit | Configurable | Enumerable
  ] = js.native
}
