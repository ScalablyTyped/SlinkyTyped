package typingsSlinky.protractor.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultTimeoutInterval
  extends /* key */ StringDictionary[js.Any] {
  /**
    * Default time to wait in ms before a test fails.
    */
  var defaultTimeoutInterval: js.UndefOr[Double] = js.native
  /**
    * If set, only execute specs whose names match the pattern, which is
    * internally compiled to a RegExp.
    */
  var grep: js.UndefOr[String] = js.native
  /**
    * Inverts 'grep' matches
    */
  var invertGrep: js.UndefOr[Boolean] = js.native
  /**
    * Function called to print jasmine results.
    */
  var print: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * If true, run specs in semi-random order
    */
  var random: js.UndefOr[Boolean] = js.native
  /**
    * Set the randomization seed if randomization is turned on
    */
  var seed: js.UndefOr[String] = js.native
  /**
    * If true, print colors to the terminal.
    */
  var showColors: js.UndefOr[Boolean] = js.native
}

object DefaultTimeoutInterval {
  @scala.inline
  def apply(): DefaultTimeoutInterval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultTimeoutInterval]
  }
  @scala.inline
  implicit class DefaultTimeoutIntervalOps[Self <: DefaultTimeoutInterval] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultTimeoutInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTimeoutInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultTimeoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTimeoutInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withGrep(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grep")(js.undefined)
        ret
    }
    @scala.inline
    def withInvertGrep(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invertGrep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvertGrep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invertGrep")(js.undefined)
        ret
    }
    @scala.inline
    def withPrint(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPrint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print")(js.undefined)
        ret
    }
    @scala.inline
    def withRandom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("random")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRandom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("random")(js.undefined)
        ret
    }
    @scala.inline
    def withSeed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seed")(js.undefined)
        ret
    }
    @scala.inline
    def withShowColors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showColors")(js.undefined)
        ret
    }
  }
  
}

