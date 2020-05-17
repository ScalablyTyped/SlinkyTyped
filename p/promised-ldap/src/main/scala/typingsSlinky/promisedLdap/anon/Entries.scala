package typingsSlinky.promisedLdap.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Entries extends js.Object {
  var entries: js.Array[_] = js.native
  var references: js.Array[_] = js.native
}

object Entries {
  @scala.inline
  def apply(entries: js.Array[_], references: js.Array[_]): Entries = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entries]
  }
  @scala.inline
  implicit class EntriesOps[Self <: Entries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntries(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferences(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("references")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

