package typingsSlinky.dotnetDepsParser

import typingsSlinky.dotnetDepsParser.parsersMod.PkgTree
import typingsSlinky.dotnetDepsParser.parsersMod.PropsLookup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dotnet-deps-parser", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def buildDepTreeFromFiles(root: String, manifestFilePath: String): PkgTree | js.Promise[PkgTree] = js.native
  def buildDepTreeFromFiles(root: String, manifestFilePath: String, includeDev: Boolean): PkgTree | js.Promise[PkgTree] = js.native
  def buildDepTreeFromFiles(root: String, manifestFilePath: String, includeDev: Boolean, targetFramework: String): PkgTree | js.Promise[PkgTree] = js.native
  def buildDepTreeFromPackagesConfig(manifestFileContents: String): js.Promise[PkgTree] = js.native
  def buildDepTreeFromPackagesConfig(manifestFileContents: String, includeDev: Boolean): js.Promise[PkgTree] = js.native
  def buildDepTreeFromProjectAssetsJson(manifestFileContents: String): PkgTree = js.native
  def buildDepTreeFromProjectAssetsJson(manifestFileContents: String, targetFramework: String): PkgTree = js.native
  def buildDepTreeFromProjectFile(manifestFileContents: String): js.Promise[PkgTree] = js.native
  def buildDepTreeFromProjectFile(manifestFileContents: String, includeDev: Boolean): js.Promise[PkgTree] = js.native
  def buildDepTreeFromProjectFile(manifestFileContents: String, includeDev: Boolean, propsMap: PropsLookup): js.Promise[PkgTree] = js.native
  def buildDepTreeFromProjectJson(manifestFileContents: String): PkgTree = js.native
  def buildDepTreeFromProjectJson(manifestFileContents: String, includeDev: Boolean): PkgTree = js.native
  def containsPackageReference(manifestFileContents: String): js.Promise[Boolean] = js.native
  def extractProps(propsFileContents: String): js.Promise[PropsLookup] = js.native
  def extractTargetFrameworksFromFiles(root: String, manifestFilePath: String): js.Promise[js.Array[String]] = js.native
  def extractTargetFrameworksFromFiles(root: String, manifestFilePath: String, includeDev: Boolean): js.Promise[js.Array[String]] = js.native
  def extractTargetFrameworksFromProjectAssetsJson(manifestFileContents: String): js.Promise[js.Array[String]] = js.native
  def extractTargetFrameworksFromProjectConfig(manifestFileContents: String): js.Promise[js.Array[String]] = js.native
  def extractTargetFrameworksFromProjectFile(manifestFileContents: String): js.Promise[js.Array[String]] = js.native
  def extractTargetFrameworksFromProjectJson(manifestFileContents: String): js.Promise[js.Array[String]] = js.native
  @js.native
  object DepType extends js.Object {
    /* "dev" */ val dev: typingsSlinky.dotnetDepsParser.parsersMod.DepType.dev with String = js.native
    /* "prod" */ val prod: typingsSlinky.dotnetDepsParser.parsersMod.DepType.prod with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.dotnetDepsParser.parsersMod.DepType with String] = js.native
  }
  
}

