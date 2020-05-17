package typingsSlinky.apostrophe.mod

import typingsSlinky.apostrophe.anon.Projection
import typingsSlinky.apostrophe.apostropheBooleans.`false`
import typingsSlinky.apostrophe.apostropheStrings.user
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Pass in custom modules to AposModuleOptions to allow them in extend
@js.native
trait AposModuleOptions[C] extends js.Object {
  var addFields: js.UndefOr[js.Array[Field]] = js.native
  var arrangeFields: js.UndefOr[js.Array[typingsSlinky.apostrophe.anon.Fields]] = js.native
  var beforeConstruct: js.UndefOr[js.Function2[/* self */ js.Any, /* options */ js.Any, _]] = js.native
  var defer: js.UndefOr[Boolean] = js.native
  var extend: AposCoreModules | C = js.native
  var filters: js.UndefOr[Projection] = js.native
  var label: String = js.native
  var name: js.UndefOr[String] = js.native
  var playerData: js.UndefOr[`false` | js.Array[String]] = js.native
  var pluralLabel: js.UndefOr[String] = js.native
  var removeFields: js.UndefOr[js.Array[Field]] = js.native
  var scene: js.UndefOr[user] = js.native
}

object AposModuleOptions {
  @scala.inline
  def apply[C](extend: AposCoreModules | C, label: String): AposModuleOptions[C] = {
    val __obj = js.Dynamic.literal(extend = extend.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AposModuleOptions[C]]
  }
  @scala.inline
  implicit class AposModuleOptionsOps[Self[c] <: AposModuleOptions[c], C] (val x: Self[C]) extends AnyVal {
    @scala.inline
    def duplicate: Self[C] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[C]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[C] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[C] with Other]
    @scala.inline
    def withExtend(value: AposCoreModules | C): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddFields(value: js.Array[Field]): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddFields: Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addFields")(js.undefined)
        ret
    }
    @scala.inline
    def withArrangeFields(value: js.Array[typingsSlinky.apostrophe.anon.Fields]): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrangeFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrangeFields: Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrangeFields")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeConstruct(value: (/* self */ js.Any, /* options */ js.Any) => _): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeConstruct")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeConstruct: Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeConstruct")(js.undefined)
        ret
    }
    @scala.inline
    def withDefer(value: Boolean): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefer: Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defer")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: Projection): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPlayerData(value: `false` | js.Array[String]): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playerData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayerData: Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playerData")(js.undefined)
        ret
    }
    @scala.inline
    def withPluralLabel(value: String): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluralLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPluralLabel: Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluralLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveFields(value: js.Array[Field]): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveFields: Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeFields")(js.undefined)
        ret
    }
    @scala.inline
    def withScene(value: user): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scene")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScene: Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scene")(js.undefined)
        ret
    }
  }
  
}

