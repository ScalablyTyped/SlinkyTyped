package typingsSlinky.googleapis.languageV1beta2Mod.languageV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a category returned from the text classifier.
  */
@js.native
trait SchemaClassificationCategory extends js.Object {
  /**
    * The classifier&#39;s confidence of the category. Number represents how
    * certain the classifier is that this category represents the given text.
    */
  var confidence: js.UndefOr[Double] = js.native
  /**
    * The name of the category representing the document, from the [predefined
    * taxonomy](/natural-language/docs/categories).
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaClassificationCategory {
  @scala.inline
  def apply(): SchemaClassificationCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClassificationCategory]
  }
  @scala.inline
  implicit class SchemaClassificationCategoryOps[Self <: SchemaClassificationCategory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfidence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfidence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confidence")(js.undefined)
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
  }
  
}

