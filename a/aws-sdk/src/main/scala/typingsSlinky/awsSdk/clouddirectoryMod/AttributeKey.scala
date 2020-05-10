package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeKey extends js.Object {
  /**
    * The name of the facet that the attribute exists within.
    */
  var FacetName: typingsSlinky.awsSdk.clouddirectoryMod.FacetName = js.native
  /**
    * The name of the attribute.
    */
  var Name: AttributeName = js.native
  /**
    * The Amazon Resource Name (ARN) of the schema that contains the facet and attribute.
    */
  var SchemaArn: Arn = js.native
}

object AttributeKey {
  @scala.inline
  def apply(FacetName: FacetName, Name: AttributeName, SchemaArn: Arn): AttributeKey = {
    val __obj = js.Dynamic.literal(FacetName = FacetName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SchemaArn = SchemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeKey]
  }
  @scala.inline
  implicit class AttributeKeyOps[Self <: AttributeKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFacetName(value: FacetName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FacetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: AttributeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchemaArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemaArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

