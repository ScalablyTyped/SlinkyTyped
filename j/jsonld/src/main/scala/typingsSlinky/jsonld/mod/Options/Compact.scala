package typingsSlinky.jsonld.mod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Compact
  extends Common
     with ExpMap {
  var appropriate: js.UndefOr[Boolean] = js.native
  var compactArrays: js.UndefOr[Boolean] = js.native
  var compactToRelative: js.UndefOr[Boolean] = js.native
  // TODO: Figure out type of info
  var compactionMap: js.UndefOr[js.Function1[/* info */ js.Any, Unit]] = js.native
  var expansion: js.UndefOr[Boolean] = js.native
  var framing: js.UndefOr[Boolean] = js.native
  var graph: js.UndefOr[Boolean] = js.native
  var skipExpansion: js.UndefOr[Boolean] = js.native
}

object Compact {
  @scala.inline
  def apply(): Compact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Compact]
  }
  @scala.inline
  implicit class CompactOps[Self <: Compact] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppropriate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appropriate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppropriate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appropriate")(js.undefined)
        ret
    }
    @scala.inline
    def withCompactArrays(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactArrays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompactArrays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactArrays")(js.undefined)
        ret
    }
    @scala.inline
    def withCompactToRelative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactToRelative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompactToRelative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactToRelative")(js.undefined)
        ret
    }
    @scala.inline
    def withCompactionMap(value: /* info */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactionMap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCompactionMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactionMap")(js.undefined)
        ret
    }
    @scala.inline
    def withExpansion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expansion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpansion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expansion")(js.undefined)
        ret
    }
    @scala.inline
    def withFraming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFraming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framing")(js.undefined)
        ret
    }
    @scala.inline
    def withGraph(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGraph: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graph")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipExpansion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipExpansion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipExpansion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipExpansion")(js.undefined)
        ret
    }
  }
  
}

