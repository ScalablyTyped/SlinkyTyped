package typingsSlinky.natsHemera.mod

import typingsSlinky.natsHemera.natsHemeraStrings.depth
import typingsSlinky.natsHemera.natsHemeraStrings.insertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BloomrunConfig extends js.Object {
  var indexing: insertion | depth = js.native
  var lookupBeforeAdd: Boolean = js.native
}

object BloomrunConfig {
  @scala.inline
  def apply(indexing: insertion | depth, lookupBeforeAdd: Boolean): BloomrunConfig = {
    val __obj = js.Dynamic.literal(indexing = indexing.asInstanceOf[js.Any], lookupBeforeAdd = lookupBeforeAdd.asInstanceOf[js.Any])
    __obj.asInstanceOf[BloomrunConfig]
  }
  @scala.inline
  implicit class BloomrunConfigOps[Self <: BloomrunConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndexing(value: insertion | depth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLookupBeforeAdd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookupBeforeAdd")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

