package typingsSlinky.rollup.mod

import typingsSlinky.rollup.anon.AssetFileName
import typingsSlinky.rollup.anon.AssetReferenceId
import typingsSlinky.rollup.anon.ChunkId
import typingsSlinky.rollup.anon.Code
import typingsSlinky.rollup.anon.CustomResolution
import typingsSlinky.rollup.anon.Left
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputPluginHooks extends js.Object {
  
  def augmentChunkHash(chunk: PreRenderedChunk): String | Unit = js.native
  
  def generateBundle(options: NormalizedOutputOptions, bundle: OutputBundle, isWrite: Boolean): Unit | js.Promise[Unit] = js.native
  
  def outputOptions(options: OutputOptions): js.UndefOr[OutputOptions | Null] = js.native
  
  def renderChunk(code: String, chunk: RenderedChunk, options: NormalizedOutputOptions): (js.Promise[Code | Null]) | Code | String | Null = js.native
  @JSName("renderChunk")
  var renderChunk_Original: RenderChunkHook = js.native
  
  def renderDynamicImport(options: CustomResolution): js.UndefOr[Left | Null] = js.native
  
  def renderError(): js.Promise[Unit] | Unit = js.native
  def renderError(err: js.Error): js.Promise[Unit] | Unit = js.native
  
  def renderStart(outputOptions: NormalizedOutputOptions, inputOptions: NormalizedInputOptions): js.Promise[Unit] | Unit = js.native
  
  /** @deprecated Use `resolveFileUrl` instead */
  def resolveAssetUrl(options: AssetFileName): js.UndefOr[String | Null] = js.native
  /** @deprecated Use `resolveFileUrl` instead */
  @JSName("resolveAssetUrl")
  var resolveAssetUrl_Original: ResolveAssetUrlHook = js.native
  
  def resolveFileUrl(options: AssetReferenceId): js.UndefOr[String | Null] = js.native
  @JSName("resolveFileUrl")
  var resolveFileUrl_Original: ResolveFileUrlHook = js.native
  
  def resolveImportMeta(prop: String, options: ChunkId): js.UndefOr[String | Null] = js.native
  def resolveImportMeta(prop: Null, options: ChunkId): js.UndefOr[String | Null] = js.native
  @JSName("resolveImportMeta")
  var resolveImportMeta_Original: ResolveImportMetaHook = js.native
  
  def writeBundle(options: NormalizedOutputOptions, bundle: OutputBundle): Unit | js.Promise[Unit] = js.native
}
