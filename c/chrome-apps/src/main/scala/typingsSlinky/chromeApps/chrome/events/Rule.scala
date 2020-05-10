package typingsSlinky.chromeApps.chrome.events

import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Description of a declarative rule for handling events.
  * @template T Type for conditions array, default: any.
  * @template K Type for actions array, default: any.
  */
@js.native
trait Rule[T /* <: js.Object */, K /* <: js.Object */] extends js.Object {
  /** List of actions that are triggered if one of the condtions is fulfilled. */
  var actions: js.Array[K] = js.native
  /** List of conditions that can trigger the actions. */
  var conditions: js.Array[T] = js.native
  /** Identifier that allows referencing this rule.  */
  var id: js.UndefOr[String] = js.native
  /**
    * Optional priority of this rule.
    * @default 100
    */
  var priority: js.UndefOr[integer] = js.native
  /**
    * Tags can be used to annotate rules and perform operations on sets of rules.
    * @since Chrome 28.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
}

object Rule {
  @scala.inline
  def apply[T, K](actions: js.Array[K], conditions: js.Array[T]): Rule[T, K] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule[T, K]]
  }
  @scala.inline
  implicit class RuleOps[Self[t, k] <: Rule[t, k], T, K] (val x: Self[T, K]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, K] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, K]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, K]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, K]) with Other]
    @scala.inline
    def withActions(value: js.Array[K]): Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConditions(value: js.Array[T]): Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: integer): Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: js.Array[String]): Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

