package typingsSlinky.cassandraDriver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ArrayOrObject = js.Array[js.Any] | org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type EmptyCallback = js.Function1[/* err */ js.Error, scala.Unit]
  
  type ValueCallback[T] = js.Function2[/* err */ js.Error, /* val */ T, scala.Unit]
  
  @scala.inline
  def defaultOptions(): typingsSlinky.cassandraDriver.mod.ClientOptions = typingsSlinky.cassandraDriver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defaultOptions")().asInstanceOf[typingsSlinky.cassandraDriver.mod.ClientOptions]
  
  @scala.inline
  def version: scala.Double = typingsSlinky.cassandraDriver.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[scala.Double]
}
