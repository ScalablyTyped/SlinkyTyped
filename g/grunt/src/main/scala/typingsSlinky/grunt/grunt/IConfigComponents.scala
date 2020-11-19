package typingsSlinky.grunt.grunt

import typingsSlinky.grunt.grunt.config.ConfigModule
import typingsSlinky.grunt.grunt.config.IProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*
  * Grunt module mixins.
  */
@js.native
trait IConfigComponents extends ConfigModule {
  
  /**
    * An alias
    * @see grunt.config.ConfigModule.init
    */
  def initConfig(config: IProjectConfig): Unit = js.native
}
