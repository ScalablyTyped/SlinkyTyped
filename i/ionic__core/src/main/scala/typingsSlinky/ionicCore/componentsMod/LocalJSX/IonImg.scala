package typingsSlinky.ionicCore.componentsMod.LocalJSX

import org.scalajs.dom.raw.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonImg extends js.Object {
  /**
    * This attribute defines the alternative text describing the image. Users will see this text displayed if the image URL is wrong, the image is not in one of the supported formats, or if the image is not yet downloaded.
    */
  var alt: js.UndefOr[String] = js.native
  /**
    * Emitted when the img fails to load
    */
  var onIonError: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  /**
    * Emitted when the image has finished loading
    */
  var onIonImgDidLoad: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  /**
    * Emitted when the img src has been set
    */
  var onIonImgWillLoad: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  /**
    * The image URL. This attribute is mandatory for the `<img>` element.
    */
  var src: js.UndefOr[String] = js.native
}

object IonImg {
  @scala.inline
  def apply(): IonImg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonImg]
  }
  @scala.inline
  implicit class IonImgOps[Self <: IonImg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIonError(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIonImgDidLoad(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonImgDidLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonImgDidLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonImgDidLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIonImgWillLoad(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonImgWillLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonImgWillLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonImgWillLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(js.undefined)
        ret
    }
  }
  
}

