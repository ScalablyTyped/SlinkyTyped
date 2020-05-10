package typingsSlinky.box2d.Box2D.Collision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Collision.b2DynamicTreeBroadPhase")
@js.native
/**
		* Creates the dynamic tree broad phase.
		**/
class b2DynamicTreeBroadPhase () extends IBroadPhase {
  /**
  		* Tests if two proxies overlap.
  		* @param proxyA First proxy to test.
  		* @param proxyB Second proxy to test.
  		* @return True if the proxyA and proxyB overlap with Fat AABBs, otherwise false.
  		**/
  def TestOverlap(proxyA: b2DynamicTreeNode, proxyB: b2DynamicTreeNode): Boolean = js.native
  /**
  		* Update the pairs. This results in pair callbacks. This can only add pairs.
  		* @param callback Called for all new proxy pairs.
  		*	param userDataA Proxy A in the pair user data.
  		*	param userDataB Proxy B in the pair user data.
  		**/
  def UpdatePairs(callback: js.Function2[/* userDataA */ js.Any, /* userDataB */ js.Any, Unit]): Unit = js.native
  /**
  		* Validates the dynamic tree.
  		* NOTE: this says "todo" in the current Box2DFlash code.
  		**/
  def Validate(): Unit = js.native
}

