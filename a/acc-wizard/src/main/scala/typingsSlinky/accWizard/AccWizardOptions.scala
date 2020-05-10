package typingsSlinky.accWizard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccWizardOptions extends js.Object {
  /**
    * @summary Class to indicate the active task in sidebar.
    * @type {string}
    */
  var activeClass: String = js.native
  /**
    * @summary Add next/prev buttons to panels.
    * @type {boolean}
    */
  var addButtons: Boolean = js.native
  /**
    * @summary Auto-scrolling.
    * @type {boolean}
    */
  var autoScrolling: Boolean = js.native
  /**
    * @summary Class(es) for back button.
    * @type {string}
    */
  var backClasses: String = js.native
  /**
    * @summary Text for back button.
    * @type {string}
    */
  var backText: String = js.native
  /**
    * @summary HTML input type for back button. (default: "reset")
    * @type {string}
    */
  var backType: String = js.native
  /**
    * @summary Class to indicate task is complete.
    * @type {string}
    */
  var completedClass: String = js.native
  /**
    * @summary Class(es) for next button.
    * @type {string}
    */
  var nextClasses: String = js.native
  /**
    * @summary Text for next button.
    * @type {string}
    */
  var nextText: String = js.native
  /**
    * @summary HTML input type for next button. (default: "submit")
    * @type {string}
    */
  var nextType: String = js.native
  /**
    * @summary Function to call on back up.
    */
  var onBack: js.Function = js.native
  /**
    * @summary A chance to hook destruction.
    */
  var onDestroy: js.Function = js.native
  /**
    * @summary A chance to hook initialization.
    */
  var onInit: js.Function = js.native
  /**
    * @summary Function to call on next step.
    */
  var onNext: js.Function = js.native
  /**
    * @summary Selector for task sidebar.
    * @type {string}
    */
  var sidebar: String = js.native
  /**
    * @summary Class for step buttons within panels.
    * @type {string}
    */
  var stepClass: String = js.native
  /**
    * @summary Class to indicate task is still pending.
    * @type {string}
    */
  var todoClass: String = js.native
}

object AccWizardOptions {
  @scala.inline
  def apply(
    activeClass: String,
    addButtons: Boolean,
    autoScrolling: Boolean,
    backClasses: String,
    backText: String,
    backType: String,
    completedClass: String,
    nextClasses: String,
    nextText: String,
    nextType: String,
    onBack: js.Function,
    onDestroy: js.Function,
    onInit: js.Function,
    onNext: js.Function,
    sidebar: String,
    stepClass: String,
    todoClass: String
  ): AccWizardOptions = {
    val __obj = js.Dynamic.literal(activeClass = activeClass.asInstanceOf[js.Any], addButtons = addButtons.asInstanceOf[js.Any], autoScrolling = autoScrolling.asInstanceOf[js.Any], backClasses = backClasses.asInstanceOf[js.Any], backText = backText.asInstanceOf[js.Any], backType = backType.asInstanceOf[js.Any], completedClass = completedClass.asInstanceOf[js.Any], nextClasses = nextClasses.asInstanceOf[js.Any], nextText = nextText.asInstanceOf[js.Any], nextType = nextType.asInstanceOf[js.Any], onBack = onBack.asInstanceOf[js.Any], onDestroy = onDestroy.asInstanceOf[js.Any], onInit = onInit.asInstanceOf[js.Any], onNext = onNext.asInstanceOf[js.Any], sidebar = sidebar.asInstanceOf[js.Any], stepClass = stepClass.asInstanceOf[js.Any], todoClass = todoClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccWizardOptions]
  }
  @scala.inline
  implicit class AccWizardOptionsOps[Self <: AccWizardOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddButtons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoScrolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackClasses(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompletedClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completedClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextClasses(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnBack(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnDestroy(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDestroy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnInit(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnNext(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSidebar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStepClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTodoClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("todoClass")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

