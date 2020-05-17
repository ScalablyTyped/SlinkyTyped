package typingsSlinky.gapiClientBooks.gapi.client.books

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientBooks.anon.CategoryId
import typingsSlinky.gapiClientBooks.anon.KeyLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnboardingResource extends js.Object {
  /** List categories for onboarding experience. */
  def listCategories(request: KeyLocale): Request[Category] = js.native
  /** List available volumes under categories for onboarding experience. */
  def listCategoryVolumes(request: CategoryId): Request[Volume2] = js.native
}

object OnboardingResource {
  @scala.inline
  def apply(
    listCategories: KeyLocale => Request[Category],
    listCategoryVolumes: CategoryId => Request[Volume2]
  ): OnboardingResource = {
    val __obj = js.Dynamic.literal(listCategories = js.Any.fromFunction1(listCategories), listCategoryVolumes = js.Any.fromFunction1(listCategoryVolumes))
    __obj.asInstanceOf[OnboardingResource]
  }
  @scala.inline
  implicit class OnboardingResourceOps[Self <: OnboardingResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withListCategories(value: KeyLocale => Request[Category]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listCategories")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListCategoryVolumes(value: CategoryId => Request[Volume2]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listCategoryVolumes")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

