package typingsSlinky.monacoEditor.mod

import typingsSlinky.monacoEditor.anon.Authority
import typingsSlinky.monacoEditor.anon.Fragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("monaco-editor", "Uri")
@js.native
class Uri () extends UriComponents {
  
  /**
    * Returns a string representing the corresponding file system path of this Uri.
    * Will handle UNC paths, normalizes windows drive letters to lower-case, and uses the
    * platform specific path separator.
    *
    * * Will *not* validate the path for invalid characters and semantics.
    * * Will *not* look at the scheme of this Uri.
    * * The result shall *not* be used for display purposes but for accessing a file on disk.
    *
    *
    * The *difference* to `Uri#path` is the use of the platform specific separator and the handling
    * of UNC paths. See the below sample of a file-uri with an authority (UNC path).
    *
    * ```ts
    const u = Uri.parse('file://server/c$/folder/file.txt')
    u.authority === 'server'
    u.path === '/shares/c$/file.txt'
    u.fsPath === '\\server\c$\folder\file.txt'
    ```
    *
    * Using `Uri#path` to read a file (using fs-apis) would not be enough because parts of the path,
    * namely the server name, would be missing. Therefore `Uri#fsPath` exists - it's sugar to ease working
    * with URIs that represent files on disk (`file` scheme).
    */
  def fsPath: String = js.native
  
  def toJSON(): UriComponents = js.native
  
  def toString(skipEncoding: Boolean): String = js.native
  
  def `with`(change: Authority): Uri = js.native
}
/* static members */
object Uri {
  
  /**
    * Creates a new Uri from a file system path, e.g. `c:\my\files`,
    * `/usr/home`, or `\\server\share\some\path`.
    *
    * The *difference* between `Uri#parse` and `Uri#file` is that the latter treats the argument
    * as path, not as stringified-uri. E.g. `Uri.file(path)` is **not the same as**
    * `Uri.parse('file://' + path)` because the path might contain characters that are
    * interpreted (# and ?). See the following sample:
    * ```ts
    const good = Uri.file('/coding/c#/project1');
    good.scheme === 'file';
    good.path === '/coding/c#/project1';
    good.fragment === '';
    const bad = Uri.parse('file://' + '/coding/c#/project1');
    bad.scheme === 'file';
    bad.path === '/coding/c'; // path is now broken
    bad.fragment === '/project1';
    ```
    *
    * @param path A file system path (see `Uri#fsPath`)
    */
  @JSImport("monaco-editor", "Uri.file")
  @js.native
  def file(path: String): Uri = js.native
  
  @JSImport("monaco-editor", "Uri.from")
  @js.native
  def from(components: Fragment): Uri = js.native
  
  @JSImport("monaco-editor", "Uri.isUri")
  @js.native
  def isUri(thing: js.Any): /* is monaco-editor.monaco-editor.Uri */ Boolean = js.native
  
  /**
    * Join a Uri path with path fragments and normalizes the resulting path.
    *
    * @param uri The input Uri.
    * @param pathFragment The path fragment to add to the Uri path.
    * @returns The resulting Uri.
    */
  @JSImport("monaco-editor", "Uri.joinPath")
  @js.native
  def joinPath(uri: Uri, pathFragment: String*): Uri = js.native
  
  /**
    * Creates a new Uri from a string, e.g. `http://www.msft.com/some/path`,
    * `file:///usr/home`, or `scheme:with/path`.
    *
    * @param value A string which represents an Uri (see `Uri#toString`).
    */
  @JSImport("monaco-editor", "Uri.parse")
  @js.native
  def parse(value: String): Uri = js.native
  @JSImport("monaco-editor", "Uri.parse")
  @js.native
  def parse(value: String, _strict: Boolean): Uri = js.native
  
  @JSImport("monaco-editor", "Uri.revive")
  @js.native
  def revive(): js.UndefOr[Uri] = js.native
  @JSImport("monaco-editor", "Uri.revive")
  @js.native
  def revive(data: Uri): js.UndefOr[Uri] = js.native
  @JSImport("monaco-editor", "Uri.revive")
  @js.native
  def revive(data: UriComponents): js.UndefOr[Uri] = js.native
  @JSImport("monaco-editor", "Uri.revive")
  @js.native
  def revive_Uri(data: Uri): Uri = js.native
  @JSImport("monaco-editor", "Uri.revive")
  @js.native
  def revive_Uri(data: UriComponents): Uri = js.native
}
