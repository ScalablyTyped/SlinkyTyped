package typingsSlinky.firefoxWebextBrowser.anon

import typingsSlinky.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofnormandyAddonStudy extends js.Object {
  /* normandyAddonStudy events */
  /**
    * Fired when a user unenrolls from a study but before the addon is uninstalled.
    * @param reason The reason why the study is ending.
    */
  val onUnenroll: WebExtEvent[js.Function1[/* reason */ String, Unit]] = js.native
  /**
    * Marks the study as ended and then uninstalls the addon.
    * @param reason The reason why the study is ending.
    */
  def endStudy(reason: String): js.Promise[_] = js.native
  /** Returns an object with metadata about the client which may be required for constructing survey URLs. */
  def getClientMetadata(): js.Promise[_] = js.native
  /* normandyAddonStudy functions */
  /** Returns a study object for the current study. */
  def getStudy(): js.Promise[_] = js.native
}

object TypeofnormandyAddonStudy {
  @scala.inline
  def apply(
    endStudy: String => js.Promise[_],
    getClientMetadata: () => js.Promise[_],
    getStudy: () => js.Promise[_],
    onUnenroll: WebExtEvent[js.Function1[/* reason */ String, Unit]]
  ): TypeofnormandyAddonStudy = {
    val __obj = js.Dynamic.literal(endStudy = js.Any.fromFunction1(endStudy), getClientMetadata = js.Any.fromFunction0(getClientMetadata), getStudy = js.Any.fromFunction0(getStudy), onUnenroll = onUnenroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofnormandyAddonStudy]
  }
  @scala.inline
  implicit class TypeofnormandyAddonStudyOps[Self <: TypeofnormandyAddonStudy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndStudy(value: String => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endStudy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetClientMetadata(value: () => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClientMetadata")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStudy(value: () => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStudy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnUnenroll(value: WebExtEvent[js.Function1[/* reason */ String, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnenroll")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

