package typingsSlinky.awsSdkBuildTypes.apiModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Member extends js.Object {
  var documentation: js.UndefOr[java.lang.String] = js.native
  var flattened: js.UndefOr[scala.Boolean] = js.native
  var locationName: js.UndefOr[java.lang.String] = js.native
  var shape: java.lang.String = js.native
  var xmlAttribute: js.UndefOr[scala.Boolean] = js.native
}

object Member {
  @scala.inline
  def apply(shape: java.lang.String): Member = {
    val __obj = js.Dynamic.literal(shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[Member]
  }
  @scala.inline
  implicit class MemberOps[Self <: Member] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShape(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentation(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentation")(js.undefined)
        ret
    }
    @scala.inline
    def withFlattened(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flattened")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlattened: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flattened")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationName(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationName")(js.undefined)
        ret
    }
    @scala.inline
    def withXmlAttribute(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXmlAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlAttribute")(js.undefined)
        ret
    }
  }
  
}

