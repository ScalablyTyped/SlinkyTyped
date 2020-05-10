package typingsSlinky.commandLineUsage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A OptionList section adds a table displaying details of the available options. */
@js.native
trait OptionList extends Section {
  /** If specified, only options from this particular group will be printed.  */
  var group: js.UndefOr[String | js.Array[String]] = js.native
  var header: js.UndefOr[String] = js.native
  /** The names of one of more option definitions to hide from the option list.  */
  var hide: js.UndefOr[String | js.Array[String]] = js.native
  /** An array of option definition objects. */
  var optionList: js.UndefOr[js.Array[OptionDefinition]] = js.native
  /** If true, the option alias will be displayed after the name, i.e. --verbose, -v instead of -v, --verbose). */
  var reverseNameOrder: js.UndefOr[Boolean] = js.native
  /** An options object suitable for passing into table-layout. */
  var tableOptions: js.UndefOr[js.Any] = js.native
}

object OptionList {
  @scala.inline
  def apply(): OptionList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionList]
  }
  @scala.inline
  implicit class OptionListOps[Self <: OptionList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroup(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withHide(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionList(value: js.Array[OptionDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionList")(js.undefined)
        ret
    }
    @scala.inline
    def withReverseNameOrder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseNameOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReverseNameOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseNameOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withTableOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableOptions")(js.undefined)
        ret
    }
  }
  
}

