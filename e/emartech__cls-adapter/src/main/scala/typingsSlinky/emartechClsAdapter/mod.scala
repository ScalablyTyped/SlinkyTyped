package typingsSlinky.emartechClsAdapter

import typingsSlinky.clsHooked.mod.Namespace
import typingsSlinky.emartechClsAdapter.anon.RequestId
import typingsSlinky.express.mod.Handler
import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.Middleware
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@emartech/cls-adapter", JSImport.Namespace)
  @js.native
  class ^ () extends ContextFactory
  @JSImport("@emartech/cls-adapter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns a function that extends the given object with the current storage.
    */
  /* static member */
  @JSImport("@emartech/cls-adapter", "addContextStorageToInput")
  @js.native
  def addContextStorageToInput: js.Function0[js.Function1[/* input */ js.Object, js.Object with RequestId]] = js.native
  @scala.inline
  def addContextStorageToInput_=(x: js.Function0[js.Function1[/* input */ js.Object, js.Object with RequestId]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addContextStorageToInput")(x.asInstanceOf[js.Any])
  
  /**
    * Returns a function that extends the given object with the request identifier set on the current storage.
    */
  /* static member */
  @JSImport("@emartech/cls-adapter", "addRequestIdToInput")
  @js.native
  def addRequestIdToInput: js.Function0[js.Function1[/* input */ js.Object, js.Object with RequestId]] = js.native
  @scala.inline
  def addRequestIdToInput_=(x: js.Function0[js.Function1[/* input */ js.Object, js.Object with RequestId]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addRequestIdToInput")(x.asInstanceOf[js.Any])
  
  /**
    * Creates (or returns existing namespace) with the namespace name 'session'
    */
  /* static member */
  @JSImport("@emartech/cls-adapter", "createNamespace")
  @js.native
  def createNamespace: js.Function0[Namespace] = js.native
  @scala.inline
  def createNamespace_=(x: js.Function0[Namespace]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createNamespace")(x.asInstanceOf[js.Any])
  
  /**
    * Destroys (if exists) the namespace with the name 'session'
    */
  /* static member */
  @JSImport("@emartech/cls-adapter", "destroyNamespace")
  @js.native
  def destroyNamespace: js.Function0[Unit] = js.native
  @scala.inline
  def destroyNamespace_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("destroyNamespace")(x.asInstanceOf[js.Any])
  
  /**
    * Returns the all the values set on the storage.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  /* static member */
  @JSImport("@emartech/cls-adapter", "getContextStorage")
  @js.native
  def getContextStorage: js.Function0[(Record[String, _]) with RequestId] = js.native
  @scala.inline
  def getContextStorage_=(x: js.Function0[(Record[String, _]) with RequestId]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getContextStorage")(x.asInstanceOf[js.Any])
  
  /**
    * Returns a middleware function compatible with Express that stores (or generates if missing)
    * the request identifier from the header (X-Request-Id) and sets it on the storage as request_id.
    */
  /* static member */
  @JSImport("@emartech/cls-adapter", "getExpressMiddleware")
  @js.native
  def getExpressMiddleware: js.Function0[Handler] = js.native
  @scala.inline
  def getExpressMiddleware_=(x: js.Function0[Handler]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getExpressMiddleware")(x.asInstanceOf[js.Any])
  
  /**
    * Returns a middleware function compatible with Koa that stores (or generates if missing)
    * the request identifier from the header (X-Request-Id) and sets it on the storage as request_id.
    */
  /* static member */
  @JSImport("@emartech/cls-adapter", "getKoaMiddleware")
  @js.native
  def getKoaMiddleware: js.Function0[Middleware[DefaultState, DefaultContext]] = js.native
  @scala.inline
  def getKoaMiddleware_=(x: js.Function0[Middleware[DefaultState, DefaultContext]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getKoaMiddleware")(x.asInstanceOf[js.Any])
  
  /**
    * Returns the the request identifier set on the storage. The identifiers key is request_id.
    */
  /* static member */
  @JSImport("@emartech/cls-adapter", "getRequestId")
  @js.native
  def getRequestId: js.Function0[js.UndefOr[String]] = js.native
  @scala.inline
  def getRequestId_=(x: js.Function0[js.UndefOr[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getRequestId")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("@emartech/cls-adapter", "run")
  @js.native
  def run: js.Function1[/* fn */ js.Function1[/* repeated */ js.Any, js.Any], js.Any] = js.native
  @scala.inline
  def run_=(x: js.Function1[/* fn */ js.Function1[/* repeated */ js.Any, js.Any], js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("run")(x.asInstanceOf[js.Any])
  
  /**
    * Sets a key with a given value on the storage.
    */
  /* static member */
  @JSImport("@emartech/cls-adapter", "setOnContext")
  @js.native
  def setOnContext: js.Function2[/* key */ String, /* value */ js.Any, js.Any] = js.native
  @scala.inline
  def setOnContext_=(x: js.Function2[/* key */ String, /* value */ js.Any, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setOnContext")(x.asInstanceOf[js.Any])
  
  @js.native
  trait ContextFactory extends StObject {
    
    var _namespace: Namespace = js.native
  }
  object ContextFactory {
    
    @scala.inline
    def apply(_namespace: Namespace): ContextFactory = {
      val __obj = js.Dynamic.literal(_namespace = _namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextFactory]
    }
    
    @scala.inline
    implicit class ContextFactoryMutableBuilder[Self <: ContextFactory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_namespace(value: Namespace): Self = StObject.set(x, "_namespace", value.asInstanceOf[js.Any])
    }
  }
}
