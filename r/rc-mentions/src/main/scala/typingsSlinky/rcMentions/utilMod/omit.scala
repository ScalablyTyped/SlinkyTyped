package typingsSlinky.rcMentions.utilMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-mentions/lib/util", "omit")
@js.native
object omit extends js.Object {
  def apply[T /* <: js.Object */, K /* <: Array[/* keyof T */ String] */](
    obj: T,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param keys because its type K is not an array type */ keys: K
  ): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K2 in std.Exclude<keyof T, K[number]> ]: T[K2]}
    */ typingsSlinky.rcMentions.rcMentionsStrings.omit with TopLevel[T] = js.native
}

