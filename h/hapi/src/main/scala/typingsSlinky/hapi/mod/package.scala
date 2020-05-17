package typingsSlinky.hapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CachePolicyOptions[T] = typingsSlinky.catbox.mod.PolicyOptionVariants[T] with typingsSlinky.hapi.anon.Cache
  type DecorationMethod[T] = js.ThisFunction1[/* this */ T, /* repeated */ js.Any, js.Any]
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
  type RouteCompressionEncoderSettings = js.Object
  type RouteEventHandler = js.Function1[/* route */ typingsSlinky.hapi.mod.RequestRoute, scala.Unit]
  type RouteOptionsCache = typingsSlinky.hapi.anon.Otherwise with (typingsSlinky.hapi.anon.ExpiresAt | typingsSlinky.hapi.anon.ExpiresIn | typingsSlinky.hapi.anon.ExpiresAtExpiresIn)
  type RouteOptionsPreArray = js.Array[typingsSlinky.hapi.mod.RouteOptionsPreAllOptions]
  type ServerAuthConfig = typingsSlinky.hapi.mod.RouteOptionsAccess
  type ServerAuthScheme = js.Function2[
    /* server */ typingsSlinky.hapi.mod.Server, 
    /* options */ js.UndefOr[typingsSlinky.hapi.mod.ServerAuthSchemeOptions], 
    typingsSlinky.hapi.mod.ServerAuthSchemeObject
  ]
  type ServerAuthSchemeOptions = js.Object
  type ServerExtPointFunction = js.Function1[/* server */ typingsSlinky.hapi.mod.Server, scala.Unit]
  type ServerMethod = js.Function1[/* repeated */ js.Any, js.Any]
  type ServerMethods = typingsSlinky.hapi.mod.Util.Dictionary[typingsSlinky.hapi.mod.ServerMethod]
  type StartEventHandler = js.Function0[scala.Unit]
  type StopEventHandler = js.Function0[scala.Unit]
  type ValidationObject = typingsSlinky.joi.mod.SchemaMap
}
