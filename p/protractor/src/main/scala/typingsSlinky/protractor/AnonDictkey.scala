package typingsSlinky.protractor

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDictkey
  extends /* key */ StringDictionary[js.Any] {
  var browserName: js.UndefOr[String] = js.native
  /**
    * Number of times to run this set of capabilities (in parallel, unless
    * limited by maxSessions). Default is 1.
    */
  var count: js.UndefOr[Double] = js.native
  /**
    * Spec files to be excluded on this capability only.
    */
  var exclude: js.UndefOr[js.Array[String]] = js.native
  /**
    * User defined name for the capability that will display in the results
    * log. Defaults to the browser name
    */
  var logName: js.UndefOr[String] = js.native
  /**
    * Maximum number of browser instances that can run in parallel for this
    * set of capabilities. This is only needed if shardTestFiles is true.
    * Default is 1.
    */
  var maxInstances: js.UndefOr[Double] = js.native
  /**
    * Name of the process executing this capability.  Not used directly by
    * protractor or the browser, but instead pass directly to third parties
    * like BrowserStack and SauceLabs as the name of the job running this
    * test
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Optional: override global seleniumAddress on this capability only.
    */
  var seleniumAddress: js.UndefOr[String] = js.native
  /**
    * If this is set to be true, specs will be sharded by file (i.e. all
    * files to be run by this set of capabilities will run in parallel).
    * Default is false.
    */
  var shardTestFiles: js.UndefOr[Boolean] = js.native
  /**
    * Additional spec files to be run on this capability only.
    */
  var specs: js.UndefOr[js.Array[String]] = js.native
}

object AnonDictkey {
  @scala.inline
  def apply(): AnonDictkey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDictkey]
  }
  @scala.inline
  implicit class AnonDictkeyOps[Self <: AnonDictkey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrowserName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowserName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserName")(js.undefined)
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withExclude(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.undefined)
        ret
    }
    @scala.inline
    def withLogName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logName")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxInstances(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxInstances")(js.undefined)
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
    def withSeleniumAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seleniumAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeleniumAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seleniumAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withShardTestFiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shardTestFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShardTestFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shardTestFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specs")(js.undefined)
        ret
    }
  }
  
}

