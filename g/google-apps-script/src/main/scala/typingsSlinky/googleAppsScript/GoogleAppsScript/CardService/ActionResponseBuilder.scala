package typingsSlinky.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A builder for ActionResponse objects.
  */
@js.native
trait ActionResponseBuilder extends js.Object {
  def build(): ActionResponse = js.native
  def setNavigation(navigation: Navigation): ActionResponseBuilder = js.native
  def setNotification(notification: Notification): ActionResponseBuilder = js.native
  def setOpenLink(openLink: OpenLink): ActionResponseBuilder = js.native
  def setStateChanged(stateChanged: Boolean): ActionResponseBuilder = js.native
}

object ActionResponseBuilder {
  @scala.inline
  def apply(
    build: () => ActionResponse,
    setNavigation: Navigation => ActionResponseBuilder,
    setNotification: Notification => ActionResponseBuilder,
    setOpenLink: OpenLink => ActionResponseBuilder,
    setStateChanged: Boolean => ActionResponseBuilder
  ): ActionResponseBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), setNavigation = js.Any.fromFunction1(setNavigation), setNotification = js.Any.fromFunction1(setNotification), setOpenLink = js.Any.fromFunction1(setOpenLink), setStateChanged = js.Any.fromFunction1(setStateChanged))
    __obj.asInstanceOf[ActionResponseBuilder]
  }
  @scala.inline
  implicit class ActionResponseBuilderOps[Self <: ActionResponseBuilder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuild(value: () => ActionResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetNavigation(value: Navigation => ActionResponseBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNavigation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetNotification(value: Notification => ActionResponseBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNotification")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOpenLink(value: OpenLink => ActionResponseBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOpenLink")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetStateChanged(value: Boolean => ActionResponseBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStateChanged")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

