package typingsSlinky.easyXHeaders.fsMod

import typingsSlinky.easyXHeaders.NodeJS.ErrnoException
import typingsSlinky.easyXHeaders.anon.Flag
import typingsSlinky.easyXHeaders.anon.`1`
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs", "readFile")
@js.native
object readFile extends js.Object {
  
  def apply(filename: String, callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]): Unit = js.native
  def apply(
    filename: String,
    encoding: String,
    callback: js.Function2[/* err */ ErrnoException, /* data */ String, Unit]
  ): Unit = js.native
  def apply(
    filename: String,
    options: Flag,
    callback: js.Function2[/* err */ ErrnoException, /* data */ String, Unit]
  ): Unit = js.native
  def apply(
    filename: String,
    options: `1`,
    callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]
  ): Unit = js.native
}
