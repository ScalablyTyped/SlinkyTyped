package typingsSlinky.extjs.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IXTemplateParser extends IBase {
  /** [Method] This method is called to process lt tpl case action gt
  		* @param action String
  		* @param actions Object Other actions keyed by the attribute name (such as 'exec').
  		*/
  var doCase: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] This method is called to process lt tpl default gt */
  var doDefault: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] This method is called to process lt tpl else gt */
  var doElse: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] This method is called to process lt tpl elseif action gt
  		* @param action String
  		* @param actions Object Other actions keyed by the attribute name (such as 'exec').
  		*/
  var doElseIf: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] This method is called to process lt tpl gt
  		* @param type String The type of action that is being ended.
  		* @param actions Object The other actions keyed by the attribute name (such as 'exec').
  		*/
  var doEnd: js.UndefOr[
    js.Function2[/* type */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] This method is called to process text
  		* @param text String
  		*/
  var doEval: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] This method is called to process lt tpl exec action gt
  		* @param action String
  		* @param actions Object Other actions keyed by the attribute name.
  		*/
  var doExec: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] This method is called to process expressions like  expr
  		* @param expr String The body of the expression (inside "{[" and "]}").
  		*/
  var doExpr: js.UndefOr[js.Function1[/* expr */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] This method is called to process lt tpl for action gt
  		* @param action String
  		* @param actions Object Other actions keyed by the attribute name (such as 'exec').
  		*/
  var doFor: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] This method is called to process lt tpl foreach action gt
  		* @param action String
  		* @param actions Object Other actions keyed by the attribute name (such as 'exec').
  		*/
  var doForEach: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] This method is called to process lt tpl if action gt
  		* @param action String
  		* @param actions Object Other actions keyed by the attribute name (such as 'exec').
  		*/
  var doIf: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] This method is called to process lt tpl switch action gt
  		* @param action String
  		* @param actions Object Other actions keyed by the attribute name (such as 'exec').
  		*/
  var doSwitch: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] This method is called to process simple tags like tag  */
  var doTag: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] This method is called to process a piece of raw text from the tpl
  		* @param text String
  		*/
  var doText: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] This method is called to process an empty lt tpl gt */
  var doTpl: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Property] (Number) */
  var level: js.UndefOr[Double] = js.native
}

object IXTemplateParser {
  @scala.inline
  def apply(): IXTemplateParser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IXTemplateParser]
  }
  @scala.inline
  implicit class IXTemplateParserOps[Self <: IXTemplateParser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDoCase(value: (/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doCase")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDoCase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doCase")(js.undefined)
        ret
    }
    @scala.inline
    def withDoDefault(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doDefault")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDoDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withDoElse(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doElse")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDoElse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doElse")(js.undefined)
        ret
    }
    @scala.inline
    def withDoElseIf(value: (/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doElseIf")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDoElseIf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doElseIf")(js.undefined)
        ret
    }
    @scala.inline
    def withDoEnd(value: (/* type */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doEnd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDoEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withDoEval(value: /* text */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doEval")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDoEval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doEval")(js.undefined)
        ret
    }
    @scala.inline
    def withDoExec(value: (/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doExec")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDoExec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doExec")(js.undefined)
        ret
    }
    @scala.inline
    def withDoExpr(value: /* expr */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doExpr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDoExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withDoFor(value: (/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doFor")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDoFor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doFor")(js.undefined)
        ret
    }
    @scala.inline
    def withDoForEach(value: (/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doForEach")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDoForEach: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doForEach")(js.undefined)
        ret
    }
    @scala.inline
    def withDoIf(value: (/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doIf")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDoIf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doIf")(js.undefined)
        ret
    }
    @scala.inline
    def withDoSwitch(value: (/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doSwitch")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDoSwitch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doSwitch")(js.undefined)
        ret
    }
    @scala.inline
    def withDoTag(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doTag")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDoTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doTag")(js.undefined)
        ret
    }
    @scala.inline
    def withDoText(value: /* text */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDoText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doText")(js.undefined)
        ret
    }
    @scala.inline
    def withDoTpl(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doTpl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDoTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doTpl")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
  }
  
}

