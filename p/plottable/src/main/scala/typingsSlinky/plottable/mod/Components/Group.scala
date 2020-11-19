package typingsSlinky.plottable.mod.Components

import typingsSlinky.plottable.componentMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable", "Components.Group")
@js.native
/**
  * Constructs a Group.
  *
  * A Group contains Components that will be rendered on top of each other.
  * Components added later will be rendered above Components already in the Group.
  *
  * @constructor
  * @param {Component[]} [components=[]] Components to be added to the Group.
  */
class Group ()
  extends typingsSlinky.plottable.componentsMod.Group {
  def this(components: js.Array[Component]) = this()
}
