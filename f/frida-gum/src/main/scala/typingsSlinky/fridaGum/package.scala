package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object fridaGum {
  
  type AnyFunction = js.Function1[/* repeated */ js.Any, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.fridaGum.Arm64Register
    - scala.Double
    - typingsSlinky.fridaGum.UInt64
    - typingsSlinky.fridaGum.Int64
    - typingsSlinky.fridaGum.NativePointerValue
  */
  type Arm64CallArgument = typingsSlinky.fridaGum._Arm64CallArgument | scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.fridaGum.ArmRegister
    - scala.Double
    - typingsSlinky.fridaGum.UInt64
    - typingsSlinky.fridaGum.Int64
    - typingsSlinky.fridaGum.NativePointerValue
  */
  type ArmCallArgument = typingsSlinky.fridaGum._ArmCallArgument | scala.Double
  
  type ArmSystemRegister = typingsSlinky.fridaGum.fridaGumStrings.`apsr-nzcvq`
  
  type CSymbols = org.scalablytyped.runtime.StringDictionary[typingsSlinky.fridaGum.NativePointerValue]
  
  type EnumerateAction = typingsSlinky.fridaGum.fridaGumStrings.stop
  
  type ExceptionHandlerCallback = js.Function1[
    /* exception */ typingsSlinky.fridaGum.ExceptionDetails, 
    scala.Boolean | scala.Unit
  ]
  
  /**
    * Opaque ID returned by `setImmediate()`. Pass it to `clearImmediate()` to cancel a pending `setImmediate()`.
    */
  type ImmediateId = scala.Double
  
  /**
    * Callback to invoke when an instruction is about to be executed.
    */
  type InstructionProbeCallback = js.ThisFunction1[
    /* this */ typingsSlinky.fridaGum.InvocationContext, 
    /* args */ typingsSlinky.fridaGum.InvocationArguments, 
    scala.Unit
  ]
  
  /**
    * Opaque ID returned by `setInterval()`. Pass it to `clearInterval()` to cancel a pending `setInterval()`.
    */
  type IntervalId = scala.Double
  
  /**
    * Virtual array providing access to the argument list. Agnostic to the number of arguments and their types.
    */
  type InvocationArguments = js.Array[typingsSlinky.fridaGum.NativePointer]
  
  type MemoryPatchApplyCallback = js.Function1[/* code */ typingsSlinky.fridaGum.NativePointer, scala.Unit]
  
  type MessageCallback = js.Function2[
    /* message */ js.Any, 
    /* data */ typingsSlinky.fridaGum.ArrayBuffer | scala.Null, 
    scala.Unit
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.fridaGum.MipsRegister
    - scala.Double
    - typingsSlinky.fridaGum.UInt64
    - typingsSlinky.fridaGum.Int64
    - typingsSlinky.fridaGum.NativePointerValue
  */
  type MipsCallArgument = typingsSlinky.fridaGum._MipsCallArgument | scala.Double
  
  type ModuleMapFilter = js.Function1[/* m */ typingsSlinky.fridaGum.Module, scala.Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.fridaGum.NativePointerValue
    - typingsSlinky.fridaGum.UInt64
    - typingsSlinky.fridaGum.Int64
    - scala.Double
    - scala.Boolean
    - js.Array[js.Any]
  */
  type NativeArgumentValue = typingsSlinky.fridaGum._NativeArgumentValue | js.Array[js.Any] | scala.Double | scala.Boolean
  
  type NativeCallback = typingsSlinky.fridaGum.NativePointer
  
  type NativeCallbackImplementation = js.ThisFunction1[
    /* this */ js.UndefOr[typingsSlinky.fridaGum.InvocationContext], 
    /* repeated */ js.Any, 
    js.Any
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.fridaGum.NativePointer
    - typingsSlinky.fridaGum.UInt64
    - typingsSlinky.fridaGum.Int64
    - scala.Double
    - scala.Boolean
    - js.Array[js.Any]
  */
  type NativeReturnValue = typingsSlinky.fridaGum._NativeReturnValue | js.Array[js.Any] | scala.Double | scala.Boolean
  
  type NativeType = java.lang.String | js.Array[js.Any]
  
  /**
    * Given as a string of the form: rwx, where rw- means “readable and writable”.
    */
  type PageProtection = java.lang.String
  
  type RpcExports = org.scalablytyped.runtime.StringDictionary[typingsSlinky.fridaGum.AnyFunction]
  
  type ScheduledCallback = js.Function1[/* repeated */ js.Any, scala.Unit]
  
  type StalkerArm32TransformCallback = js.Function1[
    /* iterator */ typingsSlinky.fridaGum.StalkerArmIterator | typingsSlinky.fridaGum.StalkerThumbIterator, 
    scala.Unit
  ]
  
  type StalkerArm64TransformCallback = js.Function1[/* iterator */ typingsSlinky.fridaGum.StalkerArm64Iterator, scala.Unit]
  
  type StalkerBlockEventBare = js.Tuple2[
    typingsSlinky.fridaGum.NativePointer | java.lang.String, 
    typingsSlinky.fridaGum.NativePointer | java.lang.String
  ]
  
  type StalkerBlockEventFull = js.Tuple3[
    typingsSlinky.fridaGum.fridaGumStrings.block, 
    typingsSlinky.fridaGum.NativePointer | java.lang.String, 
    typingsSlinky.fridaGum.NativePointer | java.lang.String
  ]
  
  type StalkerCallEventBare = js.Tuple3[
    typingsSlinky.fridaGum.NativePointer | java.lang.String, 
    typingsSlinky.fridaGum.NativePointer | java.lang.String, 
    scala.Double
  ]
  
  type StalkerCallEventFull = js.Tuple4[
    typingsSlinky.fridaGum.fridaGumStrings.call, 
    typingsSlinky.fridaGum.NativePointer | java.lang.String, 
    typingsSlinky.fridaGum.NativePointer | java.lang.String, 
    scala.Double
  ]
  
  type StalkerCallProbeCallback = typingsSlinky.fridaGum.StalkerScriptCallProbeCallback | typingsSlinky.fridaGum.StalkerNativeCallProbeCallback
  
  type StalkerCallProbeId = scala.Double
  
  type StalkerCallSummary = org.scalablytyped.runtime.StringDictionary[scala.Double]
  
  type StalkerCallout = typingsSlinky.fridaGum.StalkerScriptCallout | typingsSlinky.fridaGum.StalkerNativeCallout
  
  type StalkerCompileEventBare = js.Tuple2[
    typingsSlinky.fridaGum.NativePointer | java.lang.String, 
    typingsSlinky.fridaGum.NativePointer | java.lang.String
  ]
  
  type StalkerCompileEventFull = js.Tuple3[
    typingsSlinky.fridaGum.fridaGumStrings.compile, 
    typingsSlinky.fridaGum.NativePointer | java.lang.String, 
    typingsSlinky.fridaGum.NativePointer | java.lang.String
  ]
  
  type StalkerEventBare = typingsSlinky.fridaGum.StalkerCallEventBare | typingsSlinky.fridaGum.StalkerRetEventBare | typingsSlinky.fridaGum.StalkerExecEventBare | typingsSlinky.fridaGum.StalkerBlockEventBare | typingsSlinky.fridaGum.StalkerCompileEventBare
  
  type StalkerEventFull = typingsSlinky.fridaGum.StalkerCallEventFull | typingsSlinky.fridaGum.StalkerRetEventFull | typingsSlinky.fridaGum.StalkerExecEventFull | typingsSlinky.fridaGum.StalkerBlockEventFull | typingsSlinky.fridaGum.StalkerCompileEventFull
  
  type StalkerExecEventBare = js.Array[typingsSlinky.fridaGum.NativePointer | java.lang.String]
  
  type StalkerExecEventFull = js.Tuple2[
    typingsSlinky.fridaGum.fridaGumStrings.exec, 
    typingsSlinky.fridaGum.NativePointer | java.lang.String
  ]
  
  /**
    * Called synchronously when a call is made to the given address.
    *
    * Signature: `void onCall (GumCallSite * site, gpointer user_data)`
    */
  type StalkerNativeCallProbeCallback = typingsSlinky.fridaGum.NativePointer
  
  /**
    * Signature: `void onAesEnc (GumCpuContext * cpu_context, gpointer user_data)`
    */
  type StalkerNativeCallout = typingsSlinky.fridaGum.NativePointer
  
  /**
    * Signature: `void transform (GumStalkerIterator * iterator, GumStalkerOutput * output, gpointer user_data)`
    */
  type StalkerNativeTransformCallback = typingsSlinky.fridaGum.NativePointer
  
  type StalkerRetEventBare = js.Tuple3[
    typingsSlinky.fridaGum.NativePointer | java.lang.String, 
    typingsSlinky.fridaGum.NativePointer | java.lang.String, 
    scala.Double
  ]
  
  type StalkerRetEventFull = js.Tuple4[
    typingsSlinky.fridaGum.fridaGumStrings.ret, 
    typingsSlinky.fridaGum.NativePointer | java.lang.String, 
    typingsSlinky.fridaGum.NativePointer | java.lang.String, 
    scala.Double
  ]
  
  /**
    * Called synchronously when a call is made to the given address.
    */
  type StalkerScriptCallProbeCallback = js.Function1[/* args */ typingsSlinky.fridaGum.InvocationArguments, scala.Unit]
  
  type StalkerScriptCallout = js.Function1[/* context */ typingsSlinky.fridaGum.CpuContext, scala.Unit]
  
  type StalkerTransformCallback = typingsSlinky.fridaGum.StalkerX86TransformCallback | typingsSlinky.fridaGum.StalkerArm32TransformCallback | typingsSlinky.fridaGum.StalkerArm64TransformCallback | typingsSlinky.fridaGum.StalkerNativeTransformCallback
  
  type StalkerX86TransformCallback = js.Function1[/* iterator */ typingsSlinky.fridaGum.StalkerX86Iterator, scala.Unit]
  
  type ThreadId = scala.Double
  
  /**
    * Opaque ID returned by `setTimeout()`. Pass it to `clearTimeout()` to cancel a pending `setTimeout()`.
    */
  type TimeoutId = scala.Double
  
  /**
    * Input stream backed by a file descriptor.
    *
    * Only available on UNIX-like OSes.
    */
  type UnixInputStream = typingsSlinky.fridaGum.InputStream
  
  /**
    * Output stream backed by a file descriptor.
    *
    * Only available on UNIX-like OSes.
    */
  type UnixOutputStream = typingsSlinky.fridaGum.OutputStream
  
  type WeakRefCallback = js.Function0[scala.Unit]
  
  /**
    * Opaque ID returned by `WeakRef.bind()`. Pass it to `WeakRef.unbind()` to
    * stop monitoring the target value.
    */
  type WeakRefId = scala.Double
  
  /**
    * Input stream backed by a Windows file handle.
    *
    * Only available on Windows.
    */
  type Win32InputStream = typingsSlinky.fridaGum.InputStream
  
  /**
    * Output stream backed by a Windows file handle.
    *
    * Only available on Windows.
    */
  type Win32OutputStream = typingsSlinky.fridaGum.OutputStream
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.fridaGum.X86Register
    - scala.Double
    - typingsSlinky.fridaGum.UInt64
    - typingsSlinky.fridaGum.Int64
    - typingsSlinky.fridaGum.NativePointerValue
  */
  type X86CallArgument = typingsSlinky.fridaGum._X86CallArgument | scala.Double
}
