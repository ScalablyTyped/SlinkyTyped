package typingsSlinky.protractorHttpMock.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mocks extends js.Object {
  var mocks: js.UndefOr[Default] = js.native
  var plugins: js.UndefOr[DefaultReadonlyArray] = js.native
  /**
    * Path to protractor configuration file.
    * Default: protractor-conf.js
    */
  var protractorConfig: js.UndefOr[String] = js.native
  /**
    * Mocks directory where mock files are located.
    * Default: process.cwd()
    */
  var rootDirectory: js.UndefOr[String] = js.native
}

object Mocks {
  @scala.inline
  def apply(): Mocks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mocks]
  }
  @scala.inline
  implicit class MocksOps[Self <: Mocks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMocks(value: Default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMocks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mocks")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: DefaultReadonlyArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withProtractorConfig(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protractorConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtractorConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protractorConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withRootDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDirectory")(js.undefined)
        ret
    }
  }
  
}

