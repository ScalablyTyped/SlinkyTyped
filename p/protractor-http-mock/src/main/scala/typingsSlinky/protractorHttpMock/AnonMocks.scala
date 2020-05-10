package typingsSlinky.protractorHttpMock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMocks extends js.Object {
  var mocks: js.UndefOr[AnonDefault] = js.native
  var plugins: js.UndefOr[AnonDefaultReadonlyArray] = js.native
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

object AnonMocks {
  @scala.inline
  def apply(): AnonMocks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonMocks]
  }
  @scala.inline
  implicit class AnonMocksOps[Self <: AnonMocks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMocks(value: AnonDefault): Self = {
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
    def withPlugins(value: AnonDefaultReadonlyArray): Self = {
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

