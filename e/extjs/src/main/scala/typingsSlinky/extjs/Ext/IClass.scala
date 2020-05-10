package typingsSlinky.extjs.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClass extends js.Object {
  /** [Config Option] (String[]) */
  var alias: js.UndefOr[Array] = js.native
  /** [Config Option] (String/String[]) */
  var alternateClassName: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var config: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var extend: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (Object) */
  var inheritableStatics: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String[]/Object) */
  var mixins: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String[]) */
  var requires: js.UndefOr[Array] = js.native
  /** [Config Option] (Boolean) */
  var singleton: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Object) */
  var statics: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String[]) */
  var uses: js.UndefOr[Array] = js.native
}

object IClass {
  @scala.inline
  def apply(): IClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClass]
  }
  @scala.inline
  implicit class IClassOps[Self <: IClass] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlias(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(js.undefined)
        ret
    }
    @scala.inline
    def withAlternateClassName(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternateClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlternateClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternateClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withExtend(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extend")(js.undefined)
        ret
    }
    @scala.inline
    def withInheritableStatics(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inheritableStatics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInheritableStatics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inheritableStatics")(js.undefined)
        ret
    }
    @scala.inline
    def withMixins(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mixins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMixins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mixins")(js.undefined)
        ret
    }
    @scala.inline
    def withRequires(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequires: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requires")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleton")(js.undefined)
        ret
    }
    @scala.inline
    def withStatics(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statics")(js.undefined)
        ret
    }
    @scala.inline
    def withUses(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uses")(js.undefined)
        ret
    }
  }
  
}

