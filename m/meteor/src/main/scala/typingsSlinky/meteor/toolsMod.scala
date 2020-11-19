package typingsSlinky.meteor

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Console
import typingsSlinky.meteor.anon.Author
import typingsSlinky.meteor.anon.Bare
import typingsSlinky.meteor.anon.Cwd
import typingsSlinky.meteor.anon.DebugOnly
import typingsSlinky.meteor.anon.LaunchExternal
import typingsSlinky.meteor.anon.Name
import typingsSlinky.meteor.anon.Unordered
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("meteor/tools", JSImport.Namespace)
@js.native
object toolsMod extends js.Object {
  
  var console: Console = js.native
  
  def execFileAsync(command: String): js.Any = js.native
  def execFileAsync(command: String, args: js.UndefOr[scala.Nothing], options: Cwd): js.Any = js.native
  def execFileAsync(command: String, args: js.Array[_]): js.Any = js.native
  def execFileAsync(command: String, args: js.Array[_], options: Cwd): js.Any = js.native
  
  def execFileSync(command: String): String = js.native
  def execFileSync(command: String, args: js.UndefOr[scala.Nothing], options: Cwd): String = js.native
  def execFileSync(command: String, args: js.Array[_]): String = js.native
  def execFileSync(command: String, args: js.Array[_], options: Cwd): String = js.native
  
  @js.native
  object App extends js.Object {
    
    def accessRule(pattern: String): Unit = js.native
    def accessRule(pattern: String, options: LaunchExternal): Unit = js.native
    
    def configurePlugin(id: String, config: js.Object): Unit = js.native
    
    def icons(icons: js.Object): Unit = js.native
    
    def info(options: Author): Unit = js.native
    
    def launchScreens(launchScreens: js.Object): Unit = js.native
    
    def setPreference(name: String, value: String): Unit = js.native
    def setPreference(name: String, value: String, platform: String): Unit = js.native
  }
  
  @js.native
  object Assets extends js.Object {
    
    def absoluteFilePath(assetPath: String): String = js.native
    
    def getBinary(assetPath: String): js.UndefOr[EJSON] = js.native
    def getBinary(assetPath: String, asyncCallback: js.Function): js.UndefOr[EJSON] = js.native
    
    def getText(assetPath: String): js.UndefOr[String] = js.native
    def getText(assetPath: String, asyncCallback: js.Function): js.UndefOr[String] = js.native
  }
  
  @js.native
  object Cordova extends js.Object {
    
    def depends(dependencies: StringDictionary[String]): Unit = js.native
  }
  
  @js.native
  object Npm extends js.Object {
    
    def depends(dependencies: StringDictionary[String]): Unit = js.native
    
    def require(name: String): js.Any = js.native
  }
  
  @js.native
  object Package extends js.Object {
    
    def describe(options: DebugOnly): Unit = js.native
    
    def onTest(func: js.Function1[/* api */ typingsSlinky.meteor.toolsMod.PackageAPI, Unit]): Unit = js.native
    
    def onUse(func: js.Function1[/* api */ typingsSlinky.meteor.toolsMod.PackageAPI, Unit]): Unit = js.native
    
    def registerBuildPlugin(): Unit = js.native
    def registerBuildPlugin(options: Name): Unit = js.native
  }
  
