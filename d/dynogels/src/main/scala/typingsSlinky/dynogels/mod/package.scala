package typingsSlinky.dynogels

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Document = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type DynogelsItemCallback = js.Function2[/* err */ js.Error, /* data */ typingsSlinky.dynogels.mod.Item, scala.Unit]
  
  type QueryFilterChain = typingsSlinky.dynogels.mod.ExtendedChain[typingsSlinky.dynogels.mod.Query]
  
  type QueryWhereChain = typingsSlinky.dynogels.mod.BaseChain[typingsSlinky.dynogels.mod.Query]
  
  type tableResolve = js.Function0[java.lang.String]
}
