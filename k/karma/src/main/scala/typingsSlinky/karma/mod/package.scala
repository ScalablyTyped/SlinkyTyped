package typingsSlinky.karma

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ConstructorFn = js.Function | (org.scalablytyped.runtime.Instantiable1[/* params (repeated) */ js.Any, js.Any])
  
  type ConstructorFnType = js.Tuple2[typingsSlinky.karma.karmaStrings.`type`, typingsSlinky.karma.mod.ConstructorFn]
  
  type FactoryFn = js.Function1[/* repeated */ js.Any, js.Any]
  
  type FactoryFnType = js.Tuple2[typingsSlinky.karma.karmaStrings.factory, typingsSlinky.karma.mod.FactoryFn]
  
  type InlinePluginDef = typingsSlinky.std.Record[typingsSlinky.karma.mod.PluginName, typingsSlinky.karma.mod.InlinePluginType]
  
  type InlinePluginType = typingsSlinky.karma.mod.FactoryFnType | typingsSlinky.karma.mod.ConstructorFnType | typingsSlinky.karma.mod.ValueType
  
  type PathProxyPairs = org.scalablytyped.runtime.StringDictionary[java.lang.String | typingsSlinky.karma.mod.ProxyOptions]
  
  type PluginName = java.lang.String
  
  type ServerCallback = js.Function1[/* exitCode */ scala.Double, scala.Unit]
  
  type ValueType = js.Tuple2[typingsSlinky.karma.karmaStrings.value, js.Any]
}
