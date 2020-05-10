package typingsSlinky.extjs.Ext.app

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.IBase
import typingsSlinky.extjs.Ext.data.IModel
import typingsSlinky.extjs.Ext.data.IStore
import typingsSlinky.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IController extends IObservable {
  /** [Method] Registers one or more references
  		* @param refs Object/Object[]
  		*/
  var addRef: js.UndefOr[js.Function1[/* refs */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Property] (Ext.app.Application) */
  var application: js.UndefOr[IApplication] = js.native
  /** [Method] Adds listeners to components selected via Ext ComponentQuery
  		* @param selectors String/Object If a String, the second argument is used as the listeners, otherwise an object of selectors -> listeners is assumed
  		* @param listeners Object Config for listeners.
  		*/
  var control: js.UndefOr[
    js.Function2[/* selectors */ js.UndefOr[js.Any], /* listeners */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Returns the base Ext app Application for this controller
  		* @returns Ext.app.Application the application
  		*/
  var getApplication: js.UndefOr[js.Function0[IApplication]] = js.native
  /** [Method] Returns instance of a Controller with the given id
  		* @param id String
  		* @returns Ext.app.Controller controller instance or undefined.
  		*/
  var getController: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], this.type]] = js.native
  /** [Method] Returns a Model class with the given name
  		* @param name String
  		* @returns Ext.data.Model a model class.
  		*/
  var getModel: js.UndefOr[js.Function1[/* name */ js.UndefOr[String], IModel]] = js.native
  /** [Method] Returns instance of a Store with the given name
  		* @param name String
  		* @returns Ext.data.Store a store instance.
  		*/
  var getStore: js.UndefOr[js.Function1[/* name */ js.UndefOr[String], IStore]] = js.native
  /** [Method] Returns a View class with the given name
  		* @param name String
  		* @returns Ext.Base a view class.
  		*/
  var getView: js.UndefOr[js.Function1[/* name */ js.UndefOr[String], IBase]] = js.native
  /** [Method] Returns true if a reference is registered
  		* @param ref Object
  		* @returns Boolean
  		*/
  var hasRef: js.UndefOr[js.Function1[/* ref */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Config Option] (String) */
  var id: js.UndefOr[String] = js.native
  /** [Method] A template method that is called when your application boots
  		* @param application Ext.app.Application
  		*/
  var init: js.UndefOr[js.Function1[/* application */ js.UndefOr[IApplication], Unit]] = js.native
  /** [Method] Adds listeners to different event sources also called event domains
  		* @param to Object Config object containing domains, selectors and listeners.
  		*/
  var listen: js.UndefOr[js.Function1[/* to */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (String/String[]) */
  var models: js.UndefOr[js.Any] = js.native
  /** [Method] A template method like init but called after the viewport is created
  		* @param application Ext.app.Application
  		*/
  var onLaunch: js.UndefOr[js.Function1[/* application */ js.UndefOr[IApplication], Unit]] = js.native
  /** [Config Option] (Object[]) */
  var refs: js.UndefOr[Array] = js.native
  /** [Config Option] (String/String[]) */
  var stores: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/String[]) */
  var views: js.UndefOr[js.Any] = js.native
}

object IController {
  @scala.inline
  def apply(): IController = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IController]
  }
  @scala.inline
  implicit class IControllerOps[Self <: IController] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddRef(value: /* refs */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAddRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRef")(js.undefined)
        ret
    }
    @scala.inline
    def withApplication(value: IApplication): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application")(js.undefined)
        ret
    }
    @scala.inline
    def withControl(value: (/* selectors */ js.UndefOr[js.Any], /* listeners */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control")(js.undefined)
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
    def withGetController(value: /* id */ js.UndefOr[String] => IController): Self = {
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
    def withGetModel(value: /* name */ js.UndefOr[String] => IModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getModel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getModel")(js.undefined)
        ret
    }
    @scala.inline
    def withGetStore(value: /* name */ js.UndefOr[String] => IStore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStore")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStore")(js.undefined)
        ret
    }
    @scala.inline
    def withGetView(value: /* name */ js.UndefOr[String] => IBase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getView")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getView")(js.undefined)
        ret
    }
    @scala.inline
    def withHasRef(value: /* ref */ js.UndefOr[js.Any] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHasRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasRef")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInit(value: /* application */ js.UndefOr[IApplication] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.undefined)
        ret
    }
    @scala.inline
    def withListen(value: /* to */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutListen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listen")(js.undefined)
        ret
    }
    @scala.inline
    def withModels(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("models")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("models")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLaunch(value: /* application */ js.UndefOr[IApplication] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLaunch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLaunch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLaunch")(js.undefined)
        ret
    }
    @scala.inline
    def withRefs(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refs")(js.undefined)
        ret
    }
    @scala.inline
    def withStores(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStores: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stores")(js.undefined)
        ret
    }
    @scala.inline
    def withViews(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("views")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViews: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("views")(js.undefined)
        ret
    }
  }
  
}

