package typingsSlinky.logkitty

import typingsSlinky.logkitty.typesMod.IFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("logkitty/build/android/AndroidFilter", JSImport.Namespace)
@js.native
object androidFilterMod extends js.Object {
  @js.native
  trait AndroidFilter extends IFilter {
    var filter: js.Any = js.native
    val minPriority: js.Any = js.native
    def setCustomFilter(patterns: js.Array[String]): Unit = js.native
    def setFilterByApp(applicationId: String): Unit = js.native
    def setFilterByApp(applicationId: String, adbPath: String): Unit = js.native
    def setFilterByMatch(regexes: js.Array[js.RegExp]): Unit = js.native
    def setFilterByTag(tags: js.Array[String]): Unit = js.native
  }
  
  @js.native
  class default () extends AndroidFilter {
    def this(minPriority: Double) = this()
  }
  
}

