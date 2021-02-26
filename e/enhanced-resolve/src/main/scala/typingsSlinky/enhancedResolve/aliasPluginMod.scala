package typingsSlinky.enhancedResolve

import typingsSlinky.enhancedResolve.mod.ResolverFactory.AliasItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aliasPluginMod {
  
  @JSImport("enhanced-resolve/lib/AliasPlugin", JSImport.Namespace)
  @js.native
  class ^ protected () extends AliasPlugin {
    def this(source: String, options: AliasItem, target: String) = this()
  }
  
  @js.native
  trait AliasPlugin extends StObject {
    
    var alias: String = js.native
    
    @JSName("apply")
    def apply(resolver: typingsSlinky.enhancedResolve.resolverMod.^): Unit = js.native
    
    var name: String = js.native
    
    var onlyModule: Boolean = js.native
    
    var options: AliasItem = js.native
    
    var source: String = js.native
    
    var target: String = js.native
  }
  object AliasPlugin {
    
    @scala.inline
    def apply(
      alias: String,
      apply: typingsSlinky.enhancedResolve.resolverMod.^ => Unit,
      name: String,
      onlyModule: Boolean,
      options: AliasItem,
      source: String,
      target: String
    ): AliasPlugin = {
      val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], apply = js.Any.fromFunction1(apply), name = name.asInstanceOf[js.Any], onlyModule = onlyModule.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[AliasPlugin]
    }
    
    @scala.inline
    implicit class AliasPluginMutableBuilder[Self <: AliasPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApply(value: typingsSlinky.enhancedResolve.resolverMod.^ => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyModule(value: Boolean): Self = StObject.set(x, "onlyModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: AliasItem): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
