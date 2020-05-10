package typingsSlinky.extjs.Ext.dom

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.extjs.Ext.ITemplate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHelper extends IAbstractHelper {
  /** [Method] Creates new DOM element s without inserting them to the document
  		* @param o Object/String The DOM object spec (and children) or raw HTML blob
  		* @returns HTMLElement The new uninserted node
  		*/
  var createDom: js.UndefOr[js.Function1[/* o */ js.UndefOr[js.Any], HTMLElement]] = js.native
  /** [Method] Alias for markup
  		* @param spec Object The DOM object spec (and children)
  		* @returns String
  		*/
  var createHtml: js.UndefOr[js.Function1[/* spec */ js.UndefOr[js.Any], String]] = js.native
  /** [Method] Creates a new Ext Template from the DOM object spec
  		* @param o Object The DOM object spec (and children)
  		* @returns Ext.Template The new template
  		*/
  var createTemplate: js.UndefOr[js.Function1[/* o */ js.UndefOr[js.Any], ITemplate]] = js.native
  /** [Property] (Boolean) */
  var useDom: js.UndefOr[Boolean] = js.native
}

object IHelper {
  @scala.inline
  def apply(): IHelper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHelper]
  }
  @scala.inline
  implicit class IHelperOps[Self <: IHelper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateDom(value: /* o */ js.UndefOr[js.Any] => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreateDom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDom")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateHtml(value: /* spec */ js.UndefOr[js.Any] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createHtml")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreateHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createHtml")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateTemplate(value: /* o */ js.UndefOr[js.Any] => ITemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTemplate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreateTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withUseDom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseDom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDom")(js.undefined)
        ret
    }
  }
  
}

