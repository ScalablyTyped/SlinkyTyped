package typingsSlinky.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStructuralType extends js.Object {
  var complexProperties: js.Array[DataProperty] = js.native
  var dataProperties: js.Array[DataProperty] = js.native
  var name: String = js.native
  var namespace: String = js.native
  var shortName: String = js.native
  var unmappedProperties: js.Array[DataProperty] = js.native
  var validators: js.Array[Validator] = js.native
}

object IStructuralType {
  @scala.inline
  def apply(
    complexProperties: js.Array[DataProperty],
    dataProperties: js.Array[DataProperty],
    name: String,
    namespace: String,
    shortName: String,
    unmappedProperties: js.Array[DataProperty],
    validators: js.Array[Validator]
  ): IStructuralType = {
    val __obj = js.Dynamic.literal(complexProperties = complexProperties.asInstanceOf[js.Any], dataProperties = dataProperties.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], shortName = shortName.asInstanceOf[js.Any], unmappedProperties = unmappedProperties.asInstanceOf[js.Any], validators = validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStructuralType]
  }
  @scala.inline
  implicit class IStructuralTypeOps[Self <: IStructuralType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplexProperties(value: js.Array[DataProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complexProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataProperties(value: js.Array[DataProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnmappedProperties(value: js.Array[DataProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmappedProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidators(value: js.Array[Validator]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validators")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

