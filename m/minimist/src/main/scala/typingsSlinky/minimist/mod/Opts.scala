package typingsSlinky.minimist.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Opts extends js.Object {
  /**
    * When true, populate argv._ with everything before the -- and argv['--'] with everything after the --.
    * Note that with -- set, parsing for arguments still stops after the `--`.
    */
  var `--`: js.UndefOr[Boolean] = js.native
  /**
    * An object mapping string names to strings or arrays of string argument names to use as aliases
    */
  var alias: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.native
  /**
    * A boolean, string or array of strings to always treat as booleans. If true will treat
    * all double hyphenated arguments without equals signs as boolean (e.g. affects `--foo`, not `-f` or `--foo=bar`)
    */
  var boolean: js.UndefOr[Boolean | String | js.Array[String]] = js.native
  /**
    * An object mapping string argument names to default values
    */
  var default: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * When true, populate argv._ with everything after the first non-option
    */
  var stopEarly: js.UndefOr[Boolean] = js.native
  /**
    * A string or array of strings argument names to always treat as strings         
    */ 
  var string: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * A function which is invoked with a command line parameter not defined in the opts 
    * configuration object. If the function returns false, the unknown option is not added to argv         
    */
  var unknown: js.UndefOr[js.Function1[/* arg */ String, Boolean]] = js.native
}

object Opts {
  @scala.inline
  def apply(): Opts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Opts]
  }
  @scala.inline
  implicit class OptsOps[Self <: Opts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `with--`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("--")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `without--`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("--")(js.undefined)
        ret
    }
    @scala.inline
    def withAlias(value: StringDictionary[String | js.Array[String]]): Self = {
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
    def withBoolean(value: Boolean | String | js.Array[String]): Self = {
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
    def withDefault(value: StringDictionary[js.Any]): Self = {
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
    def withStopEarly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopEarly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopEarly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopEarly")(js.undefined)
        ret
    }
    @scala.inline
    def withString(value: String | js.Array[String]): Self = {
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
    def withUnknown(value: /* arg */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUnknown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknown")(js.undefined)
        ret
    }
  }
  
}

