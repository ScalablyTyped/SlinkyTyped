package typingsSlinky.cypress.cypressMod

import typingsSlinky.cypress.PartialCypressConfigurati
import typingsSlinky.cypress.cypressBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options available for `cypress.open` and `cypress.run`
  */
@js.native
trait CypressCommonOptions extends js.Object {
  /**
    * Specify configuration
    */
  var config: PartialCypressConfigurati = js.native
  /**
    * Path to the config file to be used.
    *
    * If `false` is passed, no config file will be used.
    *
    * @default "cypress.json"
    */
  var configFile: String | `false` = js.native
  /**
    * Specify environment variables
    */
  var env: js.Object = js.native
  /**
    * Path to a specific project
    */
  var project: String = js.native
}

object CypressCommonOptions {
  @scala.inline
  def apply(config: PartialCypressConfigurati, configFile: String | `false`, env: js.Object, project: String): CypressCommonOptions = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], configFile = configFile.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[CypressCommonOptions]
  }
  @scala.inline
  implicit class CypressCommonOptionsOps[Self <: CypressCommonOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: PartialCypressConfigurati): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigFile(value: String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnv(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

