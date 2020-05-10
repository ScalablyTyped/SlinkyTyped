package typingsSlinky.dojo.dojox.atom.io

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/atom/io/model.html
  *
  *
  */
@js.native
trait model_ extends js.Object {
  /**
    *
    */
  var util: js.Object = js.native
  /**
    *
    */
  def AtomItem(): Unit = js.native
  /**
    *
    */
  def Category(): Unit = js.native
  /**
    *
    */
  def Collection(): Unit = js.native
  /**
    *
    */
  def Content(): Unit = js.native
  /**
    *
    */
  def Entry(): Unit = js.native
  /**
    *
    */
  def Feed(): Unit = js.native
  /**
    *
    */
  def Generator(): Unit = js.native
  /**
    *
    */
  def Link(): Unit = js.native
  /**
    *
    */
  def Node(): Unit = js.native
  /**
    *
    */
  def Person(): Unit = js.native
  /**
    *
    */
  def Service(): Unit = js.native
  /**
    *
    */
  def Workspace(): Unit = js.native
}

object model_ {
  @scala.inline
  def apply(
    AtomItem: () => Unit,
    Category: () => Unit,
    Collection: () => Unit,
    Content: () => Unit,
    Entry: () => Unit,
    Feed: () => Unit,
    Generator: () => Unit,
    Link: () => Unit,
    Node: () => Unit,
    Person: () => Unit,
    Service: () => Unit,
    Workspace: () => Unit,
    util: js.Object
  ): model_ = {
    val __obj = js.Dynamic.literal(AtomItem = js.Any.fromFunction0(AtomItem), Category = js.Any.fromFunction0(Category), Collection = js.Any.fromFunction0(Collection), Content = js.Any.fromFunction0(Content), Entry = js.Any.fromFunction0(Entry), Feed = js.Any.fromFunction0(Feed), Generator = js.Any.fromFunction0(Generator), Link = js.Any.fromFunction0(Link), Node = js.Any.fromFunction0(Node), Person = js.Any.fromFunction0(Person), Service = js.Any.fromFunction0(Service), Workspace = js.Any.fromFunction0(Workspace), util = util.asInstanceOf[js.Any])
    __obj.asInstanceOf[model_]
  }
  @scala.inline
  implicit class model_Ops[Self <: model_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAtomItem(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AtomItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCategory(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Category")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCollection(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Collection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withContent(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Content")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEntry(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Entry")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFeed(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Feed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGenerator(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Generator")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLink(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Link")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNode(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Node")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPerson(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Person")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withService(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Service")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWorkspace(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Workspace")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUtil(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("util")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

