package typingsSlinky.nock.mod

import typingsSlinky.node.eventsMod.global.NodeJS.EventEmitter
import typingsSlinky.node.urlMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nock", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(basePath: String): Scope = js.native
  def apply(basePath: String, options: Options): Scope = js.native
  def apply(basePath: Url): Scope = js.native
  def apply(basePath: Url, options: Options): Scope = js.native
  def apply(basePath: js.RegExp): Scope = js.native
  def apply(basePath: js.RegExp, options: Options): Scope = js.native
  
  var back: Back_ = js.native
  
  var emitter: EventEmitter = js.native
  
  var recorder: Recorder_ = js.native
}
