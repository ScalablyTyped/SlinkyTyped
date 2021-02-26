package typingsSlinky.apostrophe

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.apostrophe.anon.Form
import typingsSlinky.apostrophe.anon.Id
import typingsSlinky.apostrophe.anon.Projection
import typingsSlinky.apostrophe.apostropheBooleans.`false`
import typingsSlinky.apostrophe.apostropheStrings.user
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("apostrophe", JSImport.Namespace)
  @js.native
  def apply(options: AposConstructor[js.Object, js.Object], args: js.Any*): js.Any = js.native
  
  object adminBar {
    
    @JSImport("apostrophe", "adminBar.link")
    @js.native
    def link(name: String, callback: js.Function0[_]): Unit = js.native
  }
  
  @JSImport("apostrophe", "change")
  @js.native
  def change(arg: String): js.Any = js.native
  @JSImport("apostrophe", "change")
  @js.native
  def change(arg: js.Object): js.Any = js.native
  
  object contextPiece {
    
    @JSImport("apostrophe", "contextPiece")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("apostrophe", "contextPiece._id")
    @js.native
    def id: String = js.native
    
    @scala.inline
    def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_id")(x.asInstanceOf[js.Any])
    
    @JSImport("apostrophe", "contextPiece.slug")
    @js.native
    def slug: String = js.native
    @scala.inline
    def slug_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("slug")(x.asInstanceOf[js.Any])
    
    @JSImport("apostrophe", "contextPiece.title")
    @js.native
    def title: String = js.native
    @scala.inline
    def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
    
    @JSImport("apostrophe", "contextPiece.type")
    @js.native
    val `type`: String = js.native
  }
  
  @JSImport("apostrophe", "create")
  @js.native
  def create(`type`: String, options: js.Any): js.Any = js.native
  @JSImport("apostrophe", "create")
  @js.native
  def create(`type`: String, options: js.Any, callback: js.Function0[_]): js.Any = js.native
  
  @JSImport("apostrophe", "define")
  @js.native
  def define(`type`: String, definition: js.Any): js.Any = js.native
  @JSImport("apostrophe", "define")
  @js.native
  def define(`type`: String, definition: js.Any, extending: js.Any): js.Any = js.native
  @JSImport("apostrophe", "define")
  @js.native
  def define(`type`: js.Array[String], definition: js.Any): js.Any = js.native
  @JSImport("apostrophe", "define")
  @js.native
  def define(`type`: js.Array[String], definition: js.Any, extending: js.Any): js.Any = js.native
  
  object docs {
    
    @JSImport("apostrophe", "docs.getManager")
    @js.native
    def getManager(`type`: String): Unit = js.native
    
    @JSImport("apostrophe", "docs.lock")
    @js.native
    def lock(id: String): Unit = js.native
    @JSImport("apostrophe", "docs.lock")
    @js.native
    def lock(id: String, callback: js.Function0[_]): Unit = js.native
    
    @JSImport("apostrophe", "docs.lockAndWatch")
    @js.native
    def lockAndWatch(id: String): Unit = js.native
    @JSImport("apostrophe", "docs.lockAndWatch")
    @js.native
    def lockAndWatch(id: String, callback: js.Function0[_]): Unit = js.native
    
    @JSImport("apostrophe", "docs.setManager")
    @js.native
    def setManager(`type`: String, manager: js.Any): Unit = js.native
    
    @JSImport("apostrophe", "docs.unlock")
    @js.native
    def unlock(_id: String, sync: js.Any): js.Any = js.native
    @JSImport("apostrophe", "docs.unlock")
    @js.native
    def unlock(_id: String, sync: js.Any, callback: js.Function0[_]): js.Any = js.native
  }
  
  @JSImport("apostrophe", "emit")
  @js.native
  def emit(name: String): js.Any = js.native
  @JSImport("apostrophe", "emit")
  @js.native
  def emit(name: String, arg: js.Any): js.Any = js.native
  
  object modalSupport {
    
    @JSImport("apostrophe", "modalSupport")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("apostrophe", "modalSupport.all")
    @js.native
    def all: js.Array[js.Any] = js.native
    @scala.inline
    def all_=(x: js.Array[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("all")(x.asInstanceOf[js.Any])
    
    @JSImport("apostrophe", "modalSupport.cancelTopModal")
    @js.native
    def cancelTopModal(): Unit = js.native
    
    @JSImport("apostrophe", "modalSupport.closeTopModal")
    @js.native
    def closeTopModal(): Unit = js.native
    
    @JSImport("apostrophe", "modalSupport.depth")
    @js.native
    def depth: Double = js.native
    @scala.inline
    def depth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("depth")(x.asInstanceOf[js.Any])
    
    @JSImport("apostrophe", "modalSupport.getLatestModal")
    @js.native
    def getLatestModal(): Null | String = js.native
    
    @JSImport("apostrophe", "modalSupport.getTopModalOrBody")
    @js.native
    def getTopModalOrBody(): String = js.native
    
    @JSImport("apostrophe", "modalSupport.initialized")
    @js.native
    def initialized: Boolean = js.native
    @scala.inline
    def initialized_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("initialized")(x.asInstanceOf[js.Any])
    
    @JSImport("apostrophe", "modalSupport.stack")
    @js.native
    def stack: js.Array[js.Any] = js.native
    @scala.inline
    def stack_=(x: js.Array[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stack")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("apostrophe", "modules")
  @js.native
  val modules: js.Object = js.native
  
  object moogBundle {
    
    @JSImport("apostrophe", "moogBundle")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("apostrophe", "moogBundle.directory")
    @js.native
    def directory: String = js.native
    @scala.inline
    def directory_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("directory")(x.asInstanceOf[js.Any])
    
    @JSImport("apostrophe", "moogBundle.modules")
    @js.native
    def modules: js.Array[String] = js.native
    @scala.inline
    def modules_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modules")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("apostrophe", "notify")
  @js.native
  def notify_(message: String, options: AposObject): js.Any = js.native
  @JSImport("apostrophe", "notify")
  @js.native
  def notify_(message: js.Object, options: AposObject): js.Any = js.native
  
  @JSImport("apostrophe", "off")
  @js.native
  def off(eventName: String): js.Any = js.native
  @JSImport("apostrophe", "off")
  @js.native
  def off(eventName: String, fn: js.Function0[_]): js.Any = js.native
  
  @JSImport("apostrophe", "on")
  @js.native
  def on(eventName: String): js.Any = js.native
  @JSImport("apostrophe", "on")
  @js.native
  def on(eventName: String, fn: js.Function0[_]): js.Any = js.native
  
  object pages {
    
    @JSImport("apostrophe", "pages")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("apostrophe", "pages.page")
    @js.native
    def page: Id = js.native
    @scala.inline
    def page_=(x: Id): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("page")(x.asInstanceOf[js.Any])
  }
  
  object schemas {
    
    @JSImport("apostrophe", "schemas.convert")
    @js.native
    def convert($el: HTMLElement, schema: Schema, data: js.Any, options: js.Any): js.Any = js.native
    @JSImport("apostrophe", "schemas.convert")
    @js.native
    def convert($el: HTMLElement, schema: Schema, data: js.Any, options: js.Any, callback: js.Function0[_]): js.Any = js.native
    
    @JSImport("apostrophe", "schemas.newInstance")
    @js.native
    def newInstance(schema: Schema): js.Any = js.native
    
    @JSImport("apostrophe", "schemas.populate")
    @js.native
    def populate(data: js.Any, name: String, $field: js.Any): js.Any = js.native
    @JSImport("apostrophe", "schemas.populate")
    @js.native
    def populate(
      data: js.Any,
      name: String,
      $field: js.Any,
      callback: js.UndefOr[scala.Nothing],
      $el: js.UndefOr[scala.Nothing],
      field: js.Any
    ): js.Any = js.native
    @JSImport("apostrophe", "schemas.populate")
    @js.native
    def populate(data: js.Any, name: String, $field: js.Any, callback: js.UndefOr[scala.Nothing], $el: HTMLElement): js.Any = js.native
    @JSImport("apostrophe", "schemas.populate")
    @js.native
    def populate(
      data: js.Any,
      name: String,
      $field: js.Any,
      callback: js.UndefOr[scala.Nothing],
      $el: HTMLElement,
      field: js.Any
    ): js.Any = js.native
    @JSImport("apostrophe", "schemas.populate")
    @js.native
    def populate(data: js.Any, name: String, $field: js.Any, callback: js.Function0[Unit]): js.Any = js.native
    @JSImport("apostrophe", "schemas.populate")
    @js.native
    def populate(
      data: js.Any,
      name: String,
      $field: js.Any,
      callback: js.Function0[Unit],
      $el: js.UndefOr[scala.Nothing],
      field: js.Any
    ): js.Any = js.native
    @JSImport("apostrophe", "schemas.populate")
    @js.native
    def populate(data: js.Any, name: String, $field: js.Any, callback: js.Function0[Unit], $el: HTMLElement): js.Any = js.native
    @JSImport("apostrophe", "schemas.populate")
    @js.native
    def populate(
      data: js.Any,
      name: String,
      $field: js.Any,
      callback: js.Function0[Unit],
      $el: HTMLElement,
      field: js.Any
    ): js.Any = js.native
    
    @JSImport("apostrophe", "schemas.returnToError")
    @js.native
    def returnToError($el: HTMLElement, schema: Schema, errorPath: js.Any, error: js.Any, callback: js.Function0[_]): Unit = js.native
  }
  
  object ui {
    
    @JSImport("apostrophe", "ui.globalBusy")
    @js.native
    def globalBusy(state: js.Any): js.Any = js.native
    
    @JSImport("apostrophe", "ui.link")
    @js.native
    def link(sel: String, verb: String, `object`: js.Object): js.Any = js.native
    @JSImport("apostrophe", "ui.link")
    @js.native
    def link(sel: String, verb: String, `object`: js.Object, callback: js.Function0[_]): js.Any = js.native
  }
  
  object utils {
    
    @JSImport("apostrophe", "utils.camelName")
    @js.native
    def camelName(s: String): String = js.native
    
    @JSImport("apostrophe", "utils.capitalizeFirst")
    @js.native
    def capitalizeFirst(s: String): String = js.native
    
    @JSImport("apostrophe", "utils.error")
    @js.native
    def error(msg: String): Unit = js.native
    
    @JSImport("apostrophe", "utils.generateId")
    @js.native
    def generateId(): String = js.native
  }
  
  object versions {
    
    @JSImport("apostrophe", "versions.edit")
    @js.native
    def edit(id: String): js.Any = js.native
    @JSImport("apostrophe", "versions.edit")
    @js.native
    def edit(id: String, afterRevert: js.Function0[Unit]): js.Any = js.native
  }
  
  // Pass in custom modules as first argument
  // second argument is additional custom options e.g. restApi exposed by apostrophe-headless
  @js.native
  trait AposConstructor[M, O] extends StObject {
    
    var afterInit: js.UndefOr[js.Function0[Unit]] = js.native
    
    var afterListen: js.UndefOr[js.Function0[Unit]] = js.native
    
    var baseUrl: js.UndefOr[String] = js.native
    
    var initFailed: js.UndefOr[js.Function1[/* error */ js.Any, Unit]] = js.native
    
    var modules: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in apostrophe.apostrophe.AposCoreModules & M ]:? apostrophe.apostrophe.AposModuleOptions<{}> | O}
      */ typingsSlinky.apostrophe.apostropheStrings.AposConstructor with TopLevel[js.Any] = js.native
    
    var prefix: js.UndefOr[String] = js.native
    
    var root: js.UndefOr[String] = js.native
    
    var rootDir: js.UndefOr[String] = js.native
    
    var shortName: String = js.native
  }
  object AposConstructor {
    
    @scala.inline
    def apply[M, O](
      modules: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in apostrophe.apostrophe.AposCoreModules & M ]:? apostrophe.apostrophe.AposModuleOptions<{}> | O}
      */ typingsSlinky.apostrophe.apostropheStrings.AposConstructor with TopLevel[js.Any],
      shortName: String
    ): AposConstructor[M, O] = {
      val __obj = js.Dynamic.literal(modules = modules.asInstanceOf[js.Any], shortName = shortName.asInstanceOf[js.Any])
      __obj.asInstanceOf[AposConstructor[M, O]]
    }
    
    @scala.inline
    implicit class AposConstructorMutableBuilder[Self <: AposConstructor[_, _], M, O] (val x: Self with (AposConstructor[M, O])) extends AnyVal {
      
      @scala.inline
      def setAfterInit(value: () => Unit): Self = StObject.set(x, "afterInit", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAfterInitUndefined: Self = StObject.set(x, "afterInit", js.undefined)
      
      @scala.inline
      def setAfterListen(value: () => Unit): Self = StObject.set(x, "afterListen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAfterListenUndefined: Self = StObject.set(x, "afterListen", js.undefined)
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      @scala.inline
      def setInitFailed(value: /* error */ js.Any => Unit): Self = StObject.set(x, "initFailed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInitFailedUndefined: Self = StObject.set(x, "initFailed", js.undefined)
      
      @scala.inline
      def setModules(
        value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ K in apostrophe.apostrophe.AposCoreModules & M ]:? apostrophe.apostrophe.AposModuleOptions<{}> | O}
        */ typingsSlinky.apostrophe.apostropheStrings.AposConstructor with TopLevel[js.Any]
      ): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootDirUndefined: Self = StObject.set(x, "rootDir", js.undefined)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-admin-bar`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-any-page-manager`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-areas`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-assets`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-attachments`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-browser-utils`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-caches`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-custom-pages`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-db`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-doc-type-manager`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-docs`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-email`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-express`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-files`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-files-widgets`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-global`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-groups`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-html-widgets`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-i18n`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-images`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-images-widgets`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-jobs`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-launder`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-locks`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-login`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-migrations`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-modal`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-module`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-notifications`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-oembed`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-pager`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-pages`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-permissions`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-pieces`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-pieces-pages`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-pieces-widgets`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-polymorphic-manager`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-push`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-rich-text-widgets`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-schemas`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-search`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-service-bridge`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-soft-redirects`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-tags`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-tasks`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-templates`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-ui`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-urls`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-users`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-utils`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-versions`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-video-fields`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-video-widgets`
    - typingsSlinky.apostrophe.apostropheStrings.`apostrophe-widgets`
  */
  trait AposCoreModules extends StObject
  object AposCoreModules {
    
    @scala.inline
    def `apostrophe-admin-bar`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-admin-bar` = "apostrophe-admin-bar".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-admin-bar`]
    
    @scala.inline
    def `apostrophe-any-page-manager`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-any-page-manager` = "apostrophe-any-page-manager".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-any-page-manager`]
    
    @scala.inline
    def `apostrophe-areas`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-areas` = "apostrophe-areas".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-areas`]
    
    @scala.inline
    def `apostrophe-assets`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-assets` = "apostrophe-assets".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-assets`]
    
    @scala.inline
    def `apostrophe-attachments`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-attachments` = "apostrophe-attachments".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-attachments`]
    
    @scala.inline
    def `apostrophe-browser-utils`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-browser-utils` = "apostrophe-browser-utils".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-browser-utils`]
    
    @scala.inline
    def `apostrophe-caches`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-caches` = "apostrophe-caches".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-caches`]
    
    @scala.inline
    def `apostrophe-custom-pages`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-custom-pages` = "apostrophe-custom-pages".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-custom-pages`]
    
    @scala.inline
    def `apostrophe-db`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-db` = "apostrophe-db".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-db`]
    
    @scala.inline
    def `apostrophe-doc-type-manager`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-doc-type-manager` = "apostrophe-doc-type-manager".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-doc-type-manager`]
    
    @scala.inline
    def `apostrophe-docs`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-docs` = "apostrophe-docs".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-docs`]
    
    @scala.inline
    def `apostrophe-email`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-email` = "apostrophe-email".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-email`]
    
    @scala.inline
    def `apostrophe-express`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-express` = "apostrophe-express".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-express`]
    
    @scala.inline
    def `apostrophe-files`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-files` = "apostrophe-files".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-files`]
    
    @scala.inline
    def `apostrophe-files-widgets`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-files-widgets` = "apostrophe-files-widgets".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-files-widgets`]
    
    @scala.inline
    def `apostrophe-global`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-global` = "apostrophe-global".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-global`]
    
    @scala.inline
    def `apostrophe-groups`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-groups` = "apostrophe-groups".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-groups`]
    
    @scala.inline
    def `apostrophe-html-widgets`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-html-widgets` = "apostrophe-html-widgets".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-html-widgets`]
    
    @scala.inline
    def `apostrophe-i18n`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-i18n` = "apostrophe-i18n".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-i18n`]
    
    @scala.inline
    def `apostrophe-images`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-images` = "apostrophe-images".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-images`]
    
    @scala.inline
    def `apostrophe-images-widgets`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-images-widgets` = "apostrophe-images-widgets".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-images-widgets`]
    
    @scala.inline
    def `apostrophe-jobs`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-jobs` = "apostrophe-jobs".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-jobs`]
    
    @scala.inline
    def `apostrophe-launder`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-launder` = "apostrophe-launder".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-launder`]
    
    @scala.inline
    def `apostrophe-locks`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-locks` = "apostrophe-locks".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-locks`]
    
    @scala.inline
    def `apostrophe-login`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-login` = "apostrophe-login".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-login`]
    
    @scala.inline
    def `apostrophe-migrations`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-migrations` = "apostrophe-migrations".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-migrations`]
    
    @scala.inline
    def `apostrophe-modal`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-modal` = "apostrophe-modal".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-modal`]
    
    @scala.inline
    def `apostrophe-module`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-module` = "apostrophe-module".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-module`]
    
    @scala.inline
    def `apostrophe-notifications`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-notifications` = "apostrophe-notifications".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-notifications`]
    
    @scala.inline
    def `apostrophe-oembed`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-oembed` = "apostrophe-oembed".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-oembed`]
    
    @scala.inline
    def `apostrophe-pager`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-pager` = "apostrophe-pager".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-pager`]
    
    @scala.inline
    def `apostrophe-pages`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-pages` = "apostrophe-pages".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-pages`]
    
    @scala.inline
    def `apostrophe-permissions`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-permissions` = "apostrophe-permissions".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-permissions`]
    
    @scala.inline
    def `apostrophe-pieces`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-pieces` = "apostrophe-pieces".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-pieces`]
    
    @scala.inline
    def `apostrophe-pieces-pages`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-pieces-pages` = "apostrophe-pieces-pages".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-pieces-pages`]
    
    @scala.inline
    def `apostrophe-pieces-widgets`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-pieces-widgets` = "apostrophe-pieces-widgets".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-pieces-widgets`]
    
    @scala.inline
    def `apostrophe-polymorphic-manager`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-polymorphic-manager` = "apostrophe-polymorphic-manager".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-polymorphic-manager`]
    
    @scala.inline
    def `apostrophe-push`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-push` = "apostrophe-push".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-push`]
    
    @scala.inline
    def `apostrophe-rich-text-widgets`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-rich-text-widgets` = "apostrophe-rich-text-widgets".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-rich-text-widgets`]
    
    @scala.inline
    def `apostrophe-schemas`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-schemas` = "apostrophe-schemas".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-schemas`]
    
    @scala.inline
    def `apostrophe-search`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-search` = "apostrophe-search".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-search`]
    
    @scala.inline
    def `apostrophe-service-bridge`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-service-bridge` = "apostrophe-service-bridge".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-service-bridge`]
    
    @scala.inline
    def `apostrophe-soft-redirects`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-soft-redirects` = "apostrophe-soft-redirects".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-soft-redirects`]
    
    @scala.inline
    def `apostrophe-tags`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-tags` = "apostrophe-tags".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-tags`]
    
    @scala.inline
    def `apostrophe-tasks`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-tasks` = "apostrophe-tasks".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-tasks`]
    
    @scala.inline
    def `apostrophe-templates`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-templates` = "apostrophe-templates".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-templates`]
    
    @scala.inline
    def `apostrophe-ui`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-ui` = "apostrophe-ui".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-ui`]
    
    @scala.inline
    def `apostrophe-urls`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-urls` = "apostrophe-urls".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-urls`]
    
    @scala.inline
    def `apostrophe-users`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-users` = "apostrophe-users".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-users`]
    
    @scala.inline
    def `apostrophe-utils`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-utils` = "apostrophe-utils".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-utils`]
    
    @scala.inline
    def `apostrophe-versions`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-versions` = "apostrophe-versions".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-versions`]
    
    @scala.inline
    def `apostrophe-video-fields`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-video-fields` = "apostrophe-video-fields".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-video-fields`]
    
    @scala.inline
    def `apostrophe-video-widgets`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-video-widgets` = "apostrophe-video-widgets".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-video-widgets`]
    
    @scala.inline
    def `apostrophe-widgets`: typingsSlinky.apostrophe.apostropheStrings.`apostrophe-widgets` = "apostrophe-widgets".asInstanceOf[typingsSlinky.apostrophe.apostropheStrings.`apostrophe-widgets`]
  }
  
  @js.native
  trait AposModule extends StObject {
    
    def emit(name: String): Unit = js.native
    
    def on(name: String, methodName: js.Any, fn: js.Function0[_]): Unit = js.native
  }
  object AposModule {
    
    @scala.inline
    def apply(emit: String => Unit, on: (String, js.Any, js.Function0[_]) => Unit): AposModule = {
      val __obj = js.Dynamic.literal(emit = js.Any.fromFunction1(emit), on = js.Any.fromFunction3(on))
      __obj.asInstanceOf[AposModule]
    }
    
    @scala.inline
    implicit class AposModuleMutableBuilder[Self <: AposModule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmit(value: String => Unit): Self = StObject.set(x, "emit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOn(value: (String, js.Any, js.Function0[_]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction3(value))
    }
  }
  
  // Pass in custom modules to AposModuleOptions to allow them in extend
  @js.native
  trait AposModuleOptions[C] extends StObject {
    
    var addFields: js.UndefOr[js.Array[Field]] = js.native
    
    var arrangeFields: js.UndefOr[js.Array[typingsSlinky.apostrophe.anon.Fields]] = js.native
    
    var beforeConstruct: js.UndefOr[js.Function2[/* self */ js.Any, /* options */ js.Any, _]] = js.native
    
    var defer: js.UndefOr[Boolean] = js.native
    
    var extend: AposCoreModules | C = js.native
    
    var filters: js.UndefOr[Projection] = js.native
    
    var label: String = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var playerData: js.UndefOr[`false` | js.Array[String]] = js.native
    
    var pluralLabel: js.UndefOr[String] = js.native
    
    var removeFields: js.UndefOr[js.Array[Field]] = js.native
    
    var scene: js.UndefOr[user] = js.native
  }
  object AposModuleOptions {
    
    @scala.inline
    def apply[C](extend: AposCoreModules | C, label: String): AposModuleOptions[C] = {
      val __obj = js.Dynamic.literal(extend = extend.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[AposModuleOptions[C]]
    }
    
    @scala.inline
    implicit class AposModuleOptionsMutableBuilder[Self <: AposModuleOptions[_], C] (val x: Self with AposModuleOptions[C]) extends AnyVal {
      
      @scala.inline
      def setAddFields(value: js.Array[Field]): Self = StObject.set(x, "addFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddFieldsUndefined: Self = StObject.set(x, "addFields", js.undefined)
      
      @scala.inline
      def setAddFieldsVarargs(value: Field*): Self = StObject.set(x, "addFields", js.Array(value :_*))
      
      @scala.inline
      def setArrangeFields(value: js.Array[typingsSlinky.apostrophe.anon.Fields]): Self = StObject.set(x, "arrangeFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrangeFieldsUndefined: Self = StObject.set(x, "arrangeFields", js.undefined)
      
      @scala.inline
      def setArrangeFieldsVarargs(value: typingsSlinky.apostrophe.anon.Fields*): Self = StObject.set(x, "arrangeFields", js.Array(value :_*))
      
      @scala.inline
      def setBeforeConstruct(value: (/* self */ js.Any, /* options */ js.Any) => _): Self = StObject.set(x, "beforeConstruct", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBeforeConstructUndefined: Self = StObject.set(x, "beforeConstruct", js.undefined)
      
      @scala.inline
      def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
      
      @scala.inline
      def setExtend(value: AposCoreModules | C): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilters(value: Projection): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPlayerData(value: `false` | js.Array[String]): Self = StObject.set(x, "playerData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlayerDataUndefined: Self = StObject.set(x, "playerData", js.undefined)
      
      @scala.inline
      def setPlayerDataVarargs(value: String*): Self = StObject.set(x, "playerData", js.Array(value :_*))
      
      @scala.inline
      def setPluralLabel(value: String): Self = StObject.set(x, "pluralLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluralLabelUndefined: Self = StObject.set(x, "pluralLabel", js.undefined)
      
      @scala.inline
      def setRemoveFields(value: js.Array[Field]): Self = StObject.set(x, "removeFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveFieldsUndefined: Self = StObject.set(x, "removeFields", js.undefined)
      
      @scala.inline
      def setRemoveFieldsVarargs(value: Field*): Self = StObject.set(x, "removeFields", js.Array(value :_*))
      
      @scala.inline
      def setScene(value: user): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSceneUndefined: Self = StObject.set(x, "scene", js.undefined)
    }
  }
  
  type AposObject = StringDictionary[js.Any]
  
  @js.native
  trait AposType extends StObject {
    
    var bless: js.UndefOr[js.Function2[/* req */ js.Any, /* field */ js.Any, Unit]] = js.native
    
    var converters: Form = js.native
    
    var empty: js.UndefOr[js.Function2[/* field */ js.Any, /* value */ js.Any, Unit]] = js.native
    
    def index(value: js.Any, field: js.Any, texts: js.Any): Unit = js.native
    
    var name: String = js.native
  }
  object AposType {
    
    @scala.inline
    def apply(converters: Form, index: (js.Any, js.Any, js.Any) => Unit, name: String): AposType = {
      val __obj = js.Dynamic.literal(converters = converters.asInstanceOf[js.Any], index = js.Any.fromFunction3(index), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[AposType]
    }
    
    @scala.inline
    implicit class AposTypeMutableBuilder[Self <: AposType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBless(value: (/* req */ js.Any, /* field */ js.Any) => Unit): Self = StObject.set(x, "bless", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBlessUndefined: Self = StObject.set(x, "bless", js.undefined)
      
      @scala.inline
      def setConverters(value: Form): Self = StObject.set(x, "converters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmpty(value: (/* field */ js.Any, /* value */ js.Any) => Unit): Self = StObject.set(x, "empty", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
      
      @scala.inline
      def setIndex(value: (js.Any, js.Any, js.Any) => Unit): Self = StObject.set(x, "index", js.Any.fromFunction3(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Field extends StObject {
    
    var choices: js.UndefOr[js.Array[SelectChoice]] = js.native
    
    var help: js.UndefOr[String] = js.native
    
    var label: String = js.native
    
    var name: String = js.native
    
    var options: js.UndefOr[AposObject] = js.native
    
    var required: js.UndefOr[Boolean] = js.native
    
    var schema: js.UndefOr[js.Array[Field]] = js.native
    
    var titleField: js.UndefOr[String] = js.native
    
    var `type`: String = js.native
    
    var widgetType: js.UndefOr[String] = js.native
  }
  object Field {
    
    @scala.inline
    def apply(label: String, name: String, `type`: String): Field = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Field]
    }
    
    @scala.inline
    implicit class FieldMutableBuilder[Self <: Field] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChoices(value: js.Array[SelectChoice]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChoicesUndefined: Self = StObject.set(x, "choices", js.undefined)
      
      @scala.inline
      def setChoicesVarargs(value: SelectChoice*): Self = StObject.set(x, "choices", js.Array(value :_*))
      
      @scala.inline
      def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: AposObject): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setSchema(value: js.Array[Field]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      @scala.inline
      def setSchemaVarargs(value: Field*): Self = StObject.set(x, "schema", js.Array(value :_*))
      
      @scala.inline
      def setTitleField(value: String): Self = StObject.set(x, "titleField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFieldUndefined: Self = StObject.set(x, "titleField", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidgetType(value: String): Self = StObject.set(x, "widgetType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidgetTypeUndefined: Self = StObject.set(x, "widgetType", js.undefined)
    }
  }
  
  type Fields = js.Array[Field]
  
  @js.native
  trait Schema extends StObject {
    
    def addFieldType(`type`: AposType): Unit = js.native
    
    def addFilters(schema: Schema, options: js.Any, cursor: js.Any): Unit = js.native
    
    def addJoinSlugFilter(field: js.Any, cursor: js.Any, suffix: js.Any): Unit = js.native
    
    def afterInit(): Unit = js.native
    
    def compose(options: AposObject): Unit = js.native
    
    def convert(
      req: js.Any,
      schema: Schema,
      to: js.Any,
      `object`: AposObject,
      output: js.Any,
      callback: js.Function0[_]
    ): Unit = js.native
    
    def createRoutes(): js.Array[_] = js.native
    
    def cursorFilterInterested(cursor: js.Any, name: String): Unit = js.native
    
    def empty(schema: Schema, `object`: AposObject): Unit = js.native
    
    def export(
      req: js.Any,
      schema: Schema,
      to: js.Any,
      `object`: AposObject,
      output: js.Any,
      callback: js.Function0[_]
    ): Unit = js.native
    
    def getFieldType(typeName: String): Unit = js.native
    
    def indexFields(schema: Schema, `object`: AposObject, texts: js.Any): Unit = js.native
    
    def isVisible(schema: Schema, `object`: AposObject, name: String): Unit = js.native
    
    def join(req: js.Any, schema: Schema, objectOrArray: js.Any, withJoins: js.Any, callback: js.Function0[_]): Unit = js.native
    
    def joinDriver(
      req: js.Any,
      method: js.Any,
      reverse: js.Any,
      items: js.Any,
      idField: js.Any,
      relationshipsField: js.Any,
      objectField: js.Any,
      options: js.Any,
      callback: js.Function0[_]
    ): Unit = js.native
    
    def joinFilterChoices(field: js.Any, cursor: js.Any, valueField: js.Any): Unit = js.native
    
    def newInstance(schema: Schema): js.Any = js.native
    
    def pageServe(req: js.Any): Unit = js.native
    
    def pushAssets(): Unit = js.native
    
    def pushCreateSingleton(): Unit = js.native
    
    def refine(schema: Schema, options: AposObject): Unit = js.native
    
    def sortedDistinct(property: js.Any, cursor: js.Any, callback: js.Function0[_]): Unit = js.native
    
    def subset(schema: Schema, fields: Fields): Schema = js.native
    
    def subsetInstance(schema: Schema, instance: AposObject): js.Any = js.native
    
    def toGroups(fields: Fields): Unit = js.native
    
    def validate(schema: Schema, options: js.Any): Unit = js.native
  }
  object Schema {
    
    @scala.inline
    def apply(
      addFieldType: AposType => Unit,
      addFilters: (Schema, js.Any, js.Any) => Unit,
      addJoinSlugFilter: (js.Any, js.Any, js.Any) => Unit,
      afterInit: () => Unit,
      compose: AposObject => Unit,
      convert: (js.Any, Schema, js.Any, AposObject, js.Any, js.Function0[_]) => Unit,
      createRoutes: () => js.Array[_],
      cursorFilterInterested: (js.Any, String) => Unit,
      empty: (Schema, AposObject) => Unit,
      export: (js.Any, Schema, js.Any, AposObject, js.Any, js.Function0[_]) => Unit,
      getFieldType: String => Unit,
      indexFields: (Schema, AposObject, js.Any) => Unit,
      isVisible: (Schema, AposObject, String) => Unit,
      join: (js.Any, Schema, js.Any, js.Any, js.Function0[_]) => Unit,
      joinDriver: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Function0[_]) => Unit,
      joinFilterChoices: (js.Any, js.Any, js.Any) => Unit,
      newInstance: Schema => js.Any,
      pageServe: js.Any => Unit,
      pushAssets: () => Unit,
      pushCreateSingleton: () => Unit,
      refine: (Schema, AposObject) => Unit,
      sortedDistinct: (js.Any, js.Any, js.Function0[_]) => Unit,
      subset: (Schema, Fields) => Schema,
      subsetInstance: (Schema, AposObject) => js.Any,
      toGroups: Fields => Unit,
      validate: (Schema, js.Any) => Unit
    ): Schema = {
      val __obj = js.Dynamic.literal(addFieldType = js.Any.fromFunction1(addFieldType), addFilters = js.Any.fromFunction3(addFilters), addJoinSlugFilter = js.Any.fromFunction3(addJoinSlugFilter), afterInit = js.Any.fromFunction0(afterInit), compose = js.Any.fromFunction1(compose), convert = js.Any.fromFunction6(convert), createRoutes = js.Any.fromFunction0(createRoutes), cursorFilterInterested = js.Any.fromFunction2(cursorFilterInterested), empty = js.Any.fromFunction2(empty), export = js.Any.fromFunction6(export), getFieldType = js.Any.fromFunction1(getFieldType), indexFields = js.Any.fromFunction3(indexFields), isVisible = js.Any.fromFunction3(isVisible), join = js.Any.fromFunction5(join), joinDriver = js.Any.fromFunction9(joinDriver), joinFilterChoices = js.Any.fromFunction3(joinFilterChoices), newInstance = js.Any.fromFunction1(newInstance), pageServe = js.Any.fromFunction1(pageServe), pushAssets = js.Any.fromFunction0(pushAssets), pushCreateSingleton = js.Any.fromFunction0(pushCreateSingleton), refine = js.Any.fromFunction2(refine), sortedDistinct = js.Any.fromFunction3(sortedDistinct), subset = js.Any.fromFunction2(subset), subsetInstance = js.Any.fromFunction2(subsetInstance), toGroups = js.Any.fromFunction1(toGroups), validate = js.Any.fromFunction2(validate))
      __obj.asInstanceOf[Schema]
    }
    
    @scala.inline
    implicit class SchemaMutableBuilder[Self <: Schema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddFieldType(value: AposType => Unit): Self = StObject.set(x, "addFieldType", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddFilters(value: (Schema, js.Any, js.Any) => Unit): Self = StObject.set(x, "addFilters", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAddJoinSlugFilter(value: (js.Any, js.Any, js.Any) => Unit): Self = StObject.set(x, "addJoinSlugFilter", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAfterInit(value: () => Unit): Self = StObject.set(x, "afterInit", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCompose(value: AposObject => Unit): Self = StObject.set(x, "compose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setConvert(value: (js.Any, Schema, js.Any, AposObject, js.Any, js.Function0[_]) => Unit): Self = StObject.set(x, "convert", js.Any.fromFunction6(value))
      
      @scala.inline
      def setCreateRoutes(value: () => js.Array[_]): Self = StObject.set(x, "createRoutes", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCursorFilterInterested(value: (js.Any, String) => Unit): Self = StObject.set(x, "cursorFilterInterested", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEmpty(value: (Schema, AposObject) => Unit): Self = StObject.set(x, "empty", js.Any.fromFunction2(value))
      
      @scala.inline
      def setExport(value: (js.Any, Schema, js.Any, AposObject, js.Any, js.Function0[_]) => Unit): Self = StObject.set(x, "export", js.Any.fromFunction6(value))
      
      @scala.inline
      def setGetFieldType(value: String => Unit): Self = StObject.set(x, "getFieldType", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIndexFields(value: (Schema, AposObject, js.Any) => Unit): Self = StObject.set(x, "indexFields", js.Any.fromFunction3(value))
      
      @scala.inline
      def setIsVisible(value: (Schema, AposObject, String) => Unit): Self = StObject.set(x, "isVisible", js.Any.fromFunction3(value))
      
      @scala.inline
      def setJoin(value: (js.Any, Schema, js.Any, js.Any, js.Function0[_]) => Unit): Self = StObject.set(x, "join", js.Any.fromFunction5(value))
      
      @scala.inline
      def setJoinDriver(value: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Function0[_]) => Unit): Self = StObject.set(x, "joinDriver", js.Any.fromFunction9(value))
      
      @scala.inline
      def setJoinFilterChoices(value: (js.Any, js.Any, js.Any) => Unit): Self = StObject.set(x, "joinFilterChoices", js.Any.fromFunction3(value))
      
      @scala.inline
      def setNewInstance(value: Schema => js.Any): Self = StObject.set(x, "newInstance", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPageServe(value: js.Any => Unit): Self = StObject.set(x, "pageServe", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPushAssets(value: () => Unit): Self = StObject.set(x, "pushAssets", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPushCreateSingleton(value: () => Unit): Self = StObject.set(x, "pushCreateSingleton", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRefine(value: (Schema, AposObject) => Unit): Self = StObject.set(x, "refine", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSortedDistinct(value: (js.Any, js.Any, js.Function0[_]) => Unit): Self = StObject.set(x, "sortedDistinct", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSubset(value: (Schema, Fields) => Schema): Self = StObject.set(x, "subset", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSubsetInstance(value: (Schema, AposObject) => js.Any): Self = StObject.set(x, "subsetInstance", js.Any.fromFunction2(value))
      
      @scala.inline
      def setToGroups(value: Fields => Unit): Self = StObject.set(x, "toGroups", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValidate(value: (Schema, js.Any) => Unit): Self = StObject.set(x, "validate", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait SelectChoice extends StObject {
    
    var label: String = js.native
    
    var value: String = js.native
  }
  object SelectChoice {
    
    @scala.inline
    def apply(label: String, value: String): SelectChoice = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectChoice]
    }
    
    @scala.inline
    implicit class SelectChoiceMutableBuilder[Self <: SelectChoice] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
