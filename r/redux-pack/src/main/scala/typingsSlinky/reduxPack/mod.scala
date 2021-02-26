package typingsSlinky.reduxPack

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Dispatch
import typingsSlinky.redux.mod.Middleware
import typingsSlinky.reduxPack.anon.ReduxpackLIFECYCLE
import typingsSlinky.reduxPack.reduxPackStrings.`redux-packSlashLIFECYCLE`
import typingsSlinky.reduxPack.reduxPackStrings.`redux-packSlashTRANSACTION`
import typingsSlinky.reduxPack.reduxPackStrings.failure
import typingsSlinky.reduxPack.reduxPackStrings.start
import typingsSlinky.reduxPack.reduxPackStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object KEY {
    
    @JSImport("redux-pack", "KEY.LIFECYCLE")
    @js.native
    val LIFECYCLE: `redux-packSlashLIFECYCLE` = js.native
    
    @JSImport("redux-pack", "KEY.TRANSACTION")
    @js.native
    val TRANSACTION: `redux-packSlashTRANSACTION` = js.native
  }
  
  object LIFECYCLE {
    
    @JSImport("redux-pack", "LIFECYCLE.FAILURE")
    @js.native
    val FAILURE: failure = js.native
    
    @JSImport("redux-pack", "LIFECYCLE.START")
    @js.native
    val START: start = js.native
    
    @JSImport("redux-pack", "LIFECYCLE.SUCCESS")
    @js.native
    val SUCCESS: success = js.native
  }
  
  @JSImport("redux-pack", "handle")
  @js.native
  def handle[TState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload](
    state: TState,
    action: Action[TFullState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload],
    handlers: Handlers[TState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload]
  ): TState = js.native
  
  @JSImport("redux-pack", "middleware")
  @js.native
  val middleware: Middleware[js.Object, js.Any, Dispatch[AnyAction]] = js.native
  
  @js.native
  trait Action[TFullState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload]
    extends typingsSlinky.redux.mod.Action[js.Any] {
    
    // add optional error key to conform to FSA design: https://github.com/redux-utilities/flux-standard-action
    // note that users of this middleware (using our types) must conform to FSA shaped actions or code will not compile
    var error: js.UndefOr[Boolean | Null] = js.native
    
    var meta: js.UndefOr[
        (ActionMeta[TFullState, TSuccessPayload, TErrorPayload, TStartPayload]) with TMetaPayload
      ] = js.native
    
    var payload: js.UndefOr[TSuccessPayload | TErrorPayload | TStartPayload] = js.native
    
    var promise: js.UndefOr[js.Promise[TSuccessPayload]] = js.native
  }
  object Action {
    
    @scala.inline
    def apply[TFullState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload](`type`: js.Any): Action[TFullState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action[TFullState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload]]
    }
    
    @scala.inline
    implicit class ActionMutableBuilder[Self <: Action[_, _, _, _, _], TFullState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload] (val x: Self with (Action[TFullState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload])) extends AnyVal {
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorNull: Self = StObject.set(x, "error", null)
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setMeta(value: (ActionMeta[TFullState, TSuccessPayload, TErrorPayload, TStartPayload]) with TMetaPayload): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      @scala.inline
      def setPayload(value: TSuccessPayload | TErrorPayload | TStartPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      @scala.inline
      def setPromise(value: js.Promise[TSuccessPayload]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
    }
  }
  
  @js.native
  trait ActionMeta[TFullState, TSuccessPayload, TErrorPayload, TStartPayload] extends StObject {
    
    var onFailure: js.UndefOr[
        js.Function2[/* error */ TErrorPayload, /* getState */ GetState[TFullState], Unit]
      ] = js.native
    
    var onFinish: js.UndefOr[js.Function2[/* resolved */ Boolean, /* getState */ GetState[TFullState], Unit]] = js.native
    
    var onStart: js.UndefOr[
        js.Function2[/* payload */ TStartPayload, /* getState */ GetState[TFullState], Unit]
      ] = js.native
    
    var onSuccess: js.UndefOr[
        js.Function2[/* response */ TSuccessPayload, /* getState */ GetState[TFullState], Unit]
      ] = js.native
    
    @JSName("redux-pack/LIFECYCLE")
    var `redux-packSlashLIFECYCLE`: js.UndefOr[LIFECYCLEValues] = js.native
    
    @JSName("redux-pack/TRANSACTION")
    var `redux-packSlashTRANSACTION`: js.UndefOr[String] = js.native
    
    var startPayload: js.UndefOr[TStartPayload] = js.native
  }
  object ActionMeta {
    
    @scala.inline
    def apply[TFullState, TSuccessPayload, TErrorPayload, TStartPayload](): ActionMeta[TFullState, TSuccessPayload, TErrorPayload, TStartPayload] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionMeta[TFullState, TSuccessPayload, TErrorPayload, TStartPayload]]
    }
    
    @scala.inline
    implicit class ActionMetaMutableBuilder[Self <: ActionMeta[_, _, _, _], TFullState, TSuccessPayload, TErrorPayload, TStartPayload] (val x: Self with (ActionMeta[TFullState, TSuccessPayload, TErrorPayload, TStartPayload])) extends AnyVal {
      
      @scala.inline
      def setOnFailure(value: (/* error */ TErrorPayload, /* getState */ GetState[TFullState]) => Unit): Self = StObject.set(x, "onFailure", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnFailureUndefined: Self = StObject.set(x, "onFailure", js.undefined)
      
      @scala.inline
      def setOnFinish(value: (/* resolved */ Boolean, /* getState */ GetState[TFullState]) => Unit): Self = StObject.set(x, "onFinish", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnFinishUndefined: Self = StObject.set(x, "onFinish", js.undefined)
      
      @scala.inline
      def setOnStart(value: (/* payload */ TStartPayload, /* getState */ GetState[TFullState]) => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      @scala.inline
      def setOnSuccess(value: (/* response */ TSuccessPayload, /* getState */ GetState[TFullState]) => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
      
      @scala.inline
      def `setRedux-packSlashLIFECYCLE`(value: LIFECYCLEValues): Self = StObject.set(x, "redux-pack/LIFECYCLE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setRedux-packSlashLIFECYCLEUndefined`: Self = StObject.set(x, "redux-pack/LIFECYCLE", js.undefined)
      
      @scala.inline
      def `setRedux-packSlashTRANSACTION`(value: String): Self = StObject.set(x, "redux-pack/TRANSACTION", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setRedux-packSlashTRANSACTIONUndefined`: Self = StObject.set(x, "redux-pack/TRANSACTION", js.undefined)
      
      @scala.inline
      def setStartPayload(value: TStartPayload): Self = StObject.set(x, "startPayload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartPayloadUndefined: Self = StObject.set(x, "startPayload", js.undefined)
    }
  }
  
  type GetState[S] = js.Function0[S]
  
  @js.native
  trait Handlers[S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload] extends StObject {
    
    var always: js.UndefOr[handlerReducer[S, typingsSlinky.redux.mod.Action[_]]] = js.native
    
    var failure: js.UndefOr[handlerReducer[S, PackActionPayload[TErrorPayload, TMetaPayload]]] = js.native
    
    var finish: js.UndefOr[handlerReducer[S, typingsSlinky.redux.mod.Action[_]]] = js.native
    
    var start: js.UndefOr[handlerReducer[S, PackActionPayload[TStartPayload, TMetaPayload]]] = js.native
    
    var success: js.UndefOr[handlerReducer[S, PackActionPayload[TSuccessPayload, TMetaPayload]]] = js.native
  }
  object Handlers {
    
    @scala.inline
    def apply[S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload](): Handlers[S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Handlers[S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload]]
    }
    
    @scala.inline
    implicit class HandlersMutableBuilder[Self <: Handlers[_, _, _, _, _], S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload] (val x: Self with (Handlers[S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload])) extends AnyVal {
      
      @scala.inline
      def setAlways(value: (S, typingsSlinky.redux.mod.Action[_]) => S): Self = StObject.set(x, "always", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAlwaysUndefined: Self = StObject.set(x, "always", js.undefined)
      
      @scala.inline
      def setFailure(value: (S, PackActionPayload[TErrorPayload, TMetaPayload]) => S): Self = StObject.set(x, "failure", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFailureUndefined: Self = StObject.set(x, "failure", js.undefined)
      
      @scala.inline
      def setFinish(value: (S, typingsSlinky.redux.mod.Action[_]) => S): Self = StObject.set(x, "finish", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFinishUndefined: Self = StObject.set(x, "finish", js.undefined)
      
      @scala.inline
      def setStart(value: (S, PackActionPayload[TStartPayload, TMetaPayload]) => S): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setSuccess(value: (S, PackActionPayload[TSuccessPayload, TMetaPayload]) => S): Self = StObject.set(x, "success", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reduxPack.reduxPackStrings.start
    - typingsSlinky.reduxPack.reduxPackStrings.success
    - typingsSlinky.reduxPack.reduxPackStrings.failure
  */
  trait LIFECYCLEValues extends StObject
  object LIFECYCLEValues {
    
    @scala.inline
    def failure: typingsSlinky.reduxPack.reduxPackStrings.failure = "failure".asInstanceOf[typingsSlinky.reduxPack.reduxPackStrings.failure]
    
    @scala.inline
    def start: typingsSlinky.reduxPack.reduxPackStrings.start = "start".asInstanceOf[typingsSlinky.reduxPack.reduxPackStrings.start]
    
    @scala.inline
    def success: typingsSlinky.reduxPack.reduxPackStrings.success = "success".asInstanceOf[typingsSlinky.reduxPack.reduxPackStrings.success]
  }
  
  type MetaPayload[M] = M with ReduxpackLIFECYCLE
  
  /* Inlined redux.redux.Action<any> & {  payload :Payload,   meta :redux-pack.redux-pack.MetaPayload<M>} */
  @js.native
  trait PackActionPayload[Payload, M] extends StObject {
    
    var meta: MetaPayload[M] = js.native
    
    var payload: Payload = js.native
    
    var `type`: js.Any = js.native
  }
  object PackActionPayload {
    
    @scala.inline
    def apply[Payload, M](meta: MetaPayload[M], payload: Payload, `type`: js.Any): PackActionPayload[Payload, M] = {
      val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackActionPayload[Payload, M]]
    }
    
    @scala.inline
    implicit class PackActionPayloadMutableBuilder[Self <: PackActionPayload[_, _], Payload, M] (val x: Self with (PackActionPayload[Payload, M])) extends AnyVal {
      
      @scala.inline
      def setMeta(value: MetaPayload[M]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PackError extends StObject {
    
    var error: Boolean = js.native
    
    var payload: js.Any = js.native
  }
  object PackError {
    
    @scala.inline
    def apply(error: Boolean, payload: js.Any): PackError = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackError]
    }
    
    @scala.inline
    implicit class PackErrorMutableBuilder[Self <: PackError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayload(value: js.Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
  
  type TFullState = StringDictionary[js.Any]
  
  type handlerReducer[S, A] = js.Function2[/* state */ S, /* action */ A, S]
}
