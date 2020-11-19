package typingsSlinky.rx.rxJoinpatternsMod

import typingsSlinky.rx.Rx.Comparer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rx.joinpatterns", "Recorded")
@js.native
class RecordedCls protected ()
  extends typingsSlinky.rx.Rx.Recorded {
  /**
    * Creates a new object recording the production of the specified value at the given virtual time.
    *
    * @constructor
    * @param {Number} time Virtual time the value was produced on.
    * @param {Mixed} value Value that was produced.
    * @param {Function} comparer An optional comparer.
    */
  def this(time: Double, value: js.Any) = this()
  def this(time: Double, value: js.Any, equalityComparer: Comparer[_, Boolean]) = this()
}
