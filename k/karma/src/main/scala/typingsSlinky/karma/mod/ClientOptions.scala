package typingsSlinky.karma.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientOptions extends js.Object {
  /**
    * @default undefined
    * @description When karma run is passed additional arguments on the command-line, they
    * are passed through to the test adapter as karma.config.args (an array of strings).
    * The client.args option allows you to set this value for actions other than run.
    * How this value is used is up to your test adapter - you should check your adapter's
    * documentation to see how (and if) it uses this value.
    */
  var args: js.UndefOr[js.Array[String]] = js.native
  /**
    * @default true
    * @description Capture all console output and pipe it to the terminal.
    */
  var captureConsole: js.UndefOr[Boolean] = js.native
  /**
    * @default true
    * @description Clear the context window
    * If true, Karma clears the context window upon the completion of running the tests.
    * If false, Karma does not clear the context window upon the completion of running the tests.
    * Setting this to false is useful when embedding a Jasmine Spec Runner Template.
    */
  var clearContext: js.UndefOr[Boolean] = js.native
  /**
    * @default false
    * @description Set style display none on client elements.
    * If true, Karma does not display the banner and browser list.
    * Useful when using karma on component tests with screenshots
    */
  var clientDisplayNone: js.UndefOr[Boolean] = js.native
  /**
    * @default false
    * @description Run the tests on the same window as the client, without using iframe or a new window
    */
  var runInParent: js.UndefOr[Boolean] = js.native
  /**
    * @default true
    * @description Run the tests inside an iFrame or a new window
    * If true, Karma runs the tests inside an iFrame. If false, Karma runs the tests in a new window. Some tests may not run in an
    * iFrame and may need a new window to run.
    */
  var useIframe: js.UndefOr[Boolean] = js.native
}

object ClientOptions {
  @scala.inline
  def apply(): ClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientOptions]
  }
  @scala.inline
  implicit class ClientOptionsOps[Self <: ClientOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptureConsole(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureConsole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptureConsole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureConsole")(js.undefined)
        ret
    }
    @scala.inline
    def withClearContext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearContext")(js.undefined)
        ret
    }
    @scala.inline
    def withClientDisplayNone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientDisplayNone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientDisplayNone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientDisplayNone")(js.undefined)
        ret
    }
    @scala.inline
    def withRunInParent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runInParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunInParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runInParent")(js.undefined)
        ret
    }
    @scala.inline
    def withUseIframe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useIframe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseIframe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useIframe")(js.undefined)
        ret
    }
  }
  
}

