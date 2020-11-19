package typingsSlinky.fsCson

import typingsSlinky.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-cson", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def readFile(filePath: String, done: js.Function2[/* err */ js.Error | Null, /* result */ js.Any, Unit]): Unit = js.native
  
  def readFileSync(filePath: String): js.Any = js.native
  
  def register(): Unit = js.native
  
  def updateFile(
    filePath: String,
    updater: js.Function1[/* data */ js.Any, _],
    done: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  
  def updateFileSync(filePath: String, updater: js.Function1[/* data */ js.Any, _]): Unit = js.native
  
  def writeFile(filePath: String, data: js.Any, done: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  
  def writeFileSafe(filePath: String, data: js.Any, done: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  
  def writeFileSafeSync(filePath: String, data: js.Any): Unit = js.native
  
  def writeFileSync(filePath: String, data: js.Any): Unit = js.native
}
