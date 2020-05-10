package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Classifier extends js.Object {
  /**
    * A classifier for comma-separated values (CSV).
    */
  var CsvClassifier: js.UndefOr[typingsSlinky.awsSdk.glueMod.CsvClassifier] = js.native
  /**
    * A classifier that uses grok.
    */
  var GrokClassifier: js.UndefOr[typingsSlinky.awsSdk.glueMod.GrokClassifier] = js.native
  /**
    * A classifier for JSON content.
    */
  var JsonClassifier: js.UndefOr[typingsSlinky.awsSdk.glueMod.JsonClassifier] = js.native
  /**
    * A classifier for XML content.
    */
  var XMLClassifier: js.UndefOr[typingsSlinky.awsSdk.glueMod.XMLClassifier] = js.native
}

object Classifier {
  @scala.inline
  def apply(): Classifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Classifier]
  }
  @scala.inline
  implicit class ClassifierOps[Self <: Classifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCsvClassifier(value: CsvClassifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CsvClassifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsvClassifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CsvClassifier")(js.undefined)
        ret
    }
    @scala.inline
    def withGrokClassifier(value: GrokClassifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrokClassifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrokClassifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrokClassifier")(js.undefined)
        ret
    }
    @scala.inline
    def withJsonClassifier(value: JsonClassifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JsonClassifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsonClassifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JsonClassifier")(js.undefined)
        ret
    }
    @scala.inline
    def withXMLClassifier(value: XMLClassifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XMLClassifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXMLClassifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XMLClassifier")(js.undefined)
        ret
    }
  }
  
}

