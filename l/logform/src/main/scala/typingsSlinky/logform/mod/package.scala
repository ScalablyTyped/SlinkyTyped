package typingsSlinky.logform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Colors = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  
  type FormatWrap = js.Function1[/* opts */ js.UndefOr[js.Any], typingsSlinky.logform.mod.Format_]
  
  type TransformFunction = js.Function2[
    /* info */ typingsSlinky.logform.mod.TransformableInfo, 
    /* opts */ js.UndefOr[js.Any], 
    typingsSlinky.logform.mod.TransformableInfo | scala.Boolean
  ]
}
