package typingsSlinky.angularBlockUi.mod.blockUI

import typingsSlinky.angular.mod.IRequestConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockUIConfig extends js.Object {
  /**
    * By default the BlockUI module will start a block whenever
    * the Angular $http service has an pending request.
    *
    * If you don't want this behaviour and want to do all the
    * blocking manually you can change this value to false.
    *
    * The default value is 'true'
    */
  var autoBlock: js.UndefOr[Boolean] = js.native
  /**
    * When the module is started it will inject the main block element
    * by adding the "block-ui" directive to the <body> element.
    *
    * Set this to false if there no need for any fullscreen blocking or if there's
    * more control required. For instance when your ng-app directive is a child
    * element of the body element it is impossible for the blockUI resolve the main
    * instance. In such a case the auto injection of the main block scope should
    * be disabled and the main block element should be relocated.
    *
    * The default value is 'true'
    */
  var autoInjectBodyBlock: js.UndefOr[Boolean] = js.native
  /**
    * While a user interface block is active the user can still navigate
    * away using the back and forward buttons of the browser.
    *
    * Callbacks registered to handle responses from the server will
    * be executed even if a different view/controller is active at the
    * time the response arrives.
    *
    * You can set this value to true if you want to prevent navigation
    * with the browser back and forward buttons while a fullscreen
    * block is active.
    *
    * Programatic location changes via the $location service are still
    * allowed however.
    *
    * The default value is 'false'
    */
  var blockBrowserNavigation: js.UndefOr[Boolean] = js.native
  /**
    * A string containing the default css classes (separated by spaces)
    * that should be applied to each block-ui element.
    *
    * The default value is "block-ui block-ui-anim-fade"
    */
  var cssClass: js.UndefOr[String] = js.native
  /**
    * Specifies the amount in milliseconds before the block
    * is visible to the user. By delaying a visible block your
    * application will appear more responsive.
    *
    * The default value is 250.
    */
  var delay: js.UndefOr[Double] = js.native
  /**
    * Changes the default message to be used when no message
    * has been provided to the start method of the service.
    *
    * Default value is 'Loading ...'.
    */
  var message: js.UndefOr[String] = js.native
  /**
    * Allows you to specify a filter function to exclude certain ajax
    * requests from blocking the user interface.
    * The blockUI service will ignore requests when the function returns `false`.
    *
    * If the filter function returns a string it will be passed as the message
    * argument to the start method of the service.
    *
    * @param config the Angular request config object.
    *
    */
  var requestFilter: js.UndefOr[js.Function1[/* config */ IRequestConfig, String | Boolean]] = js.native
  /**
    * By default the BlockUI module will reset the block count and
    * hide the overlay whenever an exception has occurred.
    *
    * You can set this value to false if you don't want this behaviour.
    *
    * The default value is 'true'
    */
  var resetOnException: js.UndefOr[Boolean] = js.native
  /**
    * Specifies a custom template to use as the overlay.
    */
  var template: js.UndefOr[String] = js.native
  /**
    * Specifies a url to retrieve the template from.
    * The current release only works with pre-cached templates,
    * which means that this url should be known in the
    * $templateCache service of Angular.
    *
    * If you're using the grunt with html2js or angular-templates,
    * which I highly recommend, you're already set.
    */
  var templateUrl: js.UndefOr[String] = js.native
}

object BlockUIConfig {
  @scala.inline
  def apply(): BlockUIConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlockUIConfig]
  }
  @scala.inline
  implicit class BlockUIConfigOps[Self <: BlockUIConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoBlock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoInjectBodyBlock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoInjectBodyBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoInjectBodyBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoInjectBodyBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockBrowserNavigation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockBrowserNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockBrowserNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockBrowserNavigation")(js.undefined)
        ret
    }
    @scala.inline
    def withCssClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestFilter(value: /* config */ IRequestConfig => String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRequestFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withResetOnException(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetOnException")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetOnException: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetOnException")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateUrl")(js.undefined)
        ret
    }
  }
  
}

