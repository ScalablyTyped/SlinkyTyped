package typingsSlinky.googleapis.manufacturersV1Mod.manufacturersV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A feature description of the product. For more information, see
  * https://support.google.com/manufacturers/answer/6124116#featuredesc.
  */
@js.native
trait SchemaFeatureDescription extends js.Object {
  /**
    * A short description of the feature.
    */
  var headline: js.UndefOr[String] = js.native
  /**
    * An optional image describing the feature.
    */
  var image: js.UndefOr[SchemaImage] = js.native
  /**
    * A detailed description of the feature.
    */
  var text: js.UndefOr[String] = js.native
}

object SchemaFeatureDescription {
  @scala.inline
  def apply(): SchemaFeatureDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFeatureDescription]
  }
  @scala.inline
  implicit class SchemaFeatureDescriptionOps[Self <: SchemaFeatureDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeadline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headline")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: SchemaImage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

