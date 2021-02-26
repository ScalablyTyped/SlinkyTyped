package typingsSlinky.grunt

import typingsSlinky.grunt.grunt.IConfigComponents
import typingsSlinky.grunt.grunt.ITaskComponents
import typingsSlinky.grunt.grunt.config.ConfigModule
import typingsSlinky.grunt.grunt.event.EventModule
import typingsSlinky.grunt.grunt.fail.FailModule
import typingsSlinky.grunt.grunt.file.FileModule
import typingsSlinky.grunt.grunt.log.LogModule
import typingsSlinky.grunt.grunt.option.OptionModule
import typingsSlinky.grunt.grunt.task.TaskModule
import typingsSlinky.grunt.grunt.template.TemplateModule
import typingsSlinky.grunt.grunt.util.UtilModule
import typingsSlinky.grunt.node.NodePackage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* GRUNT MODULE
  **************/
/**
  * The main Grunt module.
  *
  * {@link http://gruntjs.com/api/grunt}
  */
@js.native
trait IGrunt
  extends IConfigComponents
     with FailModule
     with ITaskComponents {
  
  /**
    * The current Grunt package.json metadata, as an object.
    */
  @JSName("package")
  var _package: NodePackage = js.native
  
  def config(prop: java.lang.String): js.Any = js.native
  /**
    * Get or set a value from the project's Grunt configuration.
    * This method serves as an alias to other methods;
    * if two arguments are passed, grunt.config.set is called,
    * otherwise grunt.config.get is called.
    */
  def config(prop: java.lang.String, value: js.Any): js.Any = js.native
  @JSName("config")
  var config_Original: ConfigModule = js.native
  
  var event: EventModule = js.native
  
  var fail: FailModule = js.native
  
  var file: FileModule = js.native
  
  var log: LogModule = js.native
  
  def option[T](key: java.lang.String): T = js.native
  /**
    * Gets or sets an option.
    * Boolean options can be negated by prepending no- onto the key. For example:
    *
    * grunt.option('staging', false);
    * var isDev = grunt.option('no-staging');
    * assert(isDev === true)
    */
  def option[T](key: java.lang.String, value: T): Unit = js.native
  @JSName("option")
  var option_Original: OptionModule = js.native
  
  var task: TaskModule = js.native
  
  var template: TemplateModule = js.native
  
  var util: UtilModule = js.native
  
  /**
    * The current Grunt version, as a string. This is just a shortcut to the grunt.package.version property.
    */
  var version: java.lang.String = js.native
}
