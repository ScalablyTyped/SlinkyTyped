package typingsSlinky.azdata.mod.nb

import typingsSlinky.vscode.Thenable
import typingsSlinky.vscode.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationProvider extends js.Object {
  val providerId: String = js.native
  def getNavigation(notebookUri: Uri): Thenable[NavigationResult] = js.native
}

object NavigationProvider {
  @scala.inline
  def apply(getNavigation: Uri => Thenable[NavigationResult], providerId: String): NavigationProvider = {
    val __obj = js.Dynamic.literal(getNavigation = js.Any.fromFunction1(getNavigation), providerId = providerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationProvider]
  }
  @scala.inline
  implicit class NavigationProviderOps[Self <: NavigationProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetNavigation(value: Uri => Thenable[NavigationResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNavigation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withProviderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

