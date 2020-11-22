package typingsSlinky.hapiHapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CachePolicyOptions[T] = typingsSlinky.hapiCatbox.mod.PolicyOptionVariants[T] with typingsSlinky.hapiHapi.anon.Cache
  
  type CacheProvider[T /* <: typingsSlinky.hapiCatbox.mod.ClientOptions */] = typingsSlinky.hapiCatbox.mod.EnginePrototype[js.Any] | typingsSlinky.hapiHapi.anon.Constructor[T]
  
  type DecorateName = java.lang.String | js.Symbol
  
  type DecorationMethod[T] = js.ThisFunction1[/* this */ T, /* repeated */ js.Any, js.Any]
  
  type Dependencies = java.lang.String | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type LogEventHandler = js.Function2[
    /* event */ typingsSlinky.hapiHapi.mod.LogEvent, 
    /* tags */ org.scalablytyped.runtime.StringDictionary[typingsSlinky.hapiHapi.hapiHapiBooleans.`true`], 
    scala.Unit
  ]
  
  type PayloadCompressionDecoderSettings = js.Object
  
  type PeekListener = js.Function2[/* chunk */ java.lang.String, /* encoding */ java.lang.String, scala.Unit]
  
  type Plugin[T] = typingsSlinky.hapiHapi.mod.PluginBase[T] with (typingsSlinky.hapiHapi.mod.PluginNameVersion | typingsSlinky.hapiHapi.mod.PluginPackage)
  
  type RequestEventHandler = js.Function3[
    /* request */ typingsSlinky.hapiHapi.mod.Request, 
    /* event */ typingsSlinky.hapiHapi.mod.RequestEvent, 
    /* tags */ org.scalablytyped.runtime.StringDictionary[typingsSlinky.hapiHapi.hapiHapiBooleans.`true`], 
    scala.Unit
  ]
  
  type RequestQuery = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type ResponseEventHandler = js.Function1[/* request */ typingsSlinky.hapiHapi.mod.Request, scala.Unit]
  
  type ResponseValue = java.lang.String | js.Object
  
  type RouteCompressionEncoderSettings = js.Object
  
  type RouteEventHandler = js.Function1[/* route */ typingsSlinky.hapiHapi.mod.RequestRoute, scala.Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.hapiHapi.mod.RouteOptionsAccessScopeObject
    - typingsSlinky.hapiHapi.mod.RouteOptionsAccessEntityObject
    - typingsSlinky.hapiHapi.mod.RouteOptionsAccessScopeObject with typingsSlinky.hapiHapi.mod.RouteOptionsAccessEntityObject
  */
  type RouteOptionsAccessObject = typingsSlinky.hapiHapi.mod._RouteOptionsAccessObject | (typingsSlinky.hapiHapi.mod.RouteOptionsAccessScopeObject with typingsSlinky.hapiHapi.mod.RouteOptionsAccessEntityObject)
  
  type RouteOptionsAccessScope = typingsSlinky.hapiHapi.hapiHapiBooleans.`false` | java.lang.String | js.Array[java.lang.String]
  
  type RouteOptionsCache = typingsSlinky.hapiHapi.anon.Otherwise with (typingsSlinky.hapiHapi.anon.ExpiresAt | typingsSlinky.hapiHapi.anon.ExpiresIn | typingsSlinky.hapiHapi.anon.ExpiresAtExpiresIn)
  
  type RouteOptionsPreAllOptions = typingsSlinky.hapiHapi.mod.RouteOptionsPreObject | js.Array[typingsSlinky.hapiHapi.mod.RouteOptionsPreObject] | typingsSlinky.hapiHapi.mod.Lifecycle.Method
  
  type RouteOptionsPreArray = js.Array[typingsSlinky.hapiHapi.mod.RouteOptionsPreAllOptions]
  
  type RouteOptionsResponseSchema = scala.Boolean | typingsSlinky.hapiHapi.mod.ValidationObject | typingsSlinky.joi.mod.Schema | (js.Function2[
    /* value */ js.Object | typingsSlinky.node.Buffer | java.lang.String, 
    /* options */ typingsSlinky.joi.mod.ValidationOptions, 
    js.Promise[js.Any]
  ])
  
  type RouteOptionsSecure = scala.Boolean | typingsSlinky.hapiHapi.mod.RouteOptionsSecureObject
  
  type ServerAuthConfig = typingsSlinky.hapiHapi.mod.RouteOptionsAccess
  
  type ServerAuthScheme = js.Function2[
    /* server */ typingsSlinky.hapiHapi.mod.Server_, 
    /* options */ js.UndefOr[typingsSlinky.hapiHapi.mod.ServerAuthSchemeOptions], 
    typingsSlinky.hapiHapi.mod.ServerAuthSchemeObject
  ]
  
  type ServerAuthSchemeOptions = js.Object
  
  type ServerEventsApplication = java.lang.String | typingsSlinky.hapiHapi.mod.ServerEventsApplicationObject | typingsSlinky.hapiPodium.mod.Podium
  
  type ServerExtPointFunction = js.Function1[/* server */ typingsSlinky.hapiHapi.mod.Server_, scala.Unit]
  
  type ServerMethod = js.Function1[/* repeated */ js.Any, js.Any]
  
  type ServerMethods = typingsSlinky.hapiHapi.mod.Util.Dictionary[typingsSlinky.hapiHapi.mod.ServerMethod]
  
  type StartEventHandler = js.Function0[scala.Unit]
  
  type StopEventHandler = js.Function0[scala.Unit]
  
  type ValidationObject = typingsSlinky.joi.mod.SchemaMap[js.Any]
}
