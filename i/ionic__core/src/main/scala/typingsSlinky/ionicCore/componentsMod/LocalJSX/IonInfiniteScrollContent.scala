package typingsSlinky.ionicCore.componentsMod.LocalJSX

import typingsSlinky.ionicCore.spinnerConfigsMod.SpinnerTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonInfiniteScrollContent extends js.Object {
  /**
    * An animated SVG spinner that shows while loading.
    */
  var loadingSpinner: js.UndefOr[SpinnerTypes | Null] = js.native
  /**
    * Optional text to display while loading. `loadingText` can accept either plaintext or HTML as a string. To display characters normally reserved for HTML, they must be escaped. For example `<Ionic>` would become `&lt;Ionic&gt;`  For more information: [Security Documentation](https://ionicframework.com/docs/faq/security)
    */
  var loadingText: js.UndefOr[String] = js.native
}

object IonInfiniteScrollContent {
  @scala.inline
  def apply(): IonInfiniteScrollContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonInfiniteScrollContent]
  }
  @scala.inline
  implicit class IonInfiniteScrollContentOps[Self <: IonInfiniteScrollContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoadingSpinner(value: SpinnerTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingSpinner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingSpinner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingSpinner")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingSpinnerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingSpinner")(null)
        ret
    }
    @scala.inline
    def withLoadingText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingText")(js.undefined)
        ret
    }
  }
  
}

