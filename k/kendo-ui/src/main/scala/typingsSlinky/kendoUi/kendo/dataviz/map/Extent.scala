package typingsSlinky.kendoUi.kendo.dataviz.map

import typingsSlinky.kendoUi.kendo.Class
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Extent extends Class {
  var nw: Location = js.native
  var options: ExtentOptions = js.native
  var se: Location = js.native
  def center(): Location = js.native
  def contains(location: Location): Boolean = js.native
  def containsAny(locations: js.Any): Boolean = js.native
  def edges(): js.Any = js.native
  def include(location: Location): Unit = js.native
  def includeAll(locations: js.Any): Unit = js.native
  def overlaps(extent: Extent): Boolean = js.native
  def toArray(): js.Any = js.native
}

object Extent {
  @scala.inline
  def apply(
    center: () => Location,
    contains: Location => Boolean,
    containsAny: js.Any => Boolean,
    edges: () => js.Any,
    include: Location => Unit,
    includeAll: js.Any => Unit,
    nw: Location,
    options: ExtentOptions,
    overlaps: Extent => Boolean,
    se: Location,
    toArray: () => js.Any
  ): Extent = {
    val __obj = js.Dynamic.literal(center = js.Any.fromFunction0(center), contains = js.Any.fromFunction1(contains), containsAny = js.Any.fromFunction1(containsAny), edges = js.Any.fromFunction0(edges), include = js.Any.fromFunction1(include), includeAll = js.Any.fromFunction1(includeAll), nw = nw.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], overlaps = js.Any.fromFunction1(overlaps), se = se.asInstanceOf[js.Any], toArray = js.Any.fromFunction0(toArray))
    __obj.asInstanceOf[Extent]
  }
  @scala.inline
  implicit class ExtentOps[Self <: Extent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenter(value: () => Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withContains(value: Location => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContainsAny(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsAny")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEdges(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edges")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInclude(value: Location => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIncludeAll(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNw(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: ExtentOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverlaps(value: Extent => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlaps")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSe(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("se")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToArray(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toArray")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

