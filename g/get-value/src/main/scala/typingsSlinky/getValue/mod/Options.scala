package typingsSlinky.getValue.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * The default value to return when get-value cannot result a value from the given object.
    *
    * default: `undefined`
    */
  var default: js.UndefOr[js.Any] = js.native
  /**
    * If defined, this function is called on each resolved value.
    * Useful if you want to do `.hasOwnProperty` or `Object.prototype.propertyIsEnumerable`.
    */
  var isValid: js.UndefOr[js.Function2[/* key */ String, /* object */ Record[String, _], Boolean]] = js.native
  /**
    * Customize how the object path is created when iterating over path segments.
    *
    * default: `Array.join`
    */
  var join: js.UndefOr[js.Function1[/* segs */ js.Array[String], String]] = js.native
  /**
    * The character to use when re-joining the string to check for keys
    * with dots in them (this is probably not needed when `options.join` is used).
    * This can be a different value than the separator, since the separator can be a string or regex.
    *
    * default: `"."`
    */
  var joinChar: js.UndefOr[String] = js.native
  /**
    * The separator to use for spliting the string.
    * (this is probably not needed when `options.split` is used).
    *
    *  default: `"."`
    */
  var separator: js.UndefOr[String | js.RegExp] = js.native
  /**
    * Custom function to use for splitting the string into object path segments.
    *
    * default: `String.split`
    */
  var split: js.UndefOr[js.Function1[/* s */ String, js.Array[String]]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def withIsValid(value: (/* key */ String, /* object */ Record[String, _]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutIsValid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(js.undefined)
        ret
    }
    @scala.inline
    def withJoin(value: /* segs */ js.Array[String] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("join")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutJoin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("join")(js.undefined)
        ret
    }
    @scala.inline
    def withJoinChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("joinChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJoinChar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("joinChar")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparatorRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeparator(value: String | js.RegExp): Self = {
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
    def withSplit(value: /* s */ String => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("split")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSplit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("split")(js.undefined)
        ret
    }
  }
  
}

