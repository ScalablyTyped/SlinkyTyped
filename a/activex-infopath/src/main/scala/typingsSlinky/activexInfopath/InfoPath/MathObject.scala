package typingsSlinky.activexInfopath.InfoPath

import typingsSlinky.activexMsxml2.MSXML2.IXMLDOMNodeList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MathObject extends js.Object {
  @JSName("InfoPath.MathObject_typekey")
  var InfoPathDotMathObject_typekey: MathObject = js.native
  def Avg(pxmllistInput: IXMLDOMNodeList): js.Any = js.native
  def Eval(pxmllistContext: IXMLDOMNodeList, bstrExpression: String): js.Any = js.native
  def Max(pxmllistInput: IXMLDOMNodeList): js.Any = js.native
  def Min(pxmllistInput: IXMLDOMNodeList): js.Any = js.native
  def Nz(pxmllistInput: IXMLDOMNodeList): js.Any = js.native
}

object MathObject {
  @scala.inline
  def apply(
    Avg: IXMLDOMNodeList => js.Any,
    Eval: (IXMLDOMNodeList, String) => js.Any,
    InfoPathDotMathObject_typekey: MathObject,
    Max: IXMLDOMNodeList => js.Any,
    Min: IXMLDOMNodeList => js.Any,
    Nz: IXMLDOMNodeList => js.Any
  ): MathObject = {
    val __obj = js.Dynamic.literal(Avg = js.Any.fromFunction1(Avg), Eval = js.Any.fromFunction2(Eval), Max = js.Any.fromFunction1(Max), Min = js.Any.fromFunction1(Min), Nz = js.Any.fromFunction1(Nz))
    __obj.updateDynamic("InfoPath.MathObject_typekey")(InfoPathDotMathObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MathObject]
  }
  @scala.inline
  implicit class MathObjectOps[Self <: MathObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvg(value: IXMLDOMNodeList => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Avg")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEval(value: (IXMLDOMNodeList, String) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Eval")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInfoPathDotMathObject_typekey(value: MathObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InfoPath.MathObject_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: IXMLDOMNodeList => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Max")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMin(value: IXMLDOMNodeList => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Min")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNz(value: IXMLDOMNodeList => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Nz")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

