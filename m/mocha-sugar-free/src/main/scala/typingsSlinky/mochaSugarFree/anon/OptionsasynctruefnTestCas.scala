package typingsSlinky.mochaSugarFree.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mochaSugarFree.mochaSugarFreeBooleans.`true`
import typingsSlinky.mochaSugarFree.mod.HookFunc
import typingsSlinky.mochaSugarFree.mod.SuiteFunc
import typingsSlinky.mochaSugarFree.mod.TestCase
import typingsSlinky.mochaSugarFree.mod.TestCaseWithDone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mocha-sugar-free.mocha-sugar-free.Options & {  async  :true,   fn ? :mocha-sugar-free.mocha-sugar-free.TestCaseWithDone} */
@js.native
trait OptionsasynctruefnTestCas
  extends /* option */ StringDictionary[js.Any] {
  /**
  		 * Whether the context should contain a `done` callback.
  		 */
  var async: js.UndefOr[Boolean with `true`] = js.native
  /**
  		 * Set whether timeouts are enabled.
  		 */
  var enableTimeouts: js.UndefOr[Boolean] = js.native
  /**
  		 * Whether failing to return a PromiseLike should fail the test.
  		 */
  var expectPromise: js.UndefOr[Boolean] = js.native
  /**
  		 * The test function.
  		 */
  var fn: js.UndefOr[(TestCase | TestCaseWithDone | SuiteFunc | HookFunc) with TestCaseWithDone] = js.native
  /**
  		 * Whether the test should be skipped unconditionally.
  		 */
  var skip: js.UndefOr[Boolean] = js.native
  /**
  		 * Whether the test should be skipped in a browser environment.
  		 */
  var skipIfBrowser: js.UndefOr[Boolean] = js.native
  /**
  		 * Whether the test should be skipped in a WebWorker.
  		 */
  var skipIfWebWorker: js.UndefOr[Boolean] = js.native
  /**
  		 * Whether the test should be skipped outside a browser environment.
  		 */
  var skipUnlessBrowser: js.UndefOr[Boolean] = js.native
  /**
  		 * Set test slowness threshold.
  		 */
  var slow: js.UndefOr[String | Double] = js.native
  /**
  		 * Set test timeout.
  		 */
  var timeout: js.UndefOr[String | Double] = js.native
  /**
  		 * The test title. Replaced by the title parameter if present.
  		 */
  var title: js.UndefOr[String] = js.native
}

object OptionsasynctruefnTestCas {
  @scala.inline
  def apply(): OptionsasynctruefnTestCas = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsasynctruefnTestCas]
  }
  @scala.inline
  implicit class OptionsasynctruefnTestCasOps[Self <: OptionsasynctruefnTestCas] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsync(value: Boolean with `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableTimeouts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTimeouts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableTimeouts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTimeouts")(js.undefined)
        ret
    }
    @scala.inline
    def withExpectPromise(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectPromise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpectPromise: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectPromise")(js.undefined)
        ret
    }
    @scala.inline
    def withFn(value: (TestCase | TestCaseWithDone | SuiteFunc | HookFunc) with TestCaseWithDone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fn")(js.undefined)
        ret
    }
    @scala.inline
    def withSkip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipIfBrowser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipIfBrowser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipIfBrowser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipIfBrowser")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipIfWebWorker(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipIfWebWorker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipIfWebWorker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipIfWebWorker")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipUnlessBrowser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipUnlessBrowser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipUnlessBrowser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipUnlessBrowser")(js.undefined)
        ret
    }
    @scala.inline
    def withSlow(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slow")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: String | Double): Self = {
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
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

