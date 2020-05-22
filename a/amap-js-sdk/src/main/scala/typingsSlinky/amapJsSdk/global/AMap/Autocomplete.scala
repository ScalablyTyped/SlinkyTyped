package typingsSlinky.amapJsSdk.global.AMap

import typingsSlinky.amapJsSdk.AMap.AutocompleteResult
import typingsSlinky.amapJsSdk.anon.Citylimit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Autocomplete")
@js.native
class Autocomplete protected ()
  extends typingsSlinky.amapJsSdk.AMap.Autocomplete {
  def this(opts: Citylimit) = this()
  /* CompleteClass */
  override def search(
    keyword: String,
    callback: js.Function2[/* status */ String, /* result */ String | AutocompleteResult, Unit]
  ): Unit = js.native
}

