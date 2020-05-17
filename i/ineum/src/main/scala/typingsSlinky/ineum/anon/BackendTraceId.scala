package typingsSlinky.ineum.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackendTraceId extends js.Object {
  var backendTraceId: js.UndefOr[String] = js.native
  var componentStack: js.UndefOr[String] = js.native
  var duration: js.UndefOr[Double] = js.native
  var error: js.UndefOr[js.Error] = js.native
  var meta: js.UndefOr[StringDictionary[String | Double | Boolean]] = js.native
}

object BackendTraceId {
  @scala.inline
  def apply(): BackendTraceId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackendTraceId]
  }
  @scala.inline
  implicit class BackendTraceIdOps[Self <: BackendTraceId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackendTraceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backendTraceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackendTraceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backendTraceId")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentStack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentStack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentStack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentStack")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: js.Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withMeta(value: StringDictionary[String | Double | Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(js.undefined)
        ret
    }
  }
  
}

