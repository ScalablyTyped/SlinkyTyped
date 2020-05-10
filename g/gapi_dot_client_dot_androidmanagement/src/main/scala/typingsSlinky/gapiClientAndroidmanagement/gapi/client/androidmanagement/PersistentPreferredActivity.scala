package typingsSlinky.gapiClientAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PersistentPreferredActivity extends js.Object {
  /**
    * The intent actions to match in the filter. If any actions are included in the filter, then an intent's action must be one of those values for it to
    * match. If no actions are included, the intent action is ignored.
    */
  var actions: js.UndefOr[js.Array[String]] = js.native
  /**
    * The intent categories to match in the filter. An intent includes the categories that it requires, all of which must be included in the filter in order
    * to match. In other words, adding a category to the filter has no impact on matching unless that category is specified in the intent.
    */
  var categories: js.UndefOr[js.Array[String]] = js.native
  /**
    * The activity that should be the default intent handler. This should be an Android component name, e.g. com.android.enterprise.app/.MainActivity.
    * Alternatively, the value may be the package name of an app, which causes Android Device Policy to choose an appropriate activity from the app to handle
    * the intent.
    */
  var receiverActivity: js.UndefOr[String] = js.native
}

object PersistentPreferredActivity {
  @scala.inline
  def apply(): PersistentPreferredActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistentPreferredActivity]
  }
  @scala.inline
  implicit class PersistentPreferredActivityOps[Self <: PersistentPreferredActivity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(js.undefined)
        ret
    }
    @scala.inline
    def withCategories(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(js.undefined)
        ret
    }
    @scala.inline
    def withReceiverActivity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiverActivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReceiverActivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiverActivity")(js.undefined)
        ret
    }
  }
  
}

