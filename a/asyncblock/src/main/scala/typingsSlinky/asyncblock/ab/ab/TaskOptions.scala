package typingsSlinky.asyncblock.ab.ab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskOptions extends js.Object {
  var dontWait: js.UndefOr[Boolean] = js.native
  var firstArgIsError: js.UndefOr[Boolean] = js.native
  var ignoreError: js.UndefOr[Boolean] = js.native
  var key: js.UndefOr[js.Any] = js.native
  var responseFormat: js.UndefOr[js.Array[String]] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var timeoutIsError: js.UndefOr[Boolean] = js.native
}

object TaskOptions {
  @scala.inline
  def apply(): TaskOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskOptions]
  }
  @scala.inline
  implicit class TaskOptionsOps[Self <: TaskOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDontWait(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dontWait")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDontWait: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dontWait")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstArgIsError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstArgIsError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstArgIsError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstArgIsError")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreError")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseFormat(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
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
    def withTimeoutIsError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutIsError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeoutIsError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutIsError")(js.undefined)
        ret
    }
  }
  
}

