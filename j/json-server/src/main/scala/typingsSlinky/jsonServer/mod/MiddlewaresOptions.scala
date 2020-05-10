package typingsSlinky.jsonServer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MiddlewaresOptions extends js.Object {
  /**
    * Enable body-parser middleware
    * @default true
    */
  var bodyParser: js.UndefOr[Boolean] = js.native
  /**
    * Enable logger middleware
    * @default true
    */
  var logger: js.UndefOr[Boolean] = js.native
  /**
    * Disable CORS
    * @default false
    */
  var noCors: js.UndefOr[Boolean] = js.native
  /**
    * Disable compression
    * @default false
    */
  var noGzip: js.UndefOr[Boolean] = js.native
  /**
    * Accept only GET requests
    * @default false
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  /**
    * Path to static files
    * @default "public" (if folder exists)
    */
  var static: js.UndefOr[String] = js.native
}

object MiddlewaresOptions {
  @scala.inline
  def apply(): MiddlewaresOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MiddlewaresOptions]
  }
  @scala.inline
  implicit class MiddlewaresOptionsOps[Self <: MiddlewaresOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBodyParser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyParser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyParser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyParser")(js.undefined)
        ret
    }
    @scala.inline
    def withLogger(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.undefined)
        ret
    }
    @scala.inline
    def withNoCors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoCors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCors")(js.undefined)
        ret
    }
    @scala.inline
    def withNoGzip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noGzip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoGzip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noGzip")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withStatic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("static")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("static")(js.undefined)
        ret
    }
  }
  
}

