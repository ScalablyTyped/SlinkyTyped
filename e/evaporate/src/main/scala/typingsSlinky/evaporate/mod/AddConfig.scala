package typingsSlinky.evaporate.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.File
import org.scalajs.dom.raw.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddConfig extends js.Object {
  var beforeSigner: js.UndefOr[js.Function2[/* xhr */ XMLHttpRequest, /* url */ String, Unit]] = js.native
  var cancelled: js.UndefOr[js.Function0[Unit]] = js.native
  var complete: js.UndefOr[
    js.Function3[/* xhr */ XMLHttpRequest, /* awsObjectKey */ String, /* stats */ TransferStats, Unit]
  ] = js.native
  var contentType: js.UndefOr[String] = js.native
  var error: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.native
  var file: File = js.native
  var info: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.native
  var name: String = js.native
  var nameChanged: js.UndefOr[js.Function1[/* awsObjectKey */ String, Unit]] = js.native
  var notSignedHeadersAtInitiate: js.UndefOr[StringDictionary[String]] = js.native
  var paused: js.UndefOr[js.Function1[/* file_key */ String, Unit]] = js.native
  var pausing: js.UndefOr[js.Function1[/* file_key */ String, Unit]] = js.native
  var progress: js.UndefOr[js.Function2[/* p */ Double, /* stats */ TransferStats, Unit]] = js.native
  var resumed: js.UndefOr[js.Function1[/* file_key */ String, Unit]] = js.native
  var started: js.UndefOr[js.Function1[/* file_key */ String, Unit]] = js.native
  var uploadInitiated: js.UndefOr[js.Function1[/* s3UploadId */ js.UndefOr[String], Unit]] = js.native
  var warn: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.native
  var xAmzHeadersAtComplete: js.UndefOr[StringDictionary[String]] = js.native
  var xAmzHeadersAtInitiate: js.UndefOr[StringDictionary[String]] = js.native
  var xAmzHeadersAtUpload: js.UndefOr[StringDictionary[String]] = js.native
  var xAmzHeadersCommon: js.UndefOr[StringDictionary[String]] = js.native
}

object AddConfig {
  @scala.inline
  def apply(file: File, name: String): AddConfig = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddConfig]
  }
  @scala.inline
  implicit class AddConfigOps[Self <: AddConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFile(value: File): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeSigner(value: (/* xhr */ XMLHttpRequest, /* url */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSigner")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeSigner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSigner")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelled(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCancelled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelled")(js.undefined)
        ret
    }
    @scala.inline
    def withComplete(value: (/* xhr */ XMLHttpRequest, /* awsObjectKey */ String, /* stats */ TransferStats) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.undefined)
        ret
    }
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: /* msg */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withInfo(value: /* msg */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.undefined)
        ret
    }
    @scala.inline
    def withNameChanged(value: /* awsObjectKey */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNameChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withNotSignedHeadersAtInitiate(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notSignedHeadersAtInitiate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotSignedHeadersAtInitiate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notSignedHeadersAtInitiate")(js.undefined)
        ret
    }
    @scala.inline
    def withPaused(value: /* file_key */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paused")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPaused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paused")(js.undefined)
        ret
    }
    @scala.inline
    def withPausing(value: /* file_key */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pausing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPausing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pausing")(js.undefined)
        ret
    }
    @scala.inline
    def withProgress(value: (/* p */ Double, /* stats */ TransferStats) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.undefined)
        ret
    }
    @scala.inline
    def withResumed(value: /* file_key */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResumed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumed")(js.undefined)
        ret
    }
    @scala.inline
    def withStarted(value: /* file_key */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("started")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStarted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("started")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadInitiated(value: /* s3UploadId */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadInitiated")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUploadInitiated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadInitiated")(js.undefined)
        ret
    }
    @scala.inline
    def withWarn(value: /* msg */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWarn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warn")(js.undefined)
        ret
    }
    @scala.inline
    def withXAmzHeadersAtComplete(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAmzHeadersAtComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAmzHeadersAtComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAmzHeadersAtComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withXAmzHeadersAtInitiate(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAmzHeadersAtInitiate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAmzHeadersAtInitiate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAmzHeadersAtInitiate")(js.undefined)
        ret
    }
    @scala.inline
    def withXAmzHeadersAtUpload(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAmzHeadersAtUpload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAmzHeadersAtUpload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAmzHeadersAtUpload")(js.undefined)
        ret
    }
    @scala.inline
    def withXAmzHeadersCommon(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAmzHeadersCommon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAmzHeadersCommon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAmzHeadersCommon")(js.undefined)
        ret
    }
  }
  
}

