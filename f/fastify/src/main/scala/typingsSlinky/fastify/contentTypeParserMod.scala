package typingsSlinky.fastify

import typingsSlinky.fastify.anon.BodyLimit
import typingsSlinky.fastify.anon.ParseAs
import typingsSlinky.fastify.requestMod.FastifyRequest
import typingsSlinky.fastify.routeMod.RouteGenericInterface
import typingsSlinky.fastify.utilsMod.RawRequestDefaultExpression
import typingsSlinky.fastify.utilsMod.RawServerBase
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fastify/types/content-type-parser", JSImport.Namespace)
@js.native
object contentTypeParserMod extends js.Object {
  
  @js.native
  trait AddContentTypeParser[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */] extends js.Object {
    
    def apply(
      contentType: String,
      opts: BodyLimit,
      parser: FastifyContentTypeParser[RawServer, RawRequest, RouteGenericInterface]
    ): Unit = js.native
    def apply(
      contentType: String,
      parser: FastifyContentTypeParser[RawServer, RawRequest, RouteGenericInterface]
    ): Unit = js.native
    def apply(
      contentType: js.Array[String],
      opts: BodyLimit,
      parser: FastifyContentTypeParser[RawServer, RawRequest, RouteGenericInterface]
    ): Unit = js.native
    def apply(
      contentType: js.Array[String],
      parser: FastifyContentTypeParser[RawServer, RawRequest, RouteGenericInterface]
    ): Unit = js.native
    def apply[parseAs /* <: String | Buffer */](
      contentType: String,
      opts: ParseAs[parseAs],
      parser: FastifyBodyParser[parseAs, RawServer, RawRequest, RouteGenericInterface]
    ): Unit = js.native
    def apply[parseAs /* <: String | Buffer */](
      contentType: js.Array[String],
      opts: ParseAs[parseAs],
      parser: FastifyBodyParser[parseAs, RawServer, RawRequest, RouteGenericInterface]
    ): Unit = js.native
  }
  
  type ContentTypeParserDoneFunction = js.Function2[/* err */ js.Error | Null, /* body */ js.UndefOr[js.Any], Unit]
  
  type FastifyBodyParser[RawBody /* <: String | Buffer */, RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */] = (js.Function3[
    /* request */ FastifyRequest[RouteGeneric, RawServer, RawRequest], 
    /* rawBody */ RawBody, 
    /* done */ ContentTypeParserDoneFunction, 
    Unit
  ]) | (js.Function2[
    /* request */ FastifyRequest[RouteGeneric, RawServer, RawRequest], 
    /* rawBody */ RawBody, 
    js.Promise[js.Any]
  ])
  
  type FastifyContentTypeParser[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */] = (js.Function2[
    /* request */ FastifyRequest[RouteGeneric, RawServer, RawRequest], 
    /* payload */ RawRequest, 
    js.Promise[js.Any]
  ]) | (js.Function3[
    /* request */ FastifyRequest[RouteGeneric, RawServer, RawRequest], 
    /* payload */ RawRequest, 
    /* done */ ContentTypeParserDoneFunction, 
    Unit
  ])
  
  type hasContentTypeParser = js.Function1[/* contentType */ String, Boolean]
}
