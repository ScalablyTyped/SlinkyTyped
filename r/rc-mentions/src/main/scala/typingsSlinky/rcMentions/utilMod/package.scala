package typingsSlinky.rcMentions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilMod {
  type OmitFunc = js.Function2[
    /* obj */ js.Object, 
    /* keys */ Array[java.lang.String], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K2 in std.Exclude<keyof object, [...std.Array<keyof object>][number]> ]: object[K2]}
    */ typingsSlinky.rcMentions.rcMentionsStrings.OmitFunc with js.Object
  ]
  type Omit_[T, K /* <: java.lang.String */] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[java.lang.String, K]]
}
