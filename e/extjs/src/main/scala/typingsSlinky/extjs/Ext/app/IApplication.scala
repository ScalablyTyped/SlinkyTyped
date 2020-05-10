package typingsSlinky.extjs.Ext.app

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IApplication extends IController {
  /** [Config Option] (String) */
  var appFolder: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var appProperty: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var autoCreateViewport: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String/String[]) */
  var controllers: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var enableQuickTips: js.UndefOr[Boolean] = js.native
  /** [Method] Returns the base Ext app Application for this controller
  		* @returns Ext.app.Application the application
  		*/
  @JSName("getApplication")
  var getApplication_IApplication: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Method] Returns instance of a Controller with the given id
  		* @param name Object
  		* @returns Ext.app.Controller controller instance or undefined.
  		*/
  @JSName("getController")
  var getController_IApplication: js.UndefOr[js.Function1[/* name */ js.UndefOr[js.Any], IController]] = js.native
  /** [Method] Called automatically when the page has completely loaded
  		* @param profile String The detected application profile
  		* @returns Boolean By default, the Application will dispatch to the configured startup controller and action immediately after running the launch function. Return false to prevent this behavior.
  		*/
  var launch: js.UndefOr[js.Function1[/* profile */ js.UndefOr[String], Boolean]] = js.native
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.native
  /** [Config Option] (String/String[]) */
  var namespaces: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var paths: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.native
}

object IApplication {
  @scala.inline
  def apply(): IApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IApplication]
  }
  @scala.inline
  implicit class IApplicationOps[Self <: IApplication] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppFolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppFolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appFolder")(js.undefined)
        ret
    }
    @scala.inline
    def withAppProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoCreateViewport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCreateViewport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCreateViewport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCreateViewport")(js.undefined)
        ret
    }
    @scala.inline
    def withControllers(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controllers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControllers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controllers")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableQuickTips(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableQuickTips")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableQuickTips: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableQuickTips")(js.undefined)
        ret
    }
    @scala.inline
    def withGetApplication(value: () => IApplication): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getApplication")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetApplication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getApplication")(js.undefined)
        ret
    }
    @scala.inline
    def withGetController(value: /* name */ js.UndefOr[js.Any] => IController): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getController")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetController: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getController")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunch(value: /* profile */ js.UndefOr[String] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLaunch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launch")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespaces(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaces")(js.undefined)
        ret
    }
    @scala.inline
    def withPaths(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
  }
  
}

