package typingsSlinky.dojo.dojox.mobile

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/viewRegistry.html
  *
  * A registry of existing views.
  *
  */
@js.native
trait viewRegistry_ extends js.Object {
  /**
    *
    */
  var initialView: js.Object = js.native
  /**
    * The number of registered views.
    *
    */
  var length: Double = js.native
  /**
    * Adds a view to the registry.
    *
    * @param view
    */
  def add(view: View): Unit = js.native
  /**
    * Gets the children views of the specified view.
    *
    * @param parent
    */
  def getChildViews(parent: View): js.Array[_] = js.native
  /**
    * Gets the dojox/mobile/scrollable object containing the specified DOM node.
    *
    * @param node
    */
  def getEnclosingScrollable(node: HTMLElement): scrollable = js.native
  /**
    * Gets the view containing the specified DOM node.
    *
    * @param node
    */
  def getEnclosingView(node: HTMLElement): View = js.native
  /**
    * Gets the parent view of the specified view.
    *
    * @param view
    */
  def getParentView(view: View): View = js.native
  /**
    * Gets all registered views.
    *
    */
  def getViews(): js.Array[_] = js.native
  /**
    * Removes a view from the registry.
    *
    * @param id
    */
  def remove(id: String): Unit = js.native
}

object viewRegistry_ {
  @scala.inline
  def apply(
    add: View => Unit,
    getChildViews: View => js.Array[_],
    getEnclosingScrollable: HTMLElement => scrollable,
    getEnclosingView: HTMLElement => View,
    getParentView: View => View,
    getViews: () => js.Array[_],
    initialView: js.Object,
    length: Double,
    remove: String => Unit
  ): viewRegistry_ = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), getChildViews = js.Any.fromFunction1(getChildViews), getEnclosingScrollable = js.Any.fromFunction1(getEnclosingScrollable), getEnclosingView = js.Any.fromFunction1(getEnclosingView), getParentView = js.Any.fromFunction1(getParentView), getViews = js.Any.fromFunction0(getViews), initialView = initialView.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[viewRegistry_]
  }
  @scala.inline
  implicit class viewRegistry_Ops[Self <: viewRegistry_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: View => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetChildViews(value: View => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChildViews")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetEnclosingScrollable(value: HTMLElement => scrollable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnclosingScrollable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetEnclosingView(value: HTMLElement => View): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnclosingView")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetParentView(value: View => View): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParentView")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetViews(value: () => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getViews")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInitialView(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

