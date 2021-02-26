package typingsSlinky.nodegit.mod

import typingsSlinky.node.fsMod.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Filter")
@js.native
class Filter ()
  extends typingsSlinky.nodegit.filterMod.Filter
/* static members */
object Filter {
  
  @JSImport("nodegit", "Filter.listContains")
  @js.native
  def listContains(filters: js.Any, name: String): Double = js.native
  
  @JSImport("nodegit", "Filter.listLength")
  @js.native
  def listLength(fl: js.Any): Double = js.native
  
  @JSImport("nodegit", "Filter.listNew")
  @js.native
  def listNew(repo: typingsSlinky.nodegit.repositoryMod.Repository, mode: Double, options: Double): js.Promise[_] = js.native
  
  @JSImport("nodegit", "Filter.listStreamBlob")
  @js.native
  def listStreamBlob(filters: js.Any, blob: typingsSlinky.nodegit.blobMod.Blob, target: WriteStream): Double = js.native
  
  @JSImport("nodegit", "Filter.listStreamData")
  @js.native
  def listStreamData(filters: js.Any, data: typingsSlinky.nodegit.bufMod.Buf, target: WriteStream): Double = js.native
  
  @JSImport("nodegit", "Filter.listStreamFile")
  @js.native
  def listStreamFile(
    filters: js.Any,
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    path: String,
    target: WriteStream
  ): Double = js.native
  
  @JSImport("nodegit", "Filter.unregister")
  @js.native
  def unregister(name: String): Double = js.native
}
