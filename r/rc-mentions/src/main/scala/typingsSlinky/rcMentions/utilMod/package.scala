package typingsSlinky.rcMentions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object utilMod {
  
  type OmitFunc = js.Function2[
    /* obj */ js.Object, 
    /* keys */ Array[/* keyof object */ java.lang.String], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K2 in std.Exclude<keyof object, [...std.Array<keyof object>][number]> ]: object[K2]}
    */ typingsSlinky.rcMentions.rcMentionsStrings.OmitFunc with org.scalablytyped.runtime.TopLevel[js.Object]
  ]
  
  type Omit_[T, K /* <: /* keyof T */ java.lang.String */] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
}
