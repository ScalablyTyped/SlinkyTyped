package typingsSlinky.nssm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nssm", JSImport.Namespace)
  @js.native
  def apply(serviceName: String): Nssm = js.native
  @JSImport("nssm", JSImport.Namespace)
  @js.native
  def apply(serviceName: String, options: NssmOptions): Nssm = js.native
  
  type CallbackFn = js.Function2[/* error */ js.UndefOr[String], /* result */ js.UndefOr[String], Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.nssm.nssmStrings.install
    - typingsSlinky.nssm.nssmStrings.remove
    - typingsSlinky.nssm.nssmStrings.start
    - typingsSlinky.nssm.nssmStrings.stop
    - typingsSlinky.nssm.nssmStrings.restart
    - typingsSlinky.nssm.nssmStrings.status
    - typingsSlinky.nssm.nssmStrings.pause
    - typingsSlinky.nssm.nssmStrings.continue
    - typingsSlinky.nssm.nssmStrings.rotate
    - typingsSlinky.nssm.nssmStrings.get
    - typingsSlinky.nssm.nssmStrings.set
    - typingsSlinky.nssm.nssmStrings.reset
  */
  trait Command extends StObject
  object Command {
    
    @scala.inline
    def continue: typingsSlinky.nssm.nssmStrings.continue = "continue".asInstanceOf[typingsSlinky.nssm.nssmStrings.continue]
    
    @scala.inline
    def get: typingsSlinky.nssm.nssmStrings.get = "get".asInstanceOf[typingsSlinky.nssm.nssmStrings.get]
    
    @scala.inline
    def install: typingsSlinky.nssm.nssmStrings.install = "install".asInstanceOf[typingsSlinky.nssm.nssmStrings.install]
    
    @scala.inline
    def pause: typingsSlinky.nssm.nssmStrings.pause = "pause".asInstanceOf[typingsSlinky.nssm.nssmStrings.pause]
    
    @scala.inline
    def remove: typingsSlinky.nssm.nssmStrings.remove = "remove".asInstanceOf[typingsSlinky.nssm.nssmStrings.remove]
    
    @scala.inline
    def reset: typingsSlinky.nssm.nssmStrings.reset = "reset".asInstanceOf[typingsSlinky.nssm.nssmStrings.reset]
    
    @scala.inline
    def restart: typingsSlinky.nssm.nssmStrings.restart = "restart".asInstanceOf[typingsSlinky.nssm.nssmStrings.restart]
    
    @scala.inline
    def rotate: typingsSlinky.nssm.nssmStrings.rotate = "rotate".asInstanceOf[typingsSlinky.nssm.nssmStrings.rotate]
    
    @scala.inline
    def set: typingsSlinky.nssm.nssmStrings.set = "set".asInstanceOf[typingsSlinky.nssm.nssmStrings.set]
    
    @scala.inline
    def start: typingsSlinky.nssm.nssmStrings.start = "start".asInstanceOf[typingsSlinky.nssm.nssmStrings.start]
    
    @scala.inline
    def status: typingsSlinky.nssm.nssmStrings.status = "status".asInstanceOf[typingsSlinky.nssm.nssmStrings.status]
    
    @scala.inline
    def stop: typingsSlinky.nssm.nssmStrings.stop = "stop".asInstanceOf[typingsSlinky.nssm.nssmStrings.stop]
  }
  
  /* Inlined {[ key in nssm.nssm.Command ]: nssm.nssm.NssmCommandFn} */
  @js.native
  trait Nssm extends StObject {
    
    def continue(): NssmPromise[String] = js.native
    def continue(arg1: js.UndefOr[scala.Nothing], arg2: String): NssmPromise[String] = js.native
    def continue(arg1: String): NssmPromise[String] = js.native
    def continue(arg1: String, arg2: String): NssmPromise[String] = js.native
    def continue(arg1: String, arg2: String, callback: CallbackFn): Unit = js.native
    def continue(arg1: String, callback: CallbackFn): Unit = js.native
    def continue(callback: CallbackFn): Unit = js.native
    @JSName("continue")
    var continue_Original: NssmCommandFn = js.native
    
    def get(): NssmPromise[String] = js.native
    def get(arg1: js.UndefOr[scala.Nothing], arg2: String): NssmPromise[String] = js.native
    def get(arg1: String): NssmPromise[String] = js.native
    def get(arg1: String, arg2: String): NssmPromise[String] = js.native
    def get(arg1: String, arg2: String, callback: CallbackFn): Unit = js.native
    def get(arg1: String, callback: CallbackFn): Unit = js.native
    def get(callback: CallbackFn): Unit = js.native
    @JSName("get")
    var get_Original: NssmCommandFn = js.native
    
    def install(): NssmPromise[String] = js.native
    def install(arg1: js.UndefOr[scala.Nothing], arg2: String): NssmPromise[String] = js.native
    def install(arg1: String): NssmPromise[String] = js.native
    def install(arg1: String, arg2: String): NssmPromise[String] = js.native
    def install(arg1: String, arg2: String, callback: CallbackFn): Unit = js.native
    def install(arg1: String, callback: CallbackFn): Unit = js.native
    def install(callback: CallbackFn): Unit = js.native
    @JSName("install")
    var install_Original: NssmCommandFn = js.native
    
    def pause(): NssmPromise[String] = js.native
    def pause(arg1: js.UndefOr[scala.Nothing], arg2: String): NssmPromise[String] = js.native
    def pause(arg1: String): NssmPromise[String] = js.native
    def pause(arg1: String, arg2: String): NssmPromise[String] = js.native
    def pause(arg1: String, arg2: String, callback: CallbackFn): Unit = js.native
    def pause(arg1: String, callback: CallbackFn): Unit = js.native
    def pause(callback: CallbackFn): Unit = js.native
    @JSName("pause")
    var pause_Original: NssmCommandFn = js.native
    
    def remove(): NssmPromise[String] = js.native
    def remove(arg1: js.UndefOr[scala.Nothing], arg2: String): NssmPromise[String] = js.native
    def remove(arg1: String): NssmPromise[String] = js.native
    def remove(arg1: String, arg2: String): NssmPromise[String] = js.native
    def remove(arg1: String, arg2: String, callback: CallbackFn): Unit = js.native
    def remove(arg1: String, callback: CallbackFn): Unit = js.native
    def remove(callback: CallbackFn): Unit = js.native
    @JSName("remove")
    var remove_Original: NssmCommandFn = js.native
    
    def reset(): NssmPromise[String] = js.native
    def reset(arg1: js.UndefOr[scala.Nothing], arg2: String): NssmPromise[String] = js.native
    def reset(arg1: String): NssmPromise[String] = js.native
    def reset(arg1: String, arg2: String): NssmPromise[String] = js.native
    def reset(arg1: String, arg2: String, callback: CallbackFn): Unit = js.native
    def reset(arg1: String, callback: CallbackFn): Unit = js.native
    def reset(callback: CallbackFn): Unit = js.native
    @JSName("reset")
    var reset_Original: NssmCommandFn = js.native
    
    def restart(): NssmPromise[String] = js.native
    def restart(arg1: js.UndefOr[scala.Nothing], arg2: String): NssmPromise[String] = js.native
    def restart(arg1: String): NssmPromise[String] = js.native
    def restart(arg1: String, arg2: String): NssmPromise[String] = js.native
    def restart(arg1: String, arg2: String, callback: CallbackFn): Unit = js.native
    def restart(arg1: String, callback: CallbackFn): Unit = js.native
    def restart(callback: CallbackFn): Unit = js.native
    @JSName("restart")
    var restart_Original: NssmCommandFn = js.native
    
    def rotate(): NssmPromise[String] = js.native
    def rotate(arg1: js.UndefOr[scala.Nothing], arg2: String): NssmPromise[String] = js.native
    def rotate(arg1: String): NssmPromise[String] = js.native
    def rotate(arg1: String, arg2: String): NssmPromise[String] = js.native
    def rotate(arg1: String, arg2: String, callback: CallbackFn): Unit = js.native
    def rotate(arg1: String, callback: CallbackFn): Unit = js.native
    def rotate(callback: CallbackFn): Unit = js.native
    @JSName("rotate")
    var rotate_Original: NssmCommandFn = js.native
    
    def set(): NssmPromise[String] = js.native
    def set(arg1: js.UndefOr[scala.Nothing], arg2: String): NssmPromise[String] = js.native
    def set(arg1: String): NssmPromise[String] = js.native
    def set(arg1: String, arg2: String): NssmPromise[String] = js.native
    def set(arg1: String, arg2: String, callback: CallbackFn): Unit = js.native
    def set(arg1: String, callback: CallbackFn): Unit = js.native
    def set(callback: CallbackFn): Unit = js.native
    @JSName("set")
    var set_Original: NssmCommandFn = js.native
    
    def start(): NssmPromise[String] = js.native
    def start(arg1: js.UndefOr[scala.Nothing], arg2: String): NssmPromise[String] = js.native
    def start(arg1: String): NssmPromise[String] = js.native
    def start(arg1: String, arg2: String): NssmPromise[String] = js.native
    def start(arg1: String, arg2: String, callback: CallbackFn): Unit = js.native
    def start(arg1: String, callback: CallbackFn): Unit = js.native
    def start(callback: CallbackFn): Unit = js.native
    @JSName("start")
    var start_Original: NssmCommandFn = js.native
    
    def status(): NssmPromise[String] = js.native
    def status(arg1: js.UndefOr[scala.Nothing], arg2: String): NssmPromise[String] = js.native
    def status(arg1: String): NssmPromise[String] = js.native
    def status(arg1: String, arg2: String): NssmPromise[String] = js.native
    def status(arg1: String, arg2: String, callback: CallbackFn): Unit = js.native
    def status(arg1: String, callback: CallbackFn): Unit = js.native
    def status(callback: CallbackFn): Unit = js.native
    @JSName("status")
    var status_Original: NssmCommandFn = js.native
    
    def stop(): NssmPromise[String] = js.native
    def stop(arg1: js.UndefOr[scala.Nothing], arg2: String): NssmPromise[String] = js.native
    def stop(arg1: String): NssmPromise[String] = js.native
    def stop(arg1: String, arg2: String): NssmPromise[String] = js.native
    def stop(arg1: String, arg2: String, callback: CallbackFn): Unit = js.native
    def stop(arg1: String, callback: CallbackFn): Unit = js.native
    def stop(callback: CallbackFn): Unit = js.native
    @JSName("stop")
    var stop_Original: NssmCommandFn = js.native
  }
  
  type NssmCatch[T] = js.Function1[
    /* onrejected */ js.UndefOr[
      (js.Function2[
        /* reason */ js.Error, 
        /* stderr */ String, 
        scala.Nothing | js.Thenable[scala.Nothing]
      ]) | Null
    ], 
    NssmPromise[T | scala.Nothing]
  ]
  
  type NssmCommandFn = ZeroArgCommandFn with OneArgCommandFn with TwoArgCommandFn with PromiseCommandFn
  
  @js.native
  trait NssmOptions extends StObject {
    
    var nssmExe: js.UndefOr[String] = js.native
  }
  object NssmOptions {
    
    @scala.inline
    def apply(): NssmOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NssmOptions]
    }
    
    @scala.inline
    implicit class NssmOptionsMutableBuilder[Self <: NssmOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNssmExe(value: String): Self = StObject.set(x, "nssmExe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNssmExeUndefined: Self = StObject.set(x, "nssmExe", js.undefined)
    }
  }
  
  @js.native
  trait NssmPromise[T]
    extends js.Promise[T] {
    
    def `catch`[TResult](): NssmPromise[T | TResult] = js.native
    def `catch`[TResult](
      onrejected: js.Function2[/* reason */ js.Error, /* stderr */ String, TResult | js.Thenable[TResult]]
    ): NssmPromise[T | TResult] = js.native
    @JSName("catch")
    var catch_Original: NssmCatch[T] = js.native
    
    def `then`[TResult1, TResult2](): NssmPromise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](
      onfulfilled: js.UndefOr[scala.Nothing],
      onrejected: js.Function2[/* reason */ js.Error, /* stderr */ String, TResult2 | js.Thenable[TResult2]]
    ): NssmPromise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ T, TResult1 | js.Thenable[TResult1]]): NssmPromise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](
      onfulfilled: js.Function1[/* value */ T, TResult1 | js.Thenable[TResult1]],
      onrejected: js.Function2[/* reason */ js.Error, /* stderr */ String, TResult2 | js.Thenable[TResult2]]
    ): NssmPromise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](
      onfulfilled: Null,
      onrejected: js.Function2[/* reason */ js.Error, /* stderr */ String, TResult2 | js.Thenable[TResult2]]
    ): NssmPromise[TResult1 | TResult2] = js.native
    @JSName("then")
    var then_Original: NssmThen[T] = js.native
  }
  
  type NssmThen[T] = js.Function2[
    /* onfulfilled */ js.UndefOr[(js.Function1[/* value */ T, T | js.Thenable[T]]) | Null], 
    /* onrejected */ js.UndefOr[
      (js.Function2[
        /* reason */ js.Error, 
        /* stderr */ String, 
        scala.Nothing | js.Thenable[scala.Nothing]
      ]) | Null
    ], 
    NssmPromise[T | scala.Nothing]
  ]
  
  type OneArgCommandFn = js.Function2[/* arg1 */ String, /* callback */ CallbackFn, Unit]
  
  type PromiseCommandFn = js.Function2[/* arg1 */ js.UndefOr[String], /* arg2 */ js.UndefOr[String], NssmPromise[String]]
  
  type TwoArgCommandFn = js.Function3[/* arg1 */ String, /* arg2 */ String, /* callback */ CallbackFn, Unit]
  
  type ZeroArgCommandFn = js.Function1[/* callback */ CallbackFn, Unit]
}
