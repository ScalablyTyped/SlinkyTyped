package typingsSlinky.mediumEditor.MediumEditor

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mediumEditor.anon.Prop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonOptions extends Button {
  var action: js.UndefOr[String] = js.native
  var aria: js.UndefOr[String] = js.native
  var attrs: js.UndefOr[StringDictionary[String]] = js.native
  var classList: js.UndefOr[js.Array[String]] = js.native
  var contentDefault: js.UndefOr[String] = js.native
  var contentFA: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var style: js.UndefOr[Prop] = js.native
  var tagNames: js.UndefOr[js.Array[String]] = js.native
  var useQueryState: js.UndefOr[Boolean] = js.native
}

object ButtonOptions {
  @scala.inline
  def apply(): ButtonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonOptions]
  }
  @scala.inline
  implicit class ButtonOptionsOps[Self <: ButtonOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: String): Self = {
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
    def withAria(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAria: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria")(js.undefined)
        ret
    }
    @scala.inline
    def withAttrs(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(js.undefined)
        ret
    }
    @scala.inline
    def withClassList(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classList")(js.undefined)
        ret
    }
    @scala.inline
    def withContentDefault(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withContentFA(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentFA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentFA: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentFA")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: Prop): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTagNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagNames")(js.undefined)
        ret
    }
    @scala.inline
    def withUseQueryState(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useQueryState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseQueryState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useQueryState")(js.undefined)
        ret
    }
  }
  
}

