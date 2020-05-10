package typingsSlinky.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSslPolicyReference extends js.Object {
  /**
    * URL of the SSL policy resource. Set this to empty string to clear any
    * existing SSL policy associated with the target proxy resource.
    */
  var sslPolicy: js.UndefOr[String] = js.native
}

object SchemaSslPolicyReference {
  @scala.inline
  def apply(): SchemaSslPolicyReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSslPolicyReference]
  }
  @scala.inline
  implicit class SchemaSslPolicyReferenceOps[Self <: SchemaSslPolicyReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSslPolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslPolicy")(js.undefined)
        ret
    }
  }
  
}

