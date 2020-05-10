package typingsSlinky.googleAppsScript.GoogleAppsScript.DataStudio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DataStudioApp allows scripts to interact with developer-oriented features for Data Studio.
  */
@js.native
trait DataStudioApp extends js.Object {
  def createCommunityConnector(): CommunityConnector = js.native
}

object DataStudioApp {
  @scala.inline
  def apply(createCommunityConnector: () => CommunityConnector): DataStudioApp = {
    val __obj = js.Dynamic.literal(createCommunityConnector = js.Any.fromFunction0(createCommunityConnector))
    __obj.asInstanceOf[DataStudioApp]
  }
  @scala.inline
  implicit class DataStudioAppOps[Self <: DataStudioApp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateCommunityConnector(value: () => CommunityConnector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createCommunityConnector")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

