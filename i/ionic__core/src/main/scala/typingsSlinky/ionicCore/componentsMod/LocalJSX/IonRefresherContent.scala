package typingsSlinky.ionicCore.componentsMod.LocalJSX

import typingsSlinky.ionicCore.spinnerConfigsMod.SpinnerTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonRefresherContent extends js.Object {
  /**
    * A static icon to display when you begin to pull down
    */
  var pullingIcon: js.UndefOr[String | Null] = js.native
  /**
    * The text you want to display when you begin to pull down. `pullingText` can accept either plaintext or HTML as a string. To display characters normally reserved for HTML, they must be escaped. For example `<Ionic>` would become `&lt;Ionic&gt;`  For more information: [Security Documentation](https://ionicframework.com/docs/faq/security)
    */
  var pullingText: js.UndefOr[String] = js.native
  /**
    * An animated SVG spinner that shows when refreshing begins
    */
  var refreshingSpinner: js.UndefOr[SpinnerTypes | Null] = js.native
  /**
    * The text you want to display when performing a refresh. `refreshingText` can accept either plaintext or HTML as a string. To display characters normally reserved for HTML, they must be escaped. For example `<Ionic>` would become `&lt;Ionic&gt;`  For more information: [Security Documentation](https://ionicframework.com/docs/faq/security)
    */
  var refreshingText: js.UndefOr[String] = js.native
}

object IonRefresherContent {
  @scala.inline
  def apply(): IonRefresherContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonRefresherContent]
  }
  @scala.inline
  implicit class IonRefresherContentOps[Self <: IonRefresherContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPullingIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullingIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullingIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullingIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withPullingIconNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullingIcon")(null)
        ret
    }
    @scala.inline
    def withPullingText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullingText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullingText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullingText")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshingSpinner(value: SpinnerTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshingSpinner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshingSpinner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshingSpinner")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshingSpinnerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshingSpinner")(null)
        ret
    }
    @scala.inline
    def withRefreshingText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshingText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshingText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshingText")(js.undefined)
        ret
    }
  }
  
}

