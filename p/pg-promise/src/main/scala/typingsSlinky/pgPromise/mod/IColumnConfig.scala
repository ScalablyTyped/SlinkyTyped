package typingsSlinky.pgPromise.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColumnConfig extends js.Object {
  var cast: js.UndefOr[String] = js.native
  var cnd: js.UndefOr[Boolean] = js.native
  var `def`: js.UndefOr[js.Any] = js.native
  var init: js.UndefOr[js.Function1[/* col */ IColumnDescriptor, _]] = js.native
  var mod: js.UndefOr[FormattingFilter] = js.native
  var name: String = js.native
  var prop: js.UndefOr[String] = js.native
  var skip: js.UndefOr[js.Function1[/* col */ IColumnDescriptor, Boolean]] = js.native
}

object IColumnConfig {
  @scala.inline
  def apply(name: String): IColumnConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumnConfig]
  }
  @scala.inline
  implicit class IColumnConfigOps[Self <: IColumnConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCast(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cast")(js.undefined)
        ret
    }
    @scala.inline
    def withCnd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cnd")(js.undefined)
        ret
    }
    @scala.inline
    def withDef(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("def")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("def")(js.undefined)
        ret
    }
    @scala.inline
    def withInit(value: /* col */ IColumnDescriptor => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.undefined)
        ret
    }
    @scala.inline
    def withMod(value: FormattingFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mod")(js.undefined)
        ret
    }
    @scala.inline
    def withProp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prop")(js.undefined)
        ret
    }
    @scala.inline
    def withSkip(value: /* col */ IColumnDescriptor => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSkip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(js.undefined)
        ret
    }
  }
  
}

