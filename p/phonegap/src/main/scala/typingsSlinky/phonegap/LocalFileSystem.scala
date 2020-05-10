package typingsSlinky.phonegap

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
interface LocalFileSystem {
  requestFileSystem: Function;
  resolveLocalFileSystemURI: Function;
}*/
@js.native
trait LocalFileSystem extends js.Object {
  var PERSISTENT: Double = js.native
  var TEMPORARY: Double = js.native
}

@JSGlobal("LocalFileSystem")
@js.native
object LocalFileSystem extends TopLevel[LocalFileSystem]

