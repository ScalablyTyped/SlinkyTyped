package typingsSlinky.nexpect.mod

import typingsSlinky.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IChain extends js.Object {
  
  def expect(expectation: String): IChain = js.native
  def expect(expectation: js.RegExp): IChain = js.native
  
  def run(
    callback: js.Function3[/* err */ js.Error, /* output */ js.Array[String], /* exit */ String | Double, Unit]
  ): ChildProcess = js.native
  
  def sendEof(): IChain = js.native
  
  def sendline(line: String): IChain = js.native
  
  def wait(expectation: String): IChain = js.native
  def wait(expectation: js.RegExp): IChain = js.native
}
