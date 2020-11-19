package typingsSlinky.heapdump

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("heapdump", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def writeSnapshot(): Unit = js.native
  def writeSnapshot(callback: js.Function2[/* err */ js.Error | Null, /* filename */ js.UndefOr[String], Unit]): Unit = js.native
  def writeSnapshot(
    dumpFileName: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Error | Null, /* filename */ js.UndefOr[String], Unit]
  ): Unit = js.native
  def writeSnapshot(dumpFileName: String): Unit = js.native
  def writeSnapshot(
    dumpFileName: String,
    callback: js.Function2[/* err */ js.Error | Null, /* filename */ js.UndefOr[String], Unit]
  ): Unit = js.native
}
