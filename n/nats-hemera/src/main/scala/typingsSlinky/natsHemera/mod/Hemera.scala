package typingsSlinky.natsHemera.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.natsHemera.natsHemeraStrings.onAct
import typingsSlinky.natsHemera.natsHemeraStrings.onActFinished
import typingsSlinky.natsHemera.natsHemeraStrings.onAdd
import typingsSlinky.natsHemera.natsHemeraStrings.onClose
import typingsSlinky.natsHemera.natsHemeraStrings.onError
import typingsSlinky.natsHemera.natsHemeraStrings.onRequest
import typingsSlinky.natsHemera.natsHemeraStrings.onResponse
import typingsSlinky.natsHemera.natsHemeraStrings.onSend
import typingsSlinky.natsHemera.natsHemeraStrings.preHandler
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hemera[Request, Response] extends js.Object {
  
  // act
  def act(pattern: String, handler: ActHandler): Unit = js.native
  def act(pattern: ClientPattern, handler: ActHandler): Unit = js.native
  def act[T](pattern: String): js.Promise[ActPromiseResult[T]] = js.native
  def act[T](pattern: ClientPattern): js.Promise[ActPromiseResult[T]] = js.native
  
  def add(pattern: String): AddDefinition = js.native
  def add(
    pattern: String,
    handler: js.ThisFunction1[
      /* this */ Hemera[ServerRequest, ServerResponse], 
      /* request */ ServerPattern, 
      js.Promise[_]
    ]
  ): AddDefinition = js.native
  // add
  def add(
    pattern: String,
    handler: js.ThisFunction2[
      /* this */ Hemera[ServerRequest, ServerResponse], 
      /* request */ ServerPattern, 
      /* callback */ NodeCallback, 
      Unit
    ]
  ): AddDefinition = js.native
  def add(pattern: ServerPattern): AddDefinition = js.native
  def add(
    pattern: ServerPattern,
    handler: js.ThisFunction1[
      /* this */ Hemera[ServerRequest, ServerResponse], 
      /* request */ ServerPattern, 
      js.Promise[_]
    ]
  ): AddDefinition = js.native
  def add(
    pattern: ServerPattern,
    handler: js.ThisFunction2[
      /* this */ Hemera[ServerRequest, ServerResponse], 
      /* request */ ServerPattern, 
      /* callback */ NodeCallback, 
      Unit
    ]
  ): AddDefinition = js.native
  
  @JSName("auth$")
  var auth$: js.Any = js.native
  
  def checkPluginDependencies(plugin: Plugin): Unit = js.native
  
  def close(): js.Promise[Unit] = js.native
  def close(closeListener: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
  
  var config: Config = js.native
  
  @JSName("context$")
  var context$: js.Any = js.native
  
  def createError(name: String): js.Any = js.native
  
  def decorate(name: String, decoration: js.Any): Hemera[NoContext, NoContext] = js.native
  def decorate(name: String, decoration: js.Any, dependencies: js.Array[String]): Hemera[NoContext, NoContext] = js.native
  
  @JSName("delegate$")
  var delegate$: js.Any = js.native
  
  var errors: StringDictionary[js.Error] = js.native
  
  def expose(name: String, exposition: js.Any): Hemera[NoContext, NoContext] = js.native
  def expose(name: String, exposition: js.Any, dependencies: js.Array[String]): Hemera[NoContext, NoContext] = js.native
  
  @JSName("ext")
  def ext_onAct(
    name: onAct,
    handler: js.Function1[/* instance */ Hemera[ClientRequest, ClientResponse], js.Promise[Unit]]
  ): Hemera[ClientRequest, ClientResponse] = js.native
  // client extensions
  @JSName("ext")
  def ext_onAct(
    name: onAct,
    handler: js.Function2[/* instance */ Hemera[ClientRequest, ClientResponse], /* next */ NodeCallback, Unit]
  ): Hemera[ClientRequest, ClientResponse] = js.native
  @JSName("ext")
  def ext_onActFinished(
    name: onActFinished,
    handler: js.Function1[/* instance */ Hemera[ClientRequest, ClientResponse], js.Promise[Unit]]
  ): Hemera[ClientRequest, ClientResponse] = js.native
  @JSName("ext")
  def ext_onActFinished(
    name: onActFinished,
    handler: js.Function2[/* instance */ Hemera[ClientRequest, ClientResponse], /* next */ NodeCallback, Unit]
  ): Hemera[ClientRequest, ClientResponse] = js.native
  // application extensions
  @JSName("ext")
  def ext_onAdd(name: onAdd, handler: js.Function1[/* addDefinition */ AddDefinition, Unit]): Hemera[NoContext, NoContext] = js.native
  @JSName("ext")
  def ext_onClose(name: onClose): js.Promise[Unit] = js.native
  @JSName("ext")
  def ext_onClose(
    name: onClose,
    handler: js.Function2[/* instance */ Hemera[NoContext, NoContext], /* next */ NodeCallback, Unit]
  ): Hemera[NoContext, NoContext] = js.native
  @JSName("ext")
  def ext_onError(
    name: onError,
    handler: js.Function4[
      /* instance */ Hemera[ServerRequest, ServerResponse], 
      /* payload */ js.Any, 
      /* error */ js.Error, 
      /* next */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
      Unit
    ]
  ): Hemera[ServerRequest, ServerResponse] = js.native
  @JSName("ext")
  def ext_onRequest(
    name: onRequest,
    handler: js.Function3[
      /* instance */ Hemera[ServerRequest, ServerResponse], 
      /* request */ ServerRequest, 
      /* reply */ Reply, 
      js.Promise[Unit]
    ]
  ): Hemera[ServerRequest, ServerResponse] = js.native
  @JSName("ext")
  def ext_onRequest(
    name: onRequest,
    handler: js.Function4[
      /* instance */ Hemera[ServerRequest, ServerResponse], 
      /* request */ ServerRequest, 
      /* reply */ Reply, 
      /* next */ NodeCallback, 
      Unit
    ]
  ): Hemera[ServerRequest, ServerResponse] = js.native
  @JSName("ext")
  def ext_onResponse(
    name: onResponse,
    handler: js.Function2[
      /* instance */ Hemera[ServerRequest, ServerResponse], 
      /* reply */ Reply, 
      js.Promise[Unit]
    ]
  ): Hemera[ServerRequest, ServerResponse] = js.native
  @JSName("ext")
  def ext_onResponse(
    name: onResponse,
    handler: js.Function3[
      /* instance */ Hemera[ServerRequest, ServerResponse], 
      (/* payload */ js.Any) | (/* reply */ Reply), 
      (/* error */ js.Error) | (/* next */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]), 
      js.Promise[Unit] | Unit
    ]
  ): Hemera[ServerRequest, ServerResponse] = js.native
  @JSName("ext")
  def ext_onSend(
    name: onSend,
    handler: js.Function3[
      /* instance */ Hemera[ServerRequest, ServerResponse], 
      /* request */ ServerRequest, 
      /* reply */ Reply, 
      js.Promise[Unit]
    ]
  ): Hemera[ServerRequest, ServerResponse] = js.native
  @JSName("ext")
  def ext_onSend(
    name: onSend,
    handler: js.Function4[
      /* instance */ Hemera[ServerRequest, ServerResponse], 
      /* request */ ServerRequest, 
      /* reply */ Reply, 
      /* next */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
      Unit
    ]
  ): Hemera[ServerRequest, ServerResponse] = js.native
  @JSName("ext")
  def ext_preHandler(
    name: preHandler,
    handler: js.Function3[
      /* instance */ Hemera[ServerRequest, ServerResponse], 
      /* request */ ServerRequest, 
      /* reply */ Reply, 
      js.Promise[Unit]
    ]
  ): Hemera[ServerRequest, ServerResponse] = js.native
  // server extensions
  @JSName("ext")
  def ext_preHandler(
    name: preHandler,
    handler: js.Function4[
      /* instance */ Hemera[ServerRequest, ServerResponse], 
      /* request */ ServerRequest, 
      /* reply */ Reply, 
      /* next */ NodeCallback, 
      Unit
    ]
  ): Hemera[ServerRequest, ServerResponse] = js.native
  
  def fatal(): Unit = js.native
  
  def hasDecorator(name: String): Boolean = js.native
  
  def list(Pattern: js.Any, options: js.Any): js.Array[AddDefinition] = js.native
  
  /**
    * Returns the load propert from heavy instance
    * https://github.com/hapijs/heavy
    *
    * @type {*}
    * @memberof Hemera
    */
  var load: js.Any = js.native
  
  var log: typingsSlinky.pino.mod.Logger | Logger = js.native
  
  var matchedAction: AddDefinition = js.native
  
  @JSName("meta$")
  var meta$: js.Any = js.native
  
  var notFoundPattern: ServerPattern = js.native
  
  def ready(): js.Promise[Unit] = js.native
  def ready(readyListener: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  def remove(topic: String, maxMessages: Double): Boolean = js.native
  def remove(topic: Double, maxMessages: Double): Boolean = js.native
  
  def removeAll(): Unit = js.native
  
  var request: Request = js.native
  
  @JSName("request$")
  var request$: Request$ = js.native
  
  var response: Response = js.native
  
  /**
    * Returns the Bloomrun instance
    * https://github.com/mcollina/bloomrun
    *
    * @type {*}
    * @memberof Hemera
    */
  var router: js.Any = js.native
  
  def setClientDecoder(encoder: js.Function1[/* message */ String | Buffer, DecoderResult]): Hemera[NoContext, NoContext] = js.native
  
  // serialization
  def setClientEncoder(encoder: js.Function1[/* message */ js.Object | Buffer, EncoderResult]): Hemera[NoContext, NoContext] = js.native
  
  def setErrorHandler(handler: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  def setIdGenerator(generatorFunction: js.Function0[String]): Hemera[NoContext, NoContext] = js.native
  
  def setNotFoundPattern(): Unit = js.native
  def setNotFoundPattern(pattern: String): Unit = js.native
  def setNotFoundPattern(pattern: ServerPattern): Unit = js.native
  
  def setResponseSchemaCompiler(compilerFunction: js.Function1[/* schema */ js.Object, js.Function | js.Promise[_]]): Hemera[NoContext, NoContext] = js.native
  
  def setSchemaCompiler(compilerFunction: js.Function1[/* schema */ js.Object, js.Function | js.Promise[_]]): Hemera[NoContext, NoContext] = js.native
  
  def setServerDecoder(encoder: js.Function1[/* message */ String | Buffer, DecoderResult]): Hemera[NoContext, NoContext] = js.native
  
  def setServerEncoder(encoder: js.Function1[/* message */ js.Object | Buffer, EncoderResult]): Hemera[NoContext, NoContext] = js.native
  
  var sid: Double = js.native
  
  var topics: StringDictionary[Double] = js.native
  
  @JSName("trace$")
  var trace$: Trace = js.native
  
  var transport: NatsTransport = js.native
  
  def use(
    plugin: js.Function2[/* instance */ Hemera[NoContext, NoContext], /* opts */ js.Object, js.Promise[Unit]]
  ): Unit = js.native
  def use(
    plugin: js.Function2[/* instance */ Hemera[NoContext, NoContext], /* opts */ js.Object, js.Promise[Unit]],
    options: js.Object
  ): Unit = js.native
  // plugin
  def use(
    plugin: js.Function3[
      /* instance */ Hemera[NoContext, NoContext], 
      /* opts */ js.Object, 
      /* callback */ NodeCallback, 
      Unit
    ]
  ): Unit = js.native
  def use(
    plugin: js.Function3[
      /* instance */ Hemera[NoContext, NoContext], 
      /* opts */ js.Object, 
      /* callback */ NodeCallback, 
      Unit
    ],
    options: js.Object
  ): Unit = js.native
}
