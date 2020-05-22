package typingsSlinky.kendoUi.global.kendo.dataviz.map

import typingsSlinky.kendoUi.kendo.dataviz.map.ExtentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.map.Extent")
@js.native
class Extent protected ()
  extends typingsSlinky.kendoUi.kendo.dataviz.map.Extent {
  def this(nw: js.Any, se: js.Any) = this()
  def this(nw: js.Any, se: typingsSlinky.kendoUi.kendo.dataviz.map.Location) = this()
  def this(nw: typingsSlinky.kendoUi.kendo.dataviz.map.Location, se: js.Any) = this()
  def this(
    nw: typingsSlinky.kendoUi.kendo.dataviz.map.Location,
    se: typingsSlinky.kendoUi.kendo.dataviz.map.Location
  ) = this()
  /* CompleteClass */
  override var nw: typingsSlinky.kendoUi.kendo.dataviz.map.Location = js.native
  /* CompleteClass */
  override var options: ExtentOptions = js.native
  /* CompleteClass */
  override var se: typingsSlinky.kendoUi.kendo.dataviz.map.Location = js.native
  /* CompleteClass */
  override def center(): typingsSlinky.kendoUi.kendo.dataviz.map.Location = js.native
  /* CompleteClass */
  override def contains(location: typingsSlinky.kendoUi.kendo.dataviz.map.Location): Boolean = js.native
  /* CompleteClass */
  override def containsAny(locations: js.Any): Boolean = js.native
  /* CompleteClass */
  override def edges(): js.Any = js.native
  /* CompleteClass */
  override def include(location: typingsSlinky.kendoUi.kendo.dataviz.map.Location): Unit = js.native
  /* CompleteClass */
  override def includeAll(locations: js.Any): Unit = js.native
  /* CompleteClass */
  override def overlaps(extent: typingsSlinky.kendoUi.kendo.dataviz.map.Extent): Boolean = js.native
  /* CompleteClass */
  override def toArray(): js.Any = js.native
}

/* static members */
@JSGlobal("kendo.dataviz.map.Extent")
@js.native
object Extent extends js.Object {
  def create(a: js.Any): typingsSlinky.kendoUi.kendo.dataviz.map.Extent = js.native
  def create(a: js.Any, b: js.Any): typingsSlinky.kendoUi.kendo.dataviz.map.Extent = js.native
  def create(a: js.Any, b: typingsSlinky.kendoUi.kendo.dataviz.map.Location): typingsSlinky.kendoUi.kendo.dataviz.map.Extent = js.native
  def create(a: typingsSlinky.kendoUi.kendo.dataviz.map.Location): typingsSlinky.kendoUi.kendo.dataviz.map.Extent = js.native
  def create(a: typingsSlinky.kendoUi.kendo.dataviz.map.Location, b: js.Any): typingsSlinky.kendoUi.kendo.dataviz.map.Extent = js.native
  def create(
    a: typingsSlinky.kendoUi.kendo.dataviz.map.Location,
    b: typingsSlinky.kendoUi.kendo.dataviz.map.Location
  ): typingsSlinky.kendoUi.kendo.dataviz.map.Extent = js.native
}

