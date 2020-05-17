package typingsSlinky.poi.mod.Config

import typingsSlinky.poi.mod.Opts
import typingsSlinky.webpack.mod.Configuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.webpack.mod.Configuration
  - js.Function2[
/ * config * / typingsSlinky.webpack.mod.Configuration, 
/ * opts * / typingsSlinky.poi.mod.Opts, 
scala.Unit | typingsSlinky.webpack.mod.Configuration]
*/
trait ConfigureWebpack extends js.Object

object ConfigureWebpack {
  @scala.inline
  implicit def apply(value: Configuration): ConfigureWebpack = value.asInstanceOf[ConfigureWebpack]
  @scala.inline
  implicit def apply(value: js.Function2[/* config */ Configuration, /* opts */ Opts, Unit | Configuration]): ConfigureWebpack = value.asInstanceOf[ConfigureWebpack]
}

