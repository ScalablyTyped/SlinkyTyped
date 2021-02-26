package typingsSlinky.fastifyPlugin

import typingsSlinky.fastify.pluginMod.FastifyPluginAsync
import typingsSlinky.fastify.pluginMod.FastifyPluginCallback
import typingsSlinky.fastify.utilsMod.RawServerDefault
import typingsSlinky.fastifyPlugin.anon.Fastify
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fastify-plugin", JSImport.Default)
  @js.native
  def default[Options](fn: FastifyPluginAsync[Options, RawServerDefault]): FastifyPluginAsync[Options, RawServerDefault] = js.native
  @JSImport("fastify-plugin", JSImport.Default)
  @js.native
  def default[Options](fn: FastifyPluginAsync[Options, RawServerDefault], options: String): FastifyPluginAsync[Options, RawServerDefault] = js.native
  @JSImport("fastify-plugin", JSImport.Default)
  @js.native
  def default[Options](fn: FastifyPluginAsync[Options, RawServerDefault], options: PluginMetadata): FastifyPluginAsync[Options, RawServerDefault] = js.native
  @JSImport("fastify-plugin", JSImport.Default)
  @js.native
  def default[Options](fn: FastifyPluginCallback[Options, RawServerDefault]): FastifyPluginCallback[Options, RawServerDefault] = js.native
  @JSImport("fastify-plugin", JSImport.Default)
  @js.native
  def default[Options](fn: FastifyPluginCallback[Options, RawServerDefault], options: String): FastifyPluginCallback[Options, RawServerDefault] = js.native
  @JSImport("fastify-plugin", JSImport.Default)
  @js.native
  def default[Options](fn: FastifyPluginCallback[Options, RawServerDefault], options: PluginMetadata): FastifyPluginCallback[Options, RawServerDefault] = js.native
  
  @js.native
  trait PluginMetadata extends StObject {
    
    /** Decorator dependencies for this plugin */
    var decorators: js.UndefOr[Fastify] = js.native
    
    /** The plugin dependencies */
    var dependencies: js.UndefOr[js.Array[String]] = js.native
    
    /** Bare-minimum version of Fastify for your plugin, just add the semver range that you need. */
    var fastify: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
  }
  object PluginMetadata {
    
    @scala.inline
    def apply(): PluginMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginMetadata]
    }
    
    @scala.inline
    implicit class PluginMetadataMutableBuilder[Self <: PluginMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecorators(value: Fastify): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecoratorsUndefined: Self = StObject.set(x, "decorators", js.undefined)
      
      @scala.inline
      def setDependencies(value: js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      @scala.inline
      def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value :_*))
      
      @scala.inline
      def setFastify(value: String): Self = StObject.set(x, "fastify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFastifyUndefined: Self = StObject.set(x, "fastify", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  type PluginOptions = PluginMetadata
}
