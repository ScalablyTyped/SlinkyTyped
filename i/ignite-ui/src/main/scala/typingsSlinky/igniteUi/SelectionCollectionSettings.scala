package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectionCollectionSettings
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  var multipleSelection: js.UndefOr[Boolean] = js.native
  var owner: js.UndefOr[js.Any] = js.native
  var subscribers: js.UndefOr[SelectionCollectionSettingsSubscribers] = js.native
}

object SelectionCollectionSettings {
  @scala.inline
  def apply(): SelectionCollectionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectionCollectionSettings]
  }
  @scala.inline
  implicit class SelectionCollectionSettingsOps[Self <: SelectionCollectionSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMultipleSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultipleSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscribers(value: SelectionCollectionSettingsSubscribers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscribers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribers")(js.undefined)
        ret
    }
  }
  
}

