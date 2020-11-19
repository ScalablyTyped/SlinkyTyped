package typingsSlinky.mobservable

import typingsSlinky.mobservable.dnodeMod.DataNode
import typingsSlinky.mobservable.interfacesMod.IDependencyTree
import typingsSlinky.mobservable.interfacesMod.IObserverTree
import typingsSlinky.mobservable.interfacesMod.ITransitionEvent
import typingsSlinky.mobservable.interfacesMod.Lambda
import typingsSlinky.mobservable.simpleeventemitterMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobservable/lib/extras", JSImport.Namespace)
@js.native
object extrasMod extends js.Object {
  
  def getDNode(thing: js.Any): DataNode = js.native
  def getDNode(thing: js.Any, property: String): DataNode = js.native
  
  def getDependencyTree(thing: js.Any): IDependencyTree = js.native
  def getDependencyTree(thing: js.Any, property: String): IDependencyTree = js.native
  
  def getObserverTree(thing: js.Any): IObserverTree = js.native
  def getObserverTree(thing: js.Any, property: String): IObserverTree = js.native
  
  def reportTransition(node: DataNode, state: String): Unit = js.native
  def reportTransition(node: DataNode, state: String, changed: js.UndefOr[scala.Nothing], newValue: js.Any): Unit = js.native
  def reportTransition(node: DataNode, state: String, changed: Boolean): Unit = js.native
  def reportTransition(node: DataNode, state: String, changed: Boolean, newValue: js.Any): Unit = js.native
  
  def trackTransitions(): Lambda = js.native
  def trackTransitions(extensive: js.UndefOr[scala.Nothing], onReport: js.Function1[/* lines */ ITransitionEvent, Unit]): Lambda = js.native
  def trackTransitions(extensive: Boolean): Lambda = js.native
  def trackTransitions(extensive: Boolean, onReport: js.Function1[/* lines */ ITransitionEvent, Unit]): Lambda = js.native
  
  var transitionTracker: default = js.native
}
