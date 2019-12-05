package typingsSlinky.mobservable

import typingsSlinky.mobservable.libDnodeMod.DataNode
import typingsSlinky.mobservable.libInterfacesMod.IDependencyTree
import typingsSlinky.mobservable.libInterfacesMod.IObserverTree
import typingsSlinky.mobservable.libInterfacesMod.ITransitionEvent
import typingsSlinky.mobservable.libInterfacesMod.Lambda
import typingsSlinky.mobservable.libSimpleeventemitterMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable/lib/extras", JSImport.Namespace)
@js.native
object libExtrasMod extends js.Object {
  var transitionTracker: default = js.native
  def getDNode(thing: js.Any): DataNode = js.native
  def getDNode(thing: js.Any, property: String): DataNode = js.native
  def getDependencyTree(thing: js.Any): IDependencyTree = js.native
  def getDependencyTree(thing: js.Any, property: String): IDependencyTree = js.native
  def getObserverTree(thing: js.Any): IObserverTree = js.native
  def getObserverTree(thing: js.Any, property: String): IObserverTree = js.native
  def reportTransition(node: DataNode, state: String): Unit = js.native
  def reportTransition(node: DataNode, state: String, changed: Boolean): Unit = js.native
  def reportTransition(node: DataNode, state: String, changed: Boolean, newValue: js.Any): Unit = js.native
  def trackTransitions(): Lambda = js.native
  def trackTransitions(extensive: Boolean): Lambda = js.native
  def trackTransitions(extensive: Boolean, onReport: js.Function1[/* lines */ ITransitionEvent, Unit]): Lambda = js.native
}

