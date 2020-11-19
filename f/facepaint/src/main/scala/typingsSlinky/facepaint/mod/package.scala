package typingsSlinky.facepaint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Arg = typingsSlinky.facepaint.mod.BaseArg | js.Array[typingsSlinky.facepaint.mod.BaseArg]
  
  type BaseArg = js.Object | js.Array[js.Object]
  
  type DynamicStyle = org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]]
  
  type DynamicStyleFunction = js.Function1[
    /* repeated */ typingsSlinky.facepaint.mod.Arg, 
    js.Array[typingsSlinky.facepaint.mod.DynamicStyle]
  ]
  
  type Selector = java.lang.String
}
