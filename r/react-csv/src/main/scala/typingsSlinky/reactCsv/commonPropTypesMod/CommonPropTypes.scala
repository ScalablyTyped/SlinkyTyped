package typingsSlinky.reactCsv.commonPropTypesMod

import org.scalajs.dom.raw.HTMLAnchorElement
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonPropTypes extends js.Object {
  var asyncOnClick: js.UndefOr[Boolean] = js.native
  var data: String | Data = js.native
  var enclosingCharacter: js.UndefOr[String] = js.native
  var filename: js.UndefOr[String] = js.native
  var headers: js.UndefOr[Headers] = js.native
  var onClick: js.UndefOr[SyncClickHandler | AsyncClickHandler] = js.native
  var separator: js.UndefOr[String] = js.native
  var uFEFF: js.UndefOr[Boolean] = js.native
}

object CommonPropTypes {
  @scala.inline
  def apply(data: String | Data): CommonPropTypes = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonPropTypes]
  }
  @scala.inline
  implicit class CommonPropTypesOps[Self <: CommonPropTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: String | Data): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsyncOnClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsyncOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncOnClick")(js.undefined)
        ret
    }
    @scala.inline
    def withEnclosingCharacter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enclosingCharacter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnclosingCharacter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enclosingCharacter")(js.undefined)
        ret
    }
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: Headers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClickFunction2(
      value: (/* event */ MouseEventHandler[HTMLAnchorElement], /* done */ js.Function1[/* proceed */ js.UndefOr[Boolean], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnClickFunction1(value: /* event */ MouseEventHandler[HTMLAnchorElement] => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnClick(value: SyncClickHandler | AsyncClickHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(js.undefined)
        ret
    }
    @scala.inline
    def withUFEFF(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uFEFF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUFEFF: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uFEFF")(js.undefined)
        ret
    }
  }
  
}

