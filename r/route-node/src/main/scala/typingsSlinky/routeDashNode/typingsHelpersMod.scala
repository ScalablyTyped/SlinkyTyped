package typingsSlinky.routeDashNode

import typingsSlinky.routeDashNode.routeDashNodeMod.BuildOptions
import typingsSlinky.routeDashNode.routeDashNodeMod.MatchResponse
import typingsSlinky.routeDashNode.routeDashNodeMod.RouteNodeState
import typingsSlinky.routeDashNode.routeDashNodeMod.RouteNodeStateMeta
import typingsSlinky.routeDashNode.routeDashNodeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("route-node/typings/helpers", JSImport.Namespace)
@js.native
object typingsHelpersMod extends js.Object {
  def buildPathFromSegments(): String = js.native
  def buildPathFromSegments(segments: js.Array[default]): String = js.native
  def buildPathFromSegments(segments: js.Array[default], params: js.Object): String = js.native
  def buildPathFromSegments(segments: js.Array[default], params: js.Object, options: BuildOptions): String = js.native
  def buildStateFromMatch(`match`: MatchResponse): RouteNodeState = js.native
  def getMetaFromSegments(segments: js.Array[default]): RouteNodeStateMeta = js.native
  def getPathFromSegments(segments: js.Array[default]): String = js.native
}

