package typingsSlinky.liftoff.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.fined.mod.PathSpec
import typingsSlinky.interpret.mod.Extensions_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * A method to handle bash/zsh/whatever completions.
    * @default null
    */
  var completions: js.UndefOr[js.Function1[/* completion */ String, _]] = js.native
  /**
    * An object of configuration files to find. Each property is keyed by the
    * default basename of the file being found, and the value is an object
    * of path arguments keyed by unique names.
    * @default null
    */
  var configFiles: js.UndefOr[StringDictionary[StringDictionary[String | PathSpec]]] = js.native
  /**
    * Sets the name of the configuration file Liftoff will attempt to find. Case-insensitive.
    * @default null
    */
  var configName: js.UndefOr[String] = js.native
  /**
    * Set extensions to include when searching for a configuration file.
    * If an external module is needed to load a given extension (e.g. .coffee),
    * the module name should be specified as the value for the key.
    * @default {".js":null,".json":null}
    */
  var extensions: js.UndefOr[Extensions_] = js.native
  /**
    * Sets which module your application expects to find locally when being run.
    * @default null
    */
  var moduleName: js.UndefOr[String] = js.native
  /**
    * Sugar for setting processTitle, moduleName, configName automatically.
    * @default null
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Sets what the process title will be.
    * @default null
    */
  var processTitle: js.UndefOr[String] = js.native
  /**
    * Any flag specified here will be applied to node, not your program.
    * Useful for supporting invocations like myapp --harmony command,
    * where --harmony should be passed to node, not your program.
    * This functionality is implemented using flagged-respawn.
    * To support all v8flags, see `v8flags`.
    * @default null
    */
  var v8flags: js.UndefOr[
    js.Array[String] | (js.Function1[/* cb */ js.Function2[/* err */ js.Any, /* flags */ js.Array[String], Unit], Unit])
  ] = js.native
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
    def withCompletions(value: /* completion */ String => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCompletions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completions")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigFiles(value: StringDictionary[StringDictionary[String | PathSpec]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configName")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensions(value: Extensions_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withModuleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModuleName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(js.undefined)
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
    def withProcessTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withV8flagsFunction1(value: /* cb */ js.Function2[/* err */ js.Any, /* flags */ js.Array[String], Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v8flags")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withV8flags(
      value: js.Array[String] | (js.Function1[/* cb */ js.Function2[/* err */ js.Any, /* flags */ js.Array[String], Unit], Unit])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v8flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutV8flags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v8flags")(js.undefined)
        ret
    }
  }
  
}

