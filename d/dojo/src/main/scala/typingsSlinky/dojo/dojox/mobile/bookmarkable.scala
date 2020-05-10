package typingsSlinky.dojo.dojox.mobile

import typingsSlinky.dojo.dijit.WidgetBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/bookmarkable.html
  *
  * Utilities to make the view transitions bookmarkable.
  *
  */
@js.native
trait bookmarkable extends js.Object {
  /**
    * An array containing information about the transition.
    *
    */
  var transitionInfo: js.Array[_] = js.native
  /**
    * Adds transition information.
    *
    * @param fromViewId
    * @param toViewId
    * @param args
    */
  def addTransitionInfo(fromViewId: String, toViewId: String, args: js.Object): Unit = js.native
  /**
    * Searches for a starting view and a destination view.
    *
    * @param moveTo
    */
  def findTransitionViews(moveTo: String): js.Array[_] = js.native
  /**
    * Returns an array containing the transition information.
    *
    * @param fromViewId
    * @param toViewId
    */
  def getTransitionInfo(fromViewId: String, toViewId: String): js.Any = js.native
  /**
    * Analyzes the given hash (fragment id).
    * Given a comma-separated list of view IDs, this method
    * searches for a transition destination, and makes all the
    * views in the hash visible.
    *
    * @param fragIds
    */
  def handleFragIds(fragIds: String): js.Object = js.native
  /**
    * Updates the hash (fragment id) in the browser URL.
    * The hash value consists of one or more visible view ids
    * separated with commas.
    *
    * @param toView
    */
  def setFragIds(toView: WidgetBase): Unit = js.native
}

object bookmarkable {
  @scala.inline
  def apply(
    addTransitionInfo: (String, String, js.Object) => Unit,
    findTransitionViews: String => js.Array[_],
    getTransitionInfo: (String, String) => js.Any,
    handleFragIds: String => js.Object,
    setFragIds: WidgetBase => Unit,
    transitionInfo: js.Array[_]
  ): bookmarkable = {
    val __obj = js.Dynamic.literal(addTransitionInfo = js.Any.fromFunction3(addTransitionInfo), findTransitionViews = js.Any.fromFunction1(findTransitionViews), getTransitionInfo = js.Any.fromFunction2(getTransitionInfo), handleFragIds = js.Any.fromFunction1(handleFragIds), setFragIds = js.Any.fromFunction1(setFragIds), transitionInfo = transitionInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[bookmarkable]
  }
  @scala.inline
  implicit class bookmarkableOps[Self <: bookmarkable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddTransitionInfo(value: (String, String, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addTransitionInfo")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withFindTransitionViews(value: String => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findTransitionViews")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetTransitionInfo(value: (String, String) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTransitionInfo")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHandleFragIds(value: String => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleFragIds")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetFragIds(value: WidgetBase => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFragIds")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTransitionInfo(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionInfo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

