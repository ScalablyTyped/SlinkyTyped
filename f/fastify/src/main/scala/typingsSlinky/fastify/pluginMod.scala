package typingsSlinky.fastify

import typingsSlinky.fastify.instanceMod.FastifyInstance
import typingsSlinky.fastify.loggerMod.FastifyLoggerInstance
import typingsSlinky.fastify.utilsMod.RawReplyDefaultExpression
import typingsSlinky.fastify.utilsMod.RawRequestDefaultExpression
import typingsSlinky.fastify.utilsMod.RawServerBase
import typingsSlinky.fastify.utilsMod.RawServerDefault
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginMod {
  
  type FastifyPlugin[Options /* <: FastifyPluginOptions */] = (FastifyPluginCallback[Options, RawServerDefault]) | (FastifyPluginAsync[Options, RawServerDefault])
  
  type FastifyPluginAsync[Options /* <: FastifyPluginOptions */, Server /* <: RawServerBase */] = js.Function2[
    /* instance */ FastifyInstance[
      Server, 
      RawRequestDefaultExpression[Server], 
      RawReplyDefaultExpression[Server], 
      FastifyLoggerInstance
    ], 
    /* opts */ Options, 
    js.Promise[Unit]
  ]
  
  type FastifyPluginCallback[Options /* <: FastifyPluginOptions */, Server /* <: RawServerBase */] = js.Function3[
    /* instance */ FastifyInstance[
      Server, 
      RawRequestDefaultExpression[Server], 
      RawReplyDefaultExpression[Server], 
      FastifyLoggerInstance
    ], 
    /* opts */ Options, 
    /* next */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
    Unit
  ]
  
  type FastifyPluginOptions = Record[String, js.Any]
}
