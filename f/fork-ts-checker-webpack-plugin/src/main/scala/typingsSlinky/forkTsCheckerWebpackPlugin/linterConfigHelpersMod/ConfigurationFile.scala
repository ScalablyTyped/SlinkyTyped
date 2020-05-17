package typingsSlinky.forkTsCheckerWebpackPlugin.linterConfigHelpersMod

import typingsSlinky.forkTsCheckerWebpackPlugin.anon.Exclude
import typingsSlinky.std.Map
import typingsSlinky.tslint.anon.PartialIOptions
import typingsSlinky.tslint.configurationMod.IConfigurationFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationFile extends IConfigurationFile {
  @JSName("linterOptions")
  var linterOptions_ConfigurationFile: js.UndefOr[Exclude] = js.native
}

object ConfigurationFile {
  @scala.inline
  def apply(
    `extends`: js.Array[String],
    jsRules: Map[String, PartialIOptions],
    rules: Map[String, PartialIOptions],
    rulesDirectory: js.Array[String]
  ): ConfigurationFile = {
    val __obj = js.Dynamic.literal(jsRules = jsRules.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any], rulesDirectory = rulesDirectory.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationFile]
  }
  @scala.inline
  implicit class ConfigurationFileOps[Self <: ConfigurationFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLinterOptions(value: Exclude): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linterOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinterOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linterOptions")(js.undefined)
        ret
    }
  }
  
}

