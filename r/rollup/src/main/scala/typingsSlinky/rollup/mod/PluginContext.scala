package typingsSlinky.rollup.mod

import typingsSlinky.rollup.anon.Line
import typingsSlinky.rollup.anon.Name
import typingsSlinky.rollup.anon.SkipSelf
import typingsSlinky.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginContext extends MinimalPluginContext {
  
  def addWatchFile(id: String): Unit = js.native
  
  var cache: PluginCache = js.native
  
  /** @deprecated Use `this.emitFile` instead */
  def emitAsset(name: String): String = js.native
  def emitAsset(name: String, source: String): String = js.native
  def emitAsset(name: String, source: js.typedarray.Uint8Array): String = js.native
  /** @deprecated Use `this.emitFile` instead */
  @JSName("emitAsset")
  var emitAsset_Original: EmitAsset = js.native
  
  /** @deprecated Use `this.emitFile` instead */
  def emitChunk(id: String): String = js.native
  def emitChunk(id: String, options: Name): String = js.native
  /** @deprecated Use `this.emitFile` instead */
  @JSName("emitChunk")
  var emitChunk_Original: EmitChunk = js.native
  
  def emitFile(emittedFile: EmittedFile): String = js.native
  @JSName("emitFile")
  var emitFile_Original: EmitFile = js.native
  
  def error(err: String): scala.Nothing = js.native
  def error(err: String, pos: Double): scala.Nothing = js.native
  def error(err: String, pos: Line): scala.Nothing = js.native
  def error(err: RollupError): scala.Nothing = js.native
  def error(err: RollupError, pos: Double): scala.Nothing = js.native
  def error(err: RollupError, pos: Line): scala.Nothing = js.native
  
  /** @deprecated Use `this.getFileName` instead */
  def getAssetFileName(assetReferenceId: String): String = js.native
  
  /** @deprecated Use `this.getFileName` instead */
  def getChunkFileName(chunkReferenceId: String): String = js.native
  
  def getFileName(fileReferenceId: String): String = js.native
  
  def getModuleIds(): IterableIterator[String] = js.native
  
  def getModuleInfo(moduleId: String): ModuleInfo = js.native
  @JSName("getModuleInfo")
  var getModuleInfo_Original: GetModuleInfo = js.native
  
  def isExternal(source: String, importer: js.UndefOr[scala.Nothing], isResolved: Boolean): Boolean = js.native
  /** @deprecated Use `this.resolve` instead */
  def isExternal(source: String, importer: String, isResolved: Boolean): Boolean = js.native
  /** @deprecated Use `this.resolve` instead */
  @JSName("isExternal")
  var isExternal_Original: IsExternal = js.native
  
  /** @deprecated Use `this.getModuleIds` instead */
  var moduleIds: IterableIterator[String] = js.native
  
  def parse(input: String, options: js.Any): AcornNode = js.native
  
  def resolve(source: String): js.Promise[ResolvedId | Null] = js.native
  def resolve(source: String, importer: js.UndefOr[scala.Nothing], options: SkipSelf): js.Promise[ResolvedId | Null] = js.native
  def resolve(source: String, importer: String): js.Promise[ResolvedId | Null] = js.native
  def resolve(source: String, importer: String, options: SkipSelf): js.Promise[ResolvedId | Null] = js.native
  
  /** @deprecated Use `this.resolve` instead */
  def resolveId(source: String): js.Promise[String | Null] = js.native
  def resolveId(source: String, importer: String): js.Promise[String | Null] = js.native
  
  def setAssetSource(assetReferenceId: String, source: String): Unit = js.native
  def setAssetSource(assetReferenceId: String, source: js.typedarray.Uint8Array): Unit = js.native
  
  def warn(warning: String): Unit = js.native
  def warn(warning: String, pos: Double): Unit = js.native
  def warn(warning: String, pos: Line): Unit = js.native
  def warn(warning: RollupWarning): Unit = js.native
  def warn(warning: RollupWarning, pos: Double): Unit = js.native
  def warn(warning: RollupWarning, pos: Line): Unit = js.native
}
