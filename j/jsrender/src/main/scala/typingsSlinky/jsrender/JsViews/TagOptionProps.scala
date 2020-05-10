package typingsSlinky.jsrender.JsViews

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Tags
@js.native
trait TagOptionProps
  extends /* prop */ StringDictionary[js.Any] {
  var argDefault: js.UndefOr[Boolean] = js.native
  var baseTag: js.UndefOr[String | Tag] = js.native
  var bindFrom: js.UndefOr[Double | String | (js.Array[Double | String])] = js.native
  var bindTo: js.UndefOr[Double | String | (js.Array[Double | String])] = js.native
  var contentCtx: js.UndefOr[Boolean | (js.ThisFunction1[/* this */ TagInst, /* arg0 */ js.Any, _])] = js.native
  var convert: js.UndefOr[String | Converter] = js.native
  var ctx: js.UndefOr[Hash[_]] = js.native
  var flow: js.UndefOr[Boolean] = js.native
  /* Properties that can be set as tag options, and retrieved as Tag properties */
  var init: js.UndefOr[
    js.ThisFunction3[
      /* this */ TagInst, 
      /* tagCtx */ js.UndefOr[TagCtx], 
      /* linkCtx */ js.UndefOr[LinkCtx], 
      /* ctx */ js.UndefOr[Context], 
      Unit
    ]
  ] = js.native
  var render: js.UndefOr[js.ThisFunction1[/* this */ TagInst, /* repeated */ js.Any, String | Unit]] = js.native
}

object TagOptionProps {
  @scala.inline
  def apply(): TagOptionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagOptionProps]
  }
  @scala.inline
  implicit class TagOptionPropsOps[Self <: TagOptionProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseTag(value: String | Tag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseTag")(js.undefined)
        ret
    }
    @scala.inline
    def withBindFrom(value: Double | String | (js.Array[Double | String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withBindTo(value: Double | String | (js.Array[Double | String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindTo")(js.undefined)
        ret
    }
    @scala.inline
    def withContentCtx(value: Boolean | (js.ThisFunction1[/* this */ TagInst, /* arg0 */ js.Any, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentCtx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentCtx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentCtx")(js.undefined)
        ret
    }
    @scala.inline
    def withConvertFunction2(value: (/* value */ js.Any, /* repeated */ js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convert")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withConvert(value: String | Converter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConvert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convert")(js.undefined)
        ret
    }
    @scala.inline
    def withCtx(value: Hash[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCtx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctx")(js.undefined)
        ret
    }
    @scala.inline
    def withFlow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flow")(js.undefined)
        ret
    }
    @scala.inline
    def withInit(
      value: js.ThisFunction3[
          /* this */ TagInst, 
          /* tagCtx */ js.UndefOr[TagCtx], 
          /* linkCtx */ js.UndefOr[LinkCtx], 
          /* ctx */ js.UndefOr[Context], 
          Unit
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.undefined)
        ret
    }
    @scala.inline
    def withRender(value: js.ThisFunction1[/* this */ TagInst, /* repeated */ js.Any, String | Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
        ret
    }
  }
  
}

