package typingsSlinky.meteorUniverseI18n.mod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactComponentProps extends js.Object {
  var _containerType: js.UndefOr[String] = js.native
  var _locale: js.UndefOr[String] = js.native
  var _namespace: js.UndefOr[String] = js.native
  var _props: js.UndefOr[HTMLAttributes[ReactComponentClass[js.Object]]] = js.native
  var _tagType: js.UndefOr[String] = js.native
  var _translateProps: js.UndefOr[js.Array[String]] = js.native
}

object ReactComponentProps {
  @scala.inline
  def apply(): ReactComponentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactComponentProps]
  }
  @scala.inline
  implicit class ReactComponentPropsOps[Self <: ReactComponentProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_containerType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_containerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_containerType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_containerType")(js.undefined)
        ret
    }
    @scala.inline
    def with_locale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_locale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_locale")(js.undefined)
        ret
    }
    @scala.inline
    def with_namespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_namespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_namespace")(js.undefined)
        ret
    }
    @scala.inline
    def with_props(value: HTMLAttributes[ReactComponentClass[js.Object]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_props: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_props")(js.undefined)
        ret
    }
    @scala.inline
    def with_tagType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_tagType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_tagType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_tagType")(js.undefined)
        ret
    }
    @scala.inline
    def with_translateProps(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_translateProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_translateProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_translateProps")(js.undefined)
        ret
    }
  }
  
}

