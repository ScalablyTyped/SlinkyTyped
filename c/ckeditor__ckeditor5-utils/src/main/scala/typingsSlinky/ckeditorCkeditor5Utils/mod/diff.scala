package typingsSlinky.ckeditorCkeditor5Utils.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ckeditor/ckeditor5-utils", "diff")
@js.native
object diff extends js.Object {
  
  def apply(a: String, b: String): js.Array[Change] = js.native
  def apply(a: String, b: String, cmp: js.Function2[/* a */ String, /* b */ String, Boolean]): js.Array[Change] = js.native
  def apply(a: js.Array[String], b: js.Array[String]): js.Array[Change] = js.native
  def apply(
    a: js.Array[String],
    b: js.Array[String],
    cmp: js.Function2[/* a */ String, /* b */ String, Boolean]
  ): js.Array[Change] = js.native
}
