package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait hasTrackingTemplateBuilder[B] extends js.Object {
  def withCustomParameters(customParameters: js.Object): B = js.native
  def withTrackingTemplate(trackingTemplate: String): B = js.native
}

object hasTrackingTemplateBuilder {
  @scala.inline
  def apply[B](withCustomParameters: js.Object => B, withTrackingTemplate: String => B): hasTrackingTemplateBuilder[B] = {
    val __obj = js.Dynamic.literal(withCustomParameters = js.Any.fromFunction1(withCustomParameters), withTrackingTemplate = js.Any.fromFunction1(withTrackingTemplate))
    __obj.asInstanceOf[hasTrackingTemplateBuilder[B]]
  }
  @scala.inline
  implicit class hasTrackingTemplateBuilderOps[Self[b] <: hasTrackingTemplateBuilder[b], B] (val x: Self[B]) extends AnyVal {
    @scala.inline
    def duplicate: Self[B] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[B]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[B] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[B] with Other]
    @scala.inline
    def withWithCustomParameters(value: js.Object => B): Self[B] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCustomParameters")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithTrackingTemplate(value: String => B): Self[B] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withTrackingTemplate")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

