package typingsSlinky.pulumiKubernetes.outputMod.authorization.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  */
@js.native
trait SelfSubjectRulesReviewSpec extends js.Object {
  /**
    * Namespace to evaluate rules for. Required.
    */
  val namespace: String = js.native
}

object SelfSubjectRulesReviewSpec {
  @scala.inline
  def apply(namespace: String): SelfSubjectRulesReviewSpec = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelfSubjectRulesReviewSpec]
  }
  @scala.inline
  implicit class SelfSubjectRulesReviewSpecOps[Self <: SelfSubjectRulesReviewSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

