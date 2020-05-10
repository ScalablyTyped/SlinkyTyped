package typingsSlinky.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Detected page from OCR.
  */
@js.native
trait SchemaPage extends js.Object {
  /**
    * List of blocks of text, images etc on this page.
    */
  var blocks: js.UndefOr[js.Array[SchemaBlock]] = js.native
  /**
    * Confidence of the OCR results on the page. Range [0, 1].
    */
  var confidence: js.UndefOr[Double] = js.native
  /**
    * Page height. For PDFs the unit is points. For images (including TIFFs)
    * the unit is pixels.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Additional information detected on the page.
    */
  var property: js.UndefOr[SchemaTextProperty] = js.native
  /**
    * Page width. For PDFs the unit is points. For images (including TIFFs) the
    * unit is pixels.
    */
  var width: js.UndefOr[Double] = js.native
}

object SchemaPage {
  @scala.inline
  def apply(): SchemaPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPage]
  }
  @scala.inline
  implicit class SchemaPageOps[Self <: SchemaPage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlocks(value: js.Array[SchemaBlock]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlocks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocks")(js.undefined)
        ret
    }
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
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withProperty(value: SchemaTextProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

