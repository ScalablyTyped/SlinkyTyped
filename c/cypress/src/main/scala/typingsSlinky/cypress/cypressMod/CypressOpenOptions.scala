package typingsSlinky.cypress.cypressMod

import typingsSlinky.cypress.anon.PartialCypressConfigurati
import typingsSlinky.cypress.cypressBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * All options that one can pass to "cypress.open"
  * @see https://on.cypress.io/module-api#cypress-open
  * @example
  ```
  const cypress = require('cypress')
  cypress.open({
  env: {
  username: 'Joe Doe',
  email: 'joe@acme.co'
  },
  project: '~/demos/my-project'
  })
  ```
  */
@js.native
trait CypressOpenOptions extends CypressCommonOptions {
  /**
    * Specify a filesystem path to a custom browser
    */
  var browser: String = js.native
  /**
    * Open Cypress in detached mode
    */
  var detached: Boolean = js.native
  /**
    * Run in global mode
    */
  var global: Boolean = js.native
  /**
    * Override default port
    */
  var port: Double = js.native
}

object CypressOpenOptions {
  @scala.inline
  def apply(
    browser: String,
    config: PartialCypressConfigurati,
    configFile: String | `false`,
    detached: Boolean,
    env: js.Object,
    global: Boolean,
    port: Double,
    project: String
  ): CypressOpenOptions = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], configFile = configFile.asInstanceOf[js.Any], detached = detached.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[CypressOpenOptions]
  }
  @scala.inline
  implicit class CypressOpenOptionsOps[Self <: CypressOpenOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrowser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetached(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

