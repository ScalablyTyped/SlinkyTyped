package typingsSlinky.jsonld.mod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpMap extends js.Object {
  // TODO: Figure out type of info
  var expansionMap: js.UndefOr[js.Function1[/* info */ js.Any, _]] = js.native
}

object ExpMap {
  @scala.inline
  def apply(): ExpMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpMap]
  }
  @scala.inline
  implicit class ExpMapOps[Self <: ExpMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpansionMap(value: /* info */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expansionMap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExpansionMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expansionMap")(js.undefined)
        ret
    }
  }
  
}

