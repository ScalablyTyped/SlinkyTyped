package typingsSlinky.ipfsCore.componentsMod

import typingsSlinky.ipfsCore.anon.PartialIPFSConfig
import typingsSlinky.ipfsCore.configMod.Get
import typingsSlinky.ipfsCore.configMod.GetAll
import typingsSlinky.ipfsCore.configMod.IPFSConfig
import typingsSlinky.ipfsCore.configMod.Profiles_
import typingsSlinky.ipfsCore.configMod.Replace
import typingsSlinky.ipfsCore.configMod.Set
import typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions
import typingsSlinky.std.JSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config_ extends js.Object {
  
  def get(): js.Promise[JSON] = js.native
  def get(key: js.UndefOr[scala.Nothing], options: AbortOptions): js.Promise[JSON] = js.native
  def get(key: String): js.Promise[JSON] = js.native
  def get(key: String, options: AbortOptions): js.Promise[JSON] = js.native
  
  def getAll(): js.Promise[IPFSConfig] = js.native
  def getAll(options: AbortOptions): js.Promise[IPFSConfig] = js.native
  @JSName("getAll")
  var getAll_Original: GetAll = js.native
  
  @JSName("get")
  var get_Original: Get = js.native
  
  var profiles: Profiles_ = js.native
  
  def replace(value: PartialIPFSConfig): js.Promise[Unit] = js.native
  def replace(value: PartialIPFSConfig, options: AbortOptions): js.Promise[Unit] = js.native
  @JSName("replace")
  var replace_Original: Replace = js.native
  
  def set(key: String, value: JSON): js.Promise[Unit] = js.native
  def set(key: String, value: JSON, options: AbortOptions): js.Promise[Unit] = js.native
  @JSName("set")
  var set_Original: Set = js.native
}
