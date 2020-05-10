package typingsSlinky.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobDescriptionAttributes extends js.Object {
  var `current-page-order`: js.UndefOr[PageOrder] = js.native
  var `document-metadata`: js.UndefOr[js.Array[String]] = js.native
  var `job-charge-info`: js.UndefOr[String] = js.native
  var `job-mandatory-attributes`: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 86 */ js.Any
    ]
  ] = js.native
  var `job-message-from-operator`: js.UndefOr[String] = js.native
  var `job-message-to-operator-actual`: js.UndefOr[js.Array[String]] = js.native
  var `job-name`: js.UndefOr[String] = js.native
  var `job-save-printer-make-and-model`: js.UndefOr[String] = js.native
}

object JobDescriptionAttributes {
  @scala.inline
  def apply(): JobDescriptionAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobDescriptionAttributes]
  }
  @scala.inline
  implicit class JobDescriptionAttributesOps[Self <: JobDescriptionAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withCurrent-page-order`(value: PageOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current-page-order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCurrent-page-order`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current-page-order")(js.undefined)
        ret
    }
    @scala.inline
    def `withDocument-metadata`(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDocument-metadata`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-metadata")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-charge-info`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-charge-info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-charge-info`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-charge-info")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-mandatory-attributes`(
      value: js.Array[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 86 */ js.Any
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-mandatory-attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-mandatory-attributes`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-mandatory-attributes")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-message-from-operator`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-message-from-operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-message-from-operator`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-message-from-operator")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-message-to-operator-actual`(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-message-to-operator-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-message-to-operator-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-message-to-operator-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-name`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-name`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-name")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-save-printer-make-and-model`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-save-printer-make-and-model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-save-printer-make-and-model`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-save-printer-make-and-model")(js.undefined)
        ret
    }
  }
  
}

