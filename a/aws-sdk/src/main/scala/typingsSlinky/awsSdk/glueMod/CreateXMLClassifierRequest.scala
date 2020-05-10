package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateXMLClassifierRequest extends js.Object {
  /**
    * An identifier of the data format that the classifier matches.
    */
  var Classification: typingsSlinky.awsSdk.glueMod.Classification = js.native
  /**
    * The name of the classifier.
    */
  var Name: NameString = js.native
  /**
    * The XML tag designating the element that contains each record in an XML document being parsed. This can't identify a self-closing element (closed by /&gt;). An empty row element that contains only attributes can be parsed as long as it ends with a closing tag (for example, &lt;row item_a="A" item_b="B"&gt;&lt;/row&gt; is okay, but &lt;row item_a="A" item_b="B" /&gt; is not).
    */
  var RowTag: js.UndefOr[typingsSlinky.awsSdk.glueMod.RowTag] = js.native
}

object CreateXMLClassifierRequest {
  @scala.inline
  def apply(Classification: Classification, Name: NameString): CreateXMLClassifierRequest = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateXMLClassifierRequest]
  }
  @scala.inline
  implicit class CreateXMLClassifierRequestOps[Self <: CreateXMLClassifierRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassification(value: Classification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Classification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowTag(value: RowTag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RowTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RowTag")(js.undefined)
        ret
    }
  }
  
}

