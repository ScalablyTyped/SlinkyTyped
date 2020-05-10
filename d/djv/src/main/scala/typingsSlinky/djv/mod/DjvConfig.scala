package typingsSlinky.djv.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DjvConfig extends js.Object {
  /** a handler to use for generating custom error messages */
  var errorHandler: js.UndefOr[js.Function0[Unit]] = js.native
  /** an object containing list of formatters to add for environment */
  var formats: js.UndefOr[Record[String, js.Function1[/* repeated */ String, String]]] = js.native
  /**
    * generating object should be considered as inner
    *
    * Default value is `false`/`undefined`. If `true`, then it avoid creating variables in a
    * generated function body, however without proper wrapper function approach will not work.
    */
  var inner: js.UndefOr[Boolean] = js.native
  /** defines which version of json-schema draft to use, draft-04 by default */
  var version: js.UndefOr[String] = js.native
  /** handler to apply for environment version */
  var versionConfigure: js.UndefOr[js.Function1[/* object */ js.Object, Unit]] = js.native
}

object DjvConfig {
  @scala.inline
  def apply(): DjvConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DjvConfig]
  }
  @scala.inline
  implicit class DjvConfigOps[Self <: DjvConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorHandler(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHandler")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutErrorHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withFormats(value: Record[String, js.Function1[/* repeated */ String, String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formats")(js.undefined)
        ret
    }
    @scala.inline
    def withInner(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inner")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionConfigure(value: /* object */ js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionConfigure")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutVersionConfigure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionConfigure")(js.undefined)
        ret
    }
  }
  
}

