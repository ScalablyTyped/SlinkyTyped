package typingsSlinky.dotenvSafe.mod

import typingsSlinky.dotenv.mod.DotenvConfigOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DotenvSafeOptions extends DotenvConfigOptions {
  /**
    * Enabling this option will not throw an error after loading.
    * @default false
    */
  var allowEmptyValues: js.UndefOr[Boolean] = js.native
  /**
    * Path to example environment file. (Option 1)
    * @default ".env.example"
    */
  var example: js.UndefOr[String] = js.native
  /**
    * Path to example environment file. (Option 2 -- example takes precedence)
    * @default ".env.example"
    */
  var sample: js.UndefOr[String] = js.native
}

object DotenvSafeOptions {
  @scala.inline
  def apply(): DotenvSafeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DotenvSafeOptions]
  }
  @scala.inline
  implicit class DotenvSafeOptionsOps[Self <: DotenvSafeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowEmptyValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEmptyValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowEmptyValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEmptyValues")(js.undefined)
        ret
    }
    @scala.inline
    def withExample(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("example")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExample: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("example")(js.undefined)
        ret
    }
    @scala.inline
    def withSample(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sample")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSample: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sample")(js.undefined)
        ret
    }
  }
  
}

