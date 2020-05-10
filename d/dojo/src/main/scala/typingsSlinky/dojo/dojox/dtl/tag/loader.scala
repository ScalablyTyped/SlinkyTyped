package typingsSlinky.dojo.dojox.dtl.tag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/tag/loader.html
  *
  *
  */
@js.native
trait loader extends js.Object {
  /**
    *
    * @param name
    * @param nodelist
    */
  def BlockNode(name: js.Any, nodelist: js.Any): Unit = js.native
  /**
    *
    * @param getTemplate
    * @param nodelist
    * @param shared
    * @param parent
    * @param key
    */
  def ExtendsNode(getTemplate: js.Any, nodelist: js.Any, shared: js.Any, parent: js.Any, key: js.Any): Unit = js.native
  /**
    *
    * @param path
    * @param constant
    * @param getTemplate
    * @param text
    * @param parsed
    */
  def IncludeNode(path: js.Any, constant: js.Any, getTemplate: js.Any, text: js.Any, parsed: js.Any): Unit = js.native
  /**
    *
    * @param parser
    * @param token
    */
  def block(parser: js.Any, token: js.Any): js.Any = js.native
  /**
    *
    * @param parser
    * @param token
    */
  def extends_(parser: js.Any, token: js.Any): js.Any = js.native
  /**
    *
    * @param parser
    * @param token
    */
  def include(parser: js.Any, token: js.Any): js.Any = js.native
  /**
    *
    * @param parser
    * @param token
    */
  def ssi(parser: js.Any, token: js.Any): js.Any = js.native
}

object loader {
  @scala.inline
  def apply(
    BlockNode: (js.Any, js.Any) => Unit,
    ExtendsNode: (js.Any, js.Any, js.Any, js.Any, js.Any) => Unit,
    IncludeNode: (js.Any, js.Any, js.Any, js.Any, js.Any) => Unit,
    block: (js.Any, js.Any) => js.Any,
    extends_ : (js.Any, js.Any) => js.Any,
    include: (js.Any, js.Any) => js.Any,
    ssi: (js.Any, js.Any) => js.Any
  ): loader = {
    val __obj = js.Dynamic.literal(BlockNode = js.Any.fromFunction2(BlockNode), ExtendsNode = js.Any.fromFunction5(ExtendsNode), IncludeNode = js.Any.fromFunction5(IncludeNode), block = js.Any.fromFunction2(block), extends_ = js.Any.fromFunction2(extends_), include = js.Any.fromFunction2(include), ssi = js.Any.fromFunction2(ssi))
    __obj.asInstanceOf[loader]
  }
  @scala.inline
  implicit class loaderOps[Self <: loader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockNode(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockNode")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withExtendsNode(value: (js.Any, js.Any, js.Any, js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtendsNode")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withIncludeNode(value: (js.Any, js.Any, js.Any, js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeNode")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withBlock(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withExtends_(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extends_")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInclude(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSsi(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssi")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

