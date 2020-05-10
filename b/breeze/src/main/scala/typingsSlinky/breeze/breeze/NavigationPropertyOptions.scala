package typingsSlinky.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationPropertyOptions extends js.Object {
  var associationName: js.UndefOr[String] = js.native
  var entityTypeName: String = js.native
  var foreignKeyNames: js.UndefOr[js.Array[String]] = js.native
  var foreignKeyNamesOnServer: js.UndefOr[js.Array[String]] = js.native
  var isScalar: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var nameOnServer: js.UndefOr[String] = js.native
  var validators: js.UndefOr[js.Array[Validator]] = js.native
}

object NavigationPropertyOptions {
  @scala.inline
  def apply(entityTypeName: String): NavigationPropertyOptions = {
    val __obj = js.Dynamic.literal(entityTypeName = entityTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationPropertyOptions]
  }
  @scala.inline
  implicit class NavigationPropertyOptionsOps[Self <: NavigationPropertyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntityTypeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityTypeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssociationName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associationName")(js.undefined)
        ret
    }
    @scala.inline
    def withForeignKeyNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foreignKeyNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForeignKeyNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foreignKeyNames")(js.undefined)
        ret
    }
    @scala.inline
    def withForeignKeyNamesOnServer(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foreignKeyNamesOnServer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForeignKeyNamesOnServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foreignKeyNamesOnServer")(js.undefined)
        ret
    }
    @scala.inline
    def withIsScalar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isScalar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsScalar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isScalar")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNameOnServer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameOnServer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameOnServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameOnServer")(js.undefined)
        ret
    }
    @scala.inline
    def withValidators(value: js.Array[Validator]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validators")(js.undefined)
        ret
    }
  }
  
}

