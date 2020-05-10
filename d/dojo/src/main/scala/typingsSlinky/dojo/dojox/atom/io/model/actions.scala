package typingsSlinky.dojo.dojox.atom.io.model

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/atom/io/model._actions.html
  *
  * Container for tag handling functions.
  * Container for tag handling functions.  Each child of this container is
  * a handler function for the given type of node. Each accepts two parameters:
  *
  */
@js.native
trait actions extends js.Object {
  /**
    * The dom node containing the data
    *
    */
  var node: js.Object = js.native
  /**
    * The object to insert data into.
    *
    */
  var obj: js.Object = js.native
  /**
    *
    * @param obj
    * @param node
    */
  def author(obj: js.Any, node: js.Any): Unit = js.native
  /**
    *
    * @param obj
    * @param node
    */
  def category(obj: js.Any, node: js.Any): Unit = js.native
  /**
    *
    * @param obj
    * @param node
    */
  def content(obj: js.Any, node: js.Any): Unit = js.native
  /**
    *
    * @param obj
    * @param node
    */
  def contributor(obj: js.Any, node: js.Any): Unit = js.native
  /**
    *
    * @param obj
    * @param node
    */
  def email(obj: js.Any, node: js.Any): Unit = js.native
  /**
    *
    * @param obj
    * @param node
    */
  def entry(obj: js.Any, node: js.Any): Unit = js.native
  /**
    *
    * @param obj
    * @param node
    */
  def generator(obj: js.Any, node: js.Any): Unit = js.native
  /**
    *
    * @param obj
    * @param node
    */
  def icon(obj: js.Any, node: js.Any): Unit = js.native
  /**
    *
    * @param obj
    * @param node
    */
  def id(obj: js.Any, node: js.Any): Unit = js.native
  /**
    *
    * @param obj
    * @param node
    */
  def issued(obj: js.Any, node: js.Any): Unit = js.native
  /**
    *
    * @param obj
    * @param node
    */
  def link(obj: js.Any, node: js.Any): Unit = js.native
  /**
    *
    * @param obj
    * @param node
    */
  def modified(obj: js.Any, node: js.Any): Unit = js.native
  /**
    *
    * @param obj
    * @param node
    */
  def name(obj: js.Any, node: js.Any): Unit = js.native
  /**
    *
    * @param obj
    * @param node
    */
  def published(obj: js.Any, node: js.Any): Unit = js.native
  /**
    *
    * @param obj
    * @param node
    */
  def rights(obj: js.Any, node: js.Any): Unit = js.native
  /**
    *
    * @param obj
    * @param node
    */
  def subtitle(obj: js.Any, node: js.Any): Unit = js.native
  /**
    *
    * @param obj
    * @param node
    */
  def summary(obj: js.Any, node: js.Any): Unit = js.native
  /**
    *
    * @param obj
    * @param node
    */
  def title(obj: js.Any, node: js.Any): Unit = js.native
  /**
    *
    * @param obj
    * @param node
    */
  def updated(obj: js.Any, node: js.Any): Unit = js.native
  /**
    *
    * @param obj
    * @param node
    */
  def uri(obj: js.Any, node: js.Any): Unit = js.native
}

object actions {
  @scala.inline
  def apply(
    author: (js.Any, js.Any) => Unit,
    category: (js.Any, js.Any) => Unit,
    content: (js.Any, js.Any) => Unit,
    contributor: (js.Any, js.Any) => Unit,
    email: (js.Any, js.Any) => Unit,
    entry: (js.Any, js.Any) => Unit,
    generator: (js.Any, js.Any) => Unit,
    icon: (js.Any, js.Any) => Unit,
    id: (js.Any, js.Any) => Unit,
    issued: (js.Any, js.Any) => Unit,
    link: (js.Any, js.Any) => Unit,
    modified: (js.Any, js.Any) => Unit,
    name: (js.Any, js.Any) => Unit,
    node: js.Object,
    obj: js.Object,
    published: (js.Any, js.Any) => Unit,
    rights: (js.Any, js.Any) => Unit,
    subtitle: (js.Any, js.Any) => Unit,
    summary: (js.Any, js.Any) => Unit,
    title: (js.Any, js.Any) => Unit,
    updated: (js.Any, js.Any) => Unit,
    uri: (js.Any, js.Any) => Unit
  ): actions = {
    val __obj = js.Dynamic.literal(author = js.Any.fromFunction2(author), category = js.Any.fromFunction2(category), content = js.Any.fromFunction2(content), contributor = js.Any.fromFunction2(contributor), email = js.Any.fromFunction2(email), entry = js.Any.fromFunction2(entry), generator = js.Any.fromFunction2(generator), icon = js.Any.fromFunction2(icon), id = js.Any.fromFunction2(id), issued = js.Any.fromFunction2(issued), link = js.Any.fromFunction2(link), modified = js.Any.fromFunction2(modified), name = js.Any.fromFunction2(name), node = node.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any], published = js.Any.fromFunction2(published), rights = js.Any.fromFunction2(rights), subtitle = js.Any.fromFunction2(subtitle), summary = js.Any.fromFunction2(summary), title = js.Any.fromFunction2(title), updated = js.Any.fromFunction2(updated), uri = js.Any.fromFunction2(uri))
    __obj.asInstanceOf[actions]
  }
  @scala.inline
  implicit class actionsOps[Self <: actions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthor(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCategory(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withContent(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withContributor(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contributor")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEmail(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEntry(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entry")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGenerator(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generator")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIcon(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withId(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIssued(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issued")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLink(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withModified(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modified")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withName(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNode(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObj(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("obj")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublished(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("published")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRights(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rights")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSubtitle(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSummary(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTitle(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUpdated(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUri(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

