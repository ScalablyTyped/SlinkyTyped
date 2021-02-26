package typingsSlinky.extjs.Ext

import typingsSlinky.extjs.Ext.data.IModel
import typingsSlinky.extjs.Ext.data.IStore
import typingsSlinky.extjs.Ext.util.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object app {
  
  @js.native
  trait EventBus extends StObject
  
  @js.native
  trait IApplication extends IController {
    
    /** [Config Option] (String) */
    var appFolder: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (String) */
    var appProperty: js.UndefOr[java.lang.String] = js.native
    
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
    var launch: js.UndefOr[js.Function1[/* profile */ js.UndefOr[java.lang.String], Boolean]] = js.native
    
    /** [Config Option] (String) */
    var name: js.UndefOr[java.lang.String] = js.native
    
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
    implicit class IApplicationMutableBuilder[Self <: IApplication] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppFolder(value: java.lang.String): Self = StObject.set(x, "appFolder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppFolderUndefined: Self = StObject.set(x, "appFolder", js.undefined)
      
      @scala.inline
      def setAppProperty(value: java.lang.String): Self = StObject.set(x, "appProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppPropertyUndefined: Self = StObject.set(x, "appProperty", js.undefined)
      
      @scala.inline
      def setAutoCreateViewport(value: Boolean): Self = StObject.set(x, "autoCreateViewport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCreateViewportUndefined: Self = StObject.set(x, "autoCreateViewport", js.undefined)
      
      @scala.inline
      def setControllers(value: js.Any): Self = StObject.set(x, "controllers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControllersUndefined: Self = StObject.set(x, "controllers", js.undefined)
      
      @scala.inline
      def setEnableQuickTips(value: Boolean): Self = StObject.set(x, "enableQuickTips", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableQuickTipsUndefined: Self = StObject.set(x, "enableQuickTips", js.undefined)
      
      @scala.inline
      def setGetApplication(value: () => IApplication): Self = StObject.set(x, "getApplication", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetApplicationUndefined: Self = StObject.set(x, "getApplication", js.undefined)
      
      @scala.inline
      def setGetController(value: /* name */ js.UndefOr[js.Any] => IController): Self = StObject.set(x, "getController", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetControllerUndefined: Self = StObject.set(x, "getController", js.undefined)
      
      @scala.inline
      def setLaunch(value: /* profile */ js.UndefOr[java.lang.String] => Boolean): Self = StObject.set(x, "launch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLaunchUndefined: Self = StObject.set(x, "launch", js.undefined)
      
      @scala.inline
      def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNamespaces(value: js.Any): Self = StObject.set(x, "namespaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespacesUndefined: Self = StObject.set(x, "namespaces", js.undefined)
      
      @scala.inline
      def setPaths(value: js.Any): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      @scala.inline
      def setScope(value: js.Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
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
    var getController: js.UndefOr[js.Function1[/* id */ js.UndefOr[java.lang.String], this.type]] = js.native
    
    /** [Method] Returns a Model class with the given name
      * @param name String
      * @returns Ext.data.Model a model class.
      */
    var getModel: js.UndefOr[js.Function1[/* name */ js.UndefOr[java.lang.String], IModel]] = js.native
    
    /** [Method] Returns instance of a Store with the given name
      * @param name String
      * @returns Ext.data.Store a store instance.
      */
    var getStore: js.UndefOr[js.Function1[/* name */ js.UndefOr[java.lang.String], IStore]] = js.native
    
    /** [Method] Returns a View class with the given name
      * @param name String
      * @returns Ext.Base a view class.
      */
    var getView: js.UndefOr[js.Function1[/* name */ js.UndefOr[java.lang.String], IBase]] = js.native
    
    /** [Method] Returns true if a reference is registered
      * @param ref Object
      * @returns Boolean
      */
    var hasRef: js.UndefOr[js.Function1[/* ref */ js.UndefOr[js.Any], Boolean]] = js.native
    
    /** [Config Option] (String) */
    var id: js.UndefOr[java.lang.String] = js.native
    
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
    implicit class IControllerMutableBuilder[Self <: IController] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddRef(value: /* refs */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "addRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddRefUndefined: Self = StObject.set(x, "addRef", js.undefined)
      
      @scala.inline
      def setApplication(value: IApplication): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
      
      @scala.inline
      def setControl(value: (/* selectors */ js.UndefOr[js.Any], /* listeners */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "control", js.Any.fromFunction2(value))
      
      @scala.inline
      def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
      
      @scala.inline
      def setGetApplication(value: () => IApplication): Self = StObject.set(x, "getApplication", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetApplicationUndefined: Self = StObject.set(x, "getApplication", js.undefined)
      
      @scala.inline
      def setGetController(value: /* id */ js.UndefOr[java.lang.String] => IController): Self = StObject.set(x, "getController", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetControllerUndefined: Self = StObject.set(x, "getController", js.undefined)
      
      @scala.inline
      def setGetModel(value: /* name */ js.UndefOr[java.lang.String] => IModel): Self = StObject.set(x, "getModel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetModelUndefined: Self = StObject.set(x, "getModel", js.undefined)
      
      @scala.inline
      def setGetStore(value: /* name */ js.UndefOr[java.lang.String] => IStore): Self = StObject.set(x, "getStore", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetStoreUndefined: Self = StObject.set(x, "getStore", js.undefined)
      
      @scala.inline
      def setGetView(value: /* name */ js.UndefOr[java.lang.String] => IBase): Self = StObject.set(x, "getView", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetViewUndefined: Self = StObject.set(x, "getView", js.undefined)
      
      @scala.inline
      def setHasRef(value: /* ref */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "hasRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasRefUndefined: Self = StObject.set(x, "hasRef", js.undefined)
      
      @scala.inline
      def setId(value: java.lang.String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInit(value: /* application */ js.UndefOr[IApplication] => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      @scala.inline
      def setListen(value: /* to */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "listen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setListenUndefined: Self = StObject.set(x, "listen", js.undefined)
      
      @scala.inline
      def setModels(value: js.Any): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelsUndefined: Self = StObject.set(x, "models", js.undefined)
      
      @scala.inline
      def setOnLaunch(value: /* application */ js.UndefOr[IApplication] => Unit): Self = StObject.set(x, "onLaunch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLaunchUndefined: Self = StObject.set(x, "onLaunch", js.undefined)
      
      @scala.inline
      def setRefs(value: Array): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefsUndefined: Self = StObject.set(x, "refs", js.undefined)
      
      @scala.inline
      def setStores(value: js.Any): Self = StObject.set(x, "stores", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoresUndefined: Self = StObject.set(x, "stores", js.undefined)
      
      @scala.inline
      def setViews(value: js.Any): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
    }
  }
  
  type IEventBus = IBase
  
  @js.native
  trait IEventDomain extends IBase {
    
    /** [Config Option] (String) */
    var idProperty: js.UndefOr[java.lang.String] = js.native
    
    /** [Property] (Object) */
    var instances: js.UndefOr[js.Any] = js.native
    
    /** [Method] This method matches the firer of the event the target to the given selector
      * @param target Object The firer of the event.
      * @param selector String The selector to which to match the target.
      * @returns Boolean true if the target matches the selector.
      */
    var `match`: js.UndefOr[
        js.Function2[
          /* target */ js.UndefOr[js.Any], 
          /* selector */ js.UndefOr[java.lang.String], 
          Boolean
        ]
      ] = js.native
    
    /** [Method] This method is called by the derived class to monitor fireEvent calls
      * @param observable Ext.Class The Observable to monitor for events.
      */
    var monitor: js.UndefOr[js.Function1[/* observable */ js.UndefOr[IClass], Unit]] = js.native
  }
  object IEventDomain {
    
    @scala.inline
    def apply(): IEventDomain = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEventDomain]
    }
    
    @scala.inline
    implicit class IEventDomainMutableBuilder[Self <: IEventDomain] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdProperty(value: java.lang.String): Self = StObject.set(x, "idProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdPropertyUndefined: Self = StObject.set(x, "idProperty", js.undefined)
      
      @scala.inline
      def setInstances(value: js.Any): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
      
      @scala.inline
      def setMatch(value: (/* target */ js.UndefOr[js.Any], /* selector */ js.UndefOr[java.lang.String]) => Boolean): Self = StObject.set(x, "match", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      @scala.inline
      def setMonitor(value: /* observable */ js.UndefOr[IClass] => Unit): Self = StObject.set(x, "monitor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMonitorUndefined: Self = StObject.set(x, "monitor", js.undefined)
    }
  }
  
  object domain {
    
    @js.native
    trait Component extends StObject
    
    @js.native
    trait Controller extends StObject
    
    @js.native
    trait Direct extends StObject
    
    @js.native
    trait Global extends StObject
    
    type IComponent = IEventDomain
    
    type IController = IEventDomain
    
    type IDirect = IEventDomain
    
    type IGlobal = IEventDomain
    
    type IStore = IEventDomain
    
    @js.native
    trait Store extends StObject
  }
}
