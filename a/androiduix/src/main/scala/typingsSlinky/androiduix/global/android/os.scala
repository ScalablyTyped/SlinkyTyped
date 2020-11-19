package typingsSlinky.androiduix.global.android

import typingsSlinky.androiduix.android.os.Handler.Callback
import typingsSlinky.androiduix.java_.lang.Runnable
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.os")
@js.native
object os extends js.Object {
  
  @js.native
  class Bundle ()
    extends typingsSlinky.androiduix.android.os.Bundle {
    def this(copy: typingsSlinky.androiduix.android.os.Bundle) = this()
  }
  
  @js.native
  class Handler ()
    extends typingsSlinky.androiduix.android.os.Handler {
    def this(callback: Callback) = this()
  }
  /* static members */
  @js.native
  object Handler extends js.Object {
    
    /* private */ def getPostMessage(r: js.Any, token: js.Any): js.Any = js.native
  }
  
  @js.native
  class Message ()
    extends typingsSlinky.androiduix.android.os.Message
  /* static members */
  @js.native
  object Message extends js.Object {
    
    var Type_Normal: Double = js.native
    
    var Type_Traversal: Double = js.native
    
    def obtain(): typingsSlinky.androiduix.android.os.Message = js.native
    def obtain(h: typingsSlinky.androiduix.android.os.Handler): typingsSlinky.androiduix.android.os.Message = js.native
    def obtain(h: typingsSlinky.androiduix.android.os.Handler, callback: Runnable): typingsSlinky.androiduix.android.os.Message = js.native
    def obtain(h: typingsSlinky.androiduix.android.os.Handler, what: Double): typingsSlinky.androiduix.android.os.Message = js.native
    def obtain(h: typingsSlinky.androiduix.android.os.Handler, what: Double, arg1: Double, arg2: Double): typingsSlinky.androiduix.android.os.Message = js.native
    def obtain(
      h: typingsSlinky.androiduix.android.os.Handler,
      what: Double,
      arg1: Double,
      arg2: Double,
      obj: js.Any
    ): typingsSlinky.androiduix.android.os.Message = js.native
    def obtain(h: typingsSlinky.androiduix.android.os.Handler, what: Double, obj: js.Any): typingsSlinky.androiduix.android.os.Message = js.native
    def obtain(orig: typingsSlinky.androiduix.android.os.Message): typingsSlinky.androiduix.android.os.Message = js.native
    
    var sPool: js.Any = js.native
  }
  
  @js.native
  class MessageQueue ()
    extends typingsSlinky.androiduix.android.os.MessageQueue
  /* static members */
  @js.native
  object MessageQueue extends js.Object {
    
    var _loopActive: js.Any = js.native
    
    /* private */ def checkLoop(): js.Any = js.native
    
    /* private */ def dispatchMessage(msg: js.Any): js.Any = js.native
    
    def enqueueMessage(msg: typingsSlinky.androiduix.android.os.Message, when: Double): Boolean = js.native
    
    def getMessages(h: typingsSlinky.androiduix.android.os.Handler, r: Runnable, `object`: js.Any): js.Array[typingsSlinky.androiduix.android.os.Message] = js.native
    def getMessages(h: typingsSlinky.androiduix.android.os.Handler, what: Double, `object`: js.Any): js.Array[typingsSlinky.androiduix.android.os.Message] = js.native
    
    def hasMessages(h: typingsSlinky.androiduix.android.os.Handler, r: Runnable, `object`: js.Any): Boolean = js.native
    def hasMessages(h: typingsSlinky.androiduix.android.os.Handler, what: Double, `object`: js.Any): Boolean = js.native
    
    /* private */ def loop(): js.Any = js.native
    
    var messages: Set[typingsSlinky.androiduix.android.os.Message] = js.native
    
    def recycleMessage(
      handler: typingsSlinky.androiduix.android.os.Handler,
      message: typingsSlinky.androiduix.android.os.Message
    ): Unit = js.native
    
