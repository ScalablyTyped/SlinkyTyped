package typingsSlinky.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FargateProfileSelector extends js.Object {
  /**
    * The Kubernetes labels that the selector should match. A pod must contain all of the labels that are specified in the selector for it to be considered a match.
    */
  var labels: js.UndefOr[FargateProfileLabel] = js.native
  /**
    * The Kubernetes namespace that the selector should match.
    */
  var namespace: js.UndefOr[String] = js.native
}

object FargateProfileSelector {
  @scala.inline
  def apply(): FargateProfileSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FargateProfileSelector]
  }
  @scala.inline
  implicit class FargateProfileSelectorOps[Self <: FargateProfileSelector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabels(value: FargateProfileLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(js.undefined)
        ret
    }
  }
  
}

