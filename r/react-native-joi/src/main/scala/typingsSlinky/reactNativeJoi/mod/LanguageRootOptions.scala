package typingsSlinky.reactNativeJoi.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactNativeJoi.anon.WrapArrays
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  root ? :string,   key ? :string,   messages ? :{  wrapArrays ? :boolean}, [key: string] : react-native-joi.react-native-joi.LanguageOptions} & std.Partial<std.Record<react-native-joi.react-native-joi.Types, react-native-joi.react-native-joi.LanguageOptions>> */
@js.native
trait LanguageRootOptions extends /* key */ StringDictionary[LanguageOptions] {
  var alternatives: js.UndefOr[LanguageOptions] = js.native
  var any: js.UndefOr[LanguageOptions] = js.native
  var array: js.UndefOr[LanguageOptions] = js.native
  var binary: js.UndefOr[LanguageOptions] = js.native
  var boolean: js.UndefOr[LanguageOptions] = js.native
  var date: js.UndefOr[LanguageOptions] = js.native
  var function: js.UndefOr[LanguageOptions] = js.native
  var key: js.UndefOr[String] = js.native
  var `lazy`: js.UndefOr[LanguageOptions] = js.native
  var messages: js.UndefOr[WrapArrays] = js.native
  var number: js.UndefOr[LanguageOptions] = js.native
  var `object`: js.UndefOr[LanguageOptions] = js.native
  var root: js.UndefOr[String] = js.native
  var string: js.UndefOr[LanguageOptions] = js.native
}

object LanguageRootOptions {
  @scala.inline
  def apply(): LanguageRootOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageRootOptions]
  }
  @scala.inline
  implicit class LanguageRootOptionsOps[Self <: LanguageRootOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlternatives(value: LanguageOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternatives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlternatives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternatives")(js.undefined)
        ret
    }
    @scala.inline
    def withAlternativesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternatives")(null)
        ret
    }
    @scala.inline
    def withAny(value: LanguageOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("any")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAny: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("any")(js.undefined)
        ret
    }
    @scala.inline
    def withAnyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("any")(null)
        ret
    }
    @scala.inline
    def withArray(value: LanguageOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("array")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("array")(js.undefined)
        ret
    }
    @scala.inline
    def withArrayNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("array")(null)
        ret
    }
    @scala.inline
    def withBinary(value: LanguageOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binary")(js.undefined)
        ret
    }
    @scala.inline
    def withBinaryNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binary")(null)
        ret
    }
    @scala.inline
    def withBoolean(value: LanguageOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoolean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolean")(js.undefined)
        ret
    }
    @scala.inline
    def withBooleanNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolean")(null)
        ret
    }
    @scala.inline
    def withDate(value: LanguageOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
        ret
    }
    @scala.inline
    def withDateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(null)
        ret
    }
    @scala.inline
    def withFunction(value: LanguageOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("function")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("function")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("function")(null)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withLazy(value: LanguageOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLazy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazy")(js.undefined)
        ret
    }
    @scala.inline
    def withLazyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazy")(null)
        ret
    }
    @scala.inline
    def withMessages(value: WrapArrays): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(js.undefined)
        ret
    }
    @scala.inline
    def withNumber(value: LanguageOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(null)
        ret
    }
    @scala.inline
    def withObject(value: LanguageOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(null)
        ret
    }
    @scala.inline
    def withRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withString(value: LanguageOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(js.undefined)
        ret
    }
    @scala.inline
    def withStringNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(null)
        ret
    }
  }
  
}

