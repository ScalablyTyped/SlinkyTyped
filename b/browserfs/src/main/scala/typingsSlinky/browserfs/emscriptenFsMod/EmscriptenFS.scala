package typingsSlinky.browserfs.emscriptenFsMod

import typingsSlinky.browserfs.anon.Opts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmscriptenFS extends js.Object {
  
  def createNode(parent: EmscriptenFSNode, name: String, mode: Double): EmscriptenFSNode = js.native
  def createNode(parent: EmscriptenFSNode, name: String, mode: Double, dev: js.Any): EmscriptenFSNode = js.native
  
  def getMode(path: String): Double = js.native
  
  def mount(mount: Opts): EmscriptenFSNode = js.native
  
  var node_ops: EmscriptenNodeOps = js.native
  
  def realPath(node: EmscriptenFSNode): String = js.native
  
  var stream_ops: EmscriptenStreamOps = js.native
}
