package typingsSlinky.durandal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DurandalActivatorSettings extends js.Object {
  /**
    * Lower-cased words which represent a truthy value.
    * @default ['yes', 'ok', 'true']
    */
  var affirmations: js.Array[String] = js.native
  /**
    * The default value passed to an object's deactivate function as its close parameter.
    * @default true
    */
  var closeOnDeactivate: Boolean = js.native
  /**
    * Called immediately after the old item is deactivated.
    * @param {object} oldItem The previous item.
    * @param {boolean} close Whether or not the previous item was closed.
    * @param {function} setter The activate item setter function.
    */
  def afterDeactivate(oldItem: js.Any, close: Boolean, setter: js.Function): Unit = js.native
  /**
    * Determines whether or not the current item and the new item are the same.
    * @param {object} currentItem
    * @param {object} newItem
    * @param {object} currentActivationData
    * @param {object} newActivationData
    * @returns {boolean}
    */
  def areSameItem(currentItem: js.Any, newItem: js.Any, currentActivationData: js.Any, newActivationData: js.Any): Boolean = js.native
  /**
    * Called immediately before the new item is activated.
    * @param {object} newItem
    */
  def beforeActivate(newItem: js.Any): js.Any = js.native
  /**
    * Interprets the response of a `canActivate` or `canDeactivate` call using the known affirmative values in the `affirmations` array.
    * @param {object} value
    * @returns {boolean}
    */
  def interpretResponse(value: js.Any): Boolean = js.native
}

object DurandalActivatorSettings {
  @scala.inline
  def apply(
    affirmations: js.Array[String],
    afterDeactivate: (js.Any, Boolean, js.Function) => Unit,
    areSameItem: (js.Any, js.Any, js.Any, js.Any) => Boolean,
    beforeActivate: js.Any => js.Any,
    closeOnDeactivate: Boolean,
    interpretResponse: js.Any => Boolean
  ): DurandalActivatorSettings = {
    val __obj = js.Dynamic.literal(affirmations = affirmations.asInstanceOf[js.Any], afterDeactivate = js.Any.fromFunction3(afterDeactivate), areSameItem = js.Any.fromFunction4(areSameItem), beforeActivate = js.Any.fromFunction1(beforeActivate), closeOnDeactivate = closeOnDeactivate.asInstanceOf[js.Any], interpretResponse = js.Any.fromFunction1(interpretResponse))
    __obj.asInstanceOf[DurandalActivatorSettings]
  }
  @scala.inline
  implicit class DurandalActivatorSettingsOps[Self <: DurandalActivatorSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAffirmations(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affirmations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterDeactivate(value: (js.Any, Boolean, js.Function) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDeactivate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withAreSameItem(value: (js.Any, js.Any, js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areSameItem")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withBeforeActivate(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeActivate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCloseOnDeactivate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnDeactivate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterpretResponse(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpretResponse")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

