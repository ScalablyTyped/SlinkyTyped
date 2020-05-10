package typingsSlinky.dragula.mod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragulaOptions extends js.Object {
  var accepts: js.UndefOr[
    js.Function4[
      /* el */ js.UndefOr[Element], 
      /* target */ js.UndefOr[Element], 
      /* source */ js.UndefOr[Element], 
      /* sibling */ js.UndefOr[Element], 
      Boolean
    ]
  ] = js.native
  var containers: js.UndefOr[js.Array[Element]] = js.native
  var copy: js.UndefOr[(js.Function2[/* el */ Element, /* source */ Element, Boolean]) | Boolean] = js.native
  var copySortSource: js.UndefOr[Boolean] = js.native
  var delay: js.UndefOr[Boolean | Double] = js.native
  var direction: js.UndefOr[String] = js.native
  var ignoreInputTextSelection: js.UndefOr[Boolean] = js.native
  var invalid: js.UndefOr[
    js.Function2[/* el */ js.UndefOr[Element], /* target */ js.UndefOr[Element], Boolean]
  ] = js.native
  var isContainer: js.UndefOr[js.Function1[/* el */ js.UndefOr[Element], Boolean]] = js.native
  var mirrorContainer: js.UndefOr[Element] = js.native
  var moves: js.UndefOr[
    js.Function4[
      /* el */ js.UndefOr[Element], 
      /* container */ js.UndefOr[Element], 
      /* handle */ js.UndefOr[Element], 
      /* sibling */ js.UndefOr[Element], 
      Boolean
    ]
  ] = js.native
  var removeOnSpill: js.UndefOr[Boolean] = js.native
  var revertOnSpill: js.UndefOr[Boolean] = js.native
}

object DragulaOptions {
  @scala.inline
  def apply(): DragulaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragulaOptions]
  }
  @scala.inline
  implicit class DragulaOptionsOps[Self <: DragulaOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccepts(
      value: (/* el */ js.UndefOr[Element], /* target */ js.UndefOr[Element], /* source */ js.UndefOr[Element], /* sibling */ js.UndefOr[Element]) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accepts")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutAccepts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accepts")(js.undefined)
        ret
    }
    @scala.inline
    def withContainers(value: js.Array[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containers")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyFunction2(value: (/* el */ Element, /* source */ Element) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCopy(value: (js.Function2[/* el */ Element, /* source */ Element, Boolean]) | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.undefined)
        ret
    }
    @scala.inline
    def withCopySortSource(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copySortSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopySortSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copySortSource")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreInputTextSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreInputTextSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreInputTextSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreInputTextSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalid(value: (/* el */ js.UndefOr[Element], /* target */ js.UndefOr[Element]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalid")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutInvalid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalid")(js.undefined)
        ret
    }
    @scala.inline
    def withIsContainer(value: /* el */ js.UndefOr[Element] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isContainer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withMirrorContainer(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mirrorContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMirrorContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mirrorContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withMoves(
      value: (/* el */ js.UndefOr[Element], /* container */ js.UndefOr[Element], /* handle */ js.UndefOr[Element], /* sibling */ js.UndefOr[Element]) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moves")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutMoves: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moves")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveOnSpill(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeOnSpill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveOnSpill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeOnSpill")(js.undefined)
        ret
    }
    @scala.inline
    def withRevertOnSpill(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revertOnSpill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevertOnSpill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revertOnSpill")(js.undefined)
        ret
    }
  }
  
}

