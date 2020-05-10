package typingsSlinky.pulumiAws.classifierMod

import typingsSlinky.pulumiAws.inputMod.glue.ClassifierCsvClassifier
import typingsSlinky.pulumiAws.inputMod.glue.ClassifierGrokClassifier
import typingsSlinky.pulumiAws.inputMod.glue.ClassifierJsonClassifier
import typingsSlinky.pulumiAws.inputMod.glue.ClassifierXmlClassifier
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassifierState extends js.Object {
  /**
    * A classifier for Csv content. Defined below.
    */
  val csvClassifier: js.UndefOr[Input[ClassifierCsvClassifier]] = js.native
  /**
    * A classifier that uses grok patterns. Defined below.
    */
  val grokClassifier: js.UndefOr[Input[ClassifierGrokClassifier]] = js.native
  /**
    * A classifier for JSON content. Defined below.
    */
  val jsonClassifier: js.UndefOr[Input[ClassifierJsonClassifier]] = js.native
  /**
    * The name of the classifier.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A classifier for XML content. Defined below.
    */
  val xmlClassifier: js.UndefOr[Input[ClassifierXmlClassifier]] = js.native
}

object ClassifierState {
  @scala.inline
  def apply(): ClassifierState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassifierState]
  }
  @scala.inline
  implicit class ClassifierStateOps[Self <: ClassifierState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCsvClassifier(value: Input[ClassifierCsvClassifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvClassifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsvClassifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvClassifier")(js.undefined)
        ret
    }
    @scala.inline
    def withGrokClassifier(value: Input[ClassifierGrokClassifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grokClassifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrokClassifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grokClassifier")(js.undefined)
        ret
    }
    @scala.inline
    def withJsonClassifier(value: Input[ClassifierJsonClassifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonClassifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsonClassifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonClassifier")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withXmlClassifier(value: Input[ClassifierXmlClassifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlClassifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXmlClassifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlClassifier")(js.undefined)
        ret
    }
  }
  
}

