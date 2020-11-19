package typingsSlinky.protobufjsPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@protobufjs/path", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def isAbsolute(path: String): Boolean = js.native
  
  def normalize(path: String): String = js.native
  
  def resolve(originPath: String, includePath: String): String = js.native
  def resolve(originPath: String, includePath: String, alreadyNormalized: Boolean): String = js.native
}
