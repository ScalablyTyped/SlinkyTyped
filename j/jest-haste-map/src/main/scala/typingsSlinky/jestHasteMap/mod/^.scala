package typingsSlinky.jestHasteMap.mod

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.jestHasteMap.anon.TypeofHasteModuleMap
import typingsSlinky.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HasteMap is a JavaScript implementation of Facebook's haste module system.
  *
  * This implementation is inspired by https://github.com/facebook/node-haste
  * and was built with for high-performance in large code repositories with
  * hundreds of thousands of files. This implementation is scalable and provides
  * predictable performance.
  *
  * Because the haste map creation and synchronization is critical to startup
  * performance and most tasks are blocked by I/O this class makes heavy use of
  * synchronous operations. It uses worker processes for parallelizing file
  * access and metadata extraction.
  *
  * The data structures created by `jest-haste-map` can be used directly from the
  * cache without further processing. The metadata objects in the `files` and
  * `map` objects contain cross-references: a metadata object from one can look
  * up the corresponding metadata object in the other map. Note that in most
  * projects, the number of files will be greater than the number of haste
  * modules one module can refer to many files based on platform extensions.
  *
  * type HasteMap = {
  *   clocks: WatchmanClocks,
  *   files: {[filepath: string]: FileMetaData},
  *   map: {[id: string]: ModuleMapItem},
  *   mocks: {[id: string]: string},
  * }
  *
  * // Watchman clocks are used for query synchronization and file system deltas.
  * type WatchmanClocks = {[filepath: string]: string};
  *
  * type FileMetaData = {
  *   id: ?string, // used to look up module metadata objects in `map`.
  *   mtime: number, // check for outdated files.
  *   size: number, // size of the file in bytes.
  *   visited: boolean, // whether the file has been parsed or not.
  *   dependencies: Array<string>, // all relative dependencies of this file.
  *   sha1: ?string, // SHA-1 of the file, if requested via options.
  * };
  *
  * // Modules can be targeted to a specific platform based on the file name.
  * // Example: platform.ios.js and Platform.android.js will both map to the same
  * // `Platform` module. The platform should be specified during resolution.
  * type ModuleMapItem = {[platform: string]: ModuleMetaData};
  *
  * //
  * type ModuleMetaData = {
  *   path: string, // the path to look up the file object in `files`.
  *   type: string, // the module type (either `package` or `module`).
  * };
  *
  * Note that the data structures described above are conceptual only. The actual
  * implementation uses arrays and constant keys for metadata storage. Instead of
  * `{id: 'flatMap', mtime: 3421, size: 42, visited: true, dependencies: []}` the real
  * representation is similar to `['flatMap', 3421, 42, 1, []]` to save storage space
  * and reduce parse and write time of a big JSON blob.
  *
  * The HasteMap is created as follows:
  *  1. read data from the cache or create an empty structure.
  *
  *  2. crawl the file system.
  *     * empty cache: crawl the entire file system.
  *     * cache available:
  *       * if watchman is available: get file system delta changes.
  *       * if watchman is unavailable: crawl the entire file system.
  *     * build metadata objects for every file. This builds the `files` part of
  *       the `HasteMap`.
  *
  *  3. parse and extract metadata from changed files.
  *     * this is done in parallel over worker processes to improve performance.
  *     * the worst case is to parse all files.
  *     * the best case is no file system access and retrieving all data from
  *       the cache.
  *     * the average case is a small number of changed files.
  *
  *  4. serialize the new `HasteMap` in a cache file.
  *     Worker processes can directly access the cache through `HasteMap.read()`.
  *
  */
@JSImport("jest-haste-map", JSImport.Namespace)
@js.native
class ^ protected () extends HasteMap {
  def this(options: Options) = this()
}
@JSImport("jest-haste-map", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  var DuplicateError: Instantiable2[
    /* mockPath1 */ String, 
    /* mockPath2 */ String, 
    typingsSlinky.jestHasteMap.mod.DuplicateError
  ] = js.native
  
  var H: HType = js.native
  
  var ModuleMap: TypeofHasteModuleMap = js.native
  
  def getCacheFilePath(tmpdir: Path, name: String, extra: String*): String = js.native
}
