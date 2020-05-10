package typingsSlinky.officeJs.OfficeExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies which properties of an object should be loaded. This load happens when the sync() method is executed.
  * This synchronizes the states between Office objects and corresponding JavaScript proxy objects.
  * 
  * @remarks
  * 
  * For Word, the preferred method for specifying the properties and paging information is by using a string literal. 
  * The first two examples show the preferred way to request the text and font size properties for paragraphs in a paragraph collection:
  * 
  * `context.load(paragraphs, 'text, font/size');`
  * 
  * `paragraphs.load('text, font/size');`
  * 
  * Here is a similar example using object notation (includes paging):
  * 
  * `context.load(paragraphs, {select: 'text, font/size', expand: 'font', top: 50, skip: 0});`
  * 
  * `paragraphs.load({select: 'text, font/size', expand: 'font', top: 50, skip: 0});`
  * 
  * Note that if we don't specify the specific properties on the font object in the select statement, the expand statement by itself would 
  * indicate that all of the font properties are loaded.
  */
@js.native
trait LoadOption extends js.Object {
  /**
    * A comma-delimited string, or array of strings, that specifies the navigation properties to load.
    */
  var expand: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * A comma-delimited string, or array of strings, that specifies the properties to load.
    */
  var select: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Only usable on collection types. Specifies the number of items in the collection that are to be skipped and not included in the result. 
    * If top is specified, the result set will start after skipping the specified number of items.
    */
  var skip: js.UndefOr[Double] = js.native
  /**
    * Only usable on collection types. Specifies the maximum number of collection items that can be included in the result.
    */
  var top: js.UndefOr[Double] = js.native
}

object LoadOption {
  @scala.inline
  def apply(): LoadOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadOption]
  }
  @scala.inline
  implicit class LoadOptionOps[Self <: LoadOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpand(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.undefined)
        ret
    }
    @scala.inline
    def withSelect(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
    @scala.inline
    def withSkip(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
  }
  
}

