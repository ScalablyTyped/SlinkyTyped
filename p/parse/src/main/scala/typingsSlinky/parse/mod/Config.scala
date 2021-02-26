package typingsSlinky.parse.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.parse.mod.global.Parse.UseMasterKeyOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("parse", "Config")
@js.native
class Config ()
  extends typingsSlinky.parse.mod.global.Parse.Config
object Config {
  
  /* static member */
  @JSImport("parse", "Config.current")
  @js.native
  def current(): typingsSlinky.parse.mod.global.Parse.Config = js.native
  
  /* static member */
  @JSImport("parse", "Config.get")
  @js.native
  def get(): js.Promise[typingsSlinky.parse.mod.global.Parse.Config] = js.native
  @JSImport("parse", "Config.get")
  @js.native
  def get(options: UseMasterKeyOption): js.Promise[typingsSlinky.parse.mod.global.Parse.Config] = js.native
  
  /* static member */
  @JSImport("parse", "Config.save")
  @js.native
  def save(attr: js.Any): js.Promise[typingsSlinky.parse.mod.global.Parse.Config] = js.native
  @JSImport("parse", "Config.save")
  @js.native
  def save(attr: js.Any, options: StringDictionary[Boolean]): js.Promise[typingsSlinky.parse.mod.global.Parse.Config] = js.native
}
