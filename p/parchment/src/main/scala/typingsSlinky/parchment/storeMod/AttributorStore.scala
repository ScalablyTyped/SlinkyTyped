package typingsSlinky.parchment.storeMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.parchment.blotMod.Formattable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributorStore extends js.Object {
  var attributes: js.Any = js.native
  var domNode: js.Any = js.native
  def attribute(attribute: typingsSlinky.parchment.attributorMod.default, value: js.Any): Unit = js.native
  def build(): Unit = js.native
  def copy(target: Formattable): Unit = js.native
  def move(target: Formattable): Unit = js.native
  def values(): StringDictionary[js.Any] = js.native
}

object AttributorStore {
  @scala.inline
  def apply(
    attribute: (typingsSlinky.parchment.attributorMod.default, js.Any) => Unit,
    attributes: js.Any,
    build: () => Unit,
    copy: Formattable => Unit,
    domNode: js.Any,
    move: Formattable => Unit,
    values: () => StringDictionary[js.Any]
  ): AttributorStore = {
    val __obj = js.Dynamic.literal(attribute = js.Any.fromFunction2(attribute), attributes = attributes.asInstanceOf[js.Any], build = js.Any.fromFunction0(build), copy = js.Any.fromFunction1(copy), domNode = domNode.asInstanceOf[js.Any], move = js.Any.fromFunction1(move), values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[AttributorStore]
  }
  @scala.inline
  implicit class AttributorStoreOps[Self <: AttributorStore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttribute(value: (typingsSlinky.parchment.attributorMod.default, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribute")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAttributes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuild(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCopy(value: Formattable => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDomNode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMove(value: Formattable => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValues(value: () => StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

