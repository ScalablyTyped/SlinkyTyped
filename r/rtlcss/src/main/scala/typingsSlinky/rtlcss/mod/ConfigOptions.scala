package typingsSlinky.rtlcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigOptions extends js.Object {
  /**
    * Applies to CSS rules containing no directional properties,
    * it will update the selector by applying String Map.
    */
  var autoRename: Boolean = js.native
  /**
    * Ensures autoRename is applied only if pair exists.
    */
  var autoRenameStrict: Boolean = js.native
  /**
    * An object map of disabled plugins directives,
    * where keys are plugin names and value are object
    * hash of disabled directives. e.g. {'rtlcss':{'config':true}}.
    */
  var blacklist: js.Object = js.native
  /**
    * Removes directives comments from output CSS.
    */
  var clean: Boolean = js.native
  /**
    * Fallback value for String Map options.
    */
  var greedy: Boolean = js.native
  /**
    * Applies String Map to URLs. You can also target specific node types using an object literal.
    * e.g. {'atrule': true, 'decl': false}.
    */
  var processUrls: Boolean | js.Object = js.native
  /**
    * The default array of String Map.
    */
  var stringMap: js.Array[StringMap] = js.native
  /**
    * When enabled, flips background-position expressed in length units using calc.
    */
  var useCalc: Boolean = js.native
}

object ConfigOptions {
  @scala.inline
  def apply(
    autoRename: Boolean,
    autoRenameStrict: Boolean,
    blacklist: js.Object,
    clean: Boolean,
    greedy: Boolean,
    processUrls: Boolean | js.Object,
    stringMap: js.Array[StringMap],
    useCalc: Boolean
  ): ConfigOptions = {
    val __obj = js.Dynamic.literal(autoRename = autoRename.asInstanceOf[js.Any], autoRenameStrict = autoRenameStrict.asInstanceOf[js.Any], blacklist = blacklist.asInstanceOf[js.Any], clean = clean.asInstanceOf[js.Any], greedy = greedy.asInstanceOf[js.Any], processUrls = processUrls.asInstanceOf[js.Any], stringMap = stringMap.asInstanceOf[js.Any], useCalc = useCalc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
  @scala.inline
  implicit class ConfigOptionsOps[Self <: ConfigOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoRename(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoRenameStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRenameStrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlacklist(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blacklist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClean(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGreedy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greedy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessUrls(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processUrls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStringMap(value: js.Array[StringMap]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseCalc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCalc")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

