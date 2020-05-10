package typingsSlinky.newman.mod

import typingsSlinky.newman.newmanStrings.auto
import typingsSlinky.newman.newmanStrings.failure
import typingsSlinky.newman.newmanStrings.folder
import typingsSlinky.newman.newmanStrings.off
import typingsSlinky.newman.newmanStrings.on
import typingsSlinky.postmanCollection.mod.Collection
import typingsSlinky.postmanCollection.mod.CollectionDefinition
import typingsSlinky.postmanCollection.mod.VariableScope
import typingsSlinky.postmanCollection.mod.VariableScopeDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewmanRunOptions extends js.Object {
  /**
    * Specify whether or not to stop a collection run on encountering the
    * first test script error.
    *
    * "folder" allows you to skip the entire collection run in case an invalid
    * folder was specified using the `folder` option or an error was
    * encountered in general.
    *
    * "failure" would gracefully stop a collection run after completing the
    * current test script.
    *
    * Default value: false
    */
  var bail: js.UndefOr[Boolean | (js.Array[folder | failure])] = js.native
  /** A JSON / Collection / String representing the collection. */
  var collection: Collection | CollectionDefinition | String = js.native
  /**
    * Enable or Disable colored CLI output.
    *
    * Default value: auto
    */
  var color: js.UndefOr[on | off | auto] = js.native
  /**
    * Specify the time (in milliseconds) to wait for between subsequent
    * requests.
    *
    * Default value: 0
    */
  var delayRequest: js.UndefOr[Double] = js.native
  /** An environment JSON / file path for the current collection run. */
  var environment: js.UndefOr[VariableScope | VariableScopeDefinition | String] = js.native
  /**
    * The name or ID of the folder (ItemGroup) in the collection which would
    * be run instead of the entire collection.
    */
  var folder: js.UndefOr[String | js.Array[String]] = js.native
  /** A globals JSON / file path for the current collection run. */
  var globals: js.UndefOr[VariableScope | VariableScopeDefinition | String] = js.native
  /**
    * This specifies whether newman would automatically follow 3xx responses
    * from servers.
    *
    * Default value: false
    */
  var ignoreRedirects: js.UndefOr[Boolean] = js.native
  /**
    * Disables SSL verification checks and allows self-signed SSL certificates.
    *
    * Default value: false
    */
  var insecure: js.UndefOr[Boolean] = js.native
  /**
    * Allow reading files outside of working directory.
    */
  var insecureFileRead: js.UndefOr[Boolean] = js.native
  /**
    * Specify the number of iterations to run on the collection. This is
    * usually accompanied by providing a data file reference as
    * iterationData
    */
  var iterationCount: js.UndefOr[Double] = js.native
  /**
    * Path to the JSON or CSV file or URL to be used as data source when
    * running multiple iterations on a collection.
    */
  var iterationData: js.UndefOr[js.Any] = js.native
  /**
    * Specify options for the reporter(s) declared in options.reporters.
    */
  var reporter: js.UndefOr[js.Any] = js.native
  /** Available reporters: cli, json, html and junit. */
  var reporters: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * The path to the public client certificate file.
    */
  var sslClientCert: js.UndefOr[String] = js.native
  /**
    * The path to the private client key file.
    */
  var sslClientKey: js.UndefOr[String] = js.native
  /**
    * The secret client key passphrase.
    */
  var sslClientPassphrase: js.UndefOr[String] = js.native
  /**
    * If present, allows overriding the default exit code from the current
    * collection run, useful for bypassing collection result failures.
    *
    * Default value: false
    */
  var suppressExitCode: js.UndefOr[Boolean] = js.native
  /**
    * Specify the time (in milliseconds) to wait for the entire collection run
    * to complete execution.
    *
    * Default value: Infinity
    */
  var timeout: js.UndefOr[Double] = js.native
  /**
    * Specify the time (in milliseconds) to wait for requests to return a
    * response.
    *
    * Default value: Infinity
    */
  var timeoutRequest: js.UndefOr[Double] = js.native
  /**
    * Specify the time (in milliseconds) to wait for scripts to return a
    * response.
    *
    * Default value: Infinity
    */
  var timeoutScript: js.UndefOr[Double] = js.native
  /**
    * The path of the directory to be used as working directory.
    */
  var workingDir: js.UndefOr[String] = js.native
}

object NewmanRunOptions {
  @scala.inline
  def apply(collection: Collection | CollectionDefinition | String): NewmanRunOptions = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewmanRunOptions]
  }
  @scala.inline
  implicit class NewmanRunOptionsOps[Self <: NewmanRunOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollection(value: Collection | CollectionDefinition | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBail(value: Boolean | (js.Array[folder | failure])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bail")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: on | off | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withDelayRequest(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironment(value: VariableScope | VariableScopeDefinition | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(js.undefined)
        ret
    }
    @scala.inline
    def withFolder(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folder")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobals(value: VariableScope | VariableScopeDefinition | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globals")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreRedirects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreRedirects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreRedirects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreRedirects")(js.undefined)
        ret
    }
    @scala.inline
    def withInsecure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insecure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsecure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insecure")(js.undefined)
        ret
    }
    @scala.inline
    def withInsecureFileRead(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insecureFileRead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsecureFileRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insecureFileRead")(js.undefined)
        ret
    }
    @scala.inline
    def withIterationCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterationCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIterationCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterationCount")(js.undefined)
        ret
    }
    @scala.inline
    def withIterationData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterationData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIterationData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterationData")(js.undefined)
        ret
    }
    @scala.inline
    def withReporter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reporter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReporter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reporter")(js.undefined)
        ret
    }
    @scala.inline
    def withReporters(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reporters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReporters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reporters")(js.undefined)
        ret
    }
    @scala.inline
    def withSslClientCert(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslClientCert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslClientCert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslClientCert")(js.undefined)
        ret
    }
    @scala.inline
    def withSslClientKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslClientKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslClientKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslClientKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSslClientPassphrase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslClientPassphrase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslClientPassphrase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslClientPassphrase")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressExitCode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressExitCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressExitCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressExitCode")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeoutRequest(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeoutRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeoutScript(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeoutScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutScript")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkingDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workingDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkingDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workingDir")(js.undefined)
        ret
    }
  }
  
}

