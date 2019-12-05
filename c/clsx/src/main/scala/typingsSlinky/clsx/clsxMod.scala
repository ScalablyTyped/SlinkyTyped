package typingsSlinky.clsx

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.clsx.clsxMod.ClassArray
import typingsSlinky.clsx.clsxMod.ClassDictionary
import typingsSlinky.clsx.clsxMod.ClassValue
import typingsSlinky.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("clsx", JSImport.Namespace)
@js.native
object clsxMod extends js.Object {
  @js.native
  trait ClassArray extends Array[ClassValue]
  
  def default(classes: ClassValue*): String = js.native
  type ClassDictionary = StringDictionary[js.Any]
  type ClassValue = js.UndefOr[ClassArray | ClassDictionary | String | Double | Null | Boolean]
}

