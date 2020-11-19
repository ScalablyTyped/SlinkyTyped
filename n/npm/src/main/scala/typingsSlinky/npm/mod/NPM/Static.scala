package typingsSlinky.npm.mod.NPM

import typingsSlinky.node.eventsMod.global.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Static extends EventEmitter {
  
  var abbrevs: Dictionary[String] = js.native
  
  var bin: String = js.native
  
  var cache: String = js.native
  
  var commands: Commands = js.native
  
  var config: Config = js.native
  
  def deref(command: String): String = js.native
  
  var dir: String = js.native
  
  var fullList: js.Array[String] = js.native
  
  var globalBin: String = js.native
  
  var globalDir: String = js.native
  
  def load(callback: SimpleCallback[Config]): Unit = js.native
  def load(cli: ConfigOptions): Unit = js.native
  def load(cli: ConfigOptions, callback: SimpleCallback[Config]): Unit = js.native
  
  var prefix: String = js.native
  
  var rollbacks: js.Array[_] = js.native
  
  var root: String = js.native
  
  var spinner: Spinner = js.native
  
  var tmp: String = js.native
}
