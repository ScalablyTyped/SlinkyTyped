package typingsSlinky.nightwatch.mod

import typingsSlinky.nightwatch.AnonCliargs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NightwatchOptions extends js.Object {
  /**
    * Location(s) where custom assertions will be loaded from.
    */
  var custom_assertions_path: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Location(s) where custom commands will be loaded from.
    */
  var custom_commands_path: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Controls whether or not to disable coloring of the cli output globally.
    */
  var disable_color: js.UndefOr[Boolean] = js.native
  /**
    * Location of an external globals module which will be loaded and made available to the test as a property globals on the main client instance.
    * Globals can also be defined/overwritten inside a test_settings environment.
    */
  var globals_path: js.UndefOr[String] = js.native
  /**
    * Whether or not to buffer the output in case of parallel running. See below for details.
    */
  var live_output: js.UndefOr[Boolean] = js.native
  /**
    * The location where the JUnit XML report files will be saved.
    */
  var output_folder: js.UndefOr[String] = js.native
  /**
    * Location(s) where page object files will be loaded from.
    */
  var page_objects_path: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Specifies the delay(in milliseconds) between starting the child processes when running in parallel mode.
    */
  var parallel_process_delay: js.UndefOr[Double] = js.native
  /**
    * An object containing Selenium Server related configuration options. See below for details.
    */
  var selenium: js.UndefOr[NightwatchSeleniumOptions] = js.native
  /**
    * An array of folders (excluding subfolders) where the tests are located.
    */
  var src_folders: String | js.Array[String] = js.native
  /**
    * Specifies which test runner to use when running the tests. Values can be either default (built in nightwatch runner) or mocha.
    * Example: "test_runner" : {"type" : "mocha", "options" : {"ui" : "tdd"}}
    */
  var test_runner: js.UndefOr[String | NightwatchTestRunner] = js.native
  /**
    * This object contains all the test related options. See below for details.
    */
  var test_settings: NightwatchTestSettings = js.native
  /**
    * Whether or not to run individual test files in parallel. If set to true, runs the tests in parallel and determines the number of workers automatically.
    * If set to an object, can specify specify the number of workers as "auto" or a number. Example: "test_workers" : {"enabled" : true, "workers" : "auto"}
    */
  var test_workers: js.UndefOr[Boolean | NightwatchTestWorker] = js.native
  /**
    * Allows for webdriver config (mostly the same as selenium)
    */
  var webdriver: js.UndefOr[AnonCliargs] = js.native
}

object NightwatchOptions {
  @scala.inline
  def apply(src_folders: String | js.Array[String], test_settings: NightwatchTestSettings): NightwatchOptions = {
    val __obj = js.Dynamic.literal(src_folders = src_folders.asInstanceOf[js.Any], test_settings = test_settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchOptions]
  }
  @scala.inline
  implicit class NightwatchOptionsOps[Self <: NightwatchOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSrc_folders(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src_folders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTest_settings(value: NightwatchTestSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test_settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustom_assertions_path(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_assertions_path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom_assertions_path: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_assertions_path")(js.undefined)
        ret
    }
    @scala.inline
    def withCustom_commands_path(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_commands_path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom_commands_path: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_commands_path")(js.undefined)
        ret
    }
    @scala.inline
    def withDisable_color(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisable_color: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_color")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobals_path(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globals_path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobals_path: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globals_path")(js.undefined)
        ret
    }
    @scala.inline
    def withLive_output(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("live_output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLive_output: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("live_output")(js.undefined)
        ret
    }
    @scala.inline
    def withOutput_folder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output_folder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput_folder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output_folder")(js.undefined)
        ret
    }
    @scala.inline
    def withPage_objects_path(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page_objects_path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage_objects_path: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page_objects_path")(js.undefined)
        ret
    }
    @scala.inline
    def withParallel_process_delay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallel_process_delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParallel_process_delay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallel_process_delay")(js.undefined)
        ret
    }
    @scala.inline
    def withSelenium(value: NightwatchSeleniumOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selenium")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelenium: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selenium")(js.undefined)
        ret
    }
    @scala.inline
    def withTest_runner(value: String | NightwatchTestRunner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test_runner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTest_runner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test_runner")(js.undefined)
        ret
    }
    @scala.inline
    def withTest_workers(value: Boolean | NightwatchTestWorker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test_workers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTest_workers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test_workers")(js.undefined)
        ret
    }
    @scala.inline
    def withWebdriver(value: AnonCliargs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webdriver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebdriver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webdriver")(js.undefined)
        ret
    }
  }
  
}

