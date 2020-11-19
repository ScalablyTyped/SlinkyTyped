package typingsSlinky.jake.mod.global.jake

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("jake.PackageTask")
@js.native
class PackageTask protected () extends js.Object {
  /**
    * Instantiating a PackageTask creates a number of Jake Tasks that make packaging and distributing your software easy.
    * @param name The name of the project
    * @param version The current project version (will be appended to the project-name in the package-archive
    * @param definition Defines the contents of the package, and format of the package-archive. Will be executed on the instantiated PackageTask (i.e., 'this', will be the PackageTask instance), to set the various instance-propertiess.
    */
  def this(name: String, version: String, definition: js.Function0[Unit]) = this()
  
  /**
    *     Equivalent to the '-C' command for the `tar` and `jar` commands. ("Change to this directory before adding files.")
    */
  var archiveChangeDir: String = js.native
  
  /**
    * Specifies the files and directories to include in the package-archive. If unset, this will default to the main package directory -- i.e., name + version.
    */
  var archiveContentDir: String = js.native
  
  /**
    * The shell-command to use for creating jar archives.
    */
  var jarCommand: String = js.native
  
  /**
    * Can be set to point the `jar` utility at a manifest file to use in a .jar archive. If unset, one will be automatically created by the `jar` utility. This path should be relative to the root of the package directory (this.packageDir above, likely 'pkg')
    */
  var manifestFile: String = js.native
  
  /**
    * The name of the project
    */
  var name: String = js.native
  
  /**
    * If set to true, uses the `jar` utility to create a .jar archive of the pagckage
    */
  var needJar: Boolean = js.native
  
  /**
    * If set to true, uses the `tar` utility to create a gzip .tgz archive of the pagckage
    */
  var needTar: Boolean = js.native
  
  /**
    * If set to true, uses the `tar` utility to create a bzip2 .bz2 archive of the pagckage
    */
  var needTarBz2: Boolean = js.native
  
  /**
    * If set to true, uses the `zip` utility to create a .zip archive of the pagckage
    */
  var needZip: Boolean = js.native
  
  /**
    * The list of files and directories to include in the package-archive
    */
  var packageFiles: FileList = js.native
  
  /**
    * The shell-command to use for creating tar archives.
    */
  var tarCommand: String = js.native
  
  /**
    * The project version-string
    */
  var version: String = js.native
  
  /**
    * The shell-command to use for creating zip archives.
    */
  var zipCommand: String = js.native
}
