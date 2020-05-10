package typingsSlinky.googleAppsScript.GoogleAppsScript.DataStudio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Builder to create a getAuthType() response for your script project.
  *
  *     function getAuthType() {
  *       var cc = DataStudioApp.createCommunityConnector();
  *       var authTypes = cc.AuthType;
  *
  *       return cc.newGetAuthTypeResponse()
  *         .setAuthType(authTypes.USER_PASS)
  *         .setHelpUrl("https://www.example.org/connector-auth-help")
  *         .build();
  *     }
  */
@js.native
trait GetAuthTypeResponse extends js.Object {
  def build(): GetAuthTypeResponse = js.native
  def printJson(): String = js.native
  def setAuthType(authType: AuthType): GetAuthTypeResponse = js.native
  def setHelpUrl(helpUrl: String): GetAuthTypeResponse = js.native
}

object GetAuthTypeResponse {
  @scala.inline
  def apply(
    build: () => GetAuthTypeResponse,
    printJson: () => String,
    setAuthType: AuthType => GetAuthTypeResponse,
    setHelpUrl: String => GetAuthTypeResponse
  ): GetAuthTypeResponse = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), printJson = js.Any.fromFunction0(printJson), setAuthType = js.Any.fromFunction1(setAuthType), setHelpUrl = js.Any.fromFunction1(setHelpUrl))
    __obj.asInstanceOf[GetAuthTypeResponse]
  }
  @scala.inline
  implicit class GetAuthTypeResponseOps[Self <: GetAuthTypeResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuild(value: () => GetAuthTypeResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPrintJson(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printJson")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetAuthType(value: AuthType => GetAuthTypeResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAuthType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetHelpUrl(value: String => GetAuthTypeResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHelpUrl")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

