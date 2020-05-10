package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OlapTableViewOptions
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Optional="false" a value indicating whether the result has one or more hierarchies in the columns.
  	 */
  var hasColumns: js.UndefOr[Boolean] = js.native
  /**
  	 * Optional="false" a value indicating whether the result has one or more hierarchies in the rows.
  	 */
  var hasRows: js.UndefOr[Boolean] = js.native
  /**
  	 * Optional="false" an object of type $.ig.OlapResult.
  	 */
  var result: js.UndefOr[js.Any] = js.native
  /**
  	 * Optional="false" an object containing the table view configuration options as properties.
  	 */
  var viewSettings: js.UndefOr[OlapTableViewOptionsViewSettings] = js.native
}

object OlapTableViewOptions {
  @scala.inline
  def apply(): OlapTableViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OlapTableViewOptions]
  }
  @scala.inline
  implicit class OlapTableViewOptionsOps[Self <: OlapTableViewOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasColumns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withHasRows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasRows")(js.undefined)
        ret
    }
    @scala.inline
    def withResult(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(js.undefined)
        ret
    }
    @scala.inline
    def withViewSettings(value: OlapTableViewOptionsViewSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewSettings")(js.undefined)
        ret
    }
  }
  
}