    def removeCallbacksAndMessages(h: typingsSlinky.androiduix.android.os.Handler, `object`: js.Any): Unit = js.native
    
    def removeMessages(h: typingsSlinky.androiduix.android.os.Handler, r: Runnable, `object`: js.Any): js.Any = js.native
    def removeMessages(h: typingsSlinky.androiduix.android.os.Handler, what: Double, `object`: js.Any): js.Any = js.native
    
    /* private */ def requestNextLoop(): js.Any = js.native
  }
  
  @js.native
  class SystemClock ()
    extends typingsSlinky.androiduix.android.os.SystemClock
  /* static members */
  @js.native
  object SystemClock extends js.Object {
    
    def uptimeMillis(): Double = js.native
  }
  
  @js.native
  class Trace ()
    extends typingsSlinky.androiduix.android.os.Trace
  /* static members */
  @js.native
  object Trace extends js.Object {
    
    var MAX_SECTION_NAME_LEN: js.Any = js.native
    
    var TAG: js.Any = js.native
    
    var TRACE_TAG_ACTIVITY_MANAGER: Double = js.native
    
    var TRACE_TAG_ALWAYS: Double = js.native
    
    var TRACE_TAG_APP: Double = js.native
    
    var TRACE_TAG_AUDIO: Double = js.native
    
    var TRACE_TAG_CAMERA: Double = js.native
    
    var TRACE_TAG_DALVIK: Double = js.native
    
    var TRACE_TAG_GRAPHICS: Double = js.native
    
    var TRACE_TAG_HAL: Double = js.native
    
    var TRACE_TAG_INPUT: Double = js.native
    
    var TRACE_TAG_NEVER: Double = js.native
    
    var TRACE_TAG_NOT_READY: js.Any = js.native
    
    var TRACE_TAG_RESOURCES: Double = js.native
    
    var TRACE_TAG_RS: Double = js.native
    
    var TRACE_TAG_SYNC_MANAGER: Double = js.native
    
    var TRACE_TAG_VIDEO: Double = js.native
    
    var TRACE_TAG_VIEW: Double = js.native
    
    var TRACE_TAG_WEBVIEW: Double = js.native
    
    var TRACE_TAG_WINDOW_MANAGER: Double = js.native
    
    def asyncTraceBegin(traceTag: Double, methodName: String, cookie: Double): Unit = js.native
    
    def asyncTraceEnd(traceTag: Double, methodName: String, cookie: Double): Unit = js.native
    
    def beginSection(sectionName: String): Unit = js.native
    
    /* private */ def cacheEnabledTags(): js.Any = js.native
    
    def endSection(): Unit = js.native
    
    def isTagEnabled(traceTag: Double): Boolean = js.native
    
    /* private */ def nativeAsyncTraceBegin(tag: js.Any, name: js.Any, cookie: js.Any): js.Any = js.native
    
    /* private */ def nativeAsyncTraceEnd(tag: js.Any, name: js.Any, cookie: js.Any): js.Any = js.native
    
    /* private */ def nativeGetEnabledTags(): js.Any = js.native
    
    /* private */ def nativeSetAppTracingAllowed(allowed: js.Any): js.Any = js.native
    
    /* private */ def nativeSetTracingEnabled(allowed: js.Any): js.Any = js.native
    
    /* private */ def nativeTraceBegin(tag: js.Any, name: js.Any): js.Any = js.native
    
    /* private */ def nativeTraceCounter(tag: js.Any, name: js.Any, value: js.Any): js.Any = js.native
    
    /* private */ def nativeTraceEnd(tag: js.Any): js.Any = js.native
    
    var sEnabledTags: js.Any = js.native
    
    def setAppTracingAllowed(allowed: Boolean): Unit = js.native
    
    def setTracingEnabled(enabled: Boolean): Unit = js.native
    
    def traceBegin(traceTag: Double, methodName: String): Unit = js.native
    
    def traceCounter(traceTag: Double, counterName: String, counterValue: Double): Unit = js.native
    
    def traceEnd(traceTag: Double): Unit = js.native
  }
}
