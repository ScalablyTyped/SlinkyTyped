package typingsSlinky.markedjsHtmlDiffer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Sets what kind of respective attributes' content will be compared as JSON objects, but not as strings.
    * In cases when the value of the attribute is an invalid JSON or can not be wrapped into a function, it will be compared as undefined.
    * @default []
    */
  var compareAttributesAsJSON: js.UndefOr[js.Array[_]] = js.native
  /**
    * Sets what kind of respective attributes' content will be ignored during the comparison:
    * @default []
    */
  var ignoreAttributes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Makes html-differ ignore HTML comments during the comparison.
    * @default true
    */
  var ignoreComments: js.UndefOr[Boolean] = js.native
  /**
    * Makes html-differ ignore tags' duplicate attributes during the comparison.
    * From the list of the same tag's attributes,
    * the attribute which goes the first will be taken for comparison, others will be ignored
    * @default false
    */
  var ignoreDuplicateAttributes: js.UndefOr[Boolean] = js.native
  /**
    * Makes html-differ ignore end tags during the comparison.
    * @default false
    */
  var ignoreEndTags: js.UndefOr[Boolean] = js.native
  /**
    * Makes html-differ ignore whitespaces (spaces, tabs, new lines etc.) during the comparison.
    * @default true
    */
  var ignoreWhitespaces: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompareAttributesAsJSON(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareAttributesAsJSON")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompareAttributesAsJSON: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareAttributesAsJSON")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreAttributes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreComments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreComments")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreDuplicateAttributes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDuplicateAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreDuplicateAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDuplicateAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreEndTags(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreEndTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreEndTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreEndTags")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreWhitespaces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreWhitespaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreWhitespaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreWhitespaces")(js.undefined)
        ret
    }
  }
  
}

