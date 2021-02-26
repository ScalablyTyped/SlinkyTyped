package typingsSlinky.node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object childProcessMod {
  
  type Serializable = java.lang.String | js.Object | scala.Double | scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.node.nodeStrings.pipe
    - typingsSlinky.node.nodeStrings.ignore
    - typingsSlinky.node.nodeStrings.inherit
    - js.Array[
  js.UndefOr[
    typingsSlinky.node.nodeStrings.pipe | typingsSlinky.node.nodeStrings.ipc | typingsSlinky.node.nodeStrings.ignore | typingsSlinky.node.nodeStrings.inherit | typingsSlinky.node.streamMod.Stream | scala.Double | scala.Null
  ]]
  */
  type StdioOptions = typingsSlinky.node.childProcessMod._StdioOptions | (js.Array[
    js.UndefOr[
      typingsSlinky.node.nodeStrings.pipe | typingsSlinky.node.nodeStrings.ipc | typingsSlinky.node.nodeStrings.ignore | typingsSlinky.node.nodeStrings.inherit | typingsSlinky.node.streamMod.Stream | scala.Double | scala.Null
    ]
  ])
  
  type StdioPipe = js.UndefOr[scala.Null | typingsSlinky.node.nodeStrings.pipe]
  
  // no `options` definitely means stdout/stderr are `string`.
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  // fallback if nothing else matches. Worst case is always `string | Buffer`.
  @scala.inline
  def exec(command: java.lang.String): typingsSlinky.node.childProcessMod.ChildProcess = typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def exec(
    command: java.lang.String,
    callback: js.Function3[
      /* error */ typingsSlinky.node.childProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def exec(
    command: java.lang.String,
    options: typingsSlinky.node.fsMod.BaseEncodingOptions with typingsSlinky.node.childProcessMod.ExecOptions
  ): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def exec(
    command: java.lang.String,
    options: typingsSlinky.node.fsMod.BaseEncodingOptions with typingsSlinky.node.childProcessMod.ExecOptions,
    callback: js.Function3[
      /* error */ typingsSlinky.node.childProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String | typingsSlinky.node.Buffer, 
      /* stderr */ java.lang.String | typingsSlinky.node.Buffer, 
      scala.Unit
    ]
  ): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def exec(
    command: java.lang.String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ typingsSlinky.node.childProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String | typingsSlinky.node.Buffer, 
      /* stderr */ java.lang.String | typingsSlinky.node.Buffer, 
      scala.Unit
    ]
  ): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def exec(
    command: java.lang.String,
    options: scala.Null,
    callback: js.Function3[
      /* error */ typingsSlinky.node.childProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String | typingsSlinky.node.Buffer, 
      /* stderr */ java.lang.String | typingsSlinky.node.Buffer, 
      scala.Unit
    ]
  ): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  // `options` with well known `encoding` means stdout/stderr are definitely `string`.
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  // `options` with an `encoding` whose type is `string` means stdout/stderr could either be `Buffer` or `string`.
  // There is no guarantee the `encoding` is unknown as `string` is a superset of `BufferEncoding`.
  @scala.inline
  def exec(command: java.lang.String, options: typingsSlinky.node.anon.encodingBufferEncodingExe): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def exec(
    command: java.lang.String,
    options: typingsSlinky.node.anon.encodingBufferEncodingExe,
    callback: js.Function3[
      typingsSlinky.node.childProcessMod.ExecException | scala.Null, 
      typingsSlinky.node.Buffer | (/* stdout */ java.lang.String), 
      typingsSlinky.node.Buffer | (/* stderr */ java.lang.String), 
      scala.Unit
    ]
  ): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  // `options` with `"buffer"` or `null` for `encoding` means stdout/stderr are definitely `Buffer`.
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def exec(command: java.lang.String, options: typingsSlinky.node.anon.encodingbuffernullExecOpt): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def exec(
    command: java.lang.String,
    options: typingsSlinky.node.anon.encodingbuffernullExecOpt,
    callback: js.Function3[
      /* error */ typingsSlinky.node.childProcessMod.ExecException | scala.Null, 
      /* stdout */ typingsSlinky.node.Buffer, 
      /* stderr */ typingsSlinky.node.Buffer, 
      scala.Unit
    ]
  ): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  // `options` without an `encoding` means stdout/stderr are definitely `string`.
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def exec(command: java.lang.String, options: typingsSlinky.node.childProcessMod.ExecOptions): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def exec(
    command: java.lang.String,
    options: typingsSlinky.node.childProcessMod.ExecOptions,
    callback: js.Function3[
      /* error */ typingsSlinky.node.childProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  // fallback if nothing else matches. Worst case is always `string | Buffer`.
  @scala.inline
  def execFile(file: java.lang.String): typingsSlinky.node.childProcessMod.ChildProcess = typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      typingsSlinky.node.childProcessMod.ExecException | scala.Null, 
      typingsSlinky.node.Buffer | (/* stdout */ java.lang.String), 
      typingsSlinky.node.Buffer | (/* stderr */ java.lang.String), 
      scala.Unit
    ]
  ): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: typingsSlinky.node.fsMod.BaseEncodingOptions with typingsSlinky.node.childProcessMod.ExecFileOptions
  ): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: typingsSlinky.node.fsMod.BaseEncodingOptions with typingsSlinky.node.childProcessMod.ExecFileOptions,
    callback: js.Function3[
      /* error */ typingsSlinky.node.childProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String | typingsSlinky.node.Buffer, 
      /* stderr */ java.lang.String | typingsSlinky.node.Buffer, 
      scala.Unit
    ]
  ): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ typingsSlinky.node.childProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String | typingsSlinky.node.Buffer, 
      /* stderr */ java.lang.String | typingsSlinky.node.Buffer, 
      scala.Unit
    ]
  ): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: scala.Null,
    callback: js.Function3[
      /* error */ typingsSlinky.node.childProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String | typingsSlinky.node.Buffer, 
      /* stderr */ java.lang.String | typingsSlinky.node.Buffer, 
      scala.Unit
    ]
  ): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: typingsSlinky.node.childProcessMod.ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[
      /* error */ typingsSlinky.node.childProcessMod.ExecException | scala.Null, 
      /* stdout */ typingsSlinky.node.Buffer, 
      /* stderr */ typingsSlinky.node.Buffer, 
      scala.Unit
    ]
  ): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: typingsSlinky.node.childProcessMod.ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ typingsSlinky.node.childProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String | typingsSlinky.node.Buffer, 
      /* stderr */ java.lang.String | typingsSlinky.node.Buffer, 
      scala.Unit
    ]
  ): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: typingsSlinky.node.childProcessMod.ExecFileOptionsWithStringEncoding,
    callback: js.Function3[
      /* error */ typingsSlinky.node.childProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: typingsSlinky.node.childProcessMod.ExecFileOptions,
    callback: js.Function3[
      /* error */ typingsSlinky.node.childProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(file: java.lang.String, args: js.Array[java.lang.String]): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    callback: js.Function3[
      /* error */ typingsSlinky.node.childProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: typingsSlinky.node.fsMod.BaseEncodingOptions with typingsSlinky.node.childProcessMod.ExecFileOptions
  ): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: typingsSlinky.node.fsMod.BaseEncodingOptions with typingsSlinky.node.childProcessMod.ExecFileOptions,
    callback: js.Function3[
      /* error */ typingsSlinky.node.childProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String | typingsSlinky.node.Buffer, 
      /* stderr */ java.lang.String | typingsSlinky.node.Buffer, 
      scala.Unit
    ]
  ): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ typingsSlinky.node.childProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String | typingsSlinky.node.Buffer, 
      /* stderr */ java.lang.String | typingsSlinky.node.Buffer, 
      scala.Unit
    ]
  ): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: scala.Null,
    callback: js.Function3[
      /* error */ typingsSlinky.node.childProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String | typingsSlinky.node.Buffer, 
      /* stderr */ java.lang.String | typingsSlinky.node.Buffer, 
      scala.Unit
    ]
  ): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: typingsSlinky.node.childProcessMod.ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[
      /* error */ typingsSlinky.node.childProcessMod.ExecException | scala.Null, 
      /* stdout */ typingsSlinky.node.Buffer, 
      /* stderr */ typingsSlinky.node.Buffer, 
      scala.Unit
    ]
  ): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: typingsSlinky.node.childProcessMod.ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ typingsSlinky.node.childProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String | typingsSlinky.node.Buffer, 
      /* stderr */ java.lang.String | typingsSlinky.node.Buffer, 
      scala.Unit
    ]
  ): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: typingsSlinky.node.childProcessMod.ExecFileOptionsWithStringEncoding,
    callback: js.Function3[
      /* error */ typingsSlinky.node.childProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: typingsSlinky.node.childProcessMod.ExecFileOptions,
    callback: js.Function3[
      /* error */ typingsSlinky.node.childProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: scala.Null,
    callback: js.Function3[
      typingsSlinky.node.childProcessMod.ExecException | scala.Null, 
      typingsSlinky.node.Buffer | (/* stdout */ java.lang.String), 
      typingsSlinky.node.Buffer | (/* stderr */ java.lang.String), 
      scala.Unit
    ]
  ): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: scala.Null,
    options: typingsSlinky.node.fsMod.BaseEncodingOptions with typingsSlinky.node.childProcessMod.ExecFileOptions
  ): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: scala.Null,
    options: typingsSlinky.node.fsMod.BaseEncodingOptions with typingsSlinky.node.childProcessMod.ExecFileOptions,
    callback: js.Function3[
      /* error */ typingsSlinky.node.childProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String | typingsSlinky.node.Buffer, 
      /* stderr */ java.lang.String | typingsSlinky.node.Buffer, 
      scala.Unit
    ]
  ): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: scala.Null,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ typingsSlinky.node.childProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String | typingsSlinky.node.Buffer, 
      /* stderr */ java.lang.String | typingsSlinky.node.Buffer, 
      scala.Unit
    ]
  ): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: scala.Null,
    options: scala.Null,
    callback: js.Function3[
      /* error */ typingsSlinky.node.childProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String | typingsSlinky.node.Buffer, 
      /* stderr */ java.lang.String | typingsSlinky.node.Buffer, 
      scala.Unit
    ]
  ): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: scala.Null,
    options: typingsSlinky.node.childProcessMod.ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[
      /* error */ typingsSlinky.node.childProcessMod.ExecException | scala.Null, 
      /* stdout */ typingsSlinky.node.Buffer, 
      /* stderr */ typingsSlinky.node.Buffer, 
      scala.Unit
    ]
  ): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: scala.Null,
    options: typingsSlinky.node.childProcessMod.ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ typingsSlinky.node.childProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String | typingsSlinky.node.Buffer, 
      /* stderr */ java.lang.String | typingsSlinky.node.Buffer, 
      scala.Unit
    ]
  ): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: scala.Null,
    options: typingsSlinky.node.childProcessMod.ExecFileOptionsWithStringEncoding,
    callback: js.Function3[
      /* error */ typingsSlinky.node.childProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: scala.Null,
    options: typingsSlinky.node.childProcessMod.ExecFileOptions,
    callback: js.Function3[
      /* error */ typingsSlinky.node.childProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  // no `options` definitely means stdout/stderr are `string`.
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    callback: js.Function3[
      /* error */ typingsSlinky.node.childProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    options: typingsSlinky.node.fsMod.BaseEncodingOptions with typingsSlinky.node.childProcessMod.ExecFileOptions
  ): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    options: typingsSlinky.node.fsMod.BaseEncodingOptions with typingsSlinky.node.childProcessMod.ExecFileOptions,
    callback: js.Function3[
      /* error */ typingsSlinky.node.childProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String | typingsSlinky.node.Buffer, 
      /* stderr */ java.lang.String | typingsSlinky.node.Buffer, 
      scala.Unit
    ]
  ): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  // `options` with `"buffer"` or `null` for `encoding` means stdout/stderr are definitely `Buffer`.
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    options: typingsSlinky.node.childProcessMod.ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[
      /* error */ typingsSlinky.node.childProcessMod.ExecException | scala.Null, 
      /* stdout */ typingsSlinky.node.Buffer, 
      /* stderr */ typingsSlinky.node.Buffer, 
      scala.Unit
    ]
  ): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  // `options` with an `encoding` whose type is `string` means stdout/stderr could either be `Buffer` or `string`.
  // There is no guarantee the `encoding` is unknown as `string` is a superset of `BufferEncoding`.
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    options: typingsSlinky.node.childProcessMod.ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ typingsSlinky.node.childProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String | typingsSlinky.node.Buffer, 
      /* stderr */ java.lang.String | typingsSlinky.node.Buffer, 
      scala.Unit
    ]
  ): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  // `options` with well known `encoding` means stdout/stderr are definitely `string`.
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    options: typingsSlinky.node.childProcessMod.ExecFileOptionsWithStringEncoding,
    callback: js.Function3[
      /* error */ typingsSlinky.node.childProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  // `options` without an `encoding` means stdout/stderr are definitely `string`.
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    options: typingsSlinky.node.childProcessMod.ExecFileOptions,
    callback: js.Function3[
      /* error */ typingsSlinky.node.childProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  
  @scala.inline
  def execFileSync(command: java.lang.String): java.lang.String = typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def execFileSync(
    command: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: typingsSlinky.node.childProcessMod.ExecFileSyncOptions
  ): typingsSlinky.node.Buffer = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.Buffer]
  @scala.inline
  def execFileSync(
    command: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: typingsSlinky.node.childProcessMod.ExecFileSyncOptionsWithBufferEncoding
  ): typingsSlinky.node.Buffer = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.Buffer]
  @scala.inline
  def execFileSync(
    command: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: typingsSlinky.node.childProcessMod.ExecFileSyncOptionsWithStringEncoding
  ): java.lang.String = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def execFileSync(command: java.lang.String, args: js.Array[java.lang.String]): java.lang.String = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def execFileSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: typingsSlinky.node.childProcessMod.ExecFileSyncOptions
  ): typingsSlinky.node.Buffer = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.Buffer]
  @scala.inline
  def execFileSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: typingsSlinky.node.childProcessMod.ExecFileSyncOptionsWithBufferEncoding
  ): typingsSlinky.node.Buffer = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.Buffer]
  @scala.inline
  def execFileSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: typingsSlinky.node.childProcessMod.ExecFileSyncOptionsWithStringEncoding
  ): java.lang.String = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def execFileSync(command: java.lang.String, options: typingsSlinky.node.childProcessMod.ExecFileSyncOptions): typingsSlinky.node.Buffer = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.Buffer]
  @scala.inline
  def execFileSync(
    command: java.lang.String,
    options: typingsSlinky.node.childProcessMod.ExecFileSyncOptionsWithBufferEncoding
  ): typingsSlinky.node.Buffer = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.Buffer]
  @scala.inline
  def execFileSync(
    command: java.lang.String,
    options: typingsSlinky.node.childProcessMod.ExecFileSyncOptionsWithStringEncoding
  ): java.lang.String = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def execFileSync_Buffer(command: java.lang.String): typingsSlinky.node.Buffer = typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.Buffer]
  @scala.inline
  def execFileSync_Buffer(command: java.lang.String, args: js.Array[java.lang.String]): typingsSlinky.node.Buffer = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.Buffer]
  
  @scala.inline
  def execSync(command: java.lang.String): java.lang.String = typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execSync")(command.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def execSync(command: java.lang.String, options: typingsSlinky.node.childProcessMod.ExecSyncOptions): typingsSlinky.node.Buffer = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.Buffer]
  @scala.inline
  def execSync(
    command: java.lang.String,
    options: typingsSlinky.node.childProcessMod.ExecSyncOptionsWithBufferEncoding
  ): typingsSlinky.node.Buffer = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.Buffer]
  @scala.inline
  def execSync(
    command: java.lang.String,
    options: typingsSlinky.node.childProcessMod.ExecSyncOptionsWithStringEncoding
  ): java.lang.String = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def execSync_Buffer(command: java.lang.String): typingsSlinky.node.Buffer = typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execSync")(command.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.Buffer]
  
  @scala.inline
  def fork(modulePath: java.lang.String): typingsSlinky.node.childProcessMod.ChildProcess = typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  @scala.inline
  def fork(
    modulePath: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: typingsSlinky.node.childProcessMod.ForkOptions
  ): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  @scala.inline
  def fork(modulePath: java.lang.String, args: js.Array[java.lang.String]): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  @scala.inline
  def fork(
    modulePath: java.lang.String,
    args: js.Array[java.lang.String],
    options: typingsSlinky.node.childProcessMod.ForkOptions
  ): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  @scala.inline
  def fork(modulePath: java.lang.String, options: typingsSlinky.node.childProcessMod.ForkOptions): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  
  // overloads of spawn without 'args'
  // overloads of spawn with 'args'
  @scala.inline
  def spawn(command: java.lang.String): typingsSlinky.node.childProcessMod.ChildProcessWithoutNullStreams = typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcessWithoutNullStreams]
  @scala.inline
  def spawn(
    command: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: typingsSlinky.node.childProcessMod.SpawnOptionsWithoutStdio
  ): typingsSlinky.node.childProcessMod.ChildProcessWithoutNullStreams = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcessWithoutNullStreams]
  @scala.inline
  def spawn(command: java.lang.String, args: js.Array[java.lang.String]): typingsSlinky.node.childProcessMod.ChildProcessWithoutNullStreams = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcessWithoutNullStreams]
  @scala.inline
  def spawn(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: typingsSlinky.node.childProcessMod.SpawnOptions
  ): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  @scala.inline
  def spawn(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: typingsSlinky.node.childProcessMod.SpawnOptionsWithStdioTuple[
      typingsSlinky.node.childProcessMod.StdioNull | typingsSlinky.node.childProcessMod.StdioPipe, 
      typingsSlinky.node.childProcessMod.StdioNull | typingsSlinky.node.childProcessMod.StdioPipe, 
      typingsSlinky.node.childProcessMod.StdioNull | typingsSlinky.node.childProcessMod.StdioPipe
    ]
  ): typingsSlinky.node.childProcessMod.ChildProcessByStdio[
    typingsSlinky.node.streamMod.Writable, 
    typingsSlinky.node.streamMod.Readable, 
    typingsSlinky.node.streamMod.Readable
  ] = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcessByStdio[
    typingsSlinky.node.streamMod.Writable, 
    typingsSlinky.node.streamMod.Readable, 
    typingsSlinky.node.streamMod.Readable
  ]]
  @scala.inline
  def spawn(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: typingsSlinky.node.childProcessMod.SpawnOptionsWithoutStdio
  ): typingsSlinky.node.childProcessMod.ChildProcessWithoutNullStreams = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcessWithoutNullStreams]
  @scala.inline
  def spawn(command: java.lang.String, options: typingsSlinky.node.childProcessMod.SpawnOptions): typingsSlinky.node.childProcessMod.ChildProcess = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcess]
  @scala.inline
  def spawn(
    command: java.lang.String,
    options: typingsSlinky.node.childProcessMod.SpawnOptionsWithStdioTuple[
      typingsSlinky.node.childProcessMod.StdioNull | typingsSlinky.node.childProcessMod.StdioPipe, 
      typingsSlinky.node.childProcessMod.StdioNull | typingsSlinky.node.childProcessMod.StdioPipe, 
      typingsSlinky.node.childProcessMod.StdioNull | typingsSlinky.node.childProcessMod.StdioPipe
    ]
  ): typingsSlinky.node.childProcessMod.ChildProcessByStdio[
    typingsSlinky.node.streamMod.Writable, 
    typingsSlinky.node.streamMod.Readable, 
    typingsSlinky.node.streamMod.Readable
  ] = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcessByStdio[
    typingsSlinky.node.streamMod.Writable, 
    typingsSlinky.node.streamMod.Readable, 
    typingsSlinky.node.streamMod.Readable
  ]]
  @scala.inline
  def spawn(command: java.lang.String, options: typingsSlinky.node.childProcessMod.SpawnOptionsWithoutStdio): typingsSlinky.node.childProcessMod.ChildProcessWithoutNullStreams = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.ChildProcessWithoutNullStreams]
  
  @scala.inline
  def spawnSync(command: java.lang.String): typingsSlinky.node.childProcessMod.SpawnSyncReturns[typingsSlinky.node.Buffer] = typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.childProcessMod.SpawnSyncReturns[typingsSlinky.node.Buffer]]
  @scala.inline
  def spawnSync(
    command: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: typingsSlinky.node.childProcessMod.SpawnSyncOptions
  ): typingsSlinky.node.childProcessMod.SpawnSyncReturns[typingsSlinky.node.Buffer] = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.SpawnSyncReturns[typingsSlinky.node.Buffer]]
  @scala.inline
  def spawnSync(
    command: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: typingsSlinky.node.childProcessMod.SpawnSyncOptionsWithBufferEncoding
  ): typingsSlinky.node.childProcessMod.SpawnSyncReturns[typingsSlinky.node.Buffer] = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.SpawnSyncReturns[typingsSlinky.node.Buffer]]
  @scala.inline
  def spawnSync(
    command: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: typingsSlinky.node.childProcessMod.SpawnSyncOptionsWithStringEncoding
  ): typingsSlinky.node.childProcessMod.SpawnSyncReturns[java.lang.String] = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.SpawnSyncReturns[java.lang.String]]
  @scala.inline
  def spawnSync(command: java.lang.String, args: js.Array[java.lang.String]): typingsSlinky.node.childProcessMod.SpawnSyncReturns[java.lang.String] = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.SpawnSyncReturns[java.lang.String]]
  @scala.inline
  def spawnSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: typingsSlinky.node.childProcessMod.SpawnSyncOptions
  ): typingsSlinky.node.childProcessMod.SpawnSyncReturns[typingsSlinky.node.Buffer] = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.SpawnSyncReturns[typingsSlinky.node.Buffer]]
  @scala.inline
  def spawnSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: typingsSlinky.node.childProcessMod.SpawnSyncOptionsWithBufferEncoding
  ): typingsSlinky.node.childProcessMod.SpawnSyncReturns[typingsSlinky.node.Buffer] = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.SpawnSyncReturns[typingsSlinky.node.Buffer]]
  @scala.inline
  def spawnSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: typingsSlinky.node.childProcessMod.SpawnSyncOptionsWithStringEncoding
  ): typingsSlinky.node.childProcessMod.SpawnSyncReturns[java.lang.String] = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.SpawnSyncReturns[java.lang.String]]
  @scala.inline
  def spawnSync(command: java.lang.String, options: typingsSlinky.node.childProcessMod.SpawnSyncOptions): typingsSlinky.node.childProcessMod.SpawnSyncReturns[typingsSlinky.node.Buffer] = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.SpawnSyncReturns[typingsSlinky.node.Buffer]]
  @scala.inline
  def spawnSync(
    command: java.lang.String,
    options: typingsSlinky.node.childProcessMod.SpawnSyncOptionsWithBufferEncoding
  ): typingsSlinky.node.childProcessMod.SpawnSyncReturns[typingsSlinky.node.Buffer] = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.SpawnSyncReturns[typingsSlinky.node.Buffer]]
  @scala.inline
  def spawnSync(
    command: java.lang.String,
    options: typingsSlinky.node.childProcessMod.SpawnSyncOptionsWithStringEncoding
  ): typingsSlinky.node.childProcessMod.SpawnSyncReturns[java.lang.String] = (typingsSlinky.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.childProcessMod.SpawnSyncReturns[java.lang.String]]
}
