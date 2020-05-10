package typingsSlinky.gapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigChange extends js.Object {
  /**
    * Collection of advice provided for this change, useful for determining the
    * possible impact of this change.
    */
  var advices: js.UndefOr[js.Array[Advice]] = js.native
  /** The type for this change, either ADDED, REMOVED, or MODIFIED. */
  var changeType: js.UndefOr[String] = js.native
  /**
    * Object hierarchy path to the change, with levels separated by a '.'
    * character. For repeated fields, an applicable unique identifier field is
    * used for the index (usually selector, name, or id). For maps, the term
    * 'key' is used. If the field has no unique identifier, the numeric index
    * is used.
    * Examples:
    * - visibility.rules[selector=="google.LibraryService.CreateBook"].restriction
    * - quota.metric_rules[selector=="google"].metric_costs[key=="reads"].value
    * - logging.producer_destinations[0]
    */
  var element: js.UndefOr[String] = js.native
  /**
    * Value of the changed object in the new Service configuration,
    * in JSON format. This field will not be populated if ChangeType == REMOVED.
    */
  var newValue: js.UndefOr[String] = js.native
  /**
    * Value of the changed object in the old Service configuration,
    * in JSON format. This field will not be populated if ChangeType == ADDED.
    */
  var oldValue: js.UndefOr[String] = js.native
}

object ConfigChange {
  @scala.inline
  def apply(): ConfigChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigChange]
  }
  @scala.inline
  implicit class ConfigChangeOps[Self <: ConfigChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdvices(value: js.Array[Advice]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advices")(js.undefined)
        ret
    }
    @scala.inline
    def withChangeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeType")(js.undefined)
        ret
    }
    @scala.inline
    def withElement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(js.undefined)
        ret
    }
    @scala.inline
    def withNewValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newValue")(js.undefined)
        ret
    }
    @scala.inline
    def withOldValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldValue")(js.undefined)
        ret
    }
  }
  
}

