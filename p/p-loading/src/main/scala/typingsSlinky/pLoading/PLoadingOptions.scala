package typingsSlinky.pLoading

import typingsSlinky.pLoading.pLoadingStrings.destroy
import typingsSlinky.pLoading.pLoadingStrings.hide
import typingsSlinky.pLoading.pLoadingStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PLoadingOptions extends js.Object {
  var action: js.UndefOr[show | hide | destroy] = js.native
  var containerAttrs: js.UndefOr[js.Object] = js.native
  var containerClass: js.UndefOr[String] = js.native
  var containerHTML: js.UndefOr[String] = js.native
  var destroyAfterHide: js.UndefOr[Boolean] = js.native
  var hideAnimation: js.UndefOr[js.Function1[/* $container */ JQuery, Unit]] = js.native
  var idPrefix: js.UndefOr[String] = js.native
  var maskColor: js.UndefOr[String] = js.native
  /**
    * @deprecated
    */
  var onDestroyContainer: js.UndefOr[js.Function1[/* $container */ JQuery, Unit]] = js.native
  /**
    * @deprecated
    */
  var onHideContainer: js.UndefOr[js.Function2[/* $pluginElement */ JQuery, /* $container */ JQuery, Unit]] = js.native
  /**
    * @deprecated
    */
  var onShowContainer: js.UndefOr[js.Function2[/* $pluginElement */ JQuery, /* $container */ JQuery, Unit]] = js.native
  var pluginNameSpace: js.UndefOr[String] = js.native
  var showAnimation: js.UndefOr[js.Function1[/* $container */ JQuery, Unit]] = js.native
  var spinnerAttrs: js.UndefOr[js.Object] = js.native
  var spinnerClass: js.UndefOr[String] = js.native
  var spinnerHTML: js.UndefOr[String] = js.native
  var useAddOns: js.UndefOr[js.Array[String]] = js.native
}

object PLoadingOptions {
  @scala.inline
  def apply(): PLoadingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PLoadingOptions]
  }
  @scala.inline
  implicit class PLoadingOptionsOps[Self <: PLoadingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: show | hide | destroy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerAttrs(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerAttrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerAttrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerAttrs")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClass")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerHTML(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerHTML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerHTML")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroyAfterHide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyAfterHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestroyAfterHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyAfterHide")(js.undefined)
        ret
    }
    @scala.inline
    def withHideAnimation(value: /* $container */ JQuery => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideAnimation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHideAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withIdPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskColor")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDestroyContainer(value: /* $container */ JQuery => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDestroyContainer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDestroyContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDestroyContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHideContainer(value: (/* $pluginElement */ JQuery, /* $container */ JQuery) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHideContainer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnHideContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHideContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShowContainer(value: (/* $pluginElement */ JQuery, /* $container */ JQuery) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShowContainer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnShowContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShowContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withPluginNameSpace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluginNameSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPluginNameSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluginNameSpace")(js.undefined)
        ret
    }
    @scala.inline
    def withShowAnimation(value: /* $container */ JQuery => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAnimation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShowAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withSpinnerAttrs(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinnerAttrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpinnerAttrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinnerAttrs")(js.undefined)
        ret
    }
    @scala.inline
    def withSpinnerClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinnerClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpinnerClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinnerClass")(js.undefined)
        ret
    }
    @scala.inline
    def withSpinnerHTML(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinnerHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpinnerHTML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinnerHTML")(js.undefined)
        ret
    }
    @scala.inline
    def withUseAddOns(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAddOns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseAddOns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAddOns")(js.undefined)
        ret
    }
  }
  
}

