package typingsSlinky.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Graph")
@js.native
class Graph ()
  extends typingsSlinky.nodegit.graphMod.Graph
/* static members */
object Graph {
  
  @JSImport("nodegit", "Graph.aheadBehind")
  @js.native
  def aheadBehind(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    local: typingsSlinky.nodegit.oidMod.Oid,
    upstream: typingsSlinky.nodegit.oidMod.Oid
  ): js.Promise[Double] = js.native
  
  @JSImport("nodegit", "Graph.descendantOf")
  @js.native
  def descendantOf(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    commit: typingsSlinky.nodegit.oidMod.Oid,
    ancestor: typingsSlinky.nodegit.oidMod.Oid
  ): js.Promise[Double] = js.native
}
