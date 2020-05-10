package typingsSlinky.cypress.cypressMod

import typingsSlinky.cypress.PartialCypressConfigurati
import typingsSlinky.cypress.cypressBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * All options that one can pass to "cypress.run"
  * @see https://on.cypress.io/module-api#cypress-run
  * @example
  ```
  const cypress = require('cypress')
  cypress.run({
  reporter: 'junit',
  browser: 'chrome',
  config: {
  baseUrl: 'http://localhost:8080',
  chromeWebSecurity: false,
  },
  env: {
  foo: 'bar',
  baz: 'quux',
  }
  })
  ```
  */
@js.native
trait CypressRunOptions extends CypressCommonOptions {
  /**
    * Specify different browser to run tests in, either by name or by filesystem path
    */
  var browser: String = js.native
  /**
    * Specify a unique identifier for a run to enable grouping or parallelization
    */
  var ciBuildId: String = js.native
  /**
    * Group recorded tests together under a single run name
    */
  var group: String = js.native
  /**
    * Display the browser instead of running headlessly
    */
  var headed: Boolean = js.native
  /**
    * Hide the browser instead of running headed
    */
  var headless: Boolean = js.native
  /**
    * Specify your secret record key
    */
  var key: String = js.native
  /**
    * Keep Cypress open after all tests run
    */
  var noExit: Boolean = js.native
  /**
    * Run recorded specs in parallel across multiple machines
    */
  var parallel: Boolean = js.native
  /**
    * Override default port
    */
  var port: Double = js.native
  /**
    * Whether to record the test run
    */
  var record: Boolean = js.native
  /**
    * Specify a mocha reporter
    */
  var reporter: String = js.native
  /**
    * Specify mocha reporter options
    */
  var reporterOptions: js.Any = js.native
  /**
    * Specify the specs to run
    */
  var spec: String = js.native
}

object CypressRunOptions {
  @scala.inline
  def apply(
    browser: String,
    ciBuildId: String,
    config: PartialCypressConfigurati,
    configFile: String | `false`,
    env: js.Object,
    group: String,
    headed: Boolean,
    headless: Boolean,
    key: String,
    noExit: Boolean,
    parallel: Boolean,
    port: Double,
    project: String,
    record: Boolean,
    reporter: String,
    reporterOptions: js.Any,
    spec: String
  ): CypressRunOptions = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], ciBuildId = ciBuildId.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], configFile = configFile.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], headed = headed.asInstanceOf[js.Any], headless = headless.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], noExit = noExit.asInstanceOf[js.Any], parallel = parallel.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], record = record.asInstanceOf[js.Any], reporter = reporter.asInstanceOf[js.Any], reporterOptions = reporterOptions.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[CypressRunOptions]
  }
  @scala.inline
  implicit class CypressRunOptionsOps[Self <: CypressRunOptions] (val x: Self) extends AnyVal {
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
    def withCiBuildId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ciBuildId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeadless(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headless")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoExit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noExit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParallel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecord(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("record")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReporter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reporter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReporterOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reporterOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpec(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spec")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

