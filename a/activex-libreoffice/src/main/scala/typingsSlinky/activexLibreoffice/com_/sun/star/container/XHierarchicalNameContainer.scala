package typingsSlinky.activexLibreoffice.com_.sun.star.container

import typingsSlinky.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Insertion and removal of hierarchical elements. */
@js.native
trait XHierarchicalNameContainer extends XHierarchicalNameReplace {
  /** inserts the element at the specified name. */
  def insertByHierarchicalName(aName: String, aElement: js.Any): Unit = js.native
  /** removes the element at the specified name. */
  def removeByHierarchicalName(Name: String): Unit = js.native
}

object XHierarchicalNameContainer {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getByHierarchicalName: String => js.Any,
    hasByHierarchicalName: String => Boolean,
    insertByHierarchicalName: (String, js.Any) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeByHierarchicalName: String => Unit,
    replaceByHierarchicalName: (String, js.Any) => Unit
  ): XHierarchicalNameContainer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getByHierarchicalName = js.Any.fromFunction1(getByHierarchicalName), hasByHierarchicalName = js.Any.fromFunction1(hasByHierarchicalName), insertByHierarchicalName = js.Any.fromFunction2(insertByHierarchicalName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByHierarchicalName = js.Any.fromFunction1(removeByHierarchicalName), replaceByHierarchicalName = js.Any.fromFunction2(replaceByHierarchicalName))
    __obj.asInstanceOf[XHierarchicalNameContainer]
  }
  @scala.inline
  implicit class XHierarchicalNameContainerOps[Self <: XHierarchicalNameContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInsertByHierarchicalName(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertByHierarchicalName")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveByHierarchicalName(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeByHierarchicalName")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

