package typingsSlinky.fastifyPlugin.mod

import typingsSlinky.fastify.pluginMod.FastifyPluginAsync
import typingsSlinky.fastify.pluginMod.FastifyPluginCallback
import typingsSlinky.fastify.utilsMod.RawServerDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fastify-plugin", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply[Options](fn: FastifyPluginAsync[Options, RawServerDefault]): FastifyPluginAsync[Options, RawServerDefault] = js.native
  def apply[Options](fn: FastifyPluginAsync[Options, RawServerDefault], options: String): FastifyPluginAsync[Options, RawServerDefault] = js.native
  def apply[Options](fn: FastifyPluginAsync[Options, RawServerDefault], options: PluginMetadata): FastifyPluginAsync[Options, RawServerDefault] = js.native
  def apply[Options](fn: FastifyPluginCallback[Options, RawServerDefault]): FastifyPluginCallback[Options, RawServerDefault] = js.native
  def apply[Options](fn: FastifyPluginCallback[Options, RawServerDefault], options: String): FastifyPluginCallback[Options, RawServerDefault] = js.native
  def apply[Options](fn: FastifyPluginCallback[Options, RawServerDefault], options: PluginMetadata): FastifyPluginCallback[Options, RawServerDefault] = js.native
}
