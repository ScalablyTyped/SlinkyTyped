package typingsSlinky.karma

import org.scalablytyped.runtime.StObject
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
  
  @scala.inline
  def VERSION: java.lang.String = typingsSlinky.karma.mod.^.asInstanceOf[js.Dynamic].selectDynamic("VERSION").asInstanceOf[java.lang.String]
  
  type ValueType = js.Tuple2[typingsSlinky.karma.karmaStrings.value, js.Any]
  
  @scala.inline
  def runner: typingsSlinky.karma.mod.Runner_ = typingsSlinky.karma.mod.^.asInstanceOf[js.Dynamic].selectDynamic("runner").asInstanceOf[typingsSlinky.karma.mod.Runner_]
  
  @scala.inline
  def server: typingsSlinky.karma.mod.DeprecatedServer = typingsSlinky.karma.mod.^.asInstanceOf[js.Dynamic].selectDynamic("server").asInstanceOf[typingsSlinky.karma.mod.DeprecatedServer]
  
  @scala.inline
  def stopper: typingsSlinky.karma.mod.Stopper_ = typingsSlinky.karma.mod.^.asInstanceOf[js.Dynamic].selectDynamic("stopper").asInstanceOf[typingsSlinky.karma.mod.Stopper_]
}
