package typingsSlinky.luaparse.anon

import typingsSlinky.luaparse.astMod.Identifier
import typingsSlinky.luaparse.astMod.Node
import typingsSlinky.luaparse.luaparseBooleans.`false`
import typingsSlinky.luaparse.luaparseBooleans.`true`
import typingsSlinky.luaparse.luaparseStrings.LuaJIT
import typingsSlinky.luaparse.luaparseStrings.`5Dot1`
import typingsSlinky.luaparse.luaparseStrings.`5Dot2`
import typingsSlinky.luaparse.luaparseStrings.`5Dot3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<luaparse.luaparse.Options> & {  wait  :true} */
@js.native
trait PartialOptionswaittrue extends js.Object {
  var comments: js.UndefOr[Boolean] = js.native
  var extendedIdentifiers: js.UndefOr[`false`] = js.native
  var locations: js.UndefOr[Boolean] = js.native
  var luaVersion: js.UndefOr[`5Dot1` | `5Dot2` | `5Dot3` | LuaJIT] = js.native
  var onCreateNode: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var onCreateScope: js.UndefOr[js.Function0[Unit]] = js.native
  var onDestroyScope: js.UndefOr[js.Function0[Unit]] = js.native
  var onLocalDeclaration: js.UndefOr[js.Function1[/* identifier */ Identifier, Unit]] = js.native
  var ranges: js.UndefOr[Boolean] = js.native
  var scope: js.UndefOr[Boolean] = js.native
  @JSName("wait")
  var wait_FPartialOptionswaittrue: js.UndefOr[Boolean with `true`] = js.native
}

object PartialOptionswaittrue {
  @scala.inline
  def apply(): PartialOptionswaittrue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptionswaittrue]
  }
  @scala.inline
  implicit class PartialOptionswaittrueOps[Self <: PartialOptionswaittrue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(js.undefined)
        ret
    }
    @scala.inline
    def withExtendedIdentifiers(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedIdentifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtendedIdentifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedIdentifiers")(js.undefined)
        ret
    }
    @scala.inline
    def withLocations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(js.undefined)
        ret
    }
    @scala.inline
    def withLuaVersion(value: `5Dot1` | `5Dot2` | `5Dot3` | LuaJIT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("luaVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLuaVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("luaVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCreateNode(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCreateNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCreateNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCreateNode")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCreateScope(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCreateScope")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnCreateScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCreateScope")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDestroyScope(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDestroyScope")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDestroyScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDestroyScope")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLocalDeclaration(value: /* identifier */ Identifier => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLocalDeclaration")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLocalDeclaration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLocalDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withRanges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranges")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
    @scala.inline
    def withWait(value: Boolean with `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWait: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait")(js.undefined)
        ret
    }
  }
  
}

