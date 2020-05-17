package typingsSlinky.hapiHapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CachePolicyOptions[T] = typingsSlinky.hapiCatbox.mod.PolicyOptionVariants[T] with typingsSlinky.hapiHapi.anon.Cache
  type DecorationMethod[T] = js.ThisFunction1[/* this */ T, /* repeated */ js.Any, js.Any]
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
  type RequestQuery = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  type ResponseEventHandler = js.Function1[/* request */ typingsSlinky.hapiHapi.mod.Request, scala.Unit]
  type RouteCompressionEncoderSettings = js.Object
  type RouteEventHandler = js.Function1[/* route */ typingsSlinky.hapiHapi.mod.RequestRoute, scala.Unit]
  type RouteOptionsCache = typingsSlinky.hapiHapi.anon.Otherwise with (typingsSlinky.hapiHapi.anon.ExpiresAt | typingsSlinky.hapiHapi.anon.ExpiresIn | typingsSlinky.hapiHapi.anon.ExpiresAtExpiresIn)
  type RouteOptionsPreArray = js.Array[typingsSlinky.hapiHapi.mod.RouteOptionsPreAllOptions]
  type ServerAuthConfig = typingsSlinky.hapiHapi.mod.RouteOptionsAccess
  type ServerAuthScheme = js.Function2[
    /* server */ typingsSlinky.hapiHapi.mod.Server_, 
    /* options */ js.UndefOr[typingsSlinky.hapiHapi.mod.ServerAuthSchemeOptions], 
    typingsSlinky.hapiHapi.mod.ServerAuthSchemeObject
  ]
  type ServerAuthSchemeOptions = js.Object
  type ServerExtPointFunction = js.Function1[/* server */ typingsSlinky.hapiHapi.mod.Server_, scala.Unit]
  type ServerMethod = js.Function1[/* repeated */ js.Any, js.Any]
  type ServerMethods = typingsSlinky.hapiHapi.mod.Util.Dictionary[typingsSlinky.hapiHapi.mod.ServerMethod]
  type StartEventHandler = js.Function0[scala.Unit]
  type StopEventHandler = js.Function0[scala.Unit]
  type ValidationObject = typingsSlinky.hapiJoi.mod.SchemaMap[js.Any]
}
