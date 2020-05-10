package typingsSlinky.dotenvSafe.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MissingEnvVarsError extends Error {
  /**
    * Variables which existing in the sample file, but not in the loaded file.
    */
  var missing: js.Array[String] = js.native
  /**
    * Path to example environment file.
    */
  var sample: String = js.native
}

object MissingEnvVarsError {
  @scala.inline
  def apply(message: String, missing: js.Array[String], name: String, sample: String): MissingEnvVarsError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], missing = missing.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sample = sample.asInstanceOf[js.Any])
    __obj.asInstanceOf[MissingEnvVarsError]
  }
  @scala.inline
  implicit class MissingEnvVarsErrorOps[Self <: MissingEnvVarsError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMissing(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSample(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sample")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

