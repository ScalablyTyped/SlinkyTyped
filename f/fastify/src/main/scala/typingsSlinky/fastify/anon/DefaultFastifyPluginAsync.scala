package typingsSlinky.fastify.anon

import typingsSlinky.fastify.instanceMod.FastifyInstance
import typingsSlinky.fastify.loggerMod.FastifyLoggerInstance
import typingsSlinky.fastify.pluginMod.FastifyPluginAsync
import typingsSlinky.fastify.pluginMod.FastifyPluginOptions
import typingsSlinky.fastify.utilsMod.RawReplyDefaultExpression
import typingsSlinky.fastify.utilsMod.RawRequestDefaultExpression
import typingsSlinky.fastify.utilsMod.RawServerDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultFastifyPluginAsync[Options /* <: FastifyPluginOptions */] extends js.Object {
  
  def default(
    instance: FastifyInstance[
      RawServerDefault, 
      RawRequestDefaultExpression[RawServerDefault], 
      RawReplyDefaultExpression[RawServerDefault], 
      FastifyLoggerInstance
    ],
    opts: Options
  ): js.Promise[Unit] = js.native
  @JSName("default")
  var default_Original: FastifyPluginAsync[Options, RawServerDefault] = js.native
}
