package typingsSlinky.googleapis.v1configurationMod.gamesConfigurationV1configuration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a localized string bundle resource.
  */
@js.native
trait SchemaLocalizedStringBundle extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesConfiguration#localizedStringBundle.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The locale strings.
    */
  var translations: js.UndefOr[js.Array[SchemaLocalizedString]] = js.native
}

object SchemaLocalizedStringBundle {
  @scala.inline
  def apply(): SchemaLocalizedStringBundle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocalizedStringBundle]
  }
  @scala.inline
  implicit class SchemaLocalizedStringBundleOps[Self <: SchemaLocalizedStringBundle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslations(value: js.Array[SchemaLocalizedString]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(js.undefined)
        ret
    }
  }
  
}

