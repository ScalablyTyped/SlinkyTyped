package typingsSlinky.materializeCss.M

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToastOptions extends js.Object {
  /**
    * The percentage of the toast's width it takes for a drag to dismiss a Toast.
    * @default 0.8
    */
  var activationPercent: Double = js.native
  /**
    * Classes to be added to the toast element.
    */
  var classes: String = js.native
  /**
    * Length in ms the Toast stays before dismissal.
    * @default 4000
    */
  var displayLength: Double = js.native
  /**
    * The HTML content of the Toast.
    */
  var html: String = js.native
  /**
    * Transition in duration in milliseconds.
    * @default 300
    */
  var inDuration: Double = js.native
  /**
    * Transition out duration in milliseconds.
    * @default 375
    */
  var outDuration: Double = js.native
  /**
    * Callback function called when toast is dismissed.
    */
  def completeCallback(): Unit = js.native
}

object ToastOptions {
  @scala.inline
  def apply(
    activationPercent: Double,
    classes: String,
    completeCallback: () => Unit,
    displayLength: Double,
    html: String,
    inDuration: Double,
    outDuration: Double
  ): ToastOptions = {
    val __obj = js.Dynamic.literal(activationPercent = activationPercent.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], completeCallback = js.Any.fromFunction0(completeCallback), displayLength = displayLength.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], inDuration = inDuration.asInstanceOf[js.Any], outDuration = outDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastOptions]
  }
  @scala.inline
  implicit class ToastOptionsOps[Self <: ToastOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivationPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activationPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClasses(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompleteCallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completeCallback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDisplayLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outDuration")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