  @js.native
  trait PackageAPI
    extends Instantiable0[typingsSlinky.meteor.toolsMod.PackageAPI] {
    
    def addAssets(filenames: String, architecture: String): Unit = js.native
    def addAssets(filenames: String, architecture: js.Array[String]): Unit = js.native
    def addAssets(filenames: js.Array[String], architecture: String): Unit = js.native
    def addAssets(filenames: js.Array[String], architecture: js.Array[String]): Unit = js.native
    
    def addFiles(filenames: String): Unit = js.native
    def addFiles(filenames: String, architecture: js.UndefOr[scala.Nothing], options: Bare): Unit = js.native
    def addFiles(filenames: String, architecture: String): Unit = js.native
    def addFiles(filenames: String, architecture: String, options: Bare): Unit = js.native
    def addFiles(filenames: String, architecture: js.Array[String]): Unit = js.native
    def addFiles(filenames: String, architecture: js.Array[String], options: Bare): Unit = js.native
    def addFiles(filenames: js.Array[String]): Unit = js.native
    def addFiles(filenames: js.Array[String], architecture: js.UndefOr[scala.Nothing], options: Bare): Unit = js.native
    def addFiles(filenames: js.Array[String], architecture: String): Unit = js.native
    def addFiles(filenames: js.Array[String], architecture: String, options: Bare): Unit = js.native
    def addFiles(filenames: js.Array[String], architecture: js.Array[String]): Unit = js.native
    def addFiles(filenames: js.Array[String], architecture: js.Array[String], options: Bare): Unit = js.native
    
    def export(exportedObjects: String): Unit = js.native
    def export(
      exportedObjects: String,
      architecture: js.UndefOr[scala.Nothing],
      exportOptions: js.UndefOr[scala.Nothing],
      testOnly: Boolean
    ): Unit = js.native
    def export(exportedObjects: String, architecture: js.UndefOr[scala.Nothing], exportOptions: js.Object): Unit = js.native
    def export(
      exportedObjects: String,
      architecture: js.UndefOr[scala.Nothing],
      exportOptions: js.Object,
      testOnly: Boolean
    ): Unit = js.native
    def export(exportedObjects: String, architecture: String): Unit = js.native
    def export(
      exportedObjects: String,
      architecture: String,
      exportOptions: js.UndefOr[scala.Nothing],
      testOnly: Boolean
    ): Unit = js.native
    def export(exportedObjects: String, architecture: String, exportOptions: js.Object): Unit = js.native
    def export(exportedObjects: String, architecture: String, exportOptions: js.Object, testOnly: Boolean): Unit = js.native
    def export(exportedObjects: String, architecture: js.Array[String]): Unit = js.native
    def export(
      exportedObjects: String,
      architecture: js.Array[String],
      exportOptions: js.UndefOr[scala.Nothing],
      testOnly: Boolean
    ): Unit = js.native
    def export(exportedObjects: String, architecture: js.Array[String], exportOptions: js.Object): Unit = js.native
    def export(
      exportedObjects: String,
      architecture: js.Array[String],
      exportOptions: js.Object,
      testOnly: Boolean
    ): Unit = js.native
    def export(exportedObjects: js.Array[String]): Unit = js.native
    def export(
      exportedObjects: js.Array[String],
      architecture: js.UndefOr[scala.Nothing],
      exportOptions: js.UndefOr[scala.Nothing],
      testOnly: Boolean
    ): Unit = js.native
    def export(
      exportedObjects: js.Array[String],
      architecture: js.UndefOr[scala.Nothing],
      exportOptions: js.Object
    ): Unit = js.native
    def export(
      exportedObjects: js.Array[String],
      architecture: js.UndefOr[scala.Nothing],
      exportOptions: js.Object,
      testOnly: Boolean
    ): Unit = js.native
    def export(exportedObjects: js.Array[String], architecture: String): Unit = js.native
    def export(
      exportedObjects: js.Array[String],
      architecture: String,
      exportOptions: js.UndefOr[scala.Nothing],
      testOnly: Boolean
    ): Unit = js.native
    def export(exportedObjects: js.Array[String], architecture: String, exportOptions: js.Object): Unit = js.native
    def export(
      exportedObjects: js.Array[String],
      architecture: String,
      exportOptions: js.Object,
      testOnly: Boolean
    ): Unit = js.native
    def export(exportedObjects: js.Array[String], architecture: js.Array[String]): Unit = js.native
    def export(
      exportedObjects: js.Array[String],
      architecture: js.Array[String],
      exportOptions: js.UndefOr[scala.Nothing],
      testOnly: Boolean
    ): Unit = js.native
    def export(exportedObjects: js.Array[String], architecture: js.Array[String], exportOptions: js.Object): Unit = js.native
    def export(
      exportedObjects: js.Array[String],
      architecture: js.Array[String],
      exportOptions: js.Object,
      testOnly: Boolean
    ): Unit = js.native
    
    def imply(packageNames: String): Unit = js.native
    def imply(packageNames: String, architecture: String): Unit = js.native
    def imply(packageNames: String, architecture: js.Array[String]): Unit = js.native
    def imply(packageNames: js.Array[String]): Unit = js.native
    def imply(packageNames: js.Array[String], architecture: String): Unit = js.native
    def imply(packageNames: js.Array[String], architecture: js.Array[String]): Unit = js.native
    
    def use(packageNames: String): Unit = js.native
    def use(packageNames: String, architecture: js.UndefOr[scala.Nothing], options: Unordered): Unit = js.native
    def use(packageNames: String, architecture: String): Unit = js.native
    def use(packageNames: String, architecture: String, options: Unordered): Unit = js.native
    def use(packageNames: String, architecture: js.Array[String]): Unit = js.native
    def use(packageNames: String, architecture: js.Array[String], options: Unordered): Unit = js.native
    def use(packageNames: js.Array[String]): Unit = js.native
    def use(packageNames: js.Array[String], architecture: js.UndefOr[scala.Nothing], options: Unordered): Unit = js.native
    def use(packageNames: js.Array[String], architecture: String): Unit = js.native
    def use(packageNames: js.Array[String], architecture: String, options: Unordered): Unit = js.native
    def use(packageNames: js.Array[String], architecture: js.Array[String]): Unit = js.native
    def use(packageNames: js.Array[String], architecture: js.Array[String], options: Unordered): Unit = js.native
    
    def versionsFrom(meteorRelease: String): Unit = js.native
    def versionsFrom(meteorRelease: js.Array[String]): Unit = js.native
  }
}
