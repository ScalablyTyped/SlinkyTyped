package typingsSlinky.cordovaPluginFile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LocalFileSystem extends js.Object
@JSGlobal("LocalFileSystem")
@js.native
object LocalFileSystem extends js.Object {
  
  @js.native
  sealed trait PERSISTENT extends LocalFileSystem
  
  @js.native
  sealed trait TEMPORARY extends LocalFileSystem
}
