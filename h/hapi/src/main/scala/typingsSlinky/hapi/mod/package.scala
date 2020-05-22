package typingsSlinky.hapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CachePolicyOptions[T] = typingsSlinky.catbox.mod.PolicyOptionVariants[T] with typingsSlinky.hapi.anon.Cache
  type CacheProvider[T /* <: typingsSlinky.catbox.mod.ClientOptions */] = typingsSlinky.catbox.mod.EnginePrototype[js.Any] | typingsSlinky.hapi.anon.Constructor[T]
  type DecorateName = java.lang.String | js.Symbol
  type DecorationMethod[T] = js.ThisFunction1[/* this */ T, /* repeated */ js.Any, js.Any]
  type Dependencies = java.lang.String | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type LogEventHandler = js.Function2[
    /* event */ typingsSlinky.hapi.mod.LogEvent, 
    /* tags */ org.scalablytyped.runtime.StringDictionary[typingsSlinky.hapi.hapiBooleans.`true`], 
    scala.Unit
  ]
  type PayloadCompressionDecoderSettings = js.Object
  type PeekListener = js.Function2[/* chunk */ java.lang.String, /* encoding */ java.lang.String, scala.Unit]
  type Plugin[T] = typingsSlinky.hapi.mod.PluginBase[T] with (typingsSlinky.hapi.mod.PluginNameVersion | typingsSlinky.hapi.mod.PluginPackage)
  type RequestEventHandler = js.Function3[
    /* request */ typingsSlinky.hapi.mod.Request, 
    /* event */ typingsSlinky.hapi.mod.RequestEvent, 
    /* tags */ org.scalablytyped.runtime.StringDictionary[typingsSlinky.hapi.hapiBooleans.`true`], 
    scala.Unit
  ]
  type RequestQuery = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  type ResponseEventHandler = js.Function1[/* request */ typingsSlinky.hapi.mod.Request, scala.Unit]
  type ResponseValue = java.lang.String | js.Object
  type RouteCompressionEncoderSettings = js.Object
  type RouteEventHandler = js.Function1[/* route */ typingsSlinky.hapi.mod.RequestRoute, scala.Unit]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.hapi.mod.RouteOptionsAccessScopeObject
    - typingsSlinky.hapi.mod.RouteOptionsAccessEntityObject
    - typingsSlinky.hapi.mod.RouteOptionsAccessScopeObject with typingsSlinky.hapi.mod.RouteOptionsAccessEntityObject
  */
  type RouteOptionsAccessObject = typingsSlinky.hapi.mod._RouteOptionsAccessObject | (typingsSlinky.hapi.mod.RouteOptionsAccessScopeObject with typingsSlinky.hapi.mod.RouteOptionsAccessEntityObject)
  type RouteOptionsAccessScope = typingsSlinky.hapi.hapiBooleans.`false` | java.lang.String | js.Array[java.lang.String]
  type RouteOptionsCache = typingsSlinky.hapi.anon.Otherwise with (typingsSlinky.hapi.anon.ExpiresAt | typingsSlinky.hapi.anon.ExpiresIn | typingsSlinky.hapi.anon.ExpiresAtExpiresIn)
  type RouteOptionsPreAllOptions = typingsSlinky.hapi.mod.RouteOptionsPreObject | js.Array[typingsSlinky.hapi.mod.RouteOptionsPreObject] | typingsSlinky.hapi.mod.Lifecycle.Method
  type RouteOptionsPreArray = js.Array[typingsSlinky.hapi.mod.RouteOptionsPreAllOptions]
  type RouteOptionsResponseSchema = scala.Boolean | typingsSlinky.hapi.mod.ValidationObject | typingsSlinky.joi.mod.Schema | (js.Function2[
    /* value */ js.Object | typingsSlinky.node.Buffer | java.lang.String, 
    /* options */ typingsSlinky.joi.mod.ValidationOptions, 
    js.Promise[js.Any]
  ])
  type RouteOptionsSecure = scala.Boolean | typingsSlinky.hapi.mod.RouteOptionsSecureObject
  type ServerAuthConfig = typingsSlinky.hapi.mod.RouteOptionsAccess
  type ServerAuthScheme = js.Function2[
    /* server */ typingsSlinky.hapi.mod.Server, 
    /* options */ js.UndefOr[typingsSlinky.hapi.mod.ServerAuthSchemeOptions], 
    typingsSlinky.hapi.mod.ServerAuthSchemeObject
  ]
  type ServerAuthSchemeOptions = js.Object
  type ServerEventsApplication = java.lang.String | typingsSlinky.hapi.mod.ServerEventsApplicationObject | typingsSlinky.podium.mod.Podium
  type ServerExtPointFunction = js.Function1[/* server */ typingsSlinky.hapi.mod.Server, scala.Unit]
  type ServerMethod = js.Function1[/* repeated */ js.Any, js.Any]
  type ServerMethods = typingsSlinky.hapi.mod.Util.Dictionary[typingsSlinky.hapi.mod.ServerMethod]
  type StartEventHandler = js.Function0[scala.Unit]
  type StopEventHandler = js.Function0[scala.Unit]
  type ValidationObject = typingsSlinky.joi.mod.SchemaMap
}
