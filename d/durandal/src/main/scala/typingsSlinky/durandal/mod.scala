package typingsSlinky.durandal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The activator module encapsulates all logic related to screen/component activation.
  * An activator is essentially an asynchronous state machine that understands a particular state transition protocol.
  * The protocol ensures that the following series of events always occur: `canDeactivate` (previous state), `canActivate` (new state), `deactivate` (previous state), `activate` (new state).
  * Each of the _can_ callbacks may return a boolean, affirmative value or promise for one of those. If either of the _can_ functions yields a false result, then activation halts.
  * @requires system
  * @requires knockout
  */
object mod {
  
  @JSImport("durandal/activator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("durandal/activator", "create")
  @js.native
  def create[T](): DurandalActivator[T] = js.native
  @JSImport("durandal/activator", "create")
  @js.native
  def create[T](initialActiveItem: T): DurandalActivator[T] = js.native
  @JSImport("durandal/activator", "create")
  @js.native
  def create[T](initialActiveItem: T, settings: DurandalActivatorSettings): DurandalActivator[T] = js.native
  @JSImport("durandal/activator", "create")
  @js.native
  def create[T](initialActiveItem: js.UndefOr[scala.Nothing], settings: DurandalActivatorSettings): DurandalActivator[T] = js.native
  
  @JSImport("durandal/activator", "defaults")
  @js.native
  def defaults: DurandalActivatorSettings = js.native
  @scala.inline
  def defaults_=(x: DurandalActivatorSettings): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
  
  @JSImport("durandal/activator", "isActivator")
  @js.native
  def isActivator(`object`: js.Any): Boolean = js.native
}
