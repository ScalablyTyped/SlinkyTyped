package typingsSlinky.nodegit.blameMod

import typingsSlinky.nodegit.blameHunkMod.BlameHunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit/blame", "Blame")
@js.native
class Blame_ () extends js.Object {
  
  def buffer(buffer: String, bufferLen: Double): js.Promise[Blame] = js.native
  
  def free(): Unit = js.native
  
  /**
    * @returns - the hunk at the given index, or NULL on error
    */
  def getHunkByIndex(index: Double): BlameHunk = js.native
  
  /**
    * @returns - the hunk that contains the given line, or NULL on error
    */
  def getHunkByLine(lineNo: Double): BlameHunk = js.native
  
  def getHunkCount(): Double = js.native
}
