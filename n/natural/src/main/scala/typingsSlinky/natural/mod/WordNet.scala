package typingsSlinky.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WordNet extends js.Object {
  def get(synsetOffset: Double, pos: String, callback: WordNetGetCallback): Unit = js.native
  def lookup(word: String, callback: WordNetLookupCallback): Unit = js.native
}

object WordNet {
  @scala.inline
  def apply(get: (Double, String, WordNetGetCallback) => Unit, lookup: (String, WordNetLookupCallback) => Unit): WordNet = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction3(get), lookup = js.Any.fromFunction2(lookup))
    __obj.asInstanceOf[WordNet]
  }
  @scala.inline
  implicit class WordNetOps[Self <: WordNet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: (Double, String, WordNetGetCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withLookup(value: (String, WordNetLookupCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookup")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

