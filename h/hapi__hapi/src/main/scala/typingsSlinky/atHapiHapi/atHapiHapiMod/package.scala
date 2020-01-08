package typingsSlinky.atHapiHapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atHapiHapiMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.atHapiCatbox.atHapiCatboxMod.ClientOptions
  import typingsSlinky.atHapiCatbox.atHapiCatboxMod.EnginePrototype
  import typingsSlinky.atHapiCatbox.atHapiCatboxMod.PolicyOptionVariants
  import typingsSlinky.atHapiHapi.Anon_Cache
  import typingsSlinky.atHapiHapi.Anon_Constructor
  import typingsSlinky.atHapiHapi.Anon_Default
  import typingsSlinky.atHapiHapi.Anon_ExpiresAt
  import typingsSlinky.atHapiHapi.Anon_ExpiresAtExpiresIn
  import typingsSlinky.atHapiHapi.Anon_ExpiresAtExpiresInUndefined
  import typingsSlinky.atHapiHapi.atHapiHapiBooleans.`false`
  import typingsSlinky.atHapiHapi.atHapiHapiBooleans.`true`
  import typingsSlinky.atHapiHapi.atHapiHapiMod.Lifecycle.Method
  import typingsSlinky.atHapiHapi.atHapiHapiMod.Util.Dictionary
  import typingsSlinky.atHapiJoi.atHapiJoiMod.Schema
  import typingsSlinky.atHapiJoi.atHapiJoiMod.SchemaMap
  import typingsSlinky.atHapiJoi.atHapiJoiMod.ValidationOptions
  import typingsSlinky.atHapiPodium.atHapiPodiumMod.Podium
  import typingsSlinky.node.Buffer

  type CachePolicyOptions[T] = PolicyOptionVariants[T] with Anon_Cache
  type CacheProvider[T /* <: ClientOptions */] = EnginePrototype[js.Any] | Anon_Constructor[T]
  type DecorateName = String | js.Symbol
  type DecorationMethod[T] = js.ThisFunction1[/* this */ T, /* repeated */ js.Any, js.Any]
  type Dependencies = String | js.Array[String] | StringDictionary[String]
  type LogEventHandler = js.Function2[/* event */ LogEvent, /* tags */ StringDictionary[`true`], Unit]
  type PayloadCompressionDecoderSettings = js.Object
  type PeekListener = js.Function2[/* chunk */ String, /* encoding */ String, Unit]
  type Plugin[T] = PluginBase[T] with (PluginNameVersion | PluginPackage)
  type RequestEventHandler = js.Function3[
    /* request */ Request, 
    /* event */ RequestEvent, 
    /* tags */ StringDictionary[`true`], 
    Unit
  ]
  type RequestQuery = StringDictionary[String | js.Array[String]]
  type ResponseEventHandler = js.Function1[/* request */ Request, Unit]
  type ResponseValue = String | js.Object
  type RouteCompressionEncoderSettings = js.Object
  type RouteEventHandler = js.Function1[/* route */ RequestRoute, Unit]
  /* Rewritten from type alias, can be one of: 
    - typings.atHapiHapi.atHapiHapiMod.RouteOptionsAccessScopeObject
    - typings.atHapiHapi.atHapiHapiMod.RouteOptionsAccessEntityObject
    - typings.atHapiHapi.atHapiHapiMod.RouteOptionsAccessScopeObject with typings.atHapiHapi.atHapiHapiMod.RouteOptionsAccessEntityObject
  */
  type RouteOptionsAccessObject = _RouteOptionsAccessObject | (RouteOptionsAccessScopeObject with RouteOptionsAccessEntityObject)
  type RouteOptionsAccessScope = `false` | String | js.Array[String]
  type RouteOptionsCache = Anon_Default with (Anon_ExpiresAt | Anon_ExpiresAtExpiresIn | Anon_ExpiresAtExpiresInUndefined)
  type RouteOptionsPreAllOptions = RouteOptionsPreObject | js.Array[RouteOptionsPreObject] | Method
  type RouteOptionsPreArray = js.Array[RouteOptionsPreAllOptions]
  type RouteOptionsResponseSchema = Boolean | ValidationObject | Schema | (js.Function2[
    /* value */ js.Object | Buffer | String, 
    /* options */ ValidationOptions, 
    js.Promise[js.Any]
  ])
  type RouteOptionsSecure = Boolean | RouteOptionsSecureObject
  type ServerAuthConfig = RouteOptionsAccess
  type ServerAuthScheme = js.Function2[
    /* server */ Server, 
    /* options */ js.UndefOr[ServerAuthSchemeOptions], 
    ServerAuthSchemeObject
  ]
  type ServerAuthSchemeOptions = js.Object
  type ServerEventsApplication = String | ServerEventsApplicationObject | Podium
  type ServerExtPointFunction = js.Function1[/* server */ Server, Unit]
  type ServerMethod = js.Function1[/* repeated */ js.Any, js.Any]
  type ServerMethods = Dictionary[ServerMethod]
  type StartEventHandler = js.Function0[Unit]
  type StopEventHandler = js.Function0[Unit]
  type ValidationObject = SchemaMap[js.Any]
}
