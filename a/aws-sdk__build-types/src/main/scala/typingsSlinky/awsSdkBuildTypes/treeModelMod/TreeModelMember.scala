package typingsSlinky.awsSdkBuildTypes.treeModelMod

import typingsSlinky.awsSdkTypes.protocolMod.MemberLocation
import typingsSlinky.awsSdkTypes.protocolMod.XmlNamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@aws-sdk/build-types.@aws-sdk/build-types/build/TreeModel.Documented> */
/* Inlined parent @aws-sdk/types.@aws-sdk/types.Member */
@js.native
trait TreeModelMember extends js.Object {
  var documentation: js.UndefOr[String] = js.native
  var flattened: js.UndefOr[Boolean] = js.native
  var location: js.UndefOr[MemberLocation] = js.native
  var locationName: js.UndefOr[String] = js.native
  var queryName: js.UndefOr[String] = js.native
  var resultWrapper: js.UndefOr[String] = js.native
  var sensitive: js.UndefOr[Boolean] = js.native
  var shape: TreeModelShape = js.native
  var streaming: js.UndefOr[Boolean] = js.native
  var xmlAttribute: js.UndefOr[Boolean] = js.native
  var xmlNamespace: js.UndefOr[XmlNamespace] = js.native
}

object TreeModelMember {
  @scala.inline
  def apply(shape: TreeModelShape): TreeModelMember = {
    val __obj = js.Dynamic.literal(shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeModelMember]
  }
  @scala.inline
  implicit class TreeModelMemberOps[Self <: TreeModelMember] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShape(value: TreeModelShape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentation(value: String): Self = {
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
    def withFlattened(value: Boolean): Self = {
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
    def withLocation(value: MemberLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationName(value: String): Self = {
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
    def withQueryName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryName")(js.undefined)
        ret
    }
    @scala.inline
    def withResultWrapper(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultWrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withSensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sensitive")(js.undefined)
        ret
    }
    @scala.inline
    def withStreaming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streaming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreaming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streaming")(js.undefined)
        ret
    }
    @scala.inline
    def withXmlAttribute(value: Boolean): Self = {
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
    @scala.inline
    def withXmlNamespace(value: XmlNamespace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXmlNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlNamespace")(js.undefined)
        ret
    }
  }
  
}

