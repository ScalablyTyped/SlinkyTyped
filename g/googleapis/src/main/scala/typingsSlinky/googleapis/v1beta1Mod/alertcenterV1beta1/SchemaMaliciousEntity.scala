package typingsSlinky.googleapis.v1beta1Mod.alertcenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Entity whose actions triggered a Gmail phishing alert.
  */
@js.native
trait SchemaMaliciousEntity extends js.Object {
  /**
    * The sender email address.
    */
  var fromHeader: js.UndefOr[String] = js.native
}

object SchemaMaliciousEntity {
  @scala.inline
  def apply(): SchemaMaliciousEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMaliciousEntity]
  }
  @scala.inline
  implicit class SchemaMaliciousEntityOps[Self <: SchemaMaliciousEntity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromHeader")(js.undefined)
        ret
    }
  }
  
}

