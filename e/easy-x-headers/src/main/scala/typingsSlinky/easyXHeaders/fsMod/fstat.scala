package typingsSlinky.easyXHeaders.fsMod

import typingsSlinky.easyXHeaders.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs", "fstat")
@js.native
object fstat extends js.Object {
  
  def apply(fd: Double): Unit = js.native
  def apply(fd: Double, callback: js.Function2[/* err */ ErrnoException, /* stats */ Stats, _]): Unit = js.native
}
