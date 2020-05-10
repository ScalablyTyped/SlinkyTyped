package typingsSlinky.qlikVisualizationextensions.NavigationAPI

import typingsSlinky.qlikVisualizationextensions.qlikVisualizationextensionsStrings.analysis_
import typingsSlinky.qlikVisualizationextensions.qlikVisualizationextensionsStrings.edit_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Navigation API for Qlik Sense. The Navigation API allows you to navigate
  * within a Qlik Sense app, and is meant to be used in visualization extensions
  * and will not work in Mashup scenarios.
  */
@js.native
trait INavigation extends js.Object {
  /**
    * Used for edit mode.
    */
  var analysis: analysis_ = js.native
  /**
    * Used for analysis mode.
    */
  var edit: edit_ = js.native
  /**
    * Gets the current sheet ID.
    * @return - A navigation result object.
    */
  def getCurrentSheetId(): NavigationResult = js.native
  /**
    * Gets the current mode.
    * @return - The current mode as a string.
    */
  def getMode(): String = js.native
  /**
    * Navigate to a given sheet in the current app.
    * The method will return before the actual navigation takes place.
    * @param sheetId - Set the sheet ID to navigate to.
    * @return - A navigation result object.
    */
  def gotoSheet(sheetId: String): NavigationResult = js.native
  /**
    * Navigate to a given story in the current app.
    * The method will return before the actual navigation takes place.
    * @param storyId - Set the story ID to navigate to.
    * @return - A navigation result object.
    */
  def gotoStory(storyId: String): NavigationResult = js.native
  /**
    * Checks if a given mode is allowed.
    * @param mode - Can be one of the strings: edit   |   analysis
    * or one of the constants: qlik.navigation.EDIT   |   qlik.navigation.ANALYSIS
    * @return - A Boolean value (true or false).
    */
  def isModeAllowed(mode: NavigationModeType): Boolean = js.native
  /**
    * Go to the next sheet in the current app.
    * It will do nothing if you do not have sheets in the current context.
    * The method will return before the actual navigation takes place.
    * @return - A navigation result object.
    */
  def nextSheet(): NavigationResult = js.native
  /**
    * Jumps to the previous sheet in the current app.
    * It will do nothing if you do not have sheets in the current context.
    * The method will return before the actual navigation takes place
    * @return - A navigation result object.
    */
  def prevSheet(): NavigationResult = js.native
  /**
    * Sets the current working mode of Qlik Sense.
    * @param mode - Can be one of the strings: edit   |   analysis
    * or one of the constants: qlik.navigation.EDIT   |   qlik.navigation.ANALYSIS
    * @return - A navigation result object.
    */
  def setMode(mode: String): NavigationResult = js.native
  /**
    * Switches the working mode of Qlik Sense.
    * @param mode - Can be one of the strings: edit   |   analysis
    * or one of the constants: qlik.navigation.EDIT   |   qlik.navigation.ANALYSIS
    * @return - A navigation result object.
    */
  def switchMode(mode: NavigationModeType): NavigationResult = js.native
}

object INavigation {
  @scala.inline
  def apply(
    analysis: analysis_,
    edit: edit_,
    getCurrentSheetId: () => NavigationResult,
    getMode: () => String,
    gotoSheet: String => NavigationResult,
    gotoStory: String => NavigationResult,
    isModeAllowed: NavigationModeType => Boolean,
    nextSheet: () => NavigationResult,
    prevSheet: () => NavigationResult,
    setMode: String => NavigationResult,
    switchMode: NavigationModeType => NavigationResult
  ): INavigation = {
    val __obj = js.Dynamic.literal(analysis = analysis.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any], getCurrentSheetId = js.Any.fromFunction0(getCurrentSheetId), getMode = js.Any.fromFunction0(getMode), gotoSheet = js.Any.fromFunction1(gotoSheet), gotoStory = js.Any.fromFunction1(gotoStory), isModeAllowed = js.Any.fromFunction1(isModeAllowed), nextSheet = js.Any.fromFunction0(nextSheet), prevSheet = js.Any.fromFunction0(prevSheet), setMode = js.Any.fromFunction1(setMode), switchMode = js.Any.fromFunction1(switchMode))
    __obj.asInstanceOf[INavigation]
  }
  @scala.inline
  implicit class INavigationOps[Self <: INavigation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnalysis(value: analysis_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analysis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdit(value: edit_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCurrentSheetId(value: () => NavigationResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentSheetId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMode(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGotoSheet(value: String => NavigationResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gotoSheet")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGotoStory(value: String => NavigationResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gotoStory")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsModeAllowed(value: NavigationModeType => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isModeAllowed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNextSheet(value: () => NavigationResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSheet")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPrevSheet(value: () => NavigationResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevSheet")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetMode(value: String => NavigationResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSwitchMode(value: NavigationModeType => NavigationResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switchMode")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

