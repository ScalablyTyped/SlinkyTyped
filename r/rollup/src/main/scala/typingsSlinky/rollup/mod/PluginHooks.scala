package typingsSlinky.rollup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginHooks extends OutputPluginHooks {
  
  def buildEnd(): js.Promise[Unit] | Unit = js.native
  def buildEnd(err: js.Error): js.Promise[Unit] | Unit = js.native
  
  def buildStart(options: NormalizedInputOptions): js.Promise[Unit] | Unit = js.native
  
  def load(id: String): js.Promise[LoadResult] | LoadResult = js.native
  @JSName("load")
  var load_Original: LoadHook = js.native
  
  def options(options: InputOptions): js.UndefOr[InputOptions | Null] = js.native
  
  def resolveDynamicImport(specifier: String, importer: String): js.Promise[ResolveIdResult] | ResolveIdResult = js.native
  def resolveDynamicImport(specifier: AcornNode, importer: String): js.Promise[ResolveIdResult] | ResolveIdResult = js.native
  @JSName("resolveDynamicImport")
  var resolveDynamicImport_Original: ResolveDynamicImportHook = js.native
  
  def resolveId(source: String): js.Promise[ResolveIdResult] | ResolveIdResult = js.native
  def resolveId(source: String, importer: String): js.Promise[ResolveIdResult] | ResolveIdResult = js.native
  @JSName("resolveId")
  var resolveId_Original: ResolveIdHook = js.native
  
  def transform(code: String, id: String): js.Promise[TransformResult] | TransformResult = js.native
  @JSName("transform")
  var transform_Original: TransformHook = js.native
  
  def watchChange(id: String): Unit = js.native
}
