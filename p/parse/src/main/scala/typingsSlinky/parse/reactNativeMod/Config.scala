package typingsSlinky.parse.reactNativeMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.parse.mod.global.Parse.UseMasterKeyOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse/react-native", "Config")
@js.native
class Config ()
  extends typingsSlinky.parse.mod.Config

/* static members */
@JSImport("parse/react-native", "Config")
@js.native
object Config extends js.Object {
  def current(): typingsSlinky.parse.mod.global.Parse.Config = js.native
  def get(): js.Promise[typingsSlinky.parse.mod.global.Parse.Config] = js.native
  def get(options: UseMasterKeyOption): js.Promise[typingsSlinky.parse.mod.global.Parse.Config] = js.native
  def save(attr: js.Any): js.Promise[typingsSlinky.parse.mod.global.Parse.Config] = js.native
  def save(attr: js.Any, options: StringDictionary[Boolean]): js.Promise[typingsSlinky.parse.mod.global.Parse.Config] = js.native
}

