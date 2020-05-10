package typingsSlinky.angularCommon.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angularCore.mod.DoCheck
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common", "NgClass")
@js.native
class NgClass protected ()
  extends NgClassBase
     with DoCheck {
  def this(delegate: ɵNgClassImpl) = this()
  var klass: String = js.native
  var ngClass: String | js.Array[String] | Set[String] | StringDictionary[js.Any] = js.native
}

