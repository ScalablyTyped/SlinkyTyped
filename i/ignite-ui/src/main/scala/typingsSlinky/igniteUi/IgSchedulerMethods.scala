package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgSchedulerMethods extends js.Object {
  /**
  	 * Changes the widget language to global language. Global language is the value in $.ig.util.language
  	 */
  def changeGlobalLanguage(): Unit = js.native
  /**
  	 * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
  	 */
  def changeGlobalRegional(): Unit = js.native
  /**
  	 * Changes the all locales into the widget element to the language specified in [options.language](ui.igscheduler#options:language)
  	 * Note that this method is for rare scenarios, see [language](ui.igscheduler#options:language) or [locale](ui.igscheduler#options:locale) option setter
  	 */
  def changeLocale(): Unit = js.native
  /**
  	 * Creates an appointment and adds it to the appointment collection
  	 *
  	 * @param appointment appointment
  	 */
  def createAppointment(appointment: js.Object): js.Object = js.native
  /**
  	 * Gets reference to the date range UI button.
  	 */
  def dateRangeButton(): String = js.native
  /**
  	 * Deletes appointment from the appointment collection
  	 *
  	 * @param appointment appointment
  	 */
  def deleteAppointment(appointment: js.Object): js.Object = js.native
  /**
  	 * Destroys the widget
  	 */
  def destroy(): Unit = js.native
  /**
  	 * Deletes appointment from the appointment collection
  	 *
  	 * @param appointment appointment
  	 * @param updateAppoinment updateAppoinment
  	 */
  def editAppointment(appointment: js.Object, updateAppoinment: js.Object): js.Object = js.native
  /**
  	 * Gets reference to a collection of all appointments for the given time range
  	 *
  	 * @param start Start date.
  	 * @param end End date.
  	 */
  def getAppointmentsInRange(start: js.Date, end: js.Date): js.Object = js.native
  /**
  	 * Gets reference to the jQuery calendar UI control.
  	 */
  def getCalendar(): String = js.native
  /**
  	 * Gets reference to the next UI button.
  	 */
  def nextButton(): String = js.native
  /**
  	 * Gets reference to the previous UI button.
  	 */
  def previousButton(): String = js.native
  /**
  	 * Gets reference to the today UI button.
  	 */
  def todayButton(): String = js.native
}

object IgSchedulerMethods {
  @scala.inline
  def apply(
    changeGlobalLanguage: () => Unit,
    changeGlobalRegional: () => Unit,
    changeLocale: () => Unit,
    createAppointment: js.Object => js.Object,
    dateRangeButton: () => String,
    deleteAppointment: js.Object => js.Object,
    destroy: () => Unit,
    editAppointment: (js.Object, js.Object) => js.Object,
    getAppointmentsInRange: (js.Date, js.Date) => js.Object,
    getCalendar: () => String,
    nextButton: () => String,
    previousButton: () => String,
    todayButton: () => String
  ): IgSchedulerMethods = {
    val __obj = js.Dynamic.literal(changeGlobalLanguage = js.Any.fromFunction0(changeGlobalLanguage), changeGlobalRegional = js.Any.fromFunction0(changeGlobalRegional), changeLocale = js.Any.fromFunction0(changeLocale), createAppointment = js.Any.fromFunction1(createAppointment), dateRangeButton = js.Any.fromFunction0(dateRangeButton), deleteAppointment = js.Any.fromFunction1(deleteAppointment), destroy = js.Any.fromFunction0(destroy), editAppointment = js.Any.fromFunction2(editAppointment), getAppointmentsInRange = js.Any.fromFunction2(getAppointmentsInRange), getCalendar = js.Any.fromFunction0(getCalendar), nextButton = js.Any.fromFunction0(nextButton), previousButton = js.Any.fromFunction0(previousButton), todayButton = js.Any.fromFunction0(todayButton))
    __obj.asInstanceOf[IgSchedulerMethods]
  }
  @scala.inline
  implicit class IgSchedulerMethodsOps[Self <: IgSchedulerMethods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeGlobalLanguage(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeGlobalLanguage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withChangeGlobalRegional(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeGlobalRegional")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withChangeLocale(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeLocale")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreateAppointment(value: js.Object => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createAppointment")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDateRangeButton(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateRangeButton")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDeleteAppointment(value: js.Object => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteAppointment")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEditAppointment(value: (js.Object, js.Object) => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editAppointment")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetAppointmentsInRange(value: (js.Date, js.Date) => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAppointmentsInRange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetCalendar(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCalendar")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNextButton(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextButton")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPreviousButton(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousButton")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTodayButton(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("todayButton")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

