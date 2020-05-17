package typingsSlinky.activexInfopath.InfoPath

import typingsSlinky.activexMsxml2.MSXML2.IXMLDOMNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebServiceAdapterObject extends js.Object {
  val ErrorsLocation: IXMLDOMNode = js.native
  @JSName("InfoPath.WebServiceAdapterObject_typekey")
  var InfoPathDotWebServiceAdapterObject_typekey: WebServiceAdapterObject = js.native
  var Input: String = js.native
  val Name: String = js.native
  var Operation: String = js.native
  val OutputLocation: IXMLDOMNode = js.native
  val QueryAllowed: Boolean = js.native
  val SubmitAllowed: Boolean = js.native
  var Timeout: Double = js.native
  val WSDLURL: String = js.native
  def GenerateDataSetDiffGram(pNode: IXMLDOMNode): IXMLDOMNode = js.native
  def Query(): Unit = js.native
  def Submit(): Unit = js.native
}

object WebServiceAdapterObject {
  @scala.inline
  def apply(
    ErrorsLocation: IXMLDOMNode,
    GenerateDataSetDiffGram: IXMLDOMNode => IXMLDOMNode,
    InfoPathDotWebServiceAdapterObject_typekey: WebServiceAdapterObject,
    Input: String,
    Name: String,
    Operation: String,
    OutputLocation: IXMLDOMNode,
    Query: () => Unit,
    QueryAllowed: Boolean,
    Submit: () => Unit,
    SubmitAllowed: Boolean,
    Timeout: Double,
    WSDLURL: String
  ): WebServiceAdapterObject = {
    val __obj = js.Dynamic.literal(ErrorsLocation = ErrorsLocation.asInstanceOf[js.Any], GenerateDataSetDiffGram = js.Any.fromFunction1(GenerateDataSetDiffGram), Input = Input.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Operation = Operation.asInstanceOf[js.Any], OutputLocation = OutputLocation.asInstanceOf[js.Any], Query = js.Any.fromFunction0(Query), QueryAllowed = QueryAllowed.asInstanceOf[js.Any], Submit = js.Any.fromFunction0(Submit), SubmitAllowed = SubmitAllowed.asInstanceOf[js.Any], Timeout = Timeout.asInstanceOf[js.Any], WSDLURL = WSDLURL.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.WebServiceAdapterObject_typekey")(InfoPathDotWebServiceAdapterObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebServiceAdapterObject]
  }
  @scala.inline
  implicit class WebServiceAdapterObjectOps[Self <: WebServiceAdapterObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorsLocation(value: IXMLDOMNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorsLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGenerateDataSetDiffGram(value: IXMLDOMNode => IXMLDOMNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GenerateDataSetDiffGram")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInfoPathDotWebServiceAdapterObject_typekey(value: WebServiceAdapterObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InfoPath.WebServiceAdapterObject_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputLocation(value: IXMLDOMNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Query")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withQueryAllowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubmit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Submit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSubmitAllowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubmitAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWSDLURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WSDLURL")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

