package typingsSlinky.nodeGetopt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ErrorFunc = js.Function1[/* exception */ js.Error, scala.Unit]
  
  type EventCallback = js.Function2[
    /* args */ js.Array[java.lang.String], 
    /* options */ typingsSlinky.nodeGetopt.mod.OptionMap, 
    scala.Unit
  ]
  
  type OptionConfigurationArray = org.scalablytyped.runtime.NumberDictionary[js.Array[java.lang.String]]
  
  type OptionMap = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String] | scala.Boolean]
}
